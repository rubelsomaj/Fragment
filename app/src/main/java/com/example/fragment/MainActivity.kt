package com.example.fragment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {

            gotoFragment(FirstFagment())
        }

        binding.button1.setOnClickListener {

            gotoFragment(SecondFragment())
        }


    }

    private fun gotoFragment(fragment: Fragment) {

        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()

    }

}







