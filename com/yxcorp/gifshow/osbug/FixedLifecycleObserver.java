package com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import ovb.b;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public abstract class FixedLifecycleObserver implements DefaultLifecycleObserver	// class@0021d1
{
    public int b;
    public final Handler c;
    public boolean d;
    public final Runnable e;

    public void FixedLifecycleObserver(){
       super();
       this.b = 0;
       this.c = new Handler(Looper.getMainLooper());
       this.d = false;
       this.e = new b(this);
    }
    public abstract void a();
    public abstract void b();
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public final void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedLifecycleObserver.class, "2")) {
          return;
       }
       int i = 0;
       this.b = i;
       if (this.d != null) {
          this.d = i;
          this.c.removeCallbacks(this.e);
          return;
       }else {
          this.a();
          return;
       }
    }
    public final void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedLifecycleObserver.class, "1")) {
          return;
       }
       if (this.b == 2) {
          this.d = true;
          this.c.post(this.e);
       }else {
          Log.g("FixedLifecycleObserver", "call onResumeBelievable\(\) "+p0);
          this.b();
       }
       this.b = 0;
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (this.b == 1) {
          this.b = 2;
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       this.b = 1;
    }
}
