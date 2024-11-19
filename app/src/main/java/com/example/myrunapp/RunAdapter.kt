package com.example.myrunapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Runner(val date: String, val morning: Int, val afternoon: Int, val notes: String)

class RunAdapter(private val Runner:List<Runner>) : RecyclerView.Adapter<RunAdapter.viewHolder>() {
    class viewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        val date: TextView =view.findViewById(R.id.dateOfRun)
        val morning: TextView =view.findViewById(R.id.morningRun)
        val noon: TextView =view.findViewById(R.id.afternoonRun)
        val notes: TextView =view.findViewById(R.id.enterNotes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}