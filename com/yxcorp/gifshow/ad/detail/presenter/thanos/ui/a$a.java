package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.a$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import r19.d;
import xz5.a;
import xz5.b;

public class a$a extends a	// class@0016d6
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       k1.m(this.b.B);
       if (this.b.s.getFilterStatus() == 2) {
          k1.r(new d(this), 0);
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       a z = tb.z;
       if (z == null || (tb.A != null && (tb.s.equals(z.w2(z.getCurrentIndex())) && this.b.s.getFilterStatus() == 2))) {
          tb = this.b;
          tb.A.b(tb.s);
       }
    label_003b :
       return;
    }
}
