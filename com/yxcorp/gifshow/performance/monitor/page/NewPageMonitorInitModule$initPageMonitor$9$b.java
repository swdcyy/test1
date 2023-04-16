package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9$b;
import erd.g;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import com.yxcorp.gifshow.performance.monitor.page.a;
import qvb.q;
import qvb.j;

public final class NewPageMonitorInitModule$initPageMonitor$9$b implements g	// class@000eb1
{
    public final WeakReference b;

    public void NewPageMonitorInitModule$initPageMonitor$9$b(WeakReference p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPageMonitorInitModule$initPageMonitor$9$b.class, "1")) {
       }else {
          String str = 2;
          if (p0 != null && p0.intValue() == str) {
             p0 = this.b.get();
             Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<*>");
             p0.q().h(new a(this));
          }
       }
       return;
    }
}
