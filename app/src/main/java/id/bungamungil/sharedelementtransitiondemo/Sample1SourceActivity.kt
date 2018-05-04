package id.bungamungil.sharedelementtransitiondemo

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_sample1source.*

class Sample1SourceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1source)

        Picasso.get().load(R.drawable.sample_local_image).into(image)
        image.setOnClickListener(this::showDestination)
    }

    private fun showDestination(view: View) {
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image, ViewCompat.getTransitionName(image))
        startActivity(Intent(this, Sample1DestinationActivity::class.java), options.toBundle())
    }

}