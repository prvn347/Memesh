package com.example.memesh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



    }
    fun newSubMeme(view: View){

        val tanmay = "TanmayBhatkeDost"

        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("tanmay_data", tanmay)

        }
        startActivity(intent)


    }
    fun premiereMeme(view: View){
        val pre = "AdviceAnimals"

        val intent = Intent(this, MainActivity::class.java).apply {

        putExtra("premiere_name",pre)
        }
        startActivity(intent)
    }
    fun memesub(view: View){
        val meme = "memes"
        val intent = Intent(this, MainActivity::class.java).apply {

            putExtra("memes_name",meme)
        }
        startActivity(intent)

    }
    fun dankmemes(view: View){
        val dank = "dankmemes"
        val intent = Intent(this, MainActivity::class.java).apply {

            putExtra("dank_name",dank)
        }
        startActivity(intent)

    }
    fun animememes(view: View){
      val anime = "animememes"
        val intent = Intent(this, MainActivity::class.java).apply {

            putExtra("anime_name",anime)
        }
        startActivity(intent)
    }


}