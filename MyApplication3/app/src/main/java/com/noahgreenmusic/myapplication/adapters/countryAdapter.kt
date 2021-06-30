package com.noahgreenmusic.myapplication.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noahgreenmusic.myapplication.model.Country

class countryAdapter(val countries: List<Country>) : RecyclerView.Adapter<countryAdapter.CountryViewHolder>(){
    class CountryViewHolder(var binding:CountryItemBinding): RecyclerView.ViewHolder(binding.root{
        fun bind(country) {}

    })

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var binding = countryItemBinding.Inflate(layoutInflater.from(parent.context))
        return countryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
       val country = countries[position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

class CountryItemBinding {
    fun root(function: () -> Unit): View {

    }

}
