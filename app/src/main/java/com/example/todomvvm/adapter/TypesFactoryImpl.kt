package com.example.todomvvm.adapter

import android.view.View
import com.example.todomvvm.R
import com.example.todomvvm.holder.BaseViewHolder
import com.example.todomvvm.holder.NoteHolder

private const val RUNTIME_EXCEPTION = "Illegal view type"

class TypesFactoryImpl : TypesFactory {
    override fun holder(type: Int, view: View): BaseViewHolder<*> {
        return when (type) {
            R.layout.item_note -> NoteHolder(view)
            else -> throw RuntimeException(RUNTIME_EXCEPTION)
        }
    }
}