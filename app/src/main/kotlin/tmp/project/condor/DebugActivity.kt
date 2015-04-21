package tmp.project.condor

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import kotlinx.android.anko.*

class DebugActivity : Activity() {

    val pad = dip(10)

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)

        verticalLayout {

            paddingLeft = pad
            paddingRight = pad

            textView("Project Condor: Debug") {
                textSize = 30f
                gravity = Gravity.CENTER
            }

            button("Homepage").onClick {
                startActivity<HomeActivity>()
            }

            button("First Launch").onClick {
                startActivity<FirstActivity>()
            }

            button("Streamer Page").onClick {
                startActivity<StreamerActivity>()
            }

            button("Config").onClick {
                startActivity<ConfigActivity>()
            }
        }
    }
}
