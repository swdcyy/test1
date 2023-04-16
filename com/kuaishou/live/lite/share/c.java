package com.kuaishou.live.lite.share.c;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class c	// class@000b16
{
    public boolean a;

    public void c(){
       super();
    }
    public final JsonObject a(LiveStreamFeed p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("liveStreamAuthorId", r1.U1(p0));
       String str = r1.p0(p0);
       if (str == null) {
          str = "";
       }
       obj.c0("liveStreamTitle", str);
       String str1 = r1.M0(p0);
       if (!TextUtils.x(str1)) {
          obj.c0("expTag", str1);
       }
       return obj;
    }
}
