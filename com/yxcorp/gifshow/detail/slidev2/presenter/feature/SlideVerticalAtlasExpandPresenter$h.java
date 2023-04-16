package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$h;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import zq7.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public final class SlideVerticalAtlasExpandPresenter$h implements g	// class@001931
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void SlideVerticalAtlasExpandPresenter$h(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$h.class, "1")) {
       }else {
          p0 = p0.a;
          SlideVerticalAtlasExpandPresenter w = this.b.w;
          if (w != null) {
             w.setAlpha((0x3f800000 - p0));
          }
       }
       return;
    }
}
