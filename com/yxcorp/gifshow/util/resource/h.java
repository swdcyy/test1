package com.yxcorp.gifshow.util.resource.h;
import java.lang.Runnable;
import boc.b;
import doc.a;
import com.yxcorp.gifshow.util.resource.n$c;
import t16.a;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.MagicModel;
import lnc.s6;
import com.yxcorp.gifshow.util.resource.n;
import boc.r;
import ekd.k1;

public final class h implements Runnable	// class@000cec
{
    public final b b;
    public final a c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final n$c g;
    public final a h;

    public void h(b p0,a p1,boolean p2,boolean p3,boolean p4,n$c p5,a p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       h tf = this.f;
       h tg = this.g;
       h th = this.h;
       if (tb instanceof MagicModel && s6.g()) {
          if (tb.needDownload(tc)) {
             n.k(tc, tb, td, te, tf, tg, th);
          }else if(tg != null){
             k1.o(new r(tg, tb));
          }
       }else {
          n.k(tc, tb, td, te, tf, tg, th);
       }
       return;
    }
}
