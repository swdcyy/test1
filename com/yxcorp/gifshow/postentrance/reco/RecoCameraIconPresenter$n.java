package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$n;
import erd.g;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class RecoCameraIconPresenter$n implements g	// class@001069
{
    public final RecoCameraIconPresenter b;

    public void RecoCameraIconPresenter$n(RecoCameraIconPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport(RecoCameraIconPresenter$n.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, RecoCameraIconPresenter$n.class, "1")) {
          this.b.R8();
       }
       return;
    }
}
