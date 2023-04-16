package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$init$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignal;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class LiveMerchantHourlyRankPendantPresenterV2$init$1 extends FunctionReferenceImpl implements l	// class@000cc1
{

    public void LiveMerchantHourlyRankPendantPresenterV2$init$1(LiveMerchantHourlyRankPendantPresenterV2 p0){
       super(1, p0, LiveMerchantHourlyRankPendantPresenterV2.class, "onSignalReceived", "onSignalReceived\(Lcom/kuaishou/merchant/message/nano/LiveRoomSignalMessage$SellerRankSignal;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveRoomSignalMessage$SellerRankSignal p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantPresenterV2$init$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.X8(p0);
       return;
    }
}
