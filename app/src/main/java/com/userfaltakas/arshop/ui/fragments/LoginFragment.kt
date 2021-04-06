package com.userfaltakas.arshop.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.FragmentLoginBinding
import com.userfaltakas.arshop.ui.activities.shop_activity.ShopActivity

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.backButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_startFragment)
        }

        binding.loginBtn.setOnClickListener {
            val intent = Intent(activity, ShopActivity::class.java)
            intent.putExtra("dest", "login")
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}