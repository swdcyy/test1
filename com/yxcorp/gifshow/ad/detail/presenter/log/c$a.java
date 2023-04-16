package com.yxcorp.gifshow.ad.detail.presenter.log.c$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;

public class c$a extends a	// class@001660
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       c$a tb = this.b;
       c r = tb.r;
       if (r != null) {
          r.remove(tb.u);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       c r = tb.r;
       if (r != null) {
          r.add(tb.u);
       }
       return;
    }
}
