package tmp.project.condor.tools.listadapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import kotlinx.android.anko.id
import kotlinx.android.anko.text
import kotlinx.android.anko.textView
import tmp.project.condor.dsl

/**
 * Represents an Item in our ListAdapter implementation.
 *
 * @author Ribesg
 */
abstract class ListAdapterItem(val ctx: Context) {

    abstract val id: Long

    open fun getView(old: View?, parent: ViewGroup): View? = ctx.dsl {
        textView {
            text = id.toString()
        }
    }
}
