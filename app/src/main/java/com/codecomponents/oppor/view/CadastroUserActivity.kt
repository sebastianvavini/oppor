package com.codecomponents.oppor.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codecomponents.oppor.R
import com.codecomponents.oppor.databinding.ActivityCadastroUserBinding
import com.codecomponents.oppor.viewmodel.CadastroUserViewModel

class CadastroUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroUserBinding
    private lateinit var viewModel:CadastroUserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCadastroUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}