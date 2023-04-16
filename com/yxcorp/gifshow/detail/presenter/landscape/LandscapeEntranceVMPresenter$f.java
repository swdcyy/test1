package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$f;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;
import kotlin.jvm.internal.a;
import xl8.b;

public final class LandscapeEntranceVMPresenter$f implements g	// class@0016e5
{
    public final LandscapeEntranceVMPresenter b;

    public void LandscapeEntranceVMPresenter$f(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport2(LandscapeEntranceVMPresenter$f.class, "1") || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(b), this, LandscapeEntranceVMPresenter$f.class, "1")) {
          if (!b) {
             b = this.b.Z;
             if (b != null) {
                b.onNext(Boolean.FALSE);
             }
          }else if(this.b.W8()){
             b = this.b.H;
             a.m(b);
             b = b.a();
             a.o(b, "mLandscapeEntranceSwitch!!.value");
             if (b.booleanValue()) {
                b = this.b.Z;
                if (b != null) {
                   b.onNext(Boolean.TRUE);
                }
             }
          }
          PatchProxy.onMethodExit(LandscapeEntranceVMPresenter$f.class, "1");
       }
       return;
    }
}
