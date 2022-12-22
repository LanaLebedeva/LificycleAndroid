package com.github.lanalebedeva.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

private const val TAG = "mainActivity"

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        super.onCreate(savedInstanceState, persistentState)

        val nameFunThrowable = Throwable().stackTrace[0].methodName
        Log.d(TAG, nameFunThrowable)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        val nameFunException = Exception().stackTrace[0].methodName
        Log.d(TAG, nameFunException)
        val nameFunObject = object {}.javaClass.enclosingMethod?.name
        Log.d(TAG, nameFunObject.toString())
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
//        lifecycle.addObserver(MyObserver())
    }

    override fun onStart() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onStart()
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        lifecycle.addObserver(MyObserver())
    }

    override fun onResume() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        super.onResume()
    }

    override fun onPause() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        super.onPause()
    }

    override fun onStop() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        super.onStop()
    }

    override fun onDestroy() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        super.onDestroy()
    }
}
