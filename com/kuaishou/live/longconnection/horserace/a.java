package com.kuaishou.live.longconnection.horserace.a;
import kf3.a;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.longconnection.connector.l;
import brd.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import brd.t;
import com.kuaishou.live.longconnection.horserace.a$c;
import erd.o;
import com.kuaishou.live.longconnection.horserace.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.live.longconnection.horserace.a$b;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.longconnection.horserace.a$a;
import erd.g;
import com.kuaishou.live.longconnection.horserace.c;

public class a implements a	// class@000c83
{
    public final long[] a;
    public final long b;
    public List c;
    public boolean d;
    public boolean e;

    public void a(long[] p0,long p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          if (p0[i] - this.b <= 0) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("barrier can not be larger than timeout");
    }
    public a0 a(List p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c = new ArrayList();
       return d.b(t.fromIterable(p0).map(new a$c(this, p1)), this.a).observeOn(a.c()).flatMapSingle(new a$b(this, p0)).timeout(this.b, TimeUnit.MILLISECONDS, a.c()).doOnError(new a$a(this)).firstOrError();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.e = true;
       a tc = this.c;
       if (tc != null) {
          int i = 0;
          int i1 = tc.size();
          while (i < i1) {
             if (this.c.size() > i) {
                this.c.get(i).c("exit live room, cancel horse");
             }
             i = i + 1;
          }
          this.c.clear();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.c.clear();
       return;
    }
}
