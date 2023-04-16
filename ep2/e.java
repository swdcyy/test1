package ep2.e;
import zo2.a0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ep2.e$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import ep2.e$b;
import erd.g;
import crd.b;
import msd.l;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsMessage;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Throwable;
import zo2.a0$b;
import zo2.a0$a;
import zo2.a0$c;

public final class e	// class@0027b3
{
    public final String a;
    public KtvMusicOrderInfo b;
    public b c;
    public l d;
    public long e;
    public final e$a f;
    public final a0 g;

    public void e(a0 p0,long p1){
       a.p(p0, "livePlayer");
       super();
       this.g = p0;
       this.a = "LivePlayerProgressScheduler";
       this.f = new e$a(this);
       if (p1) {
          this.a(p1);
       }
       return;
    }
    public final void a(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "1")) {
          return;
       }
       this.e();
       this.e = p0;
       this.c = t.interval(0, 100, TimeUnit.MILLISECONDS, d.a).subscribe(new e$b(this, p0));
       return;
    }
    public final void b(l p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.d = p0;
       if (!PatchProxy.applyVoid(null, this, uoe, "6")) {
          LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
          b.Z(kTV, this.a+" tryToProcessLatestAACData");
          byte[] uobyteArray = this.g.i();
          if (uobyteArray != null) {
             try{
                b.Z(kTV, this.a+" tryToProcessLatestAACData parse data");
                LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(uobyteArray);
                if (liveFlvStrea != null && liveFlvStrea.messageType == 2) {
                   LiveFlvStream$LiveFlvStreamMessage syncLyrics = liveFlvStrea.syncLyrics;
                   if (syncLyrics != null) {
                      LiveFlvStream$LiveFlvSyncLyricsMessage orderId = syncLyrics.orderId;
                      e tb = this.b;
                      if (tb == null) {
                         a.S("music");
                      }
                      if (a.g(orderId, tb.musicOrderId) && liveFlvStrea.syncLyrics.syncLyricsType == 1) {
                         b.Z(kTV, this.a+" tryToProcessLatestAACData scheduleUpdateProgress");
                         this.a(liveFlvStrea.syncLyrics.lyricsOffset);
                      }
                   }
                }
             }catch(java.lang.Exception e6){
                b.I(LiveVoicePartyLogTag.KTV, this.a+" tryToProcessLatestAACData", e6);
             }
          }
       }
    }
    public final void c(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "music");
       b.Z(LiveVoicePartyLogTag.KTV, this.a+" start");
       this.b = p0;
       this.g.d(this.f);
       this.g.j(this.f);
       this.g.g(this.f);
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       this.d = objArray;
       this.g.a(this.f);
       this.g.b(this.f);
       this.g.f(this.f);
       this.e();
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e tc = this.c;
       if (tc != null) {
          tc.dispose();
       }
       this.e = 0;
       return;
    }
}
