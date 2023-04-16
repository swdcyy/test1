package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$c;
import jta.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import pp7.b;
import com.kwai.slide.play.detail.base.BasePage;

public final class SlidePage$c extends a	// class@0017d5
{
    public final SlidePage a;

    public void SlidePage$c(SlidePage p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       if (PatchProxy.isSupport2(SlidePage$c.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, SlidePage$c.class, "1")) {
          return;
       }
       this.a.j0().f(Float.valueOf(p0));
       PatchProxy.onMethodExit(SlidePage$c.class, "1");
       return;
    }
}
