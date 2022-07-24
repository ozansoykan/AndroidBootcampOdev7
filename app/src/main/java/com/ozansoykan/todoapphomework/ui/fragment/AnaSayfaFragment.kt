package com.ozansoykan.todoapphomework.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.ozansoykan.todoapphomework.R
import com.ozansoykan.todoapphomework.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        tasarim.toolbarAnaSayfa.title = "Yapılacak İşler"

        tasarim.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisKayit)
        }

        return tasarim.root
    }


}