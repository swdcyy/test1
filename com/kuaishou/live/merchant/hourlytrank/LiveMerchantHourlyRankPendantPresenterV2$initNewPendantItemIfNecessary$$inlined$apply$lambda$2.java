package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg3.b;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import ba2.v;
import ba2.i;

public final class LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2 extends Lambda implements a	// class@000cc3
{
    public final LiveMerchantHourlyRankPendantPresenterV2 this$0;

    public void LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2(LiveMerchantHourlyRankPendantPresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2.class, "1")) {
          return;
       }
       b p = this.this$0.p;
       a.o(p, "mLiveBasicContext");
       LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2 tthis$0 = this.this$0;
       int[] ointArray = new int[]{tthis$0.v};
       i.e(p.a(), v.h(LiveHourlyRankType.MERCHANT_RANK), tthis$0.x, ointArray);
       PatchProxy.onMethodExit(LiveMerchantHourlyRankPendantPresenterV2$initNewPendantItemIfNecessary$$inlined$apply$lambda$2.class, "1");
       return;
    }
}
