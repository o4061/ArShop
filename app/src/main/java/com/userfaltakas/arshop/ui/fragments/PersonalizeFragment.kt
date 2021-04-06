package com.userfaltakas.arshop.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.FragmentPersonalizeBinding

import com.userfaltakas.arshop.ui.activities.shop_activity.ShopActivity

class PersonalizeFragment : Fragment() {
    private var _binding: FragmentPersonalizeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalizeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as ShopActivity).hideBottomNavigationView()
        var xsShirt = false

        val ageAdapter = context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.age,
                R.layout.age_spinner_layout
            )
        }
        ageAdapter?.setDropDownViewResource(R.layout.spinner_dropdown_layout)
        binding.spinnerAge.adapter = ageAdapter


        val genderAdapter = context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.gender,
                R.layout.gender_spinner_layout
            )
        }
        genderAdapter?.setDropDownViewResource(R.layout.spinner_dropdown_layout)
        binding.spinnerGender.adapter = genderAdapter

        binding.nextBtn.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_personalizeFragment_to_interestsFragment)
        }

        binding.skipBtn.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_personalizeFragment_to_interestsFragment)
        }


        binding.xsShirt.setOnClickListener {
            xsShirt = if (xsShirt) {
                binding.xsShirt.setImageResource(R.drawable.ic_xs_unchecked)
                false
            } else {
                binding.xsShirt.setImageResource(R.drawable.ic_xs_checked)
                true
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}