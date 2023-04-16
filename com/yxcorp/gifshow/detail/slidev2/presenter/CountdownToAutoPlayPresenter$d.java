package com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$d;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$STOP_REASON;
import java.util.BitSet;

public final class CountdownToAutoPlayPresenter$d implements g	// class@0018ad
{
    public final CountdownToAutoPlayPresenter b;

    public void CountdownToAutoPlayPresenter$d(CountdownToAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       CountdownToAutoPlayPresenter$d uod = CountdownToAutoPlayPresenter$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          uod = this.b;
          if (uod.s != null) {
             if (b) {
                uod.u.set(CountdownToAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU.getType());
                this.b.R8();
             }else {
                uod.u.clear(CountdownToAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU.getType());
                this.b.P8();
             }
          }
       }
       return;
    }
}
