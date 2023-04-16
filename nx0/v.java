package nx0.v;
import erd.g;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;

public final class v implements g	// class@0033fe
{
    public final LiveAudienceOverRoomV2ViewController b;

    public void v(LiveAudienceOverRoomV2ViewController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v.class, "1")) {
       }else {
          a.o(p0, "enable");
          if (p0.booleanValue()) {
             this.b.V2().a(5);
          }else {
             this.b.V2().f(5);
          }
          PatchProxy.onMethodExit(v.class, "1");
       }
       return;
    }
}
