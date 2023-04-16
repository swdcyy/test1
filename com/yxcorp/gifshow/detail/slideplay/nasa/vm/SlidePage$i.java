package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$i;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bs7.a;
import com.kwai.slide.play.detail.base.BasePage;
import android.view.ViewGroup;
import qp7.e;
import v6a.m0;
import jf5.a;
import kotlin.jvm.internal.a;
import rf5.u;
import android.view.View;
import r7a.i;

public final class SlidePage$i implements g	// class@0017de
{
    public final SlidePage b;

    public void SlidePage$i(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$i.class, "1")) {
       }else {
          ViewGroup viewGroup = this.b.P().u();
          if (p0.a != 2) {
             p0 = this.b.d1().v.R;
             a.o(p0, "callerContext.mPhotoDeta¡­wipeToProfileFeedMovement");
             if (p0.v()) {
                b = true;
             label_0035 :
                i.b(viewGroup, b, false);
                PatchProxy.onMethodExit(SlidePage$i.class, "1");
             }
          }
          b = false;
          goto label_0035 ;
       }
       return;
    }
}
