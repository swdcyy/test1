package com.kuaishou.merchant.home2.feed.model.FeedPage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class FeedPage implements Serializable	// class@00179e
{
    public boolean mCache;
    public String mCursor;
    public List mFeeds;
    public long mResponseTime;
    public static final long serialVersionUID = 0x989aff37e4a92e63;

    public void FeedPage(){
       super();
    }
    public static FeedPage from(String p0,List p1){
       FeedPage obj = PatchProxy.applyTwoRefs(p0, p1, null, FeedPage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FeedPage();
       obj.mCursor = p0;
       obj.mFeeds = p1;
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FeedPage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
