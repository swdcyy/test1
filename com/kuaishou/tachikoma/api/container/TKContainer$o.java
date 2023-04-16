package com.kuaishou.tachikoma.api.container.TKContainer$o;
import oo8.k;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.r;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tx4.w;
import com.kuaishou.tachikoma.b;
import java.util.Objects;
import tw4.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.tachikoma.core.bridge.d;
import bx4.h;
import bx4.c;
import java.lang.System;

public class TKContainer$o implements k	// class@000f72
{
    public final r a;
    public final TKContainer b;

    public void TKContainer$o(TKContainer p0,r p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void failed(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$o.class, "2")) {
          return;
       }
       TKContainer$o ta = this.a;
       if (ta != null) {
          ta.a(4001, p0);
       }
       b.a(p0, this.b.b);
       return;
    }
    public void success(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKContainer$o.class, "1")) {
          return;
       }
       this.b.w = true;
       TKContainer$o tb = this.b;
       TKContainer k = tb.k;
       if (k != null) {
          TKContainer c = tb.c;
          Objects.requireNonNull(c);
          Object obj = PatchProxy.apply(objArray, c, t.class, "18");
          long l = (obj != PatchProxyResult.class)? obj.longValue(): c.a.i;
          k.a.k = l;
          c = this.b.k;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoid(objArray, c, h.class, "8")) {
             c.a.l = System.currentTimeMillis();
          }
          this.b.k.m = h.C;
       }
       h.C = false;
       tb = this.a;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
