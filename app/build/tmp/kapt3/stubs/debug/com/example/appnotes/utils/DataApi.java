package com.example.appnotes.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/appnotes/utils/DataApi;", "", "()V", "noteDao", "Lcom/example/appnotes/data/room/NoteDao;", "getNoteDao", "()Lcom/example/appnotes/data/room/NoteDao;", "setNoteDao", "(Lcom/example/appnotes/data/room/NoteDao;)V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "createNoteDao", "", "application", "Landroid/app/Application;", "createSharePref", "app_debug"})
public final class DataApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appnotes.utils.DataApi INSTANCE = null;
    public static com.example.appnotes.data.room.NoteDao noteDao;
    public static android.content.SharedPreferences sharedPref;
    
    private DataApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appnotes.data.room.NoteDao getNoteDao() {
        return null;
    }
    
    public final void setNoteDao(@org.jetbrains.annotations.NotNull()
    com.example.appnotes.data.room.NoteDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public final void createNoteDao(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
    
    public final void createSharePref(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
}