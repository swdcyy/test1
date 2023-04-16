package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$g;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SlideVerticalAtlasAutoPlayPresenter$g implements g	// class@001804
{
    public final SlideVerticalAtlasAutoPlayPresenter b;

    public void SlideVerticalAtlasAutoPlayPresenter$g(SlideVerticalAtlasAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlideVerticalAtlasAutoPlayPresenter$g.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.c9(7);
          }else {
             this.b.b9(7);
          }
          PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$g.class, "1");
       }
       return;
    }
}
