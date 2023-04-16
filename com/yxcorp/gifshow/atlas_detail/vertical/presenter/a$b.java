package com.yxcorp.gifshow.atlas_detail.vertical.presenter.a$b;
import d6a.a;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import joc.m;
import foc.m;
import foc.r;
import joc.g;

public class a$b extends a	// class@001bda
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void i2(){
       a y;
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       a v = tb.v;
       if (v != null) {
          y = tb.y;
          if (v.c.f() == 2) {
             v.c.p(y);
          }
       }
       tb = this.b;
       v = tb.w;
       if (v != null) {
          y = tb.y;
          if (v.c.f() == 2) {
             v.c.p(y);
          }
       }
       return;
    }
}
