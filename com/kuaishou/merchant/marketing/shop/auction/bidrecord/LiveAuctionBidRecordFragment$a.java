package com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment$a;
import y8c.g;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import xm4.a;
import w84.a;
import androidx.fragment.app.Fragment;
import ml8.c;

public class LiveAuctionBidRecordFragment$a extends g	// class@001b7e
{
    public final LiveAuctionBidRecordFragment w;

    public void LiveAuctionBidRecordFragment$a(LiveAuctionBidRecordFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveAuctionBidRecordFragment$a uoa = LiveAuctionBidRecordFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.e(p0, 0x7f0d09e6), new a(this.w));
    }
}
