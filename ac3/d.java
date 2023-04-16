package ac3.d;
import i51.g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Number;
import ac3.i;

public final class d implements g	// class@000066
{
    public final LiveBaseLongConnectionManager a;

    public void d(LiveBaseLongConnectionManager p0){
       this.a = p0;
       super();
    }
    public e0 c(){
       e0 obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.s.getPage();
       a.o(obj, "logPackageProvider.page");
       return obj;
    }
    public String d(){
       String obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.g.getUserId();
       a.o(obj, "liveStreamFeedWrapper.userId");
       return obj;
    }
    public boolean e(){
       return false;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.p.g();
    }
    public String getLiveStreamId(){
       String obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.g.getLiveStreamId();
       a.o(obj, "liveStreamFeedWrapper.liveStreamId");
       return obj;
    }
}
