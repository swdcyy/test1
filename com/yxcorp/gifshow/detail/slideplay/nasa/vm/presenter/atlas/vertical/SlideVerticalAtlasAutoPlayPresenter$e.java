package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$e;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import id5.v;
import q87.c;

public final class SlideVerticalAtlasAutoPlayPresenter$e implements g	// class@001802
{
    public final SlideVerticalAtlasAutoPlayPresenter b;

    public void SlideVerticalAtlasAutoPlayPresenter$e(SlideVerticalAtlasAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlideVerticalAtlasAutoPlayPresenter$e.class, "1")) {
       }else {
          a.p(p0, "event");
          if (p0.a == null) {
             Object[] objArray = new Object[0];
             v.C().w("SlideVerticalAtlasAPP", "tryStartScroll: 双指缩放清屏返回", objArray);
             this.b.Z8(-1, 9);
          }
          PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$e.class, "1");
       }
       return;
    }
}
