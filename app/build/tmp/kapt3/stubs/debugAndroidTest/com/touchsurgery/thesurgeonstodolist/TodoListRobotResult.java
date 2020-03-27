package com.touchsurgery.thesurgeonstodolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/touchsurgery/thesurgeonstodolist/TodoListRobotResult;", "", "()V", "clickListItemByText", "Landroidx/test/espresso/ViewInteraction;", "text", "", "listItemIsDisplayed", "position", "", "withItemContent", "Lorg/hamcrest/Matcher;", "expectedText", "itemTextMatcher", "app_debug"})
public final class TodoListRobotResult {
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction clickListItemByText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction listItemIsDisplayed(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<java.lang.Object> withItemContent(@org.jetbrains.annotations.NotNull()
    java.lang.String expectedText) {
        return null;
    }
    
    /**
     * * Creates a matcher against the text stored in R.id.list. This text is roughly
     *     * "item: $row_number" ----> .... check.
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<java.lang.Object> withItemContent(@org.jetbrains.annotations.NotNull()
    org.hamcrest.Matcher<java.lang.String> itemTextMatcher) {
        return null;
    }
    
    public TodoListRobotResult() {
        super();
    }
}