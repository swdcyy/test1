package com.kwai.nearby.local.presenter.d;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import qc7.e;
import brd.t;
import dd7.j;
import com.kwai.imsdk.internal.util.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class d extends h	// class@000fad
{
    public boolean H;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       super.E8();
       this.X7(RxBus.f.f(e.class).subscribe(new j(this), new e()));
       return;
    }
}
