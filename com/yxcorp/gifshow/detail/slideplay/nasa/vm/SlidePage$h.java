package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$h;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import rd5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import pp7.b;
import com.kwai.slide.play.detail.base.BasePage;
import uq7.b;
import com.kwai.slide.play.detail.event.CleanType;

public final class SlidePage$h implements g	// class@0017dc
{
    public final SlidePage b;

    public void SlidePage$h(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$h.class, "1")) {
       }else {
          j a = p0.a;
          if (a == ChangeScreenVisibilityCause.NASA_FEATURE_SCREEN_CLEAN || a == ChangeScreenVisibilityCause.CLICK) {
             this.b.e0().f(new b(CleanType.TYPE_NASA, p0.b, p0.c));
          }else if(a == ChangeScreenVisibilityCause.NASA_FEATURE_PANEL){
             this.b.e0().f(new b(CleanType.TYPE_NASA_PANEL, p0.b, p0.c));
          }else if(a == ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED){
             this.b.e0().f(new b(CleanType.TYPE_PRESS_SPEED, p0.b, false));
          }else {
             this.b.e0().f(new b(CleanType.TYPE_ALL, p0.b, p0.c));
          }
          PatchProxy.onMethodExit(SlidePage$h.class, "1");
       }
       return;
    }
}
