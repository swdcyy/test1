package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;

public class b$b extends a	// class@001983
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.b.S8();
       this.b.W8();
       k1.m(this.b.I);
       this.b.H = null;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       if (NasaFeatureGuideManager.f().b()) {
          k1.r(this.b.I, 2000);
       }
       return;
    }
}
