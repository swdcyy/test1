package com.yxcorp.gifshow.page.cost.InternalTraceImpl$attachTo$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.page.cost.InternalTraceImpl;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.List;
import rvb.h;
import java.util.Iterator;
import java.lang.Iterable;
import rvb.c$a;
import java.util.Objects;

public final class InternalTraceImpl$attachTo$1 implements DefaultLifecycleObserver	// class@000e11
{
    public final InternalTraceImpl b;

    public void InternalTraceImpl$attachTo$1(InternalTraceImpl p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InternalTraceImpl$attachTo$1.class, "1")) {
          return;
       }
       a.p(p0, "lo");
       StringBuilder str = "detach from: "+p0;
       InternalTraceImpl$attachTo$1 tb = this.b;
       tb.b = null;
       Iterator iterator = tb.c.a().iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       this.b.clean();
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
