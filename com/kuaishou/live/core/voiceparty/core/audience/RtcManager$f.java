package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$f;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import hp2.j;
import com.kuaishou.live.basic.model.StreamType;
import ap2.g;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$PrepareRtcSuccess;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$PrepareAryaFail;
import java.util.Objects;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import msd.a;
import qrd.l1;
import ee1.a;
import q00.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$d$a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.a$a;
import zo2.o0;

public final class RtcManager$f extends b	// class@0013aa
{
    public final RtcManager d;

    public void RtcManager$f(RtcManager p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RtcManager$f.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p1.e = p0.a();
          p1.f = p0.b;
          if (this.d.a.a(this.a().k.b)) {
             this.g(new RtcManager$PrepareRtcSuccess(p0.a()));
          }else {
             this.g(new RtcManager$PrepareAryaFail());
          }
       }
       return;
    }
    public void f(h p0){
       RtcManager a;
       RtcManager$f td;
       boolean b;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$f.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       a = this.d.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, og, "5")) {
          g b1 = a.b;
          if (b1 != null) {
             b1.dispose();
          }
          a.b = null;
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "release Arya");
          b1 = a.f;
          if (b1 != null) {
             l1 ol1 = b1.invoke();
          }
          a.f = null;
          a.d = null;
          a.h.ab("BIZ_KEY_VOICE_PARTY", true);
       }
       a = this.d.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, og, "3")) {
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "releaseArya");
          og = a.c;
          if (og != null) {
             og.release();
          }
          a.c = null;
       }
       if (a.g(p0, RtcManager$d$a.d)) {
          td = this.d;
          RtcManager f = td.f;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoidOneRefs(f, td, RtcManager.class, "14")) {
             Iterator iterator = td.c.iterator();
             while (true) {
                b = false;
                while (true) {
                   if (iterator.hasNext()) {
                      a$a uoa = iterator.next();
                      if (b || uoa.c()) {
                         b = true;
                      }else {
                         continue ;
                      }
                   }else if(!b){
                      td.b.i0(f);
                      break ;
                   }
                }
             }
          }
       }
       td.e = null;
       td.f = null;
       return;
    }
}
