package com.yxcorp.gifshow.follow.common.model.PymkBarFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zga.o;
import java.util.Map;

public class PymkBarFeed extends BaseFeed	// class@001061
{
    public CommonMeta mCommonMeta;
    public PymkBarFeed$PymkBarMeta mPymkBarMeta;
    public String mTopBarId;
    public static final long serialVersionUID = 0x801bb758e4eb999f;

    public void PymkBarFeed(){
       super();
    }
    public String getId(){
       return this.mTopBarId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymkBarFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PymkBarFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PymkBarFeed.class, new o());
       }else {
          obj.put(PymkBarFeed.class, null);
       }
       return obj;
    }
}
