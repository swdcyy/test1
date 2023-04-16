package nx0.k;
import erd.g;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import nx0.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import kotlin.jvm.internal.a;
import nx0.h;

public final class k implements g	// class@0033f0
{
    public final a b;
    public final i c;

    public void k(a p0,i p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          b.y(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Model"), "check animation resource failed", p0);
          LiveStreamFeedWrapper liveStreamFe = this.b.r.r5();
          a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
          String userId = liveStreamFe.getUserId();
          a.o(userId, "feedService.liveStreamFeedWrapper.userId");
          h.d(this.c, userId, "DOWNLOAD_FAIL");
          p0 = this.b;
          p0.e = null;
          p0.h();
       }
       return;
    }
}
