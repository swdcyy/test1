package com.kuaishou.android.model.feed.CommodityFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.o;
import java.util.Map;

public class CommodityFeed extends BaseFeed	// class@000ad9
{
    public CommonMeta mCommonMeta;
    public static final long serialVersionUID = 0xd7887dd53c876f77;

    public void CommodityFeed(){
       super();
    }
    public String getId(){
       CommodityFeed tmCommonMeta = this.mCommonMeta;
       String str = (tmCommonMeta == null)? "": tmCommonMeta.mId;
       return str;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommodityFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CommodityFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CommodityFeed.class, new o());
       }else {
          obj.put(CommodityFeed.class, null);
       }
       return obj;
    }
}
