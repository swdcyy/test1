package com.yxcorp.gifshow.message.init.k;
import erd.o;
import zb5.i;
import pa6.a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import zb5.c;
import io.reactivex.g;

public final class k implements o	// class@001d5c
{
    public final i b;
    public final a c;

    public void k(i p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       k tc = this.c;
       p0 = tc.c;
       a b = tc.b;
       a a = tc.a;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyThreeRefs(p0, b, a, tb, i.class, "12");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new c(tb, p0, b, a));
       }
       return ot;
    }
}
