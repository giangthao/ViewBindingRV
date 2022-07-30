package com.tutorial.viewbindingrv
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.viewbindingrv.databinding.RecycleviewItemBinding

class MainAdapter(val taskList: List<Task>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding: RecycleviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
            fun bindItem(task: Task){
                itemBinding.titleTv.text = task.title
                itemBinding.timeTv.text = task.timestamp
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MainViewHolder{
        return MainViewHolder(RecycleviewItemBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int){
/*        var task: Task? = null
        task = taskList.get(position)
        var textView = holder.itemBinding.titleTv
        textView!!.text = task.title
        var textViewTime = holder.itemBinding.timeTv
        textViewTime!!.text = task.timestamp*/
        val task = taskList[position]
        holder.bindItem(task)


    }
    override fun getItemCount(): Int {
        return taskList.size
    }
}