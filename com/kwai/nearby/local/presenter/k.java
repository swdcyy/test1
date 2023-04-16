package com.kwai.nearby.local.presenter.k;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView$b;
import java.lang.Object;
import bd7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class k implements TipRefreshView$b	// class@000fb6
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final void onShow(){
       if (PatchProxy.applyVoid(null, null, a.class, "2")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LOCATION_TRAN_BAR";
          u1.D0("816772", null, 0, uElementPack, null, null);
       }
       return;
    }
}
