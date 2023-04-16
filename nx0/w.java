package nx0.w;
import erd.g;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;

public final class w implements g	// class@0033ff
{
    public final LiveAudienceOverRoomV2ViewController b;

    public void w(LiveAudienceOverRoomV2ViewController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
       }else {
          b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2ViewController"), "turbo mode changed", "isTurboMode", Boolean.valueOf((p0.booleanValue() ^ 0x01)));
          a.o(p0, "isEnabled");
          if (p0.booleanValue()) {
             this.b.V2().f(3);
          }else {
             this.b.V2().a(3);
          }
       }
       return;
    }
}
