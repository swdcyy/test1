package com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment$c;
import im8.g;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.auction.start.AuctionPublish;
import com.kuaishou.merchant.marketing.shop.auction.start.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.auction.start.l;
import java.util.Map;
import java.util.HashMap;

public class LiveAnchorStartAuctionFragment$c implements g	// class@001bc6
{
    public LiveMerchantBaseContext b;
    public h c;
    public c d;
    public LiveAnchorStartAuctionFragment e;
    public AuctionPublish f;
    public AuctionStartConfig g;
    public a h;

    public void LiveAnchorStartAuctionFragment$c(){
       super();
       this.f = new AuctionPublish();
       this.h = new a();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorStartAuctionFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorStartAuctionFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAnchorStartAuctionFragment$c.class, new l());
       }else {
          obj.put(LiveAnchorStartAuctionFragment$c.class, null);
       }
       return obj;
    }
}
