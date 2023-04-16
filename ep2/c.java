package ep2.c;
import mp2.c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import jp2.p;
import jp2.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import jp2.z;
import brd.t;
import ep2.c$a;
import brd.w;
import erd.c;
import ep2.c$b;
import ep2.c$c;
import erd.g;
import ep2.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import qrd.l1;

public final class c implements c	// class@0027af
{
    public final PublishSubject a;
    public RtcManager$c b;
    public b c;
    public final boolean d;
    public final RtcManager e;
    public final p f;
    public final c g;

    public void c(boolean p0,RtcManager p1,p p2,c p3){
       a.p(p1, "rtcManager");
       a.p(p2, "downloader");
       a.p(p3, "ktvInfo");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.a = publishSubje;
    }
    public void a(KtvMusicOrderInfo p0,l p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       a.p(p0, "music");
       a.p(p1, "onSuccess");
       a.p(p2, "onFail");
       z.e(this.g, this.f, p0);
       t ot = t.zip(z.d(z.c(this.f, this.g, p0), "1. GuestSpeakPrepare DownloadMusic & Lyric"), z.d(this.a, "2. GuestSpeakPrepare SingerNotify"), c$a.a);
       a.o(ot, "Observable.zip\(\n      do¡­    \) { pair, _ -> pair }");
       b uob = z.d(ot, "- GuestSpeakPrepare").subscribe(new c$b(this, p1), new c$c(p2));
       a.o(uob, "Observable.zip\(\n      do¡­ onFail\(error\)\n        }\)");
       this.c = uob;
       if (this.d == null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
             uob = new b(this, p0);
             this.b = uob;
             this.e.b(uob);
          }
       }else {
          this.a.onNext(l1.a);
       }
       return;
    }
    public void abort(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.release();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tb = this.b;
       if (tb != null) {
          c te = this.e;
          if (tb == null) {
             a.S("rtcObserver");
          }
          te.i(tb);
       }
       tb = this.c;
       if (tb == null) {
          a.S("disposable");
       }
       tb.dispose();
       return;
    }
}
