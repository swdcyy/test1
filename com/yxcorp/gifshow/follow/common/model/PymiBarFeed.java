package com.yxcorp.gifshow.follow.common.model.PymiBarFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zga.l;
import java.util.Map;

public class PymiBarFeed extends BaseFeed	// class@00105f
{
    public CommonMeta mCommonMeta;
    public PymiBarFeed$PymiBarMeta mPymiBarMeta;
    public String mTopBarId;
    public static final long serialVersionUID = 0xb149c97c153057bb;

    public void PymiBarFeed(){
       super();
    }
    public String getId(){
       return this.mTopBarId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymiBarFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PymiBarFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PymiBarFeed.class, new l());
       }else {
          obj.put(PymiBarFeed.class, null);
       }
       return obj;
    }
}
