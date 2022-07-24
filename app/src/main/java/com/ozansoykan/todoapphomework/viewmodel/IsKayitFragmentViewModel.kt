package com.ozansoykan.todoapphomework.viewmodel

import androidx.lifecycle.ViewModel
import com.ozansoykan.todoapphomework.data.repo.IslerDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IsKayitFragmentViewModel @Inject constructor(var irepo:IslerDaoRepository) : ViewModel() {
    fun kayit(is_aciklama:String){
        irepo.isKayit(is_aciklama)
    }
}