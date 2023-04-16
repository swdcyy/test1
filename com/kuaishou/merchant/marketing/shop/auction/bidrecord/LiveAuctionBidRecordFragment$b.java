package com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment$b;
import gka.c;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.q;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public class LiveAuctionBidRecordFragment$b extends c	// class@001b7f
{
    public final LiveAuctionBidRecordFragment m;

    public void LiveAuctionBidRecordFragment$b(LiveAuctionBidRecordFragment p0,RefreshLayout p1,q p2,int p3){
       this.m = p0;
       super(p1, p2, p3);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveAuctionBidRecordFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.i("还没人出价");
       obj.k(R.drawable.arg_RES_7f0805da);
       return obj;
    }
}
