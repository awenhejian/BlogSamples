package org.lynxz.lifecycledemo.observer

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import org.lynxz.lifecycledemo.util.Logger

/**
 * Created by lynxz on 2019/3/2
 * E-mail: lynxz8866@gmail.com
 *
 * Description:
 */
open class MainActObserver : LifecycleObserver {
//    override fun onStateChanged(source: LifecycleOwner?, event: Lifecycle.Event?) {
//        Logger.d("MainActObserver onStateChanged $event")
//    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Logger.d("MainActObserver onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(owner: LifecycleOwner?) {
        Logger.d("MainActObserver onStart owner is: $owner")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Logger.d("MainActObserver onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    open fun onPause() {
        Logger.d("MainActObserver onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Logger.d("MainActObserver onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Logger.d("MainActObserver onDestroy")
    }
}
