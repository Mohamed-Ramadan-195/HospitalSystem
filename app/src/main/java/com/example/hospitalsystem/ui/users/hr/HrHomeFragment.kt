package com.example.hospitalsystem.ui.users.hr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hospitalsystem.R
import com.example.hospitalsystem.databinding.FragmentHrHomeBinding

class HrHomeFragment : Fragment() {

    private var _binding: FragmentHrHomeBinding ?= null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_hr_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHrHomeBinding.bind(view)

        onClicks()
    }

    private fun onClicks() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}