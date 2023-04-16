package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$k;
import ud5.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class SlideVerticalAtlasAutoPlayPresenter$k implements e	// class@001808
{
    public final SlideVerticalAtlasAutoPlayPresenter a;

    public void SlideVerticalAtlasAutoPlayPresenter$k(SlideVerticalAtlasAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter$k.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter$k.class, "1")) {
          return;
       }
       SlideVerticalAtlasAutoPlayPresenter$k ta = this.a;
       ta.F = p0;
       ta.Y8(p0);
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$k.class, "1");
       return;
    }
}
