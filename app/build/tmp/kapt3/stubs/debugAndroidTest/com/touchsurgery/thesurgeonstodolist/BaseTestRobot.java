package com.touchsurgery.thesurgeonstodolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\b\u00a8\u0006\u0018"}, d2 = {"Lcom/touchsurgery/thesurgeonstodolist/BaseTestRobot;", "", "()V", "childAtPosition", "Lorg/hamcrest/Matcher;", "Landroid/view/View;", "parentMatcher", "position", "", "clickButton", "Landroidx/test/espresso/ViewInteraction;", "resId", "desc", "", "clickListItem", "", "listRes", "fillEditText", "text", "matchText", "viewInteraction", "textView", "withListSize", "size", "app_debug"})
public class BaseTestRobot {
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction fillEditText(int resId, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction clickButton(int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction clickButton(@org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction textView(int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction matchText(@org.jetbrains.annotations.NotNull()
    androidx.test.espresso.ViewInteraction viewInteraction, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewInteraction matchText(int resId, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    public final void clickListItem(int listRes, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> childAtPosition(@org.jetbrains.annotations.NotNull()
    org.hamcrest.Matcher<android.view.View> parentMatcher, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withListSize(int size) {
        return null;
    }
    
    public BaseTestRobot() {
        super();
    }
}