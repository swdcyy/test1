package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$g;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LandscapeEntranceVMPresenter$g implements g	// class@0016e6
{
    public final LandscapeEntranceVMPresenter b;

    public void LandscapeEntranceVMPresenter$g(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeEntranceVMPresenter$g.class, "1")) {
       }else if(a.g(Boolean.valueOf(this.b.W), p0) ^ 0x01){
          a.o(p0, "it");
          this.b.W = p0.booleanValue();
       }
       return;
    }
}
