package com.example.listview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val foodList = ArrayList<Foods>().also {
            it.add(
                Foods(
                    name = "Cheeseburger",
                    ingredients = "Beef, Cheese, Lettuce, Tomato, Bread",
                    image = R.drawable.cheeseburger,
                    price = "$3.00"
                )
            )
            it.add(
                Foods(
                    name = "Chicken Alfredo",
                    ingredients = "Chicken, Noodles, Alfredo Sauce",
                    image = R.drawable.alfredo,
                    price = "$5.00"
                )
            )
            it.add(
                Foods(
                    name = "Meatball Sandwich",
                    ingredients = "Beef, Parmesan Cheese, Peppers, Bread",
                    image = R.drawable.meatball,
                    price = "$4.50"
                )
            )
            it.add(
                Foods(
                    name = "Taco",
                    ingredients = "Beef or Chicken, Cheese, Lettuce, Tortilla",
                    image = R.drawable.taco,
                    price = "$2.50"
                )
            )
        }
        val adapter = FoodAdapter(this,foodList)
        binding.foodMenu.adapter = adapter
    }
}