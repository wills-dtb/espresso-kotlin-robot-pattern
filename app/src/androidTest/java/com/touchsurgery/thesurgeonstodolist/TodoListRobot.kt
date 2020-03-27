package com.touchsurgery.thesurgeonstodolist

import androidx.test.espresso.action.GeneralClickAction
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Tap


fun withCreateTodoListRobot(fn: TodoListRobot.CreateTodoListRobot.() -> Unit): TodoListRobot.CreateTodoListRobot = TodoListRobot.CreateTodoListRobot().apply(fn)
fun withDeleteTodoListRobot(fn: TodoListRobot.DeleteTodoListRobot.() -> Unit): TodoListRobot.DeleteTodoListRobot = TodoListRobot.DeleteTodoListRobot().apply(fn)

open class TodoListRobot: BaseTestRobot() {

    class CreateTodoListRobot: TodoListRobot() {
        fun clickFabButton() = clickButton(R.id.fab)
        fun setNewItemDescription(desc: String) = fillEditText(R.id.todoText, desc)
        fun clickPriorityBar(value: GeneralLocation) = clickButton(R.id.seekBar).perform(GeneralClickAction(Tap.SINGLE, value, Press.FINGER))!!
        fun clickSubmitButton() = clickButton(R.id.submitTodo)
    }

    class DeleteTodoListRobot: TodoListRobot() {
        fun deleteItemAtPosition(listItemIndex: Int) = clickListItem(R.id.list, listItemIndex)
    }

}