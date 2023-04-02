package com.example.appnotes.ui.screen.profile.ProfileScreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.appnotes.utils.DataApi.sharedPref

class ProfileViewModel : ViewModel() {
    fun save() {
        sharedPref.edit().apply {
            putString("email", email.value)
            putString("phone", phone.value)
            apply()
        }


    }

    var email = mutableStateOf("")
    var phone = mutableStateOf("")

    init {
        email.value = sharedPref.getString("email", "") ?: ""
        phone.value = sharedPref.getString("phone", "") ?: ""
    }
}