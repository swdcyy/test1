package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.b0;
import vz8.f;
import java.lang.Runnable;
import ekd.k1;

public class a$b extends a	// class@0015cb
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void i2(){
       a$b uob = a$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       this.b.S8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "3") && b0.b(k.B(this.b.t))) {
          f uof = new f(this);
          this.b.z = uof;
          k1.r(uof, 5000);
       }
       return;
    }
}
