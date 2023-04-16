package c12.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2$e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c12.m;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import w51.a;
import java.lang.Number;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import java.lang.Long;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import ekd.k1;
import c12.n;
import java.lang.Runnable;

public class o implements PresenterV2$e	// class@0004a9
{
    public final m a;
    public List b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public String g;

    public void o(PresenterV2 p0,m p1,String p2){
       super();
       this.c = false;
       this.d = false;
       this.f = 0;
       this.a = p1;
       p0.i = this;
       this.g = p2;
    }
    public static boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, o.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "84");
       boolean b = false;
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("live_enable_scatter_loader", b);
       if (!i) {
          return a.t().u("SOURCE_LIVE").d("enableScarlettLoadCache", b);
       }else if(i == 1){
          b = true;
       }
       return b;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "4")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SCATTER_LOADER, "callUnbind", "liveStreamId", this.g);
       this.f();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SCATTER_LOADER, "callBind", "liveStreamId", this.g);
       this.b = p0;
       if (this.d == null) {
          this.g(p0);
       }
       return;
    }
    public final void c(List p0,long p1){
       long l3;
       long l = this;
       TimeUnit obj = p0;
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(obj, Long.valueOf(p1), l, oo, "12")) {
          return;
       }
       long l1 = (l.e)? System.nanoTime() - l.e: 0;
       l.e = System.nanoTime();
       long l2 = p1;
       int i = 0;
       while (l2 > 0 && l.f < p0.size()) {
          PresenterV2$c uoc = obj.get(l.f);
          String str = "13";
          Object obj1 = PatchProxy.applyOneRefsWithListener(uoc, l, oo, str);
          if (obj1 != PatchProxyResult.class) {
             l3 = obj1.longValue();
          }else {
             uoc.a();
             long l4 = System.nanoTime() - System.nanoTime();
             PatchProxy.onMethodExit(oo, str);
             l3 = l4;
          }
          l2 = l2 - l3;
          int i1 = l.f + 1;
          l.f = i1;
          i = i + 1;
       }
       obj = TimeUnit.NANOSECONDS;
       b.f0(LiveLogTag.LIVE_SCATTER_LOADER, "bindPresentersLimitTimeCost, bindCount: "+i, "endIndex", Integer.valueOf(l.f), "waitTimeMs", Long.valueOf(obj.toMillis(l1)), "costTimeMs", Long.valueOf(obj.toMillis((System.nanoTime() - l.e))), "liveStreamId", l.g);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.d = false;
       this.c = true;
       this.e = 0;
       o ta = this.a;
       if (ta != null) {
          ta.a();
       }
       b.c0(LiveLogTag.LIVE_SCATTER_LOADER, "onScatterLoadFinished", "liveStreamId", this.g);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, o.class, "10")) {
          return;
       }
       this.d = false;
       this.e = 0;
       k1.n(this);
       return;
    }
    public final void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "9")) {
          return;
       }
       if (this.f >= p0.size()) {
          this.e();
          return;
       }else {
          this.d = true;
          k1.s(new n(this, p0), this, 0);
          return;
       }
    }
}
