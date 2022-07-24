package com.ozansoykan.todoapphomework.data.repo

import androidx.lifecycle.MutableLiveData
import com.ozansoykan.todoapphomework.data.entity.Isler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class IslerDaoRepository(var idao:IslerDaoRepository) {
    var islerListesi: MutableLiveData<List<Isler>>

    init {
        islerListesi = MutableLiveData()
    }

    fun isleriGetir() : MutableLiveData<List<Isler>> {
        return islerListesi
    }

    fun isKayit(is_aciklama:String){
        val job = CoroutineScope(Dispatchers.Main).launch {
            val yeniIs = Isler(0,is_aciklama)
            idao.isKayit(yeniIs)
        }
    }

    fun isGuncelle(is_id:Int,is_aciklama: String){
        val job = CoroutineScope(Dispatchers.Main).launch {
            val guncellenenIs = Isler(is_id, is_aciklama)
            idao.isGuncelle(guncellenenIs)
        }
    }

    fun isAra(aramaKelimesi:String){
        val job = CoroutineScope(Dispatchers.Main).launch {
            islerListesi.value = idao.isAra(aramaKelimesi)
        }
    }

    fun isSil(is_id:Int){
        val job = CoroutineScope(Dispatchers.Main).launch {
            val silinenIs = Isler(is_id,"")
            idao.isSil(silinenIs)
            tumIsleriAl()
        }
    }

    fun tumIsleriAl(){
        val job = CoroutineScope(Dispatchers.Main).launch {
            islerListesi.value = idao.tumIsler()
        }
    }

}