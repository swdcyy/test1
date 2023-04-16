package com.kwai.library.kwaiplayerkit.framework.utils.NonLeakLifecycleObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.Object;
import java.lang.ref.SoftReference;
import androidx.lifecycle.LifecycleOwner;
import n2.a;

public class NonLeakLifecycleObserver implements DefaultLifecycleObserver	// class@000893
{
    public final SoftReference b;
    public final Object c;

    public void NonLeakLifecycleObserver(Object p0){
       super();
       this.c = p0;
       this.b = new SoftReference(p0);
    }
    public final SoftReference a(){
       return this.b;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
