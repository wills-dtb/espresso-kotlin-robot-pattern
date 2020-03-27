package com.touchsurgery.thesurgeonstodolist

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.*
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers

infix fun TodoListRobot.verifyThat(fn: TodoListRobotResult.() -> Unit): TodoListRobotResult = TodoListRobotResult().apply(fn)

class TodoListRobotResult {

    fun listItemIsDisplayed(position: Int = 0, text: String): ViewInteraction = onData(anything())
        .inAdapterView(
            allOf(
                withId(R.id.list),
                BaseTestRobot().childAtPosition(
                    withClassName(`is`("android.support.constraint.ConstraintLayout")),
                    0
                )
            )
        ).atPosition(position).check(matches(withSubstring(text)))

    fun withItemContent(expectedText: String): Matcher<Any> {
        checkNotNull(expectedText)
        return withItemContent(Matchers.equalTo(expectedText))
    }

        /**
     * Creates a matcher against the text stored in R.id.list. This text is roughly
     * "item: $row_number" ----> .... check.
     */

    /**
     * Creates a matcher against the text stored in R.id.list. This text is roughly
     * "item: $row_number" ----> .... check.
     */
    fun withItemContent(itemTextMatcher: Matcher<String>): Matcher<Any> {
        checkNotNull(itemTextMatcher)
        return object : BoundedMatcher<Any, Any>(Map::class.java) {
            override fun matchesSafely(map: Any): Boolean {
                return Matchers.hasEntry(Matchers.equalTo("STR"), itemTextMatcher).matches(map)
            }

            override fun describeTo(description: Description) {
                description.appendText("with item content: ")
                itemTextMatcher.describeTo(description)
            }
        }
    }

}