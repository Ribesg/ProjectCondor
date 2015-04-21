package tmp.project.condor

import android.widget.TextView

/**
 * @author Ribesg
 */

public fun TextView.setTextStyle(style: Int) {
    this.setTypeface(this.getTypeface(), style)
}

public fun Int.abs(): Int = Math.abs(this)
