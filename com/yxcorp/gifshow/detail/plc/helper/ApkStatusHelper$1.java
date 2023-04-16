package com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ApkStatusHelper$1 implements DefaultLifecycleObserver	// class@00166c
{
    public final ApkStatusHelper b;

    public void ApkStatusHelper$1(ApkStatusHelper p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApkStatusHelper$1.class, "2")) {
          return;
       }
       this.b.b();
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApkStatusHelper$1.class, "1")) {
          return;
       }
       this.b.c();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
