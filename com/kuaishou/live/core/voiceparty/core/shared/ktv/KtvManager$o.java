package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$o;
import ut7.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import mp2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$i;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import jp2.w;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.System;
import jp2.s;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Long;
import kp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SingerChangeSingType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class KtvManager$o extends d	// class@00143c
{
    public final KtvManager f;

    public void KtvManager$o(KtvManager p0,String p1){
       this.f = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$o.class, "1")) {
       }else {
          a.p(p0, "logic");
          a.p(p1, "reason");
          KtvManager$i oi = this.h();
          KtvManager$f uof = this.a();
          Objects.requireNonNull(oi);
          if (!PatchProxy.applyVoidOneRefs(uof, oi, KtvManager$i.class, "2")) {
             a.p(uof, "<set-?>");
             oi.a = uof;
          }
          this.a().k(true);
          this.a().i(p0.getMusicInfo());
          this.a().g(p0.getLyrics());
          this.a().l(System.currentTimeMillis());
          this.f.i().q2(this.a().b(), p0.getLyrics());
       }
       return;
    }
    public void f(h p0){
       Long longx;
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$o.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       this.a().k(false);
       this.f.i().K1(this.a().b());
       KtvManager q = this.f.q;
       KtvMusicOrderInfo ktvMusicOrde = this.a().b();
       w ow = this.a().c();
       if (ow != null) {
          longx = Long.valueOf(ow.d());
       }else {
          Lyrics lyrics = this.a().a();
          longx = (lyrics != null)? Long.valueOf((long)lyrics.mDuration): null;
       }
       long l = (longx != null)? longx.longValue(): -1;
       q.d(ktvMusicOrde, l, this.a().f());
       return;
    }
    public final boolean j(KtvManager$SingerChangeSingType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "singType");
       if (a.g(p0.b(), this.a().e())) {
          this.a().j(p0.a());
       }
       return true;
    }
}
