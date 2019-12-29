package com.kefa.contactsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.contacts_list.*

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val name: String = intent.getStringExtra("name")
        val address: String = intent.getStringExtra("address")
        val phone: String = intent.getStringExtra("phone")
        val email: String = intent.getStringExtra("email")
        val image: Int = intent.getStringExtra("image").toInt()


        name1.text = name
        phone1.text = phone
        address1.text = address
        email1.text = email
        imageView1.setImageResource(image)
    }
}