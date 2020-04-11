package com.example.tp4exo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




            if ( c2 != null ){
                val fragment = Bookshelf.newInstance(true)
                val fragment2 = Details()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contaner, fragment)
                transaction.replace(R.id.c2, fragment2)
                transaction.commit()
            }else{
                val fragment = Bookshelf.newInstance(false)
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contaner, fragment)
                transaction.commit()
            }
        }


}