package com.example.gowanandroid.util

import android.app.Activity
import androidx.core.app.ShareCompat
import com.example.gowanandroid.R


/**
 * Created by xiaojianjun on 2019-11-21.
 */
fun share(
    activity: Activity,
    title: String? = activity.getString(R.string.app_name),
    content: String?
) {
    ShareCompat.IntentBuilder.from(activity)
        .setType("text/plain")
        .setSubject(title)
        .setText(content)
        .setChooserTitle(title)
        .startChooser()
}