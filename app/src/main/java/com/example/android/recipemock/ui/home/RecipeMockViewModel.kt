package com.example.android.recipemock.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.recipemock.api.Recipe
import com.example.android.recipemock.api.RetrofitClient
import kotlinx.coroutines.launch
import retrofit2.http.GET

class RecipeMockViewModel : ViewModel(){
    private val _status = MutableLiveData<String>()
    //create new variable for list of recipes
    private lateinit var list: List<Recipe>

    val status: LiveData<String> = _status

    init {

        viewModelScope.launch{
            getRecipes()
        }
    }

    private suspend fun getRecipes(){
        try {
            val listResult = RetrofitClient.apiService.getRecipes()
            _status.value = "Success: ${listResult.size}"
        } catch (e: Exception) {
            _status.value = "Failure: ${e.message}"
        }
    }
}