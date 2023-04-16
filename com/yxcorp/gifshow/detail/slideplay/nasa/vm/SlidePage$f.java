package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$f;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.base.BasePage;

public final class SlidePage$f implements g	// class@0017d9
{
    public final SlidePage b;

    public void SlidePage$f(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$f.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.S0(p0.booleanValue());
          this.b.k1(p0.booleanValue());
          PatchProxy.onMethodExit(SlidePage$f.class, "1");
       }
       return;
    }
}
