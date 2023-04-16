package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h$c;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.util.Objects;
import java.lang.Boolean;
import oe6.a;
import java.lang.Runnable;
import ekd.k1;

public class h$c extends a	// class@001991
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       h$c uoc = h$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (!p0 && !this.a.X8()) {
          NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.f();
          Objects.requireNonNull(nasaFeatureG);
          if (!PatchProxy.isSupport(NasaFeatureGuideManager.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, nasaFeatureG, NasaFeatureGuideManager.class, "9")) {
             a.e0(false);
          }
          k1.m(this.a.L);
       }
       return;
    }
}
