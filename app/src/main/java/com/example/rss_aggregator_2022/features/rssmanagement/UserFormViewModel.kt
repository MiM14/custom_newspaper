package com.example.rss_aggregator_2022.features.rssmanagement

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rss_aggregator_2022.features.domain.SaveRssUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserFormViewModel(private val saveRssUseCase: SaveRssUseCase) : ViewModel() {

    private val _formUiState: MutableLiveData<FormUiState> by lazy {
        MutableLiveData((FormUiState()))
    }
    val formUiState: MutableLiveData<FormUiState> = _formUiState

    fun saveRss(name: String, url: String) {
        viewModelScope.launch(Dispatchers.IO) {
            saveRssUseCase(name, url)
            _formUiState.postValue(FormUiState(isSuccess = true))
        }
    }

    data class FormUiState(val isSuccess: Boolean = false)
}