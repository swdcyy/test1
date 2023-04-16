package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.lang.Runnable;
import ekd.k1;

public class m$b extends a	// class@00199b
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, m$b.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, m$b.class, "1")) {
          return;
       }
       if (NasaFeatureGuideManager.f().j()) {
          k1.r(this.b.z, 1000);
       }
       return;
    }
}
