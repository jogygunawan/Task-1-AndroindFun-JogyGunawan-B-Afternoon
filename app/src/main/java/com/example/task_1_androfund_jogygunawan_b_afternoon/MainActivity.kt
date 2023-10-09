package com.example.task_1_androfund_jogygunawan_b_afternoon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView2)
//
//        val usernamee =intent.getParcelableExtra<User>("User")?.username
//        val password =intent.getParcelableExtra<User>("User")?.password
//        tv.text = "Ussername: $usernamee dan Password: $password"

        val usernamee =intent.getParcelableExtra<User>("User")?.username
        tv.text = "$usernamee "

        val btnImplicit: Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_implicit -> {
//                val message = "Hallo Test"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type = "text/plan"
//                startActivity(intent)
                val intent = Intent()
                intent.putExtra("history","Anda sudah login")
                setResult(RESULT_OK,intent)
                finish()
            }
        }

    }
}