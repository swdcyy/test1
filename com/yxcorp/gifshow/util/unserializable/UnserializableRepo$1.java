package com.yxcorp.gifshow.util.unserializable.UnserializableRepo$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import moc.b;

public class UnserializableRepo$1 implements DefaultLifecycleObserver	// class@000d08
{
    public final Lifecycle$Event b;
    public final int c;

    public void UnserializableRepo$1(Lifecycle$Event p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (this.b == Lifecycle$Event.ON_DESTROY) {
          p0.getLifecycle().removeObserver(this);
          b.f(this.c);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (this.b == Lifecycle$Event.ON_RESUME) {
          p0.getLifecycle().removeObserver(this);
          b.f(this.c);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (this.b == Lifecycle$Event.ON_STOP) {
          p0.getLifecycle().removeObserver(this);
          b.f(this.c);
       }
       return;
    }
}
