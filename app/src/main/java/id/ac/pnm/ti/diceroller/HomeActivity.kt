package id.ac.pnm.ti.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import id.ac.pnm.ti.diceroller.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
        val binding: ActivityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)

//        val name:TextView = findViewById(R.id.nama)
//        val age:TextView = findViewById(R.id.age)
//        val loc:TextView = findViewById(R.id.loc)

//        name.text = "Binuko"

        binding.name = "Angger"
        binding.age.text = "34"
        binding.location = "Malang"
    }
}