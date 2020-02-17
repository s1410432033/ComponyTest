package com.example.test.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.*
import com.example.test.Model.ApiObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(){

    lateinit var retrofit: ApiService
    lateinit var mRecycleView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        retrofit = RetrofitSet().apiInterface
        mRecycleView = this.findViewById(R.id.mRecycleView)
        getData()
    }

    fun getData(){
        retrofit.getT(auth = "CWB-FAEB75E0-791E-4533-815E-88294C2747FE",
            location = "臺北市",
            element = "MinT")
            .enqueue(object :Callback<ApiObject>{
                override fun onResponse(call: Call<ApiObject>, response: Response<ApiObject>) {
                    val mResponse = response.body()!!
                    TimeObject.time = mResponse.records?.location?.get(0)?.weatherElement?.get(0)?.time
                    if(TimeObject.time !=null) {
                        setRecycle()
                    }
                }

                override fun onFailure(call: Call<ApiObject>, t: Throwable) {
                    Log.e(this.toString(),t.toString())
                }
            })
    }
    fun setRecycle(){
        mRecycleView.layoutManager =  LinearLayoutManager(this)
        mRecycleView.adapter = MainAdpater(this)
    }
    fun goNext(position:Int){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.addToBackStack("back")
        transaction.replace(
            R.id.main,
            NextFragment(position)
        ).commit()
    }

}
