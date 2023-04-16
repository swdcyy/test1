package com.kuaishou.live.core.show.share.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t02.a0;
import pj2.c0;
import vj2.a;
import java.util.Set;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz$AudienceSubBiz;

public class e	// class@001011
{
    public GifshowActivity a;
    public a0 b;
    public boolean c;
    public c0 d;
    public a e;
    public final Set f;
    public s g;

    public void e(GifshowActivity p0,a0 p1,c0 p2,a p3,Set p4){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       String str = this.d.e();
       if (!TextUtils.x(str)) {
          p0.c0("shareResourceType", str);
       }
       p0.c0("liveStreamAuthorId", r1.U1(this.b.c.mEntity));
       return;
    }
    public final JsonObject b(JsonObject p0){
       String obj = PatchProxy.applyOneRefs(p0, this, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = new JsonObject();
       }
       p0.c0("liveStreamAuthorId", r1.U1(this.b.c.mEntity));
       obj = r1.p0(this.b.c.mEntity);
       if (obj == null) {
          obj = "";
       }
       p0.c0("liveStreamTitle", obj);
       obj = r1.M0(this.b.c.mEntity);
       if (!TextUtils.x(obj)) {
          p0.c0("expTag", obj);
       }
       this.a(p0);
       Map map = this.d.c();
       if (map != null) {
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             p0.c0(key, uEntry.getValue());
          }
       }
       return p0;
    }
    public final boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((LiveShareSubBiz$AudienceSubBiz.LIVE_QUIZ_REVIVE_CARD.getValue()).equals(p0) || (LiveShareSubBiz$AudienceSubBiz.LIVE_QUIZ_GROUP.getValue()).equals(p0))? true: false;
       return b;
    }
}
