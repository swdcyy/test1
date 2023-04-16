package com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$g;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter;
import java.lang.Object;
import eda.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;

public final class NasaAutoPlaySerialPanelPresenter$g implements g	// class@0019e4
{
    public final NasaAutoPlaySerialPanelPresenter b;

    public void NasaAutoPlaySerialPanelPresenter$g(NasaAutoPlaySerialPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaAutoPlaySerialPanelPresenter$g.class, "1")) {
       }else {
          a.p(p0, "nasaPickSerialPanelShowEvent");
          NasaAutoPlaySerialPanelPresenter$g tb = this.b;
          p0 = (p0.a != null)? SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.CURRENT_POSITION_DISABLE: SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
          tb.W = p0;
       }
       return;
    }
}
