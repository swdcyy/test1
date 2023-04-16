package knd.d;
import knd.d$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.util.List;
import msd.l;
import java.lang.reflect.Type;
import oa0.a;
import java.lang.StringBuilder;
import elb.y;
import elb.z;
import brd.t;
import knd.d$b;
import erd.o;
import knd.d$c;
import knd.d$d;
import erd.g;
import crd.b;
import java.lang.Long;
import knd.c;
import knd.a;
import knd.b;
import java.util.concurrent.TimeUnit;
import cjd.e;
import t45.d;
import brd.z;
import knd.d$e;
import knd.d$f;

public final class d	// class@0017dd
{
    public int a;
    public boolean b;
    public final List c;
    public final a d;
    public static final d$a e;

    static {
       d.e = new d$a(null);
    }
    public void d(){
       super();
       ArrayList uArrayList = Lists.b();
       a.o(uArrayList, "Lists.newArrayList\(\)");
       this.c = uArrayList;
       this.d = new a();
    }
    public final String a(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("RecommendTextRepoV2", "getNextRecoText", objArray);
       if (q.f(this.c)) {
          return null;
       }else {
          int i1 = 1;
          if (!p0) {
             this.a = i1;
             return this.c.get(i);
          }else {
             this.b = i1;
             int i2 = this.a % this.c.size();
             this.a = i2;
             this.a = i2 + 1;
             return this.c.get(i2);
          }
       }
    }
    public final void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "consumer");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "RecommendTextRepoV2";
       a.D().w(str, "loadDefaultRecoTextList", objArray);
       List list = a.p(List.class);
       if (!q.f(list)) {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "load default recommend text from cache info, size = "+list.size(), objArray1);
          this.c.clear();
          a.o(list, "cacheTextList");
          this.c.addAll(list);
          p0.invoke(Boolean.TRUE);
          return;
       }else {
          this.d.c(y.b.a().a().map(d$b.b).subscribe(new d$c(this, p0), new d$d(p0)));
          return;
       }
    }
    public final void c(String p0,long p1,l p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, d.class, "3")) {
          return;
       }
       a.p(p0, "sessionId");
       a.p(p2, "consumer");
       Object[] objArray = new Object[0];
       a.D().w("RecommendTextRepoV2", "loadRecoTextList sessionId = "+p0+" delayMs = "+p1, objArray);
       d td = this.d;
       c uoc = c.class;
       _monitor_enter(uoc);
       b uob = PatchProxy.apply(null, null, uoc, "1");
       if (uob != PatchProxyResult.class) {
          _monitor_exit(uoc);
       }else {
          uob = new b();
          c.a = uob;
          _monitor_exit(uoc);
       }
       td.c(uob.a(p0).delay(p1, TimeUnit.MILLISECONDS).map(new e()).observeOn(d.a).subscribe(new d$e(this, p2), new d$f(p2)));
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecommendTextRepoV2", "release", objArray);
       this.d.dispose();
       this.d.d();
       return;
    }
}
