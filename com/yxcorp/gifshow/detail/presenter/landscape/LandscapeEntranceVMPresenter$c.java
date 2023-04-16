package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$c;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public final class LandscapeEntranceVMPresenter$c implements g	// class@0016e2
{
    public final LandscapeEntranceVMPresenter b;

    public void LandscapeEntranceVMPresenter$c(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LandscapeEntranceVMPresenter$c.class, "1")) {
       }else {
          p0 = this.b.Z;
          if (p0 != null) {
             p0.onNext(Boolean.TRUE);
          }
          PatchProxy.onMethodExit(LandscapeEntranceVMPresenter$c.class, "1");
       }
       return;
    }
}
