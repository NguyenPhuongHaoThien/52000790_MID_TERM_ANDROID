package com.example.appnotes.ui.screen.updateNote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/appnotes/ui/screen/updateNote/UpdateNoteViewmodel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "contentCurrentNote", "Landroidx/compose/runtime/MutableState;", "", "getContentCurrentNote", "()Landroidx/compose/runtime/MutableState;", "setContentCurrentNote", "(Landroidx/compose/runtime/MutableState;)V", "idCurrentNote", "", "Ljava/lang/Integer;", "timeCurrentNote", "", "getTimeCurrentNote", "setTimeCurrentNote", "titleCurrentNote", "getTitleCurrentNote", "setTitleCurrentNote", "update", "", "app_debug"})
public final class UpdateNoteViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.String> titleCurrentNote;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.String> contentCurrentNote;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.Long> timeCurrentNote;
    private java.lang.Integer idCurrentNote;
    
    public UpdateNoteViewmodel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getTitleCurrentNote() {
        return null;
    }
    
    public final void setTitleCurrentNote(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getContentCurrentNote() {
        return null;
    }
    
    public final void setContentCurrentNote(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Long> getTimeCurrentNote() {
        return null;
    }
    
    public final void setTimeCurrentNote(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.Long> p0) {
    }
    
    public final void update() {
    }
}