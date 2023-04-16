package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$d;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.util.Objects;
import ap2.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xv4.i;
import ee1.a;
import com.kuaishou.live.core.voiceparty.core.audience.aryalogic.AudienceRtcLogic$enterRtcRoom$1;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomFailEvent;
import ut7.e;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import com.kuaishou.live.core.voiceparty.core.audience.a;
import erd.g;
import crd.b;

public final class RtcManager$buildAryaInnerState$1$d extends a	// class@0013a1
{
    public b d;
    public final RtcManager$buildAryaInnerState$1 e;

    public void RtcManager$buildAryaInnerState$1$d(RtcManager$buildAryaInnerState$1 p0,String p1){
       this.e = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       RtcManager a;
       int b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RtcManager$buildAryaInnerState$1$d.class, "1")) {
       }else {
          String str = "aryaConfig";
          a.p(p0, str);
          a.p(p1, "reason");
          RtcManager$buildAryaInnerState$1 this$0 = this.e.this$0;
          a = this$0.a;
          RtcManager g = this$0.g;
          Objects.requireNonNull(a);
          Object obj = PatchProxy.applyTwoRefs(p0, g, a, g.class, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             a.p(p0, str);
             a.p(g, "observer");
             a.h.p2(g);
             a.h.p2(a.e);
             a.f = new AudienceRtcLogic$enterRtcRoom$1(a, g);
             p0 = a.h.Fc("BIZ_KEY_VOICE_PARTY", p0, null);
             a.d = p0;
             int i = 1;
             b = (p0 == null || !p0.length())? 1: 0;
             b = b ^ i;
          }
          if (!b) {
             this.g(new RtcManager$EnterRoomFailEvent());
          }else {
             this.d = t.timer(10, TimeUnit.SECONDS, d.a).subscribe(new a(this));
          }
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$buildAryaInnerState$1$d.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       RtcManager$buildAryaInnerState$1$d td = this.d;
       if (td != null) {
          td.dispose();
       }
       return;
    }
}
