package com.kuaishou.android.model.feed.DynamicLoopEmptyFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.p;
import java.util.Map;

public class DynamicLoopEmptyFeed extends BaseFeed	// class@000ae1
{
    public CommonMeta mCommonMeta;
    public static final long serialVersionUID = 0x63c81518edf85261;

    public void DynamicLoopEmptyFeed(){
       super();
       this.mCommonMeta = new CommonMeta();
    }
    public String getId(){
       return "DynamicLoopEmptyFeed";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicLoopEmptyFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, DynamicLoopEmptyFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(DynamicLoopEmptyFeed.class, new p());
       }else {
          obj.put(DynamicLoopEmptyFeed.class, null);
       }
       return obj;
    }
}
