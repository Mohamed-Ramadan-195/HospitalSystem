package com.example.hospitalsystem.ui.users.nurse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hospitalsystem.R
import com.example.hospitalsystem.databinding.FragmentNurseHomeBinding

class NurseHomeFragment : Fragment() {

    private var _binding: FragmentNurseHomeBinding ?= null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_nurse_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNurseHomeBinding.bind(view)

        onClicks()
    }

    private fun onClicks() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}