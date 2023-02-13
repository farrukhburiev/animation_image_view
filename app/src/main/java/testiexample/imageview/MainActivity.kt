package testiexample.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var anim: Animation
    lateinit var anim1: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        anim = AnimationUtils.loadAnimation(this, R.anim.getsuga_tensyo)
        anim1 = AnimationUtils.loadAnimation(this, R.anim.getsuga_tensyo2)
        imageView.setOnClickListener {

            imageView.startAnimation(anim)

            anim.setAnimationListener(object: Animation.AnimationListener{
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {

                    imageView.setImageResource(R.drawable.image2)
                    imageView.startAnimation(anim1)

                }

                override fun onAnimationRepeat(p0: Animation?) {
                }

            })

        }
    }
}