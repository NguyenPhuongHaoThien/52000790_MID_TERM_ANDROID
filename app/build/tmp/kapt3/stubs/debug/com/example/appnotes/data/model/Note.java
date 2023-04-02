package com.example.appnotes.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "note")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\rH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b\u00a8\u0006!"}, d2 = {"Lcom/example/appnotes/data/model/Note;", "", "titleNote", "", "contentNote", "timeNote", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getContentNote", "()Ljava/lang/String;", "setContentNote", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getTimeNote", "()J", "setTimeNote", "(J)V", "getTitleNote", "setTitleNote", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Note {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String titleNote;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String contentNote;
    private long timeNote;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appnotes.data.model.Note copy(@org.jetbrains.annotations.NotNull()
    java.lang.String titleNote, @org.jetbrains.annotations.NotNull()
    java.lang.String contentNote, long timeNote) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Note(@org.jetbrains.annotations.NotNull()
    java.lang.String titleNote, @org.jetbrains.annotations.NotNull()
    java.lang.String contentNote, long timeNote) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitleNote() {
        return null;
    }
    
    public final void setTitleNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentNote() {
        return null;
    }
    
    public final void setContentNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getTimeNote() {
        return 0L;
    }
    
    public final void setTimeNote(long p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
}