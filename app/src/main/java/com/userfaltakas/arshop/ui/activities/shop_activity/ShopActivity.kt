package com.userfaltakas.arshop.ui.activities.shop_activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.userfaltakas.arshop.R
import com.userfaltakas.arshop.databinding.ActivityShopBinding

class ShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false

        val navController = findNavController(R.id.fragment3)
        binding.bottomNavigationView.setupWithNavController(navController)
    }

    fun hideBottomNavigationView() {
        binding.bottomNavigationLayout.visibility = View.GONE
    }

    fun showBottomNavigationView() {
        binding.bottomNavigationLayout.visibility = View.VISIBLE
    }
}