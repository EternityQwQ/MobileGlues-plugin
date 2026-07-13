package com.fcl.plugin.mobileglues.eternity.utils

import android.content.Context
import android.widget.Toast

fun Context.toast(text: Any, duration: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, text.toString(), duration).show()
