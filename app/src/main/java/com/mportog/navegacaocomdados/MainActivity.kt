package com.mportog.navegacaocomdados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_passar_dados.setOnClickListener{
if(isValid()) {
    val intent = Intent(applicationContext, ConfirmacaoDadosActivity::class.java)
    intent.putExtra("nome", editName.text.toString())
    intent.putExtra("birth", editDate.text.toString())
    intent.putExtra("tel", editPhone.text.toString())
    intent.putExtra("mail", editEmail.text.toString())
    startActivity(intent)
}
        }
    }
    fun isValid(): Boolean{
        var isValid : Boolean = true
        if (editName.text.toString() == null || editName.text.toString().equals("")) {
            isValid = false
        }
        if (editName.text.toString() == null || editName.text.toString().equals("")) {
            isValid = false
        }
        if (editName.text.toString() == null || editName.text.toString().equals("")) {
            isValid = false
        }
        if (editName.text.toString() == null || editName.text.toString().equals(""))
        {   isValid = false
        }
        return isValid
    }
}