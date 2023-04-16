package nx0.x$e;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$d;
import nx0.x;
import java.lang.Object;
import nx0.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zh3.c;
import yh3.a;
import nx0.y;

public final class x$e implements a$d	// class@003407
{
    public final x a;

    public void x$e(x p0){
       this.a = p0;
       super();
    }
    public void a(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$e.class, "1")) {
          return;
       }
       a.p(p0, "overRoomMessage");
       b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2ViewModel"), "receive message", "overRoomMessage", p0);
       x$e ta = this.a;
       ta.a = p0;
       ta.s0(ta.v0()).q(p0.g());
       return;
    }
}
