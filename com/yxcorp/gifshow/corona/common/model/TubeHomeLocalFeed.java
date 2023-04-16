package com.yxcorp.gifshow.corona.common.model.TubeHomeLocalFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jq9.e1;
import java.util.Map;

public class TubeHomeLocalFeed extends BaseFeed	// class@00124b
{
    public AggregateTemplateMeta mAggregateTemplateMeta;
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public static final String ID = "home_local_tube";

    public void TubeHomeLocalFeed(){
       super();
    }
    public String getId(){
       return "home_local_tube";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TubeHomeLocalFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, TubeHomeLocalFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(TubeHomeLocalFeed.class, new e1());
       }else {
          obj.put(TubeHomeLocalFeed.class, null);
       }
       return obj;
    }
}
