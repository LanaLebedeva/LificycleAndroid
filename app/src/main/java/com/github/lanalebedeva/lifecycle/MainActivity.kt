package com.github.lanalebedeva.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.add
import androidx.fragment.app.commit

private const val TAG = "mainActivity"

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nameFunThrowable = Throwable().stackTrace[0].methodName
        Log.d(TAG, nameFunThrowable)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        val nameFunException = Exception().stackTrace[0].methodName
        Log.d(TAG, nameFunException)
        val nameFunObject = object {}.javaClass.enclosingMethod?.name
        Log.d(TAG, nameFunObject.toString())
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        lifecycle.addObserver(MyObserver())
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<MyFragment>(R.id.fragment_container_view)
            }
        }
    }

    override fun onStart() {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        super.onStart()
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
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
