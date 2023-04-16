package com.yxcorp.gifshow.performance.monitor.page.a;
import qvb.q;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import java.lang.ref.WeakReference;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import qvb.j;

public final class a implements q	// class@000eb8
{
    public final NewPageMonitorInitModule$initPageMonitor$9$b b;

    public void a(NewPageMonitorInitModule$initPageMonitor$9$b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       p.a(this, p0, p1);
       if (p0) {
          PageMonitor.trackPageRequestError$default(PageMonitor.INSTANCE, this.b.b.get(), p1, 0, 4, null);
          Object obj = this.b.b.get();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<*>");
          obj.q().f(this);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       p.b(this, p0, p1);
       if (p0) {
          PageMonitor iNSTANCE = PageMonitor.INSTANCE;
          Object obj = this.b.b.get();
          String str = (p1)? "CachePageList": "PageList";
          iNSTANCE.trackPageRequestEnd(obj, true, p1, str);
          Object obj1 = this.b.b.get();
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<*>");
          obj1.q().f(this);
       }
       return;
    }
}
