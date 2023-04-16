package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$g;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import uq7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.base.BasePage;
import pp7.b;

public final class SlidePage$g implements g	// class@0017db
{
    public final SlidePage b;

    public void SlidePage$g(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$g.class, "1")) {
       }else {
          this.b.L.f(p0);
          p0.b = false;
          PatchProxy.onMethodExit(SlidePage$g.class, "1");
       }
       return;
    }
}
