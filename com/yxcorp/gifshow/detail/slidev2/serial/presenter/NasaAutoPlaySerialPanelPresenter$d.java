package com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class NasaAutoPlaySerialPanelPresenter$d implements Observer	// class@0019e1
{
    public final NasaAutoPlaySerialPanelPresenter b;

    public void NasaAutoPlaySerialPanelPresenter$d(NasaAutoPlaySerialPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaAutoPlaySerialPanelPresenter$d.class, "1")) {
       }else if(a.g(p0, Boolean.TRUE)){
          this.b.B9(false);
          this.b.T.set(7);
          this.b.G9();
       }else {
          this.b.T.clear(7);
          this.b.F9();
       }
       return;
    }
}
