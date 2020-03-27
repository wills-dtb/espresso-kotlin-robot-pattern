package com.touchsurgery.thesurgeonstodolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/touchsurgery/thesurgeonstodolist/TodoListRobot;", "Lcom/touchsurgery/thesurgeonstodolist/BaseTestRobot;", "()V", "CreateTodoListRobot", "DeleteTodoListRobot", "app_debug"})
public class TodoListRobot extends com.touchsurgery.thesurgeonstodolist.BaseTestRobot {
    
    public TodoListRobot() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/touchsurgery/thesurgeonstodolist/TodoListRobot$CreateTodoListRobot;", "Lcom/touchsurgery/thesurgeonstodolist/TodoListRobot;", "()V", "clickFabButton", "Landroidx/test/espresso/ViewInteraction;", "clickPriorityBar", "value", "Landroidx/test/espresso/action/GeneralLocation;", "clickSubmitButton", "setNewItemDescription", "desc", "", "app_debug"})
    public static final class CreateTodoListRobot extends com.touchsurgery.thesurgeonstodolist.TodoListRobot {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.test.espresso.ViewInteraction clickFabButton() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.test.espresso.ViewInteraction setNewItemDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String desc) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.test.espresso.ViewInteraction clickPriorityBar(@org.jetbrains.annotations.NotNull()
        androidx.test.espresso.action.GeneralLocation value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.test.espresso.ViewInteraction clickSubmitButton() {
            return null;
        }
        
        public CreateTodoListRobot() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/touchsurgery/thesurgeonstodolist/TodoListRobot$DeleteTodoListRobot;", "Lcom/touchsurgery/thesurgeonstodolist/TodoListRobot;", "()V", "deleteItemAtPosition", "", "listItemIndex", "", "app_debug"})
    public static final class DeleteTodoListRobot extends com.touchsurgery.thesurgeonstodolist.TodoListRobot {
        
        public final void deleteItemAtPosition(int listItemIndex) {
        }
        
        public DeleteTodoListRobot() {
            super();
        }
    }
}