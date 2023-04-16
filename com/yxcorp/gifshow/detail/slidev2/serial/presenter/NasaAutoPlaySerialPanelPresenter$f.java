package com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$f;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class NasaAutoPlaySerialPanelPresenter$f implements g	// class@0019e3
{
    public final NasaAutoPlaySerialPanelPresenter b;

    public void NasaAutoPlaySerialPanelPresenter$f(NasaAutoPlaySerialPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaAutoPlaySerialPanelPresenter$f.class, "1")) {
       }else if(p0 != null){
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.t1 = true;
             p0.T.set(18);
             this.b.G9();
          }else {
             p0 = this.b;
             p0.t1 = false;
             p0.T.clear(18);
             this.b.F9();
          }
       }
       return;
    }
}
