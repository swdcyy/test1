package com.yxcorp.gifshow.location.PostLocationPermissionHolder;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import j2b.s;
import com.yxcorp.gifshow.location.PostLocationPermissionHolder$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import brd.t;

public final class PostLocationPermissionHolder	// class@001ade
{
    public boolean a;
    public LifecycleOwner b;
    public final c c;
    public final LifecycleObserver d;

    public void PostLocationPermissionHolder(boolean p0){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.c = uoa;
       this.a = s.b();
       this.d = new PostLocationPermissionHolder$mLifecycleObserver$1(this, p0);
    }
    public final void a(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostLocationPermissionHolder.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       this.b = p0;
       p0.getLifecycle().addObserver(this.d);
       return;
    }
    public final t b(){
       return this.c;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, PostLocationPermissionHolder.class, "1")) {
          return;
       }
       PostLocationPermissionHolder tb = this.b;
       if (tb != null) {
          Lifecycle lifecycle = tb.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.d);
          }
       }
       return;
    }
}
