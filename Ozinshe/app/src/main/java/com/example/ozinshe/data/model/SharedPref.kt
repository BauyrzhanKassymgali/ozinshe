package com.example.ozinshe.data.model


import android.content.Context
import android.content.SharedPreferences



class SharedPref {
    companion object{

        fun setValue(context: Context, value: String){
            val sharedPref: SharedPreferences = context.getSharedPreferences("auth_prefs", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPref.edit()
            editor.putString("saveToken", value)
            editor.apply()
        }
    }
}