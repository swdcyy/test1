package com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$mLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.Objects;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$b;

public final class PlcMiniRecoLogger$mLifecycleObserver$1 implements DefaultLifecycleObserver	// class@00106f
{
    public final PlcMiniRecoLogger b;

    public void PlcMiniRecoLogger$mLifecycleObserver$1(PlcMiniRecoLogger p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcMiniRecoLogger$mLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       PlcMiniRecoLogger c = this.b.c;
       if (c != null) {
          Lifecycle lifecycle = c.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this);
          }
       }
       PlcMiniRecoLogger$mLifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, PlcMiniRecoLogger.class, "2")) {
          tb.b.b(false);
       }
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
