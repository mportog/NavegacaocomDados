package com.mportog.navegacaocomdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_confirmacao_dados.*

class ConfirmacaoDadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao_dados)

        val dados : Bundle ? = intent.extras
        val nome = dados!!.getString("nome")
        val data = dados!!.getString("birth")
        val mail = dados!!.getString("mail")
        val tel = dados!!.getString("tel")

        dataTel.text =tel
        dataMail.text =mail
        dataNome.text =nome
        dataBirth.text = data
    }
}