package com.kefa.contactsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_details.view.*
import kotlinx.android.synthetic.main.contacts_list.view.*
import kotlinx.android.synthetic.main.contacts_list.view.name

class ContactsAdapter(
    var context: Context,
    var contacts: ArrayList<Mycontact>
) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(
                    R.layout.contacts_list,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = contacts.get(position).name
        holder.phone.text = contacts.get(position).phone
        holder.address.text = contacts.get(position).address
        holder.user_image.setImageResource(contacts.get(position).image)
        holder.itemView.setOnClickListener {
            //            Toast.makeText(context,
//                "you clicked ${contacts.get(position)}"
//                ,Toast.LENGTH_LONG).show()


            val intent = Intent(context, Details::class.java)
            intent.putExtra("name", contacts.get(position).name)
            intent.putExtra("phone", contacts.get(position).phone)
            intent.putExtra("email", contacts.get(position).email)
            intent.putExtra("address", contacts.get(position).address)
            intent.putExtra("image", contacts.get(position).image.toString())
            context.startActivity(intent)
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.name
        val phone = view.phone
        val address = view.address
        val user_image = view.user_image
    }
}
