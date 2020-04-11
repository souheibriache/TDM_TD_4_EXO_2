package com.example.td_4_exo_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.td_4_exo_2.fragments.*
import kotlinx.android.synthetic.main.activity_book.*

class bookActivity : AppCompatActivity() {







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)


        val fragmentId = intent.getIntExtra("fragmentId",1)

        when (fragmentId) {


            1 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_1Fragment()
            ).commit()
            2 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_2Fragment()
            ).commit()
            3 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_3Fragment()
            ).commit()
            4 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_4Fragment()
            ).commit()
            5 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_5Fragment()
            ).commit()
            6 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_6Fragment()
            ).commit()
            7 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_7Fragment()
            ).commit()
            8 -> supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                Book_8Fragment()
            ).commit()
            else ->
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Book_1Fragment()).commit()

        }


    }

    private fun moveToFragment(fragment: Fragment) {
        val fragmentTrans = supportFragmentManager.beginTransaction()
        fragmentTrans.replace(R.id.fragment_container, fragment)
        fragmentTrans.commit()
    }

}





