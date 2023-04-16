package dp2.i;
import lp2.c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import jp2.u;
import hf3.a;
import jp2.p;
import zo2.a0;
import jp2.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import wa1.h;
import dp2.i$e;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import dp2.e;
import com.kuaishou.livestream.message.nano.SCKtvMicSeatsInvitationInfo;
import lf3.g;
import dp2.f;
import com.kuaishou.livestream.message.nano.SCKtvCurrentMusicOrderStarted;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import brd.t;
import jp2.z;
import dp2.d;
import erd.o;
import dp2.h;
import dp2.g;
import dp2.i$a;
import brd.w;
import erd.i;
import dp2.i$b;
import erd.c;
import dp2.i$c;
import dp2.i$d;
import erd.g;
import crd.b;
import dp2.a;

public final class i implements c	// class@002578
{
    public final PublishSubject a;
    public final PublishSubject b;
    public final PublishSubject c;
    public final h d;
    public final i$e e;
    public boolean f;
    public b g;
    public final RtcManager h;
    public final u i;
    public final p j;
    public final a0 k;
    public final c l;

    public void i(RtcManager p0,u p1,a p2,p p3,a0 p4,c p5){
       a.p(p0, "rtcManager");
       a.p(p1, "ktvRtcService");
       a.p(p2, "longConnection");
       a.p(p3, "musicDownloader");
       a.p(p4, "livePlayer");
       a.p(p5, "ktvInfo");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<String>\(\)");
       this.a = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.b = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.c = publishSubje;
       this.d = new h(p2);
       this.e = new i$e(this);
    }
    public void a(KtvMusicOrderInfo p0,boolean p1,l p2,l p3){
       t ot3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, i.class, "1")) {
          return;
       }
       a.p(p0, "music");
       a.p(p2, "onSuccess");
       a.p(p3, "onFail");
       if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "2")) {
          this.d.a(662, SCKtvMicSeatsInvitationInfo.class, new e(this));
          this.d.a(477, SCKtvCurrentMusicOrderStarted.class, new f(this, p0));
       }
       this.h.b(this.e);
       t ot = z.d(z.c(this.j, this.l, p0), "1. AudiencePrepareSing Download Music & Lyric");
       t ot1 = z.d(this.c, "2/4. AudiencePrepareSing AnchorNotify");
       if (!p1) {
          i ta = this.a;
          t ot2 = PatchProxy.applyOneRefs(ta, this, oi, "3");
          if (ot2 != patchProxyRe) {
          }else {
             ot2 = ta.switchMap(new d(this));
          }
          a.o(ot2, "micInvite.acceptKtvMicInvitation\(\)");
          ot3 = z.d(ot2, "2. AudiencePrepareSing AcceptMicInv");
          i tb = this.b;
          t ot4 = PatchProxy.applyOneRefs(tb, this, oi, "4");
          if (ot4 != patchProxyRe) {
          }else {
             t ot5 = tb.switchMap(new h(this));
             a.o(ot5, "switchMap {\n      hasAbo¡­yId, ktvInfo.ktvId\)\n    }");
             ot4 = ot5.onErrorResumeNext(new g());
             a.o(ot4, "onErrorResumeNext\(Functi¡­ble.error\(mapper\(t\)\)\n  }\)");
          }
          ot3 = t.zip(ot, ot3, z.d(ot4, "3. AudiencePrepareSing MicReady"), ot1, i$a.a);
          a.o(ot3, "Observable.zip\(\n        ¡­{ pair, _, _, _ -> pair }");
       }else {
          this.f = true;
          ot3 = t.zip(ot, ot1, i$b.a);
          a.o(ot3, "Observable.zip\(\n        ¡­    \) { pair, _ -> pair }");
       }
       b uob = z.d(ot3, "AudiencePrepareSing").subscribe(new i$c(this, p2, p0), new i$d(p3));
       a.o(uob, "prepare\n      .log\(\"Audi¡­      onFail\(it\)\n      }\)");
       this.g = uob;
       return;
    }
    public void b(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "6")) {
          return;
       }
       this.release();
       if (this.f != null && !p0) {
          this.h.h(6, a.a);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.d.b();
       this.h.i(this.e);
       i tg = this.g;
       if (tg == null) {
          a.S("disposable");
       }
       tg.dispose();
       return;
    }
}
