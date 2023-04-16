package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV3;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg3.b;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignalAll;
import brd.t;
import ks3.k0;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV3$init$1;
import fg3.n;
import msd.l;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV3$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b;
import lp3.e;
import iy1.g;
import lp3.c;
import iy1.l;
import kotlin.jvm.internal.a;
import ky1.c;

public final class LiveMerchantHourlyRankPendantPresenterV3 extends LiveMerchantHourlyRankPendantPresenterV2	// class@000cc7
{
    public LiveRoomSignalMessage$SellerRankSignalAll J;

    public void LiveMerchantHourlyRankPendantPresenterV3(){
       super();
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV3.class, "1")) {
          return;
       }
       if (this.u == null) {
          b uob = this.r.b(975, LiveRoomSignalMessage$SellerRankSignalAll.class).subscribe(new n(new LiveMerchantHourlyRankPendantPresenterV3$init$1(this)), LiveMerchantHourlyRankPendantPresenterV3$a.b);
          this.u = uob;
          this.X7(uob);
          this.A = new LiveMerchantHourlyRankPendantPresenterV2$b(this);
          LiveMerchantHourlyRankPendantPresenterV2 tA = this.A;
          a.m(tA);
          this.V8().a(g.class).Xb(l.g, tA);
       }
       return;
    }
}
