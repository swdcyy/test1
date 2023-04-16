package com.kuaishou.live.core.basic.activity.i0;
import n51.a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xj3.d;
import m02.h1;
import msd.a;
import k51.b;
import en8.a;
import m02.i1;
import msd.l;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$c;
import m02.g1;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.LinkedList;

public class i0 implements a	// class@00183d
{
    public final LivePlayLoader a;

    public void i0(LivePlayLoader p0){
       this.a = p0;
       super();
    }
    public Object a(String p0,Runnable p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.b == null) {
          return null;
       }
       obj = new d(400, p0, new Object(), b.b(p0, new h1(p1)));
       this.a.b.e(obj);
       return obj.b();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "3")) {
          return;
       }
       if (p0 != null) {
          LivePlayLoader b = this.a.b;
          if (b != null) {
             b.b(new i1(p0));
             if (p0 instanceof LivePlayLoader$c) {
                y.q(this.a.r, new g1(p0));
             }
          }
       }
       return;
    }
    public Object c(String p0,Runnable p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.b == null) {
          return null;
       }
       obj = new d(401, p0, new LivePlayLoader$c(), p1);
       this.a.r.add(obj);
       i0 ta = this.a;
       if (ta.l != null) {
          ta.d();
       }
       return obj.b();
    }
}
