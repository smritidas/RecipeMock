package com.example.android.recipemock.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.recipemock.R
import com.example.android.recipemock.api.Recipe

class RecipeAdapter():
    RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    private var dataset: List<Recipe> = emptyList()

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textViewName: TextView = view.findViewById(R.id.name)
        val textViewHeading: TextView = view.findViewById(R.id.heading)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_layout, parent, false)

        return ViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
    }

    override fun getItemCount() = dataset.size

    fun setData(dataset: List<Recipe>){
        this.dataset = dataset
        notifyDataSetChanged()
    }

}