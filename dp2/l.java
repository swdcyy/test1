package dp2.l;
import lp2.c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import jp2.u;
import hf3.a;
import jp2.p;
import jp2.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import wa1.h;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import dp2.k;
import com.kuaishou.livestream.message.nano.SCKtvCurrentMusicOrderStarted;
import lf3.g;
import brd.t;
import jp2.z;
import dp2.l$a;
import brd.w;
import erd.c;
import dp2.l$b;
import dp2.l$c;
import erd.g;
import crd.b;

public final class l implements c	// class@00257e
{
    public final PublishSubject a;
    public final h b;
    public b c;
    public final RtcManager d;
    public final u e;
    public final p f;
    public final c g;

    public void l(RtcManager p0,u p1,a p2,p p3,c p4){
       a.p(p0, "rtcManager");
       a.p(p1, "ktvRtcService");
       a.p(p2, "longConnection");
       a.p(p3, "musicDownloader");
       a.p(p4, "ktvInfo");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p3;
       this.g = p4;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.a = publishSubje;
       this.b = new h(p2);
    }
    public void a(KtvMusicOrderInfo p0,boolean p1,l p2,l p3){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, l.class, "1")) {
          return;
       }
       a.p(p0, "music");
       a.p(p2, "onSuccess");
       a.p(p3, "onFail");
       if (!PatchProxy.applyVoidOneRefs(p0, this, ol, "2")) {
          this.b.a(477, SCKtvCurrentMusicOrderStarted.class, new k(this, p0));
       }
       t ot = t.zip(z.d(z.c(this.f, this.g, p0), "1. GuestPrepareSingLogic DownloadMusic & Lyric"), z.d(this.a, "2. GuestPrepareSingLogic AnchorNotify"), l$a.a);
       a.o(ot, "Observable.zip\(\n      do¡­    \) { pair, _ -> pair }");
       b uob = z.d(ot, "GuestPrepareSingLogic").subscribe(new l$b(this, p2, p0), new l$c(p3));
       a.o(uob, "Observable.zip\(\n      do¡­      onFail\(it\)\n      }\)");
       this.c = uob;
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, l.class, "4")) {
          return;
       }
       this.release();
       return;
    }
    public final c c(){
       return this.g;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.b.b();
       l tc = this.c;
       if (tc == null) {
          a.S("disposable");
       }
       tc.dispose();
       return;
    }
}
