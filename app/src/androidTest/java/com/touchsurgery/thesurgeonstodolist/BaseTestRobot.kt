package com.touchsurgery.thesurgeonstodolist

import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher


open class BaseTestRobot {

    fun fillEditText(resId: Int, text: String): ViewInteraction =
        onView(withId(resId)).perform(replaceText(text), closeSoftKeyboard())

    fun clickButton(resId: Int): ViewInteraction = onView(withId(resId)).perform(click())

    fun clickButton(desc: String): ViewInteraction = onView(withContentDescription(desc)).perform(click())

    fun textView(resId: Int): ViewInteraction = onView(withId(resId))

    fun matchText(viewInteraction: ViewInteraction, text: String): ViewInteraction = viewInteraction
        .check(matches(withText(text)))

    fun matchText(resId: Int, text: String): ViewInteraction = matchText(textView(resId), text)

    fun clickListItem(listRes: Int, position: Int) {
        Espresso.onData(CoreMatchers.anything())
            .inAdapterView(CoreMatchers.allOf(withId(listRes)))
            .atPosition(position).perform(click())
    }

    fun childAtPosition(parentMatcher: Matcher<View>, position: Int): Matcher<View> {
        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }

    fun withListSize(size: Int): Matcher<View> {
        return object : TypeSafeMatcher<View>() {
            public override fun matchesSafely(view: View): Boolean {
                return (view as ListView).getCount() === size
            }
            override fun describeTo(description: Description) {
                description.appendText("ListView should have $size items")
            }
        }
    }
}