package com.kuaishou.android.model.feed.TubeRecommendFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.yxcorp.gifshow.tube.TubeInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.s0;
import java.util.Map;

public class TubeRecommendFeed extends BaseFeed	// class@000b77
{
    public CommonMeta mCommonMeta;
    public TubeInfo mTubeInfo;
    public static final long serialVersionUID = 0xa9d9bc57a341e96d;

    public void TubeRecommendFeed(){
       super();
    }
    public String getId(){
       TubeRecommendFeed tmTubeInfo = this.mTubeInfo;
       if (tmTubeInfo != null) {
          TubeInfo mTubeId = tmTubeInfo.mTubeId;
          if (mTubeId != null) {
             return mTubeId;
          }
       }
       return "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TubeRecommendFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, TubeRecommendFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(TubeRecommendFeed.class, new s0());
       }else {
          obj.put(TubeRecommendFeed.class, null);
       }
       return obj;
    }
}
