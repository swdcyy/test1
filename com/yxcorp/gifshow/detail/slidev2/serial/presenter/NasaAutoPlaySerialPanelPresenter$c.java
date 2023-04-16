package com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$c;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NasaAutoPlaySerialPanelPresenter$c implements g	// class@0019e0
{
    public final NasaAutoPlaySerialPanelPresenter b;

    public void NasaAutoPlaySerialPanelPresenter$c(NasaAutoPlaySerialPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaAutoPlaySerialPanelPresenter$c.class, "1")) {
       }else {
          a.o(p0, "progress");
          this.b.u1 = p0.floatValue();
          this.b.O9();
          PatchProxy.onMethodExit(NasaAutoPlaySerialPanelPresenter$c.class, "1");
       }
       return;
    }
}
