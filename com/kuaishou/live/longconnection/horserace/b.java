package com.kuaishou.live.longconnection.horserace.b;
import kf3.a;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.longconnection.connector.l;
import brd.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.live.longconnection.horserace.b$d;
import erd.o;
import com.kuaishou.live.longconnection.horserace.d;
import com.kuaishou.live.longconnection.horserace.b$c;
import com.kuaishou.live.longconnection.horserace.b$b;
import erd.g;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.longconnection.horserace.b$a;
import com.kuaishou.live.longconnection.horserace.c;

public class b implements a	// class@000c88
{
    public final long a;
    public List b;
    public boolean c;
    public boolean d;

    public void b(long p0,boolean p1){
       super();
       this.a = p0;
       this.c = p1;
    }
    public a0 a(List p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = new ArrayList();
       long[] olongArray = new long[]{0};
       return d.b(t.fromIterable(p0).observeOn(a.c()).map(new b$d(this, p1)), olongArray).flatMap(new b$c(this)).firstOrError().G(a.c()).r(new b$b(this)).V(this.a, TimeUnit.MILLISECONDS, a.c()).p(new b$a(this));
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.d = true;
       b tb = this.b;
       if (tb != null) {
          int i = 0;
          int i1 = tb.size();
          while (i < i1) {
             if (this.b.size() > i) {
                this.b.get(i).c("exit live room, cancel horse");
             }
             i = i + 1;
          }
          this.b.clear();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.clear();
       return;
    }
}
