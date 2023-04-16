package ep2.e$a;
import zo2.a0$b;
import zo2.a0$a;
import zo2.a0$c;
import ep2.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsMessage;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;

public final class e$a implements a0$b, a0$a, a0$c	// class@0027b1
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "3")) {
          return;
       }
       this.a.e();
       return;
    }
    public void onBufferEnd(){
    }
    public void onBufferStart(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       this.a.e();
       return;
    }
    public void onEvent(LiveFlvStream$LiveFlvStreamMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "event");
       if (p0.messageType == 2) {
          LiveFlvStream$LiveFlvStreamMessage syncLyrics = p0.syncLyrics;
          if (syncLyrics != null) {
             LiveFlvStream$LiveFlvSyncLyricsMessage orderId = syncLyrics.orderId;
             e b = this.a.b;
             if (b == null) {
                a.S("music");
             }
             if (a.g(orderId, b.musicOrderId)) {
                p0 = p0.syncLyrics;
                orderId = p0.syncLyricsType;
                if (orderId != 1) {
                   if (orderId == 2 || orderId == 3) {
                      this.a.e();
                   }
                }else {
                   this.a.a(p0.lyricsOffset);
                }
             }
          }
       }
       return;
    }
}
