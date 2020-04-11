package com.example.td_4_exo_2

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.td_4_exo_2.fragments.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)









        layout_book_1.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_1Fragment()).commit()
            } else
                move(1)
        }
        layout_book_2.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_2Fragment()).commit()
            } else
                move(2)
        }
        layout_book_3.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_3Fragment()).commit()
            } else
                move(3)
        }
        layout_book_4.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_4Fragment()).commit()
            } else
                move(4)
        }
        layout_book_5.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_5Fragment()).commit()
            } else
                move(5)
        }
        layout_book_6.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_6Fragment()).commit()
            } else
                move(6)
        }
        layout_book_7.setOnClickListener {

            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_7Fragment()).commit()
            } else
                move(7)
        }
        layout_book_8.setOnClickListener {
            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK === Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_8Fragment()).commit()
            } else
                move(8)
        }


    }


    private fun move(fragmentId: Int) {
        val intent = Intent(this@MainActivity, bookActivity::class.java)
        intent.putExtra("fragmentId", fragmentId)
        startActivity(intent)

    }
}
