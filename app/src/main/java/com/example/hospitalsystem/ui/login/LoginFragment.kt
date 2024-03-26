package com.example.hospitalsystem.ui.login

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hospitalsystem.R
import com.example.hospitalsystem.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding ?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLoginBinding.bind(view)

        onClicks()
    }

    private fun onClicks() {
        binding.loginButton.setOnClickListener {
            val emailError =  validateEmail()
            val passwordError = validatePassword()

            if (emailError != null) {
                binding.emailEditText.error = emailError
                return@setOnClickListener
            } else if (passwordError != null) {
                binding.passwordEditText.error = passwordError
                return@setOnClickListener
            } else {
                findNavController().navigate(R.id.action_loginFragment_to_receptionistHomeFragment)
            }
        }
    }

    private fun validateEmail(): String? {
        val emailText = binding.emailEditText.text.toString()
        return if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
            "Invalid email address"
        } else {
            null
        }
    }

    private fun validatePassword(): String? {
        val passwordText = binding.passwordEditText.text.toString()
        return if (passwordText.length < 8) {
            "password must be at least 8 characters"
        } else if (!passwordText.matches(".*[A-Z].*".toRegex())) {
            "password must contain upper-case letter"
        } else if (!passwordText.matches(".*[a-z].*".toRegex())) {
            "password must contain lower-case letter"
        } else {
            null
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}