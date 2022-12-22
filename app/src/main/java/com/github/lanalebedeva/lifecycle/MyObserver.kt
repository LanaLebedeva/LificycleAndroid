package com.github.lanalebedeva.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

private const val TAG = "MyObserver"

class MyObserver : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> Log.d(TAG, "ON_CREATE")
            Lifecycle.Event.ON_START -> Log.d(TAG, "ON_START")
            Lifecycle.Event.ON_RESUME -> Log.d(TAG, "ON_RESUME")
            Lifecycle.Event.ON_PAUSE -> Log.d(TAG, "ON_PAUSE")
            Lifecycle.Event.ON_STOP -> Log.d(TAG, "ON_STOP")
            Lifecycle.Event.ON_DESTROY -> Log.d(TAG, "ON_DESTROY")
            Lifecycle.Event.ON_ANY -> Log.d(TAG, "ON_ANY")
        }
    }
}
