package com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.o;
import java.util.Map;

public class ContentAggregateWeakFeed extends BaseFeed	// class@000ae0
{
    public AggregateV6Model mAggregateV6Model;
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public ContentAggregateWeakMeta mRankInfo;
    public ContentAggregateWeakFeed$AggregateContentInfo mRightBottomInfo;
    public static final long serialVersionUID = 0xf7cb6f5dcf8cbebb;

    public void ContentAggregateWeakFeed(){
       super();
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContentAggregateWeakFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ContentAggregateWeakFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ContentAggregateWeakFeed.class, new o());
       }else {
          obj.put(ContentAggregateWeakFeed.class, null);
       }
       return obj;
    }
}
