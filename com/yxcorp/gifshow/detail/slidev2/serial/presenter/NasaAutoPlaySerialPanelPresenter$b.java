package com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$b;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;
import java.util.Objects;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import y8a.e;
import com.yxcorp.gifshow.entity.QPhoto;
import n8a.a;

public final class NasaAutoPlaySerialPanelPresenter$b implements g	// class@0019df
{
    public final NasaAutoPlaySerialPanelPresenter b;

    public void NasaAutoPlaySerialPanelPresenter$b(NasaAutoPlaySerialPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaAutoPlaySerialPanelPresenter$b.class, "1")) {
       }else {
          a.o(p0, "isSeeking");
          int i = 6;
          if (p0.booleanValue()) {
             this.b.T.set(i);
             this.b.G9();
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, nasaAutoPlay, "13")) {
                if (p0.R9(p0.u1)) {
                   NasaAutoPlaySerialPanelPresenter.A1 = false;
                }else if(!NasaAutoPlaySerialPanelPresenter.A1){
                   NasaAutoPlaySerialPanelPresenter.A1 = true;
                }
                p0.T.clear(i);
                p0.O9();
                if (!PatchProxy.applyVoid(objArray, p0, nasaAutoPlay, "12")) {
                   p0.Y8();
                   if (p0.R9(p0.u1) && p0.O != null) {
                      NasaAutoPlaySerialPanelPresenter k1 = p0.k1;
                      if (k1 != null) {
                         objArray = k1.a(e.a(p0.x1));
                      }
                      NasaAutoPlaySerialPanelPresenter.z1 = objArray;
                   }else {
                      p0.U9();
                   }
                }
                p0.F9();
                p0.u1 = 0;
             }
          }
          PatchProxy.onMethodExit(NasaAutoPlaySerialPanelPresenter$b.class, "1");
       }
       return;
    }
}
