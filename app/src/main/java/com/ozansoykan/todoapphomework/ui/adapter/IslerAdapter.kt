package com.ozansoykan.todoapphomework.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ozansoykan.todoapphomework.data.entity.Isler
import com.ozansoykan.todoapphomework.databinding.CardTasarimBinding
import com.ozansoykan.todoapphomework.ui.fragment.AnaSayfaFragmentDirections
import com.ozansoykan.todoapphomework.viewmodel.AnasayfaFragmentViewModel

class KisilerAdapter(var mContext: Context,
                     var islerListesi:List<Isler>,
                     var viewModel: AnasayfaFragmentViewModel
)
    : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim//Shadowing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim:CardTasarimBinding = DataBindingUtil.inflate(layoutInflater,R.layout.card_tasarim, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val isler = islerListesi.get(position)
        val t = holder.tasarim
        t.islerListesi = isler

        t.imageViewSilResim.setOnClickListener {
            Snackbar.make(it,"${isler.is_aciklama} silinsin mi?", Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                    viewModel.sil(isler.is_id)
                }.show()
        }

        t.satirCard.setOnClickListener {
            val gecis = AnaSayfaFragmentDirections.gecisDetay(isler = isler)
            Navigation.gecisYap(it,gecis)
        }
    }

    override fun getItemCount(): Int {
        return islerListesi.size
    }
}