package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FoodAdapter(
    private val context: Context,
    private val arrayList: ArrayList<Foods>
) : BaseAdapter() {

    override fun getCount() = arrayList.size
    override fun getItem(p0: Int) = arrayList[p0]
    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        var convertView: View? = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.foodmenu_item,viewGroup,false)
        }
        val foods = getItem(position) as Foods

        convertView?.apply {
            val foodImg = findViewById<ImageView>(R.id.foodimg)
            val foodName = findViewById<TextView>(R.id.foodName)
            val foodIngredients = findViewById<TextView>(R.id.foodDescription)
            val foodPrice = findViewById<TextView>(R.id.foodPrice)

            foods.apply {
                foodImg.setImageResource(image)
                foodName.text = name
                foodIngredients.text = ingredients
                foodPrice.text = price
            }
        }
        return convertView!!
    }
}