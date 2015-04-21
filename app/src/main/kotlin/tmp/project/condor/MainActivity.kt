package tmp.project.condor

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import kotlinx.android.anko.*
import java.util.Random

class MainActivity : Activity() {

    val rand = Random()

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)

        verticalLayout {

            paddingLeft = dip(12)
            paddingRight = paddingLeft

            textView("Test App") {
                textSize = 30f
            }

            button("Reset").onClick {
                finish()
                startActivity<MainActivity>()
            }

            button("Rand").onClick {
                val r = rand.nextInt().abs().toString()
                button(r) {
                    textColor = Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256))
                    onClick { toast(r) }
                }
            }
        }
    }
}
