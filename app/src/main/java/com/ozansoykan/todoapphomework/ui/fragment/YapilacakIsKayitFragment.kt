package com.ozansoykan.todoapphomework.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozansoykan.todoapphomework.R
import com.ozansoykan.todoapphomework.databinding.FragmentYapilacakIsKayitBinding


class YapilacakIsKayitFragment : Fragment() {

    private lateinit var tasarim : FragmentYapilacakIsKayitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentYapilacakIsKayitBinding.inflate(inflater, container, false)
        tasarim.toolbarKayit.title = "Yapılacak İş Kayıt"

        tasarim.buttonKaydet.setOnClickListener {
            val yapilacak_is = tasarim.editTextYapilacakIs.text.toString()
            kayit(yapilacak_is)
        }

        return tasarim.root
    }

    fun kayit(yapilacak_is:String){
        Log.e("İş",yapilacak_is)
    }

}