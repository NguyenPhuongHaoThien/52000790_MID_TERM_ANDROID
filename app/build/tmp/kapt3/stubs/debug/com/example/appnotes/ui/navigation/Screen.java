package com.example.appnotes.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001\u0004\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/appnotes/ui/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "AddScreen", "NotesScreen", "ProfileScreen", "UpdateScreen", "Lcom/example/appnotes/ui/navigation/Screen$NotesScreen;", "Lcom/example/appnotes/ui/navigation/Screen$UpdateScreen;", "Lcom/example/appnotes/ui/navigation/Screen$ProfileScreen;", "Lcom/example/appnotes/ui/navigation/Screen$AddScreen;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String route;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/appnotes/ui/navigation/Screen$NotesScreen;", "Lcom/example/appnotes/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class NotesScreen extends com.example.appnotes.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.appnotes.ui.navigation.Screen.NotesScreen INSTANCE = null;
        
        private NotesScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/appnotes/ui/navigation/Screen$UpdateScreen;", "Lcom/example/appnotes/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class UpdateScreen extends com.example.appnotes.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.appnotes.ui.navigation.Screen.UpdateScreen INSTANCE = null;
        
        private UpdateScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/appnotes/ui/navigation/Screen$ProfileScreen;", "Lcom/example/appnotes/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class ProfileScreen extends com.example.appnotes.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.appnotes.ui.navigation.Screen.ProfileScreen INSTANCE = null;
        
        private ProfileScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/appnotes/ui/navigation/Screen$AddScreen;", "Lcom/example/appnotes/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class AddScreen extends com.example.appnotes.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.appnotes.ui.navigation.Screen.AddScreen INSTANCE = null;
        
        private AddScreen() {
            super(null);
        }
    }
}