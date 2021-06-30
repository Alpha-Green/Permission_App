package com.noahgreenmusic.tablayouts

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.noahgreenmusic.tablayouts.views.CallkFragment
import com.noahgreenmusic.tablayouts.views.ChatFragment
import com.noahgreenmusic.tablayouts.views.StatusFragment

class WhatsAppAdapter (fm: FragmentManager): FragmentStatePagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Chats"
            1 -> return "Status"
            2 -> return "Calls"
            else -> return "Chat"
        }
    }

    override fun getCount(): Int {
       return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatFragment()
            1 -> return StatusFragment()
            2 -> return CallkFragment()
            else -> return ChatFragment()
        }
    }

}
