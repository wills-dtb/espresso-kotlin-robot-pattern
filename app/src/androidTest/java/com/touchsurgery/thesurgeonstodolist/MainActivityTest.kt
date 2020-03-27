package com.touchsurgery.thesurgeonstodolist

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.touchsurgery.thesurgeonstodolist.activities.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val mActivityTestRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Before
    fun setUp() {
        mActivityTestRule.launchActivity(null)
    }

    @Test
    fun shouldCreateANewItem() {
        withCreateTodoListRobot {
            clickFabButton()
            setNewItemDescription("New item")
            clickPriorityBar(GeneralLocation.CENTER_LEFT)
            clickSubmitButton()
        } verifyThat {
            listItemIsDisplayed(text = "New item")
        }
    }

    @Test
    fun shouldCreateANewItemWithDifferentPriorities() {
        val priorityLocation = arrayOf(GeneralLocation.CENTER_LEFT, GeneralLocation.CENTER, GeneralLocation.CENTER_RIGHT)
        for((index, value) in priorityLocation.withIndex())
            withCreateTodoListRobot {
                clickFabButton()
                setNewItemDescription("New item")
                clickPriorityBar(value)
                clickSubmitButton()
            } verifyThat {
                if (index == 0) listItemIsDisplayed(text = "(0) New item")
                if (index == 1) listItemIsDisplayed(1, text = "(5) New item")
                if (index == 2) listItemIsDisplayed(2, text = "(10) New item")
            }
    }

    @Test
    fun shouldCreateAndDeleteTheNewItem() {
        withCreateTodoListRobot {
            clickFabButton()
            setNewItemDescription("New item")
            clickPriorityBar(GeneralLocation.CENTER)
            clickSubmitButton()
        }

        withDeleteTodoListRobot {
            deleteItemAtPosition(0)
        } verifyThat {
            listItemIsDisplayed(0,  "Treat patients")
        }
    }

    @Test
    fun shouldDeleteAllItems() {
        for(i in 1..2)
            withDeleteTodoListRobot {
                deleteItemAtPosition(0)
            }

        onView(withId(R.id.list)).check(matches(BaseTestRobot().withListSize(0)))
    }

    @Test
    fun shouldChangeTheSettingsCorrectly() {
        SettingsRobotResult().listItemsAreAscendingInPriority()

        withSettingsRobot {
            clickMoreOptions()
            clickSettingsButton()
            clickRadioSortPriorityButton()
            clickDescendingButton()
        } andThen {
            goBackToMainActivty()
        } andVerifyThat {
            listItemsAreDescendingInPriority()
        }

        // rollback
        withSettingsRobot {
            clickMoreOptions()
            clickSettingsButton()
            clickRadioSortNameButton()
            clickAscendingButton()
        }
    }

}