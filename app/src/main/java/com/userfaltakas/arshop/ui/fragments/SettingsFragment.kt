package com.userfaltakas.arshop.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.FragmentSettingsBinding
import com.userfaltakas.arshop.ui.activities.authentication_activity.AuthenticationActivity

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.modifyInterests.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_settingsFragment_to_personalizeFragment)
        }

        binding.logoutBtn.setOnClickListener {
            val intent = Intent(activity, AuthenticationActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}