package com.example.todomvvm.adapter

import androidx.databinding.ViewDataBinding
import com.example.todomvvm.holder.BaseViewHolder

interface TypesFactory {
    fun holder(type: Int, view: ViewDataBinding): BaseViewHolder<*>
}