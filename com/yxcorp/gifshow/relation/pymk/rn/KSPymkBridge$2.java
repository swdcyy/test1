package com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge;
import com.yxcorp.gifshow.pymk.log.h;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class KSPymkBridge$2 implements DefaultLifecycleObserver	// class@001952
{
    public final h b;
    public final KSPymkBridge c;

    public void KSPymkBridge$2(KSPymkBridge p0,h p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge$2.class, "1")) {
          return;
       }
       this.b.b();
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
