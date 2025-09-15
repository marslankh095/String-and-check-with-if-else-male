package com.app.newtry

import android.content.Context
import android.content.Intent

// generic extension function
fun <T> Context.openActivity(activityClass: Class<T>) {
    val intent = Intent(this, activityClass)
    this.startActivity(intent)
}
