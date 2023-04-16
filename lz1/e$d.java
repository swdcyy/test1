package lz1.e$d;
import kj3.b;
import lz1.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import w51.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lz1.g;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import kotlin.jvm.internal.a;

public final class e$d implements b	// class@003091
{
    public final e a;

    public void e$d(e p0){
       this.a = p0;
       super();
    }
    public void a(byte[] p0,int p1,int p2){
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(e$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e$d.class, "1")) {
          return;
       }
       if (a.w()) {
          b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, " SeiLossSimulator enabled, drop sei message");
          return;
       }else if(p2 == 251){
          if (this.a.f == null) {
             b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "receive sei, but isAnchorHasSeiChecksum is false");
             return;
          }else {
             LiveStageProto$LayoutConfig layoutConfig = g.a.b(p0, p1, p2);
             if (layoutConfig != null) {
                a.m(p0);
                this.a.c(layoutConfig, p0);
             }
          }
       }
       return;
    }
}
