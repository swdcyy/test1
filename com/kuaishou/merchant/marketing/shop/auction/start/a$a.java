package com.kuaishou.merchant.marketing.shop.auction.start.a$a;
import io.reactivex.g;
import com.kuaishou.merchant.marketing.shop.auction.start.a$b;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import brd.g;
import java.util.List;

public class a$a implements g	// class@001bc8
{
    public final a$b b;

    public void a$a(a$b p0){
       super();
       this.b = p0;
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (p0.isDisposed()) {
          return;
       }
       a$a tb = this.b;
       a$b d = tb.d;
       if (d != null) {
          p0.onError(d);
          return;
       }else {
          d = tb.c;
          if (d != null) {
             p0.onNext(d);
             p0.onComplete();
             return;
          }else {
             tb.e.add(p0);
             return;
          }
       }
    }
}
