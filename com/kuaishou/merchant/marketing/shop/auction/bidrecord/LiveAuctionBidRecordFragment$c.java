package com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment$c;
import qvb.n0;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionBidRecordResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import v84.b;
import v84.a;
import x84.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cjd.e;
import erd.o;
import java.util.List;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import java.util.Collection;
import ekd.q;

public class LiveAuctionBidRecordFragment$c extends n0	// class@001b80
{
    public final LiveAuctionBidRecordFragment m;

    public void LiveAuctionBidRecordFragment$c(LiveAuctionBidRecordFragment p0){
       this.m = p0;
       super();
    }
    public boolean B1(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAuctionBidRecordFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && p0.hasMore()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public t I1(){
       String str;
       AuctionBidRecordResponse obj = PatchProxy.apply(null, this, LiveAuctionBidRecordFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.K())? this.L0().mCursor: "";
       return a.a().b(this.m.z.b.getLiveStreamId(), this.m.z.c, obj).map(new e());
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAuctionBidRecordFragment$c.class, "3")) {
       }else if(p0 == null){
          if (this.K()) {
             p1.clear();
             this.m.z.e.postValue(Integer.valueOf(p0.mBidCount));
             this.m.z.f.postValue(p0.mRuleUrl);
             this.m.z.g.postValue(p0.mStartPrice);
          }
          if (!q.f(p0.mBidInfoList)) {
             p1.addAll(p0.mBidInfoList);
          }
       }
       return;
    }
}
