package lz1.e$c;
import sa1.b$a;
import lz1.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import w51.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e$c implements b$a	// class@003090
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void a(int p0,MessageNano p1,byte[] p2,boolean p3){
       if (!PatchProxy.isSupport(e$c.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, e$c.class, "1")) {
          a.p(p1, "layoutConfig");
          a.p(p2, "originData");
          if (a.w()) {
             b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, " SeiLossSimulator enabled, drop sei message");
          }else if(p3){
             this.a.c(p1, p2);
          }
       }
       return;
    }
}
