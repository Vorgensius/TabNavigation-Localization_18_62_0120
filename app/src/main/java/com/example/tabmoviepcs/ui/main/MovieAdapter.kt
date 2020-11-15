package com.example.tabmoviepcs.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.tabmoviepcs.R
import kotlinx.android.synthetic.main.item_row.view.*

class MovieAdapter (private val listMovie: ArrayList<Movie>): RecyclerView.Adapter<MovieAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)

        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(movie:Movie){
            with(itemView){
                txtTitle.text = movie.title
                txtYear.text = movie.year
            }
        }

    }

}