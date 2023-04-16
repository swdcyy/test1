package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$e;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tr7.a;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.g;
import qp7.e;
import tr7.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.y;

public final class SlidePage$e implements g	// class@0017d7
{
    public final SlidePage b;

    public void SlidePage$e(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$e.class, "1")) {
       }else {
          c uoc = this.b.M().s();
          a.o(p0, "isLoading");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoc, uoc1, "5")) {
             uoc.c.onNext(Boolean.valueOf(b));
          }
          PatchProxy.onMethodExit(SlidePage$e.class, "1");
       }
       return;
    }
}
