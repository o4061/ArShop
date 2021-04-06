package com.userfaltakas.arshop.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.FragmentEnterAppBinding


class EnterAppFragment : Fragment() {
    private var _binding: FragmentEnterAppBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEnterAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = activity?.intent?.extras
        if (bundle != null) {
            if (bundle.getString("dest").equals("login")) {
                Navigation.findNavController(view)
                    .navigate(R.id.action_enterAppFragment_to_locationFailFragment)
            } else {
                Navigation.findNavController(view)
                    .navigate(R.id.action_enterAppFragment_to_personalizeFragment)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}