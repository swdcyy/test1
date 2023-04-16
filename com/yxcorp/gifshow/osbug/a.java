package com.yxcorp.gifshow.osbug.a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.util.SparseArray;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import android.os.Bundle;
import ekd.k1;
import ovb.a;
import java.lang.Runnable;

public abstract class a implements Application$ActivityLifecycleCallbacks	// class@0021d7
{
    public final SparseArray b;

    public void a(){
       super();
       this.b = new SparseArray();
    }
    public final int a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = this.b.get(p0.hashCode());
       int i = (integer == null)? 0: integer.intValue();
       return i;
    }
    public abstract void b(Activity p0);
    public final void c(Activity p0,int p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a.class, "6")) {
          return;
       }
       this.b.put(p0.hashCode(), Integer.valueOf(p1));
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.c(p0, 0);
       k1.n(p0);
       return;
    }
    public final void onActivityPostResumed(Activity p0){
    }
    public final void onActivityPreResumed(Activity p0){
    }
    public final void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (this.a(p0) == 2) {
          k1.p(new a(this, p0), p0);
       }else {
          this.b(p0);
       }
       this.c(p0, 0);
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.a(p0) == 1) {
          this.c(p0, 2);
       }
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.c(p0, 1);
       return;
    }
}
