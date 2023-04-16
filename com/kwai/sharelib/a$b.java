package com.kwai.sharelib.a$b;
import java.util.concurrent.Callable;
import com.kwai.sharelib.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import crd.b;
import uo7.k;
import com.kwai.sharelib.b;
import erd.a;
import com.kwai.sharelib.c;
import erd.g;
import com.kwai.sharelib.d;
import com.kwai.sharelib.e;

public final class a$b implements Callable	// class@0016a5
{
    public final a b;
    public final t c;

    public void a$b(a p0,t p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       t ot;
       a$b uob = PatchProxy.apply(null, this, a$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          b uob1 = this.b.k();
          if (uob1 == null) {
             uob = this.c;
          }else if(this.b.g.p()){
             ot = this.c.doOnComplete(new b(this, uob1));
          }else {
             ot = this.c.doOnNext(new c(this, uob1));
          }
          uob = ot.doOnError(new d(this, uob1)).doOnDispose(new e(this, uob1));
       }
       return uob;
    }
}
