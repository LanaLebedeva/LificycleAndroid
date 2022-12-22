package com.github.lanalebedeva.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

private const val TAG = "mainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        val nameFunThrowable = Throwable().stackTrace[0].methodName
        Log.d(TAG, nameFunThrowable)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        val nameFunException = Exception().stackTrace[0].methodName
        Log.d(TAG, nameFunException)
        val nameFunObject = object {}.javaClass.enclosingMethod?.name
        Log.d(TAG, nameFunObject.toString())
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onStart()
    }

    override fun onResume() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onResume()
    }

    override fun onPause() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onPause()
    }

    override fun onStop() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onStop()
    }

    override fun onDestroy() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onDestroy()
    }
}
