package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV3$init$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignalAll;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import fg3.d;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2;
import ekd.j;
import java.util.ArrayList;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignal;
import java.lang.Long;
import java.util.List;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView;
import java.util.Arrays;

public final class LiveMerchantHourlyRankPendantPresenterV3$init$1 extends FunctionReferenceImpl implements l	// class@000cc6
{

    public void LiveMerchantHourlyRankPendantPresenterV3$init$1(LiveMerchantHourlyRankPendantPresenterV3 p0){
       super(1, p0, LiveMerchantHourlyRankPendantPresenterV3.class, "onSignalReceived", "onSignalReceived\(Lcom/kuaishou/merchant/message/nano/LiveRoomSignalMessage$SellerRankSignalAll;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveRoomSignalMessage$SellerRankSignalAll p0){
       LiveMerchantHourlyRankPendantPresenterV3 j;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantPresenterV3$init$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       d uod = d.class;
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LiveMerchantHourlyRankPendantPresenterV3.class, "2")) {
          treceiver.F = true;
          treceiver.J = p0;
          if (p0 != null && !j.h(p0.sellerRankSignal)) {
             j = treceiver.J;
             a.m(j);
             j = j.sellerRankSignal;
             String str = "mSignalList!!.sellerRankSignal";
             a.o(j, str);
             ArrayList uArrayList = new ArrayList(j.length);
             int len = j.length;
             for (int i = 0; i < len; i = i + 1) {
                uArrayList.add(Long.valueOf(j[i].carouselMills));
             }
             d uod1 = treceiver.W8();
             if (uod1 != null && !PatchProxy.applyVoidOneRefs(uArrayList, uod1, uod, "6")) {
                a.p(uArrayList, "intervals");
                uod1.b.setInterval(uArrayList);
             }
             j = treceiver.J;
             a.m(j);
             object oobject = j.sellerRankSignal[0];
             a.o(oobject, "mSignalList!!.sellerRankSignal[0]");
             treceiver.X8(oobject);
             j = treceiver.J;
             a.m(j);
             j = j.sellerRankSignal;
             a.o(j, str);
             ArrayList uArrayList1 = new ArrayList(j.length);
             int len1 = j.length;
             for (len = 0; len < len1; len = len + 1) {
                uArrayList1.add(j[len].rankPendantName);
             }
             uod1 = treceiver.W8();
             if (uod1 != null && !PatchProxy.applyVoidOneRefs(uArrayList1, uod1, uod, "5")) {
                a.p(uArrayList1, "content");
                String[] stringArray = new String[0];
                Object[] objArray = uArrayList1.toArray(stringArray);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                uod1.b.setContent(Arrays.copyOf(objArray, objArray.length));
             }
          }
       }
    label_00ce :
       return;
    }
}
