package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val listView = findViewById<ListView>(R.id.listview)
        val taskList = arrayListOf<String>() // Step 1 - j0 bhi task hai unka ek array bna liya
        taskList.add("Attend Exam")
        taskList.add("Complete Assignment")
        taskList.add("Submit Project")
        taskList.add("Grocery Lana Hai")
        taskList.add("Bed Lena Hai")
        taskList.add("Laptop Kharidna hai")
        val adapterForMyListView =ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList) // step 2 adapter invoke kiya aur kaise list view
        //chahiye wo select kiya same syntax rhega aur taskList bhi pass kr diya
        listView.adapter = adapterForMyListView
        // adapter invoke kr diya
 
    listView.setOnItemClickListener { parent, view, position, id ->
            // these attributes are passed by default and it is for each item ye sb by default
        val text = "Clicked on item :" +(view as TextView).text.toString()
        // basically ye function hr item ka data rkha hai to list ke item me kya likha hai
        // wo bhi pta hoga hi to hmne view me se wo text le liye ab view me direct
        // get text ka option ni ata to usko types cast kr diya Textview me
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
    }
}