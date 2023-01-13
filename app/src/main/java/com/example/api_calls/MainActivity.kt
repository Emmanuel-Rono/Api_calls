package com.example.api_calls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Calendar.getInstance

class MainActivity : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch {
            try {
                val thequotes = QuotesAPI.retrofitService.getQoutes()
                if (thequotes != null)
                // Checking the results
                    Log.d("ayush: ", thequotes.body().toString())
                Toast.makeText(applicationContext, "Data Received success",Toast.LENGTH_LONG).show()
            }
            catch (e:Exception)
            {
                Toast.makeText(applicationContext,"Failed to get Data", Toast.LENGTH_LONG).show()
            }
        }
        // launching a new coroutine
    }
}
