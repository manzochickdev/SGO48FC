package com.example.sgo48fc

import android.util.Log
import androidx.fragment.app.Fragment

const val TAG = "SGO48FC"

fun Any.logd(tag:String = TAG) {
    if (this is String){
        Log.d(TAG,this)
    }
    else Log.d(TAG,this.toString())
}

fun Fragment.customTag():String{
    return this::class.java.simpleName
}