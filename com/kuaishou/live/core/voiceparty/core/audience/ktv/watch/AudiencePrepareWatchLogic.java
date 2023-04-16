package com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic;
import mp2.c;
import zo2.a0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import ep2.e;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jp2.z;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.d;
import erd.o;
import jp2.x;
import jp2.y;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$a;
import brd.w;
import erd.c;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$b;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$c;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$prepare$4;
import java.lang.Long;

public final class AudiencePrepareWatchLogic implements c	// class@0013c3
{
    public final PublishSubject a;
    public b b;
    public final e c;
    public final boolean d;
    public final a0 e;

    public void AudiencePrepareWatchLogic(boolean p0,a0 p1){
       a.p(p1, "player");
       super();
       this.d = p0;
       this.e = p1;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Long>\(\)");
       this.a = publishSubje;
       this.c = new e(p1, 0);
    }
    public void a(KtvMusicOrderInfo p0,l p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AudiencePrepareWatchLogic.class, "1")) {
          return;
       }
       String str = "music";
       a.p(p0, str);
       a.p(p1, "onSuccess");
       a.p(p2, "onFail");
       this.c.c(p0);
       t ot = PatchProxy.applyOneRefs(p0, null, z.class, "6");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, str);
          ot = t.just(p0).switchMap(d.b).map(x.b).onErrorResumeNext(new y(p0));
          a.o(ot, "Observable.just\(music\).s¡­\(Optional.absent\(\)\)\n    }");
       }
       t ot1 = t.combineLatest(z.d(ot, "1. AudiencePrepareWatch download"), z.d(this.a, "2. AudiencePrepareWatch received progress"), AudiencePrepareWatchLogic$a.a);
       a.o(ot1, "Observable.combineLatest¡­\) { lyrics, _ -> lyrics }");
       this.b = z.d(ot1, "AudiencePrepareWatch").subscribe(new AudiencePrepareWatchLogic$b(this, p1, p0), new AudiencePrepareWatchLogic$c(p2));
       if (this.d == null) {
          this.c.b(new AudiencePrepareWatchLogic$prepare$4(this));
       }else {
          this.a.onNext(Long.valueOf(0));
       }
       return;
    }
    public void abort(){
       if (PatchProxy.applyVoid(null, this, AudiencePrepareWatchLogic.class, "3")) {
          return;
       }
       this.release();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, AudiencePrepareWatchLogic.class, "2")) {
          return;
       }
       this.c.d();
       AudiencePrepareWatchLogic tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       return;
    }
}
