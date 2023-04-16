package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$n;
import jta.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;

public final class SlideVerticalAtlasAutoPlayPresenter$n extends a	// class@00180b
{
    public final SlideVerticalAtlasAutoPlayPresenter a;

    public void SlideVerticalAtlasAutoPlayPresenter$n(SlideVerticalAtlasAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter$n.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter$n.class, "2")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          this.a.b9(5);
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$n.class, "2");
       return;
    }
    public void d(float p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter$n.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter$n.class, "1")) {
          return;
       }
       this.a.c9(5);
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$n.class, "1");
       return;
    }
}
