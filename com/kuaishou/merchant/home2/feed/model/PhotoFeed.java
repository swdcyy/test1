package com.kuaishou.merchant.home2.feed.model.PhotoFeed;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.merchant.home2.feed.model.CommodityFeed;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;

public class PhotoFeed extends LiveFeed	// class@0017b9
{
    public QPhoto mVideoQPhoto;
    public static final long serialVersionUID = 0x7520e4314950e153;

    public void PhotoFeed(){
       super();
    }
    public long getCommodityID(){
       LiveFeed obj = PatchProxy.apply(null, this, PhotoFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mCommodity;
       if (obj != null) {
          return obj.mId;
       }
       if (this.getCommodity() != null) {
          return this.getCommodity().mId;
       }
       return 0;
    }
}
