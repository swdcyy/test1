package com.yxcorp.gifshow.featured.detail.featured.presenter.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import oda.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import zda.h1;
import erd.g;
import crd.b;

public class o extends PresenterV2	// class@000f8a
{

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new h1(this)));
       return;
    }
}
