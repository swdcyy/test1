package b94.g;
import erd.g;
import b94.m;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityInfo;
import java.util.Map;
import lnc.o5;
import com.kuaishou.merchant.basic.util.o;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionInfoSignal;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.lang.Long;
import crd.b;
import lnc.b9;

public final class g implements g	// class@00032d
{
    public final m b;

    public void g(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String str1;
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "9")) {
       }else if(p0 != null){
          LiveRoomSignalMessage$SCKwaishopLiveActivityPendant activityInfo = p0.activityInfo;
          if (activityInfo != null) {
             LiveRoomSignalMessage$SCKwaishopLiveActivityInfo activityStat = activityInfo.activityState;
             LiveRoomSignalMessage$SCKwaishopLiveActivityInfo activityEndT = activityInfo.activityEndTimeMills;
             String str = null;
             LiveRoomSignalMessage$SCKwaishopLiveActivityInfo extraMap = activityInfo.extraMap;
             long l = 0;
             if (extraMap != null) {
                str = o5.b(extraMap.get("requestDelaySecond"), 10);
                str1 = p0.activityInfo.extraMap.get("itemId");
                l = o5.d(p0.activityInfo.extraMap.get("endRemainTime"), l);
             }else {
                str1 = "";
             }
             p0 = 1;
             if (activityStat == p0) {
                activityEndT = o.d() + l;
             }
             LiveRoomSignalMessage$AuctionInfoSignal uAuctionInfo = new LiveRoomSignalMessage$AuctionInfoSignal();
             uAuctionInfo.endTime = activityEndT;
             uAuctionInfo.realEndTime = activityEndT;
             uAuctionInfo.requestDelaySecond = str;
             LiveRoomSignalMessage$ItemInfo itemInfo = new LiveRoomSignalMessage$ItemInfo();
             uAuctionInfo.itemInfo = itemInfo;
             itemInfo.itemId = str1;
             if (activityStat != p0) {
                if (activityStat == 2) {
                   tb.w.remove(str1);
                   tb.P8(uAuctionInfo);
                   a.s(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionResumeSignal endRetainTime:"+tb.R8(uAuctionInfo));
                   tb.S8(6, uAuctionInfo);
                }
             }else {
                tb.w.put(str1, Long.valueOf(activityEndT));
                b9.a(tb.t);
                a.s(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "handleAuctionSuspendSignal endRetainTime:"+tb.R8(uAuctionInfo));
                tb.S8(5, uAuctionInfo);
             }
          }
       }
       return;
    }
}
