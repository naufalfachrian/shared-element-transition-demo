package id.bungamungil.sharedelementtransitiondemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_sample1destination.*

class Sample1DestinationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1destination)

        Picasso.get().load(R.drawable.sample_local_image).into(image)
    }

}