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
            Log.d("메인화면" , "로그 버튼 클릭됨.") // d는 디버깅용 로그
            Log.e("메인화면","e로 로그 찍어보기") // 에러 찾기용 로그
            Log.wtf("메인화면","빡칠때 사용하는 로그") // 빡칠때 쓰는 로그
            Toast.makeText(this,"로그버튼 클릭함.",Toast.LENGTH_SHORT).show()
        }

        binding.toastBtn.setOnClickListener {
            // 토스트 버튼 이벤트
            // 토스트 버튼이 클릭 되면 실행되는 코드
            Toast.makeText(this,"토스트 버튼 클릭함.",Toast.LENGTH_SHORT).show()
        }

        binding.varBtn.setOnClickListener {
            // 코틀린 변수 문법 연습 버튼 이벤트
            // 코틀린 변수 연습 버튼이 클릭되면 실행되는 코드
            // 내 이름을 저장할 변수(String) 타입 => 변동 가능성 있음.

            var myName : String
            // 내 이름을 저장할 변수 , String 형으로 생성

            myName = "조영재"

            // 이름 변경
            myName = "영재맨"

            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()

            val hakbun : String
            // 내 학번을 저장할 변수 생성
            hakbun = "20183277"

            // 학번 변수 변경시도
//            hakbun = "20183181"
        // 에러 발생 , val은 상수로 보면 됨. var은 변수
        }
    }
}