package com.userfaltakas.arshop.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.FragmentSingUpBinding
import com.userfaltakas.arshop.ui.activities.shop_activity.ShopActivity


class SingUpFragment : Fragment() {

    private var _binding: FragmentSingUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSingUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_singUpFragment_to_startFragment)
        }

        binding.SignUpBtn.setOnClickListener {
            val intent = Intent(activity, ShopActivity::class.java)
            intent.putExtra("dest", "singUp")
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}