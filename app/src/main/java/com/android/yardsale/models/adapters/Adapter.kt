package com.android.yardsale.models.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.yardsale.R
import com.android.yardsale.models.`class`.Product
import com.squareup.picasso.Picasso
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

class Adapter(private val productList: List<Product>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(val productView: View) : RecyclerView.ViewHolder(productView) {
        fun render(product: Product) {
            val photo = productView.findViewById<ImageView>(R.id.imageViewProduct)
            Picasso.get().load(product.photo)
                .into(productView.findViewById<ImageView>(R.id.imageViewProduct))
            productView.findViewById<TextView>(R.id.textViewPrice).text = "$ ${decimalFormat(product.price)}"
            productView.findViewById<TextView>(R.id.textViewNameProduct).text = product.name
        }
        private fun decimalFormat(price: Float): String {
            val decimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.getDefault())
            decimalFormatSymbols.groupingSeparator = ','
            decimalFormatSymbols.decimalSeparator = '.'
            val decimalFormat = DecimalFormat("#,###.##", decimalFormatSymbols)
            return decimalFormat.format(price)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_product_yard, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(productList[position])
    }
}