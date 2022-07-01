package com.kesavan.interview.peacockinterviewcode.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kesavan.interview.peacockinterviewcode.databinding.LayThronesItemBinding
import com.kesavan.interview.peacockinterviewcode.loadImagefromUrl
import com.kesavan.interview.peacockinterviewcode.main.model.ThronesItem

class ThronesAdapter: RecyclerView.Adapter<ThronesViewHolder>() {
    private val thronesListItems: MutableList<ThronesItem> = mutableListOf()

    fun loadThrones(thronesListItems:MutableList<ThronesItem>){
        this.thronesListItems.addAll(thronesListItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThronesViewHolder {
        return ThronesViewHolder(LayThronesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ThronesViewHolder, position: Int) {
        holder.updateView(thronesListItems[position])
    }

    override fun getItemCount(): Int {
        return thronesListItems.size
    }
}

class ThronesViewHolder(itemView: LayThronesItemBinding) :
    RecyclerView.ViewHolder(itemView.root) {
    private val binding = itemView
    fun updateView(item:ThronesItem){
        binding.actorName.text=item.fullName
        binding.actorTitle.text= item.title
        binding.actorFamily.text=item.family
        binding.actorImage.loadImagefromUrl(item.imageUrl)
    }
}