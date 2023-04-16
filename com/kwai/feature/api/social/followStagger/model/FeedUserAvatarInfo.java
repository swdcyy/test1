package com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kv5.d;
import java.util.Map;
import java.util.HashMap;

public class FeedUserAvatarInfo implements Serializable, g	// class@0010d4
{
    public LiveStreamFeed mLiveStreamFeed;
    public int mStatus;
    public static final long serialVersionUID = 0x61ffbfe0cd015b6a;

    public void FeedUserAvatarInfo(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedUserAvatarInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FeedUserAvatarInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FeedUserAvatarInfo.class, new d());
       }else {
          obj.put(FeedUserAvatarInfo.class, null);
       }
       return obj;
    }
}
