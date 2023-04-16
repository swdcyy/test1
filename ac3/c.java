package ac3.c;
import lf3.g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ac3.i;
import lf3.f;

public final class c implements g	// class@000065
{
    public final LiveBaseLongConnectionManager b;

    public void c(LiveBaseLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          b.P(LiveLogTag.LIVE_SOCKET.appendTag("LiveAudienceLongConnectionManager"), "onEnterRoomAckReceived");
          this.b.p.k(false);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
