package com.yxcorp.gifshow.camera.record.base.CallerContext$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import java.util.Map;

public class CallerContext$1 implements DefaultLifecycleObserver	// class@000da1
{
    public final b b;

    public void CallerContext$1(b p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CallerContext$1.class, "1")) {
          return;
       }
       this.b.f.getLifecycle().removeObserver(this);
       this.b.c.clear();
       this.b.b.clear();
       return;
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
