package com.example.practica_demo.ui.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LocationViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "Mapa de Ubicacion"
    }
    val text: LiveData<String> = _text
}