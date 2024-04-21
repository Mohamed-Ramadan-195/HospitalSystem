package com.example.hospitalsystem.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hospitalsystem.R
import com.example.hospitalsystem.databinding.FragmentCreateReportBinding

class CreateReportFragment : Fragment() {

    private var _binding: FragmentCreateReportBinding ?= null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create_report, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCreateReportBinding.bind(view)

        onClicks()
    }

    private fun onClicks() {
        binding?.backButton?.setOnClickListener {

        }
        binding?.createReportButton?.setOnClickListener {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}