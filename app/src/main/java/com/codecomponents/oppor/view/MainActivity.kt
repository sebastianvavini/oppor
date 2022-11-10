package com.codecomponents.oppor.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.codecomponents.oppor.R
import com.codecomponents.oppor.databinding.ActivityCadastroUserBinding
import com.codecomponents.oppor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCadastrar.setOnClickListener(this)
        binding.buttonIrLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id==R.id.button_cadastrar){
            startActivity(Intent(this,CadastroUserActivity::class.java))
        }
        if(v.id==R.id.button_ir_login){
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}