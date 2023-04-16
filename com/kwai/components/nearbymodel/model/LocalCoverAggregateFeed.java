package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.components.nearbymodel.model.f;
import java.util.Map;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;

public class LocalCoverAggregateFeed extends BaseFeed	// class@000c7f
{
    public CommonMeta mCommonMeta;
    public LocalCoverAggregateFeed$CoverAggregateMeta mCoverAggregateMeta;
    public ExtMeta mExtMeta;
    public static final int ITEM_TYPE_TIMELINE = 5;
    public static final int ITEM_TYPE_TIMELINE_V2 = 6;
    public static final long serialVersionUID = 0xf1ee2113e7b6dcd5;

    public void LocalCoverAggregateFeed(){
       super();
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LocalCoverAggregateFeed.class, new f());
       }else {
          obj.put(LocalCoverAggregateFeed.class, null);
       }
       return obj;
    }
    public boolean isTimelineCard(){
       LocalCoverAggregateFeed tmCoverAggre = this.mCoverAggregateMeta;
       boolean b = (tmCoverAggre != null && tmCoverAggre.mItemType == 5)? true: false;
       return b;
    }
    public boolean isTimelineCardV2(){
       LocalCoverAggregateFeed tmCoverAggre = this.mCoverAggregateMeta;
       boolean b = (tmCoverAggre != null && tmCoverAggre.mItemType == 6)? true: false;
       return b;
    }
}
