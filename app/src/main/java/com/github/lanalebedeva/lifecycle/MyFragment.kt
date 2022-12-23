package com.github.lanalebedeva.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val TAG = "myFragment"

class MyFragment : Fragment(R.layout.fragment_my) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        lifecycle.addObserver(MyObserver())
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onStart() {
        super.onStart()
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onResume() {
        super.onResume()
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onPause() {
        super.onPause()
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onStop() {
        super.onStop()
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

    override fun onDestroy() {
        super.onDestroy()
        val nameFunThread = Thread.currentThread().stackTrace[2].methodName
        Log.d(TAG, nameFunThread)
        Log.d(TAG,  "lifecycle.currentState = ${lifecycle.currentState.name}")
    }

}
