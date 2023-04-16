package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.lang.Runnable;
import ekd.k1;

public class h$b extends a	// class@001990
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("SlidePlayLeftSlideGuide", "becomesDetachedOnPageSelected", objArray);
       this.b.R8();
       this.b.Z8();
       h$b tb = this.b;
       tb.K = null;
       tb.R = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       if (NasaFeatureGuideManager.f().d() > 3 && (!NasaFeatureGuideManager.f().g() || (!this.b.X8() || this.b.W8()))) {
          Object[] objArray = new Object[0];
          o.C().w("NasaGuide", "left guide p attach", objArray);
          k1.r(this.b.L, 5000);
       }
       this.b.R = true;
       return;
    }
}
