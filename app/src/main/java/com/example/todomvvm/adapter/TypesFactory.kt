package com.example.todomvvm.adapter

import android.view.View
import com.example.todomvvm.holder.BaseViewHolder

interface TypesFactory {
    fun holder(type: Int, view: View): BaseViewHolder<*>
}