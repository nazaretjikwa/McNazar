package com.example.mc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class madapter(private val namaList: ArrayList<dt>):RecyclerView.Adapter<madapter.MyViewHolder>() {

//    Class MyViewHolder (dt: View) : RecyclerView.ViewHolder(dt){
//        val img : ImageView = dt.findViewById(R.id.img)
//        val jdl : TextView = dt.findViewById(R.id.jdl)
//        val ket : TextView = dt.findViewById(R.id.ket)
//
//    }
    class MyViewHolder(dt: View) : RecyclerView.ViewHolder (dt){

        val img : ImageView = dt.findViewById(R.id.img)
    val jdl : TextView = dt.findViewById(R.id.jdl)
    val ket : TextView = dt.findViewById(R.id.ket)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.hm,parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return namaList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem : dt = namaList[position]
        holder.img.setImageResource(currentItem.gambar)
        holder.jdl.text = currentItem.judul
        holder.ket.text = currentItem.keterangan

    }


}