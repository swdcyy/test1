package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$j;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp7.b;
import com.kwai.slide.play.detail.base.BasePage;

public final class SlidePage$j implements g	// class@0017e0
{
    public final SlidePage b;

    public void SlidePage$j(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$j.class, "1")) {
       }else {
          this.b.b0().f(p0);
          PatchProxy.onMethodExit(SlidePage$j.class, "1");
       }
       return;
    }
}
