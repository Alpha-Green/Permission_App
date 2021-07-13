package com.noahgreenmusic.myapplication.ui

import androidx.recyclerview.widget.RecyclerView
import com.noahgreenmusic.myapplication.models.User

class UserAdapter: { var users: list<User>){

class UserViewHolder (private  val binding: UserItemBinding):
        RecyclerView.ViewHolder(binding.root)
    fun bindUser(user: User){


    }
}
