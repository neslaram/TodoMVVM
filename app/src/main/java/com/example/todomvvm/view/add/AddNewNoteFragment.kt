package com.example.todomvvm.view.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.todomvvm.R
import com.example.todomvvm.databinding.AddNewNoteFragmentBinding
import com.example.todomvvm.utils.NOTE_ITEM
import com.example.todomvvm.utils.navigateSafe

class AddNewNoteFragment : Fragment() {

    private val viewModel: AddNewNoteViewModel by lazy {
        ViewModelProviders.of(this)[AddNewNoteViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding: AddNewNoteFragmentBinding =
                DataBindingUtil.inflate(inflater, R.layout.add_new_note_fragment, container, false)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.saveNoteEvent.observe(this, Observer {
            // Only proceed if the event has never been handled
            it.getContentIfNotHandled()?.let {
                view?.let { view ->
                    val bundle = Bundle().apply {
                        putSerializable(NOTE_ITEM, it)
                    }
                    Navigation.findNavController(view)
                            .navigateSafe(R.id.action_addNewNoteFragment_to_mainFragment, bundle)
                }
            }
        })
    }
}
