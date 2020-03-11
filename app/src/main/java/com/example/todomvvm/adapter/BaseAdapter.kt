package com.example.todomvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.todomvvm.entities.BaseDataItem
import com.example.todomvvm.holder.BaseViewHolder
import com.example.todomvvm.utils.BindableAdapter

@Suppress("UNCHECKED_CAST")
class BaseAdapter(private val typeFactory: TypesFactoryImpl) : RecyclerView.Adapter<BaseViewHolder<BaseDataItem>>(),
    BindableAdapter<BaseDataItem> {

    private var items = listOf<BaseDataItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<BaseDataItem> {
        val binding =
            DataBindingUtil.inflate<ViewDataBinding>(LayoutInflater.from(parent.context), viewType, parent, false)
        return typeFactory.holder(viewType, binding) as BaseViewHolder<BaseDataItem>
    }

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: BaseViewHolder<BaseDataItem>, position: Int) = holder.bind(items[position])

    override fun getItemViewType(position: Int) = items[position].type(typeFactory)

    override fun setData(data: List<BaseDataItem>) {
        this.items = data
        notifyDataSetChanged()
    }
}
