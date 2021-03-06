package pt.ipg.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    companion object{
        public val INFO_EXTRA_MENSAGEM :String = "MENSAGEM"
       // public val INFO_EXTRA_DATA  = "DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        //obeter a mensagem
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val mensagem = editTextMensagem.text.toString()
        //val data = Date()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }

        //passar entre atividades
        val intent = Intent(this,MostraMensagemActivity::class.java)
        intent.putExtra(INFO_EXTRA_MENSAGEM,mensagem)
       // intent.putExtra(INFO_EXTRA_MENSAGEM,data)

        startActivity(intent)
    }
}