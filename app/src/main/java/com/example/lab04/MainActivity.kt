package com.example.lab04

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab04.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //import will be suggested
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //the step is used to link the ui created in xml to our kotlin file
        //3 step
        //enable {viewBinding} in Gradle
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //button yang ber id buttonPlus ditekan
        binding.buttonPlus.setOnClickListener {
            //dapatkan nilai dari editText1 dan editText2 = binding.editText1.text.
            //Tukarkan ke integer = toInt()
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            //Dapatkan hasil tambahan num1 dan num2
            val sum = num1 + num2;
            //Keluarkan result ke textview dengan id resultTextView
            binding.resultTextView.text = "Result: $sum"
        }

        binding.buttonMinus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val minus = num1 - num2;
            binding.resultTextView.text = "Result: $minus"
        }

        binding.buttonProduct.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val product = num1 * num2;
            binding.resultTextView.text = "Result: $product"
        }

        binding.buttonDivide.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val division = num1 / num2;
            binding.resultTextView.text = "Result: $division"
        }
        /*
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        */

    }
}