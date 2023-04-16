package com.yxcorp.gifshow.detail.common.bottom.BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.common.bottom.BaseGeneralBottomEntryElement;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import q2b.h$b;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;

public final class BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1 implements DefaultLifecycleObserver	// class@001397
{
    public final BaseGeneralBottomEntryElement b;

    public void BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1(BaseGeneralBottomEntryElement p0){
       this.b = p0;
       super();
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
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       BaseGeneralBottomEntryElement$mActivityLifecycleObserver$1 tb = this.b;
       if (tb.B > 0) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, BaseGeneralBottomEntryElement.class, "20")) {
             BaseGeneralBottomEntryElement w = tb.w;
             if (w == null) {
                a.S("mFragment");
             }
             h$b uob = h$b.d(0, 0);
             uob.k(tb.p0("INNER_PAGE_STAY_LEGTH", Boolean.TRUE));
             u1.p0("", w, uob);
             tb.B = 0;
          }
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
