package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$l;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import lp2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$h;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ktvSinging$1$onEnter$1;
import msd.l;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ktvSinging$1$onEnter$2;
import jp2.w;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.System;
import jp2.s;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import crd.b;
import java.lang.Long;
import kp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ChangeSingTypeForMyself;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$GuestEnterRoom;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SingRefrain;

public final class KtvManager$l extends c	// class@001439
{
    public d f;
    public b g;
    public final KtvManager h;

    public void KtvManager$l(KtvManager p0,String p1){
       this.h = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$l.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.f = p0;
          p0 = this.h.d().n();
          int i = 1;
          p0.j((p0.e() + i));
          p0 = this.f;
          String str = "logic";
          if (p0 == null) {
             a.S(str);
          }
          p0.c(new KtvManager$ktvSinging$1$onEnter$1(this));
          p0 = this.f;
          if (p0 == null) {
             a.S(str);
          }
          p0.b(this.a().d());
          p0 = this.f;
          if (p0 == null) {
             a.S(str);
          }
          p0.a(new KtvManager$ktvSinging$1$onEnter$2(this));
          p0 = this.a();
          KtvManager$l tf = this.f;
          if (tf == null) {
             a.S(str);
          }
          p0.i(tf.getMusicInfo());
          p0 = this.a();
          tf = this.f;
          if (tf == null) {
             a.S(str);
          }
          p0.g(tf.getLyrics());
          this.a().k(i);
          this.a().l(System.currentTimeMillis());
          p0 = this.h.i();
          KtvMusicOrderInfo ktvMusicOrde = this.a().b();
          tf = this.f;
          if (tf == null) {
             a.S(str);
          }
          p0.J(ktvMusicOrde, tf.getLyrics());
       }
       return;
    }
    public void f(h p0){
       Long longx;
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$l.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       KtvManager$l tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       this.a().k(false);
       boolean b = this.a().m();
       KtvManager$l tf = this.f;
       if (tf == null) {
          a.S("logic");
       }
       tf.d(b);
       this.h.i().S0(this.a().b());
       KtvManager q = this.h.q;
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
    public final boolean h(KtvManager$ChangeSingTypeForMyself p0){
       KtvManager$l obj = PatchProxy.applyOneRefs(p0, this, KtvManager$l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       if (this.a().d() != p0.a()) {
          this.a().j(p0.a());
          obj = this.f;
          if (obj == null) {
             a.S("logic");
          }
          obj.b(p0.a());
       }
       return true;
    }
    public final boolean j(KtvManager$GuestEnterRoom p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       KtvManager$l tf = this.f;
       if (tf == null) {
          a.S("logic");
       }
       tf.e(this.a().d());
       return true;
    }
    public final boolean k(KtvManager$SingRefrain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       KtvManager$l tf = this.f;
       if (tf == null) {
          a.S("logic");
       }
       tf.f();
       return true;
    }
}
