package ex0.h;
import java.lang.Runnable;
import ex0.i;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Object;
import java.util.Objects;
import ex0.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveAnchorQosInfoSyncMessage;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.os.SystemClock;
import java.lang.Long;
import androidx.collection.SimpleArrayMap;
import java.util.List;

public final class h implements Runnable	// class@002212
{
    public final i b;
    public final LiveFlvStream$LiveFlvStreamMessage c;

    public void h(i p0,LiveFlvStream$LiveFlvStreamMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.messageType == 10) {
          LiveFlvStream$LiveFlvStreamMessage anchorQosInf = tc.anchorQosInfoSync;
          if (anchorQosInf != null) {
             i p = tb.P;
             Objects.requireNonNull(p);
             if (!PatchProxy.applyVoidOneRefs(anchorQosInf, p, c.class, "2")) {
                int i = 1;
                if (anchorQosInf.version != i) {
                   b.d0(LiveLogTag.BAD_NETWORK, "onReceiveAnchorQos unSupport version:", "SupportedVersion", Integer.valueOf(i), "AnchorQos", anchorQosInf);
                }else {
                   b.c0(LiveLogTag.BAD_NETWORK, "onReceiveAnchorQos", "anchorQos", anchorQosInf);
                   p.c.put(anchorQosInf, Long.valueOf(SystemClock.elapsedRealtime()));
                   if (p.b.size() >= 2) {
                      LiveFlvStream$LiveAnchorQosInfoSyncMessage liveAnchorQo = p.b.remove(0);
                      if (liveAnchorQo != null) {
                         p.c.remove(liveAnchorQo);
                      }
                   }
                   p.b.add(anchorQosInf);
                   p.c.put(anchorQosInf, Long.valueOf(SystemClock.elapsedRealtime()));
                }
             }
             tb.N = tc.anchorQosInfoSync;
          }
       }
       return;
    }
}
