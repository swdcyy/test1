package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$l;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;

public final class SlideVerticalAtlasAutoPlayPresenter$l implements g	// class@001809
{
    public final SlideVerticalAtlasAutoPlayPresenter b;

    public void SlideVerticalAtlasAutoPlayPresenter$l(SlideVerticalAtlasAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       float f = p0.floatValue();
       if (!PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter$l.class, "1") || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(f), this, SlideVerticalAtlasAutoPlayPresenter$l.class, "1")) {
          this.b.e9(f);
          PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$l.class, "1");
       }
       return;
    }
}
