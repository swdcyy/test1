package hn1.c0$d;
import erd.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import hn1.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hn1.b0;
import kotlin.jvm.internal.a;
import hn1.z$b;
import hn1.b0$b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import hn1.z$c;
import hn1.b0$c;
import hn1.z$a;
import hn1.b0$a;
import kotlin.NoWhenBranchMatchedException;

public final class c0$d implements c	// class@002715
{
    public static final c0$d a;

    static {
       c0$d.a = new c0$d();
    }
    public void c0$d(){
       super();
    }
    public Object a(Object p0,Object p1){
       b0$b uob = PatchProxy.applyTwoRefs(p0, p1, this, c0$d.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "liveViewData");
          a.p(p1, "playInfo");
          if (p1 instanceof z$b) {
             p0 = p0.mLiveStreamView;
             a.o(p0, "liveViewData.mLiveStreamView");
             uob = new b0$b(p0);
          }else if(p1 instanceof z$c){
             p0 = b0$c.a;
          }else if(p1 instanceof z$a){
             p0 = new b0$a(p1.a());
          }else {
             throw new NoWhenBranchMatchedException();
          }
          uob = p0;
       }
       return uob;
    }
}
