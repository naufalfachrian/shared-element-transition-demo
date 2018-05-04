package id.bungamungil.sharedelementtransitiondemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample1Label.setOnClickListener(this::sample1LabelClicked)
    }

    private fun sample1LabelClicked(view: View) {
        startActivity(Intent(this, Sample1SourceActivity::class.java))
    }

}
