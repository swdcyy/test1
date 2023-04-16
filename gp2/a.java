package gp2.a;
import msd.p;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import mrd.a;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import gp2.a$a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand$PlayerSyncCommand;
import java.lang.Long;
import qrd.l1;

public final class a implements p	// class@002b72
{
    public final a b;
    public boolean c;
    public b d;
    public final t e;
    public final String f;

    public void a(String p0,long p1){
       a.p(p0, "episodeOrderId");
       super();
       this.f = p0;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Long>\(\)");
       this.b = uoa;
       this.e = uoa;
       this.d = t.timer(p1, TimeUnit.MILLISECONDS, d.a).subscribe(new a$a(this));
    }
    public Object invoke(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "command");
          char c = ' ';
          b.Z(LiveVoicePartyLogTag.THEATER, "AnchorPlayProgressObserver receive sync command isComplete "+this.c+c+this.f+c+p1);
          int i = 1;
          if ((a.g(p1.b, this.f) ^ i) || (p1.c != VoicePartyTheaterSyncCommand$PlayerSyncCommand.UNKNOWN && this.c == null)) {
             this.c = i;
             p0 = this.d;
             if (p0 != null) {
                p0.dispose();
                this.d = null;
             }
             this.b.onNext(Long.valueOf(p1.d));
             this.b.onComplete();
          }
       }
       return l1.a;
    }
}
