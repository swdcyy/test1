package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wd4.a;
import brd.t;
import t45.d;
import brd.z;
import nk4.j;
import erd.g;
import crd.b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;

public class d extends PresenterV2	// class@00081b
{
    public MerchantLivePurchasePanelFragment p;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          this.X7(RxBus.f.k(a.class, false).observeOn(d.a).subscribe(new j(this)));
       }
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          RxBus.f.d(a.class);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT");
       return;
    }
}
