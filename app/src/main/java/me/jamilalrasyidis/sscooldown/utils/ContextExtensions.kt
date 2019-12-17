package me.jamilalrasyidis.sscooldown.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

/**
 * Created by Jamil on 12/17/2019.
 */
fun Context.setBackgroundLayout(imageUrl: String, view: View) {
    Glide.with(this)
        .load(imageUrl)
        .into(object : CustomTarget<Drawable>() {
            override fun onResourceReady(
                resource: Drawable,
                transition: Transition<in Drawable>?
            ) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    view.background = resource
                } else {
                    @Suppress("DEPRECATION")
                    view.setBackgroundDrawable(resource)
                }
            }

            override fun onLoadCleared(placeholder: Drawable?) {}

        })
}