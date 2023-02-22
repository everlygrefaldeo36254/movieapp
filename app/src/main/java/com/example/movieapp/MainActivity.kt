package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieapp.adapter.TvShowAdapter
import com.example.movieapp.databinding.ActivityMain1Binding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain1Binding
    private val viewModel: TvShowViewModel by viewModels()
    private lateinit var tvShowAdapater: TvShowAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setUpRV()

    }

    private fun setUpRV(){
        tvShowAdapater = TvShowAdapter()
        binding.recyclerView.apply {
            adapter = tvShowAdapater
            layoutManager = LinearLayoutManager(this@MainActivity,
                LinearLayoutManager.HORIZONTAL,false)
            setHasFixedSize(true)
        }

        viewModel.responseTvShow.observe(this,{
                listTvShows ->
            tvShowAdapater.tvShows = listTvShows
        }

        )

    }
}