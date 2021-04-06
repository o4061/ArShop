package com.userfaltakas.arshop.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.FragmentInterestsBinding


class InterestsFragment : Fragment() {
    private var _binding: FragmentInterestsBinding? = null
    private val binding get() = _binding!!

    private var blackBtn = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInterestsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.blackBtn.setOnClickListener {
            blackBtn = if (blackBtn) {
                binding.blackBtn.setImageResource(R.color.transparent)
                false

            } else {
                binding.blackBtn.setImageResource(R.drawable.ic_checked)
                true
            }
        }

        binding.completeBtn.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_interestsFragment_to_locationFailFragment)
        }

        binding.skipBtn.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_interestsFragment_to_locationFailFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}