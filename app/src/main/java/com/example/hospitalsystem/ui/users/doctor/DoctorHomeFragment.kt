package com.example.hospitalsystem.ui.users.doctor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hospitalsystem.R
import com.example.hospitalsystem.databinding.FragmentDoctorHomeBinding

class DoctorHomeFragment : Fragment() {

    private var _binding: FragmentDoctorHomeBinding ?= null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_doctor_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDoctorHomeBinding.bind(view)

        onClicks()
    }

    private fun onClicks() {
        binding?.notificationIcon?.setOnClickListener {  }
        binding?.callsCard?.setOnClickListener {  }
        binding?.tasksCard?.setOnClickListener {  }
        binding?.reportsCard?.setOnClickListener {  }
        binding?.attendanceCard?.setOnClickListener {  }
        binding?.casesCard?.setOnClickListener {  }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}