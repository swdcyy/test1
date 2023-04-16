package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;

public class d$b extends a	// class@001988
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "2")) {
          return;
       }
       k1.m(this.b.w);
       d$b tb = this.b;
       tb.x = null;
       tb.R8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       if (NasaFeatureGuideManager.f().c()) {
          k1.r(this.b.w, 1000);
       }
       return;
    }
}
