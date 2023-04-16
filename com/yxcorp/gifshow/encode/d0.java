package com.yxcorp.gifshow.encode.d0;
import erd.o;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.encode.s0;
import ekd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import pca.u0;

public final class d0 implements o	// class@000d14
{
    public final PostWorkInfo b;
    public final AtomicLong c;
    public final AtomicInteger d;

    public void d0(PostWorkInfo p0,AtomicLong p1,AtomicInteger p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       t ot;
       d0 tb = this.b;
       d0 tc = this.c;
       d0 td = this.d;
       int i = 1;
       boolean b = (p0.intValue() == i && !s0.k(tb))? true: false;
       tc.set(k1.i());
       if (!b) {
          i = 3;
       }
       td.set(i);
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0)) {
          ot = PatchProxy.applyTwoRefs(tb, Boolean.valueOf(b), null, os0, "34");
          if (ot != PatchProxyResult.class) {
          label_004d :
             return ot;
          }
       }
       ot = t.just(tb).flatMap(new u0(tb, b));
       goto label_004d ;
    }
}
