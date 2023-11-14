package com.example.tugasretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasretrofit.databinding.ListPokemonBinding
import com.squareup.picasso.Picasso

typealias onClickDisaster = (Disaster) -> Unit

class DisasterAdaptor (
    private val listDisaster: List<Disaster>,
    private val onClickDisaster: onClickDisaster) : RecyclerView.Adapter<DisasterAdaptor.ItemDisasterViewHolder>() {
        inner class ItemDisasterViewHolder(private val binding : ListPokemonBinding) :
            RecyclerView.ViewHolder(binding.root){
            fun bind (data: Disaster){
                with(binding){
                    nameCard.text = data.nameDisaster
                    Picasso.get().load(data.imageDisaster).into(fotoCard)
                    itemView.setOnClickListener{
                        onClickDisaster(data)
                    }
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDisasterViewHolder {
            val binding = ListPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ItemDisasterViewHolder(binding)
        }

        override fun getItemCount(): Int = listDisaster.size

        override fun onBindViewHolder(holder: ItemDisasterViewHolder, position: Int) {
            holder.bind(listDisaster[position])
        }
}