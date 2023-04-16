package com.yxcorp.gifshow.map.map.model.MomentFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i6b.e;
import java.util.Map;

public class MomentFeed extends BaseFeed	// class@001c99
{
    public CommonMeta mCommonMeta;
    public User mUser;
    public static final long serialVersionUID = 0x500eb6496babb344;

    public void MomentFeed(){
       super();
    }
    public boolean equals(Object p0){
       return false;
    }
    public String getId(){
       return "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MomentFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MomentFeed.class, new e());
       }else {
          obj.put(MomentFeed.class, null);
       }
       return obj;
    }
}
