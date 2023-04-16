package com.kuaishou.merchant.home2.feed.FeedChannelInfo$a;
import java.lang.Object;
import nsd.u;
import jo4.d;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lx3.a;
import java.util.List;
import java.lang.Long;

public final class FeedChannelInfo$a	// class@001782
{

    public void FeedChannelInfo$a(){
       super();
    }
    public void FeedChannelInfo$a(u p0){
       super();
    }
    public final FeedChannelInfo a(d p0){
       FeedChannelInfo obj = PatchProxy.applyOneRefs(p0, this, FeedChannelInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FeedChannelInfo(p0.getChannelId(), p0.getChannelName());
       if (p0 instanceof a) {
          obj.setWidth(p0.width);
          obj.setHeight(p0.height);
          obj.setImageUrls(p0.imageUrls);
          obj.setMBubbleDisplayTime(p0.bubbleDisplayTime);
          obj.setMBubbleText(p0.bubbleText);
       }
       return obj;
    }
}
