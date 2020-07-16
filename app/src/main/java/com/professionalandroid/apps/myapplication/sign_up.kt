package com.professionalandroid.apps.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_up.*

class sign_up : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

       auth = FirebaseAuth.getInstance()

       btn_button.setOnClickListener {
           if(EditText_email.text.toString().length <= 0 || EditText_password.text.toString().length <= 0){
               Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
           }else{
               auth.signInWithEmailAndPassword(EditText_email.text.toString(), EditText_password.text.toString())
                   .addOnCompleteListener(this) { task ->
                       if (task.isSuccessful) {
                           val user = auth.currentUser

                       } else {

                       }

                   }
           }
       }
    }
}