package com.touchsurgery.thesurgeonstodolist

infix fun SettingsRobot.andVerifyThat(fn: SettingsRobotResult.() -> Unit): SettingsRobotResult = SettingsRobotResult().apply(fn)

class SettingsRobotResult {

    fun listItemsAreDescendingInPriority() {
        TodoListRobotResult().listItemIsDisplayed(text = "(10) Try those amazing surgery mobile apps")
        TodoListRobotResult().listItemIsDisplayed(1, "(5) Treat patients")
    }

    fun listItemsAreAscendingInPriority() {
        TodoListRobotResult().listItemIsDisplayed(text = "(5) Treat patients")
        TodoListRobotResult().listItemIsDisplayed(1, "(10) Try those amazing surgery mobile apps")
    }
}