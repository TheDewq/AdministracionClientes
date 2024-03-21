package com.example.adminstracionclientes.ui.lista

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListaViewModel : ViewModel() {
    fun prueba(view: View){
        Toast.makeText(view.context, "si srive", Toast.LENGTH_LONG)
        print("si")
    }
}