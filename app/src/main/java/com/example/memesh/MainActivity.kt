package com.example.memesh

import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class MainActivity : AppCompatActivity() {
    var currentImageurl:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadMeme()
    }
    private fun loadMeme() {
        val receivedData1 = intent.getStringExtra("tanmay_data")
        var functionVariable1 = receivedData1
        val receivedData2 = intent.getStringExtra("premiere_name")
        var functionVariable2 = receivedData2
        val receivedData3 = intent.getStringExtra("memes_name")
        var functionVariable3 = receivedData3
        val receivedData4 = intent.getStringExtra("dank_name")
        var functionVariable4 = receivedData4
        val receivedData5 = intent.getStringExtra("anime_name")
        var functionVariable5 = receivedData5

        val imag = findViewById<ImageView>(R.id.imageView)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

// ...
        progressBar.visibility = View.VISIBLE
        if (functionVariable1 == "TanmayBhatkeDost") {
            val queue = Volley.newRequestQueue(this)
            val url = "https://meme-api.com/gimme/TanmayBhatkeDost"
            val jsondata = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->

                    // Display the first 500 characters of the response string.
                    currentImageurl = response.getString("url")
//                Toast.makeText(this, "ye rha bhai", Toast.LENGTH_LONG).show()

                    Glide.with(this).load(currentImageurl)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false

                            }
                        }).into(imag)


                },
                {
                    Toast.makeText(this, "this can t happen", Toast.LENGTH_SHORT).show()
                })

// Add the request to the RequestQueue.
            queue.add(jsondata)
        }
        if (functionVariable2 == "AdviceAnimals") {
            val queue = Volley.newRequestQueue(this)
            val url = "https://meme-api.com/gimme/premiere"
            val jsondata = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->

                    // Display the first 500 characters of the response string.
                    currentImageurl = response.getString("url")
//                Toast.makeText(this, "ye rha bhai", Toast.LENGTH_LONG).show()

                    Glide.with(this).load(currentImageurl)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false

                            }
                        }).into(imag)


                },
                {
                    Toast.makeText(this, "this can t happen", Toast.LENGTH_SHORT).show()
                })

// Add the request to the RequestQueue.
            queue.add(jsondata)
        }

        if (functionVariable3 == "memes"){
            val queue = Volley.newRequestQueue(this)
            val url = "https://meme-api.com/gimme/memes"
            val jsondata = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->

                    // Display the first 500 characters of the response string.
                    currentImageurl = response.getString("url")
//                Toast.makeText(this, "ye rha bhai", Toast.LENGTH_LONG).show()

                    Glide.with(this).load(currentImageurl)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false

                            }
                        }).into(imag)


                },
                {
                    Toast.makeText(this, "this can t happen", Toast.LENGTH_SHORT).show()
                })

// Add the request to the RequestQueue.
            queue.add(jsondata)
        }
        if (functionVariable4 == "dankmemes"){
            val queue = Volley.newRequestQueue(this)
            val url = "https://meme-api.com/gimme/dankmemes"
            val jsondata = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->

                    // Display the first 500 characters of the response string.
                    currentImageurl = response.getString("url")
//                Toast.makeText(this, "ye rha bhai", Toast.LENGTH_LONG).show()

                    Glide.with(this).load(currentImageurl)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false

                            }
                        }).into(imag)


                },
                {
                    Toast.makeText(this, "this can t happen", Toast.LENGTH_SHORT).show()
                })

// Add the request to the RequestQueue.
            queue.add(jsondata)
        }
        if (functionVariable5 == "animememes"){
            val queue = Volley.newRequestQueue(this)
            val url = "https://meme-api.com/gimme/animememes"
            val jsondata = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->

                    // Display the first 500 characters of the response string.
                    currentImageurl = response.getString("url")
//                Toast.makeText(this, "ye rha bhai", Toast.LENGTH_LONG).show()

                    Glide.with(this).load(currentImageurl)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false

                            }
                        }).into(imag)


                },
                {
                    Toast.makeText(this, "this can t happen", Toast.LENGTH_SHORT).show()
                })

// Add the request to the RequestQueue.
            queue.add(jsondata)
        }
        else {
            val queue = Volley.newRequestQueue(this)
            val url = "https://meme-api.com/gimme"
            val jsondata = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->

                    // Display the first 500 characters of the response string.
                    currentImageurl = response.getString("url")
//                Toast.makeText(this, "ye rha bhai", Toast.LENGTH_LONG).show()

                    Glide.with(this).load(currentImageurl)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                progressBar.visibility = View.GONE
                                return false

                            }
                        }).into(imag)


                },
                {
                    Toast.makeText(this, "this can t happen", Toast.LENGTH_SHORT).show()
                })

// Add the request to the RequestQueue.
            queue.add(jsondata)

        }


// Instantiate the RequestQueue.


        // Request a string response from the provided URL.


        }
    fun downlaodMedia(view: View){

        val fileName = Uri.parse(currentImageurl).lastPathSegment
        val description = "Downloading $fileName"


        val request = DownloadManager.Request(Uri.parse(currentImageurl))
            .setTitle(title)
            .setDescription(description)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)

        val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        manager.enqueue(request)
    }

    fun shareMeme(view:View){
        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT,"Hey,see this cool see this cool meme I found on reddit:$currentImageurl")
        intent.type = "text/plain"
val chooser = Intent.createChooser(intent,"Share this using...")
        startActivity(chooser)


    }
    fun nextMeme(view:View){

       loadMeme()

    }
    fun seeSubReddit(view: View){
        val myButton = findViewById<Button>(R.id.subReddit)
        myButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


            // start new activity here
        }



    }

}