package com.example.todomvvm.view.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todomvvm.R
import com.example.todomvvm.adapter.BaseAdapter
import com.example.todomvvm.databinding.MainFragmentBinding
import com.example.todomvvm.utils.navigateSafe
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.android.ext.android.inject

class MainFragment : Fragment() {
    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this)[MainViewModel::class.java]
    }

    private val adapter: BaseAdapter by inject()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding: MainFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("", arguments.toString())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNotesList()
        setupObservers()
    }

    private fun setupNotesList() {
        context?.let { context ->
            notesRecycler.apply {
                adapter = this@MainFragment.adapter
                layoutManager = LinearLayoutManager(context)
                addItemDecoration(DividerItemDecoration(context, LinearLayout.VERTICAL))
            }
        }
    }

    private fun setupObservers() {
        viewModel.addNoteEvent.observe(this, Observer {
            // Only proceed if the event has never been handled
            it.getContentIfNotHandled()?.let {
                view?.let { view ->
                    Navigation.findNavController(view)
                            .navigateSafe(R.id.action_mainFragment_to_addNewNoteFragment)
                }
            }
        })
    }
}
