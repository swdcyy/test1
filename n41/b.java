package n41.b;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.bridge.model.LiveJSRoomInfoModel;
import lp3.e;
import xp5.g;
import lp3.c;
import kotlin.jvm.internal.a;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import java.lang.Boolean;
import dsd.a;
import o63.m;
import o63.m$a;

public final class b extends AbstractLiveJsCommand	// class@0032a8
{

    public void b(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = new LiveJSRoomInfoModel();
       c uoc = this.h().a(g.class);
       String str = "serviceManager.getServic¡­eInfoManager::class.java\)";
       a.o(uoc, str);
       p0.setLiveStreamId(uoc.getLiveStreamId());
       p0.setAnchorUserId(uoc.d());
       p0.setExpTag(uoc.getExpTag());
       uoc = this.h().a(d.class);
       a.o(uoc, str);
       LiveStreamFeed liveStreamFe = uoc.j0();
       if (liveStreamFe != null) {
          p0.setFeedLogCtx(r1.O0(liveStreamFe));
       }
       p0.setNormalPlay(a.a(false));
       return m.g.f(p0, true);
    }
}
