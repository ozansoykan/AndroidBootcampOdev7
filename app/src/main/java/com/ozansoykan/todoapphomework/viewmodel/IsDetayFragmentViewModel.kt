package com.ozansoykan.todoapphomework.viewmodel

import androidx.lifecycle.ViewModel
import com.ozansoykan.todoapphomework.data.repo.IslerDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IsDetayFragmentViewModel @Inject constructor(var irepo:IslerDaoRepository) : ViewModel() {
    fun guncelle(is_id:Int,is_aciklama:String){
        irepo.isGuncelle(is_id,is_aciklama)
    }
}