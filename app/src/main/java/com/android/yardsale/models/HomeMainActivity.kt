package com.android.yardsale.models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.yardsale.R
import com.android.yardsale.models.adapters.Adapter
import com.android.yardsale.models.`class`.Product
import com.google.android.material.button.MaterialButton

class HomeMainActivity : AppCompatActivity() {
    private lateinit var recyclerViewProducts: RecyclerView
    private val productList = listOf(
        Product("Smartphone Samsung Galaxy S21", 2599000f, "https://i.pinimg.com/564x/1f/a0/ab/1fa0ab247691b84300d8a02931087d0e.jpg"),
        Product("Laptop HP Pavilion", 3499000f, "https://i.pinimg.com/736x/45/de/2a/45de2adef4cb97669e7274fd179184f7.jpg"),
        Product("Televisor LG 4K 55 pulgadas", 1899000f, "https://i.pinimg.com/736x/3e/9e/14/3e9e14d0dbb846facda530f21bec23d6.jpg"),
        Product("Consola de juegos PS5", 4999000f, "https://i.pinimg.com/564x/38/09/db/3809db37105d38ed79744eb0306e4168.jpg"),
        Product("Tablet Lenovo Tab M10", 799000f, "https://i.pinimg.com/564x/86/c9/11/86c9119bc8d6ec29c3686c96d3ed6c44.jpg"),
        Product("Cámara Canon EOS Rebel T7", 1999000f, "https://i.pinimg.com/564x/4a/0f/34/4a0f34c77dc839f0cf2acdb15d47037b.jpg"),
        Product("Auriculares inalámbricos Sony", 499000f, "https://i.pinimg.com/564x/6f/e4/63/6fe46397bbdbc199d1d83e1ac8cc7f7d.jpg"),
        Product("Aspiradora robot iRobot Roomba", 1299000f, "https://i.pinimg.com/564x/67/87/41/67874118b1809b3658f560d8fc42f1e7.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)
        initComponents()
        initRecyclerView()
    }

    private fun initComponents() {
        recyclerViewProducts = findViewById(R.id.recyclerViewProducts)
    }

    private fun initRecyclerView() {
        val layoutManager = GridLayoutManager(this, 2)
        recyclerViewProducts.layoutManager = layoutManager
        val adapter = Adapter(productList)
        recyclerViewProducts.adapter = adapter
    }
}