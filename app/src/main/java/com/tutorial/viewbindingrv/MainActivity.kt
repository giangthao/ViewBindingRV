package com.tutorial.viewbindingrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutorial.viewbindingrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
/* This is my code
    lateinit var taskList: List<Task>
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var rvItem = binding!!.rvItemsList
        setContentView(binding?.root)
        //Create adapter passing in the sample user data

       /*This is my Code
        taskList = TaskList.taskList*/
         var adapter = MainAdapter(TaskList.taskList)
        // Lookup the recyclerivew in activity layout
        /*rvItem.adapter = adapter
        rvItem.layoutManager = LinearLayoutManager(this)*/
        binding?.rvItemsList?.adapter = adapter
        binding?.rvItemsList?.layoutManager = LinearLayoutManager(this)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}