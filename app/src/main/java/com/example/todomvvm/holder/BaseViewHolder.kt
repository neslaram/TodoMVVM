package com.example.todomvvm.holder

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<in T>(view: ViewDataBinding) : RecyclerView.ViewHolder(view.root) {
    abstract fun bind(item: T)
}