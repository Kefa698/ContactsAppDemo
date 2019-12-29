package com.kefa.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)


//        create list of names
        var names = arrayListOf<Mycontact>()
        names.add(Mycontact("Zach", "0712345678", R.mipmap.img1, "Kenya", "zach@gmail.com"))
        names.add(Mycontact("Ayana", "0723058255", R.mipmap.img2, "Kenya", "ayanaiyyar@gmail.com"))
        names.add(Mycontact("Challo", "0759302393", R.mipmap.img3, "Kenya", "challo@gmail.com"))
        names.add(Mycontact("Lena", "0712345678", R.mipmap.img4, "Kenya", "zach@gmail.com"))
        names.add(Mycontact("Adesh", "0712345678", R.mipmap.img5, "Kenya", "zach@gmail.com"))
        names.add(Mycontact("Silas", "0712345678", R.mipmap.img6, "Kenya", "zach@gmail.com"))


//
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactsAdapter(this, names)
    }


}
