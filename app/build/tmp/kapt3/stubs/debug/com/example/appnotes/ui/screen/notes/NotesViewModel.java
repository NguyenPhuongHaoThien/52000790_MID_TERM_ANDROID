package com.example.appnotes.ui.screen.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\u000e\u0010\n\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u0005J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010+\u001a\u00020\'2\u0006\u0010\u001a\u001a\u00020\u001bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000b0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006,"}, d2 = {"Lcom/example/appnotes/ui/screen/notes/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dateFitter", "Landroidx/compose/runtime/MutableState;", "", "getDateFitter", "()Landroidx/compose/runtime/MutableState;", "setDateFitter", "(Landroidx/compose/runtime/MutableState;)V", "fitter", "", "", "getFitter", "()Ljava/util/List;", "setFitter", "(Ljava/util/List;)V", "isShow", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "setShow", "(Landroidx/lifecycle/MutableLiveData;)V", "isShowDialogFitter", "setShowDialogFitter", "note", "Lcom/example/appnotes/data/model/Note;", "getNote", "()Lcom/example/appnotes/data/model/Note;", "setNote", "(Lcom/example/appnotes/data/model/Note;)V", "notes", "Landroidx/lifecycle/LiveData;", "getNotes", "()Landroidx/lifecycle/LiveData;", "setNotes", "(Landroidx/lifecycle/LiveData;)V", "closeDialog", "", "deleteNote", "indexFitter", "getfitter", "openDialog", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.appnotes.data.model.Note>> notes;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShow;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowDialogFitter;
    @org.jetbrains.annotations.Nullable()
    private com.example.appnotes.data.model.Note note;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> fitter;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.Integer> dateFitter;
    
    public NotesViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appnotes.data.model.Note>> getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.appnotes.data.model.Note>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShow() {
        return null;
    }
    
    public final void setShow(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowDialogFitter() {
        return null;
    }
    
    public final void setShowDialogFitter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appnotes.data.model.Note getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.Nullable()
    com.example.appnotes.data.model.Note p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFitter() {
        return null;
    }
    
    public final void setFitter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getDateFitter() {
        return null;
    }
    
    public final void setDateFitter(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.Integer> p0) {
    }
    
    public final void openDialog(@org.jetbrains.annotations.NotNull()
    com.example.appnotes.data.model.Note note) {
    }
    
    public final void deleteNote() {
    }
    
    public final void closeDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getfitter() {
        return null;
    }
    
    public final void fitter(int indexFitter) {
    }
}