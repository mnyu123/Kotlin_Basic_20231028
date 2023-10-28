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
            Log.d("메인화면", "로그 버튼 클릭됨.") // d는 디버깅용 로그
            Log.e("메인화면", "e로 로그 찍어보기") // 에러 찾기용 로그
            Log.wtf("메인화면", "빡칠때 사용하는 로그") // 빡칠때 쓰는 로그
            Toast.makeText(this, "로그버튼 클릭함.", Toast.LENGTH_SHORT).show()
        }

        binding.toastBtn.setOnClickListener {
            // 토스트 버튼 이벤트
            // 토스트 버튼이 클릭 되면 실행되는 코드
            Toast.makeText(this, "토스트 버튼 클릭함.", Toast.LENGTH_SHORT).show()
        }

        binding.varBtn.setOnClickListener {
            // 코틀린 변수 문법 연습 버튼 이벤트
            // 코틀린 변수 연습 버튼이 클릭되면 실행되는 코드
            // 내 이름을 저장할 변수(String) 타입 => 변동 가능성 있음.

            var myName: String
            // 내 이름을 저장할 변수 , String 형으로 생성

            myName = "조영재"

            // 이름 변경
            myName = "영재맨"

            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()

            val hakbun: String
            // 내 학번을 저장할 변수 생성
            hakbun = "20183277"

            // 학번 변수 변경시도
//            hakbun = "20183181"
            // 에러 발생 , val은 상수로 보면 됨. var은 변수

            val myBirthYear = 1999
            // 지금 보면 자료형을 안써줬는데 자동으로 int형인걸로 보고 알아서 타입 설정함.
            // 실무 팁 : val로 죄다 만들어 놓고 나중에 변경해야하는 것들만 "var"로 변경해서 함.

            // 코틀린 특 : 모든 변수가 전부 .method 사용 가능
        }

        binding.ifBtn.setOnClickListener {
            // 사용자의 나이를 val에 저장함.
            // 하지만 editText로 입력을 받음.
            // toString으로 String 형으로 받다가 toInt로 int형으로 형 변환됨.
            val userAge = binding.edtUserAge.text.toString().toInt()

            // 성인 판별
            // if-else는 자바랑 똑~같음
//            if (userAge >= 20) {
//                Toast.makeText(this, "성인 확인.", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "애들은 가라", Toast.LENGTH_SHORT).show()
//            }

            // 자바의 switch와 똑같은 기능을 하는 "when" 의 문법 사용 예제
            when (userAge) {
                24 -> {
                    // userAge에 24가 들어있을때 실행하는 코드 내용
                    Toast.makeText(this, "24살 입니다.", Toast.LENGTH_SHORT).show()
                }

                20, 21, 22, 23 -> {
                    // userAge에 20~23 가 들어있을때 실행하는 코드 내용
                    Toast.makeText(this, "현역입니다.", Toast.LENGTH_SHORT).show()
                }

                in 25..30 ->{
                    // userAge 값이 25부터 30 사이일때 쓰는건 "in 숫자 .. 숫자" 이렇게 하면 된다.
                    Toast.makeText(this, "25~30세 입니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}