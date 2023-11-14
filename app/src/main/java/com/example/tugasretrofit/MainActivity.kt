package com.example.tugasretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugasretrofit.databinding.ActivityMainBinding
import com.example.tugasretrofit.model.FilmModel
import com.example.tugasretrofit.model.PokemonModel
import com.example.tugasretrofit.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val IntentToDetail = Intent(this@MainActivity, MainActivity2::class.java)
        val extras = Bundle()
        val client = ApiClient.getInstance()
        val response = client.getData()
        val data = ArrayList<Disaster>()
        response.enqueue(object : Callback<FilmModel> {
            override fun onResponse(call: Call<FilmModel>, response: Response<FilmModel>) {
                val thisResponse = response.body()
                val datas = thisResponse?.result?: emptyList()
                if (datas.isNotEmpty()) {
                    for (i in datas) {
                        data.add(Disaster(nameDisaster = i?.title, imageDisaster = i?.image, idDisaster = i?.id))
                        Log.d("Hallo", ""+data)
                    }
                    val adaptorDisaster = DisasterAdaptor(data) {
                            disaster -> Toast.makeText(this@MainActivity, "This Name ${disaster.nameDisaster}", Toast.LENGTH_SHORT).show();
                        extras.putString("judul", disaster.nameDisaster)
                        extras.putString("image", disaster.imageDisaster)
                        IntentToDetail.putExtras(extras)
                        startActivity(IntentToDetail)
                    }
                    with(binding){
                        rvDisaster.apply {
                            adapter = adaptorDisaster
                            layoutManager = GridLayoutManager(this@MainActivity, 1)
                        }
                    }
                }
            }
            override fun onFailure(call: Call<FilmModel>, t: Throwable) {
                Log.d("error", "" + t.stackTraceToString())
            }
        })
    }
}