package com.yxcorp.gifshow.share.operation.b$a$a;
import erd.o;
import com.yxcorp.gifshow.share.operation.b$a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import e17.i;
import uo7.k;
import uo7.c0;
import brd.t;
import com.yxcorp.gifshow.share.operation.b;
import com.yxcorp.gifshow.share.operation.a;
import erd.g;

public final class b$a$a implements o	// class@001c02
{
    public final b$a b;

    public void b$a$a(b$a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$a$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "isGranted");
          if (p0.booleanValue()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10321b);
             p0 = this.b;
             p0 = p0.c.a(p0.getConfiguration());
          }else {
             p0 = t.just(this.b.getConfiguration()).doOnNext(a.b);
          }
          ot = p0;
       }
       return ot;
    }
}
