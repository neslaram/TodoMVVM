package com.example.todomvvm.ui.mainactivity

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todomvvm.R

import androidx.databinding.DataBindingUtil
import com.example.todomvvm.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding: MainFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        binding.vm = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.lifecycleOwner = this
        return binding.root
    }
}
