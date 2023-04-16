package ac3.a;
import ac3.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import d61.f;
import java.util.List;

public final class a implements i	// class@000063
{
    public final LiveStreamFeedWrapper a;
    public boolean b;
    public final LiveStreamFeed c;
    public final int d;

    public void a(LiveStreamFeed p0,int p1){
       a.p(p0, "liveSteamFeed");
       super();
       this.c = p0;
       this.d = p1;
       this.a = new LiveStreamFeedWrapper(p0);
       this.b = true;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getUserId();
    }
    public boolean e(){
       return false;
    }
    public Race f(){
       QLivePlayConfig obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLivePlayConfig();
       a.o(obj, "feedWrapper.livePlayConfig");
       Race horseRace = obj.getHorseRace();
       a.o(horseRace, "feedWrapper.livePlayConfig.horseRace");
       return horseRace;
    }
    public int g(){
       return this.d;
    }
    public String getExpTag(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b(this.a.getExpTag(), x.f(this.a.mEntity));
    }
    public String getLiveStreamId(){
       QLivePlayConfig obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLivePlayConfig();
       a.o(obj, "feedWrapper.livePlayConfig");
       String liveStreamId = obj.getLiveStreamId();
       a.o(liveStreamId, "feedWrapper.livePlayConfig.liveStreamId");
       return liveStreamId;
    }
    public String getLocale(){
       QLivePlayConfig obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLivePlayConfig();
       a.o(obj, "feedWrapper.livePlayConfig");
       String locale = obj.getLocale();
       a.o(locale, "feedWrapper.livePlayConfig.locale");
       return locale;
    }
    public String h(){
       QLivePlayConfig obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLivePlayConfig().mAttach;
       a.o(obj, "feedWrapper.livePlayConfig.mAttach");
       return obj;
    }
    public boolean i(){
       return this.b;
    }
    public List j(){
       QLivePlayConfig obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLivePlayConfig().mSocketHostPorts;
       a.o(obj, "feedWrapper.livePlayConfig.mSocketHostPorts");
       return obj;
    }
    public void k(boolean p0){
       this.b = p0;
    }
}
