package com.example.hospitalsystem.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hospitalsystem.R
import com.example.hospitalsystem.databinding.FragmentNewUserBinding

class NewUserFragment : Fragment() {

    private var _binding: FragmentNewUserBinding ?= null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_new_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNewUserBinding.bind(view)

        onClicks()
    }

    private fun onClicks() {
        binding?.backButton?.setOnClickListener {   }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}