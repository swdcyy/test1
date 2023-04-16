package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$h;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import bxb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class SlideVerticalAtlasAutoPlayPresenter$h implements g	// class@001805
{
    public final SlideVerticalAtlasAutoPlayPresenter b;

    public void SlideVerticalAtlasAutoPlayPresenter$h(SlideVerticalAtlasAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlideVerticalAtlasAutoPlayPresenter$h.class, "1")) {
       }else if(p0.a == 1){
          this.b.c9(6);
       }else {
          this.b.b9(6);
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$h.class, "1");
       return;
    }
}
