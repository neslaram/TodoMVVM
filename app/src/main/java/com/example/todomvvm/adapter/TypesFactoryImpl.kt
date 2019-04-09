package com.example.todomvvm.adapter

import androidx.databinding.ViewDataBinding
import com.example.todomvvm.R
import com.example.todomvvm.databinding.ItemNoteBinding
import com.example.todomvvm.holder.BaseViewHolder
import com.example.todomvvm.holder.NoteHolder

private const val RUNTIME_EXCEPTION = "Illegal binding type"

class TypesFactoryImpl : TypesFactory {
    override fun holder(type: Int, view: ViewDataBinding): BaseViewHolder<*> {
        return when (type) {
            R.layout.item_note -> NoteHolder(view as ItemNoteBinding)
            else -> throw RuntimeException(RUNTIME_EXCEPTION)
        }
    }
}