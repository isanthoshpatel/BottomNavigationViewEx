package com.example.bottomnavigationviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fl, Home()).commit()

        bnv.setOnNavigationItemSelectedListener(this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                supportFragmentManager.beginTransaction().replace(R.id.fl, Home()).commit()
            }
            R.id.videos -> {
                supportFragmentManager.beginTransaction().replace(R.id.fl, Videos()).commit()

            }
            R.id.ask -> {
                supportFragmentManager.beginTransaction().replace(R.id.fl, Ask()).commit()

            }
        }
      return true
    }

}
