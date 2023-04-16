package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.Fragment;
import brd.t;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9$b;
import java.lang.Throwable;
import qrd.i;
import yf7.h;

public final class NewPageMonitorInitModule$initPageMonitor$9 extends Lambda implements l	// class@000eb2
{
    public final NewPageMonitorInitModule this$0;

    public void NewPageMonitorInitModule$initPageMonitor$9(NewPageMonitorInitModule p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Object p0){
       WeakReference obj = PatchProxy.applyOneRefs(p0, this, NewPageMonitorInitModule$initPageMonitor$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       obj = new WeakReference(p0);
       if (p0 instanceof RecyclerFragment) {
          b uob = p0.I5().subscribe(NewPageMonitorInitModule$initPageMonitor$9$a.b);
          a.o(uob, "it.recyclerLifecycle\(\).s¡­            }\n          }");
          this.this$0.o0(p0, uob);
          p0 = p0.gh().subscribe(new NewPageMonitorInitModule$initPageMonitor$9$b(obj));
          a.o(p0, "it.lazyLifecycle.subscri¡­            }\n          }");
          this.this$0.o0(p0, p0);
       }
       return true;
    }
}
