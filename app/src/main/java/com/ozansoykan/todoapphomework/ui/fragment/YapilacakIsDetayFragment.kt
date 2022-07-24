package com.ozansoykan.todoapphomework.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozansoykan.todoapphomework.R
import com.ozansoykan.todoapphomework.databinding.FragmentYapilacakIsDetayBinding

class YapilacakIsDetayFragment : Fragment() {

    private lateinit var tasarim : FragmentYapilacakIsDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentYapilacakIsDetayBinding.inflate(inflater, container, false)

        return tasarim.root
    }

}