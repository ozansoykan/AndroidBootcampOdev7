package com.ozansoykan.todoapphomework.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ozansoykan.todoapphomework.data.entity.Isler
import com.ozansoykan.todoapphomework.data.repo.IslerDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnasayfaFragmentViewModel @Inject constructor(var irepo:IslerDaoRepository) : ViewModel() {
    var islerListesi = MutableLiveData<List<Isler>>()

    init {
        isleriYukle()
        islerListesi = irepo.isleriGetir()
    }

    fun ara(aramaKelimesi:String){
        irepo.isAra(aramaKelimesi)
    }

    fun sil(is_id:Int){
        irepo.isSil(is_id)
    }

    fun kisileriYukle(){
        irepo.tumIsleriAl()
    }
}