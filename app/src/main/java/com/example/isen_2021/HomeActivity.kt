package com.example.isen_2021

import android.content.Intent
import android.os.Bundle
import com.example.isen_2021.databinding.ActivityHomeBinding
import com.example.isen_2021.map.MapsActivity

class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.starterButton.setOnClickListener {
            startCategoryActivity(ItemType.STARTER)
        }

        binding.mainButton.setOnClickListener {
            startCategoryActivity(ItemType.MAIN)
        }

        binding.dessertButton.setOnClickListener {
            startCategoryActivity(ItemType.DESSERT)
        }

        binding.mapButton.setOnClickListener {
            val intent = Intent(this , MapsActivity::class.java)
            startActivity(intent)
        }

    }

    private fun startCategoryActivity(item: ItemType) {
        val intent = Intent(this, CategoryActivity::class.java)
        intent.putExtra(CATEGORY_NAME, item)
        startActivity(intent)
    }

    companion object {
        const val CATEGORY_NAME = "CATEGORY_NAME"
    }
}