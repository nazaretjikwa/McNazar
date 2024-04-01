package com.example.mc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class home : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<dt>
    private lateinit var newAdapter: madapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_home)

        newRecyclerView = findViewById(R.id.ba)
        newArrayList = ArrayList()

        newArrayList.add(dt(R.drawable.av, "AVATAR", "AVATAR merupakan film ciptaan James Cameron" ))
        newArrayList.add(dt(R.drawable.bat, "BAT_MAN", "BAT_MAN merupakan film film super hero yang di buat  uleh DC " ))
        newArrayList.add(dt(R.drawable.blac, "BLACK_PANTHER", "BLACK_PANTHER merupakan film suoerhero yang di produksi oleh Marvel" ))
        newArrayList.add(dt(R.drawable.iron, "IRON_MAN", "IRON_MAN merupakan film yang superhero yang di di produksi oleh marvel" ))
        newArrayList.add(dt(R.drawable.spid, "SPIDER_MAN", "APIDER_MAN merupakan film ciptaan James Cameron" ))
        newArrayList.add(dt(R.drawable.gr, "SPIDER_MAN", "APIDER_MAN merupakan film ciptaan James Cameron" ))
        newArrayList.add(dt(R.drawable.thor, "SPIDER_MAN", "APIDER_MAN merupakan film ciptaan James Cameron" ))
        newArrayList.add(dt(R.drawable.cp, "SPIDER_MAN", "APIDER_MAN merupakan film ciptaan James Cameron" ))
        newArrayList.add(dt(R.drawable.pool, "SPIDER_MAN", "APIDER_MAN merupakan film ciptaan James Cameron" ))




        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newAdapter = madapter(newArrayList)
        newRecyclerView.adapter = newAdapter


    }
}