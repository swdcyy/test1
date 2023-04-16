package com.kwai.nearby.local.presenter.c;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import qc7.e;
import brd.t;
import dd7.i;
import com.kwai.imsdk.internal.util.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.feedstaggercard.model.CardStyle;

public class c extends g	// class@000fac
{
    public boolean H;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.E8();
       this.X7(RxBus.f.f(e.class).subscribe(new i(this), new e()));
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return CardStyle.isV4Bottom(this.t.mBottomType);
    }
}
