package com.userfaltakas.arshop.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.userfaltakas.arshop.databinding.FragmentLocationFailBinding
import com.userfaltakas.arshop.ui.activities.shop_activity.ShopActivity

class LocationFailFragment : Fragment() {
    private var _binding: FragmentLocationFailBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLocationFailBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as ShopActivity).showBottomNavigationView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}