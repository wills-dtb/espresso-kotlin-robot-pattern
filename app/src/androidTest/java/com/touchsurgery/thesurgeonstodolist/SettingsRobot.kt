package com.touchsurgery.thesurgeonstodolist

import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText

fun withSettingsRobot(func: SettingsRobot.() -> Unit) = SettingsRobot().apply { func() }
infix fun SettingsRobot.andThen(fn: SettingsRobot.() -> Unit): SettingsRobot {
    return also(fn)
}


class SettingsRobot: BaseTestRobot() {
    fun clickMoreOptions() = clickButton("More options")
    fun clickSettingsButton() = clickButton(R.id.title)
    fun clickDescendingButton() = clickButton(R.id.switchAscending).check(matches(withText("Descending")))
    fun clickAscendingButton() = clickButton(R.id.switchAscending).check(matches(withText("Ascending")))
    fun clickRadioSortNameButton() = clickButton(R.id.radioSortName)
    fun clickRadioSortPriorityButton() = clickButton(R.id.radioSortPriority)
    fun goBackToMainActivty() = pressBack()
}