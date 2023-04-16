package lz1.e$e;
import kj3.a;
import lz1.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.util.Iterator;
import java.lang.Iterable;
import lz1.e$b;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveStageLayoutConfigChecksum;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.io.IOException;

public final class e$e implements a	// class@003092
{
    public final e b;

    public void e$e(e p0){
       this.b = p0;
       super();
    }
    public void onParseAdSei(long p0,int p1,String p2){
    }
    public void onTsptInfo(byte[] p0,int p1){
       e$e uoe = e$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       try{
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
          Iterator iterator = this.b.d.iterator();
          while (iterator.hasNext()) {
             a.o(liveFlvStrea, "message");
             iterator.next().g(liveFlvStrea);
          }
          LiveFlvStream$LiveFlvStreamMessage liveStageLay = liveFlvStrea.liveStageLayoutConfigChecksum;
          if (liveStageLay != null) {
             boolean b = true;
             if (liveStageLay.version != b) {
                b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "version not match, ignore");
                return;
             }else if(this.b.f == null){
                b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "change isAnchorHasSeiChecksum: true");
             }
             e$e tb = this.b;
             tb.f = b;
             tb.d(liveFlvStrea.liveStageLayoutConfigChecksum.checksum);
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e3){
          e3.printStackTrace();
       }
       return;
    }
    public void onVideoFrameRender(long p0){
    }
    public void s2(byte[] p0,int p1){
    }
}
