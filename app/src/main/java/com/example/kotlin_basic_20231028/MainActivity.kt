package com.example.kotlin_basic_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlin_basic_20231028.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
//    바인딩 설정1
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        바인딩 설정2
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        바인딩 사용
        binding.logBtn.setOnClickListener { 
            // 로그 버튼 이벤트
            // 로그 버튼이 클릭 되면 실행되는 코드
            Log.d("메인화면" , "로그 버튼 클릭됨.")
            Toast.makeText(this,"로그버튼 클릭함.",Toast.LENGTH_SHORT).show()
        }

        binding.toastBtn.setOnClickListener {
            // 토스트 버튼 이벤트
            // 토스트 버튼이 클릭 되면 실행되는 코드
            Toast.makeText(this,"토스트 버튼 클릭함.",Toast.LENGTH_SHORT).show()
        }
    }
}