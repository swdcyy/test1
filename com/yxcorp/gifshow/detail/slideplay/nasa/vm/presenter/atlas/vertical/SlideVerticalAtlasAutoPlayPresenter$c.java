package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$c;
import yg5.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import yg5.s0;
import yg5.r0;

public final class SlideVerticalAtlasAutoPlayPresenter$c implements t0	// class@0017ff
{
    public final SlideVerticalAtlasAutoPlayPresenter b;

    public void SlideVerticalAtlasAutoPlayPresenter$c(SlideVerticalAtlasAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter$c.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter$c.class, "2")) {
          return;
       }
       if (!p0) {
          this.b.b9(3);
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$c.class, "2");
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter$c.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, SlideVerticalAtlasAutoPlayPresenter$c.class, "1")) {
          return;
       }
       if (p0) {
          this.b.c9(3);
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$c.class, "1");
       return;
    }
}
