package com.yxcorp.gifshow.log.CorrectPageUtil$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import k2b.s1;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class CorrectPageUtil$2 implements DefaultLifecycleObserver	// class@001ae5
{
    public final s1 b;

    public void CorrectPageUtil$2(s1 p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CorrectPageUtil$2.class, "1")) {
          return;
       }
       b.a(0x4b316083).w0(this.b);
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