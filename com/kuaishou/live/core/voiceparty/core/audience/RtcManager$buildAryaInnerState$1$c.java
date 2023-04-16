package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$c;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.a$a;
import zo2.o0;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$onEnterRoom$2;
import java.util.Objects;
import ap2.g;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import ap2.c;
import erd.o;
import cjd.e;
import ap2.d;
import msd.l;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$d$c;
import java.lang.Integer;

public final class RtcManager$buildAryaInnerState$1$c extends c	// class@0013a0
{
    public final RtcManager$buildAryaInnerState$1 f;

    public void RtcManager$buildAryaInnerState$1$c(RtcManager$buildAryaInnerState$1 p0,String p1){
       this.f = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       RtcManager a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RtcManager$buildAryaInnerState$1$c.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p0 = this.f.this$0;
          p0.d = true;
          RtcManager f = p0.f;
          if (!PatchProxy.applyVoidOneRefs(f, p0, RtcManager.class, "13")) {
             Iterator iterator = p0.c.iterator();
             while (true) {
                boolean b = false;
                while (true) {
                   if (iterator.hasNext()) {
                      a$a uoa = iterator.next();
                      if (b || uoa.a()) {
                         b = true;
                      }else {
                         continue ;
                      }
                   }else if(!b){
                      p0.b.I(f);
                   }
                   a = p0.a;
                   RtcManager$onEnterRoom$2 oonEnterRoom = new RtcManager$onEnterRoom$2(p0, f);
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidOneRefs(oonEnterRoom, a, g.class, "6")) {
                      a.p(oonEnterRoom, "onGetResult");
                      p0 = a.a;
                      if (p0 != null) {
                         p0.dispose();
                      }
                      a.a = t.interval(0, 2, TimeUnit.SECONDS).flatMap(new c(a)).map(new e()).subscribe(new d(a, oonEnterRoom));
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
    public void f(h p0){
       RtcManager a;
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$buildAryaInnerState$1$c.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       RtcManager$buildAryaInnerState$1 this$0 = this.f.this$0;
       this$0.d = false;
       RtcManager$d$c d = (p0 instanceof RtcManager$d$c)? p0.d: 0;
       RtcManager f = this$0.f;
       Objects.requireNonNull(this$0);
       RtcManager rtcManager = RtcManager.class;
       if (!PatchProxy.isSupport(rtcManager) || !PatchProxy.applyVoidTwoRefs(f, Integer.valueOf(d), this$0, rtcManager, "15")) {
          Iterator iterator = this$0.c.iterator();
       label_0041 :
          boolean b = false;
          while (true) {
             if (iterator.hasNext()) {
                a$a uoa = iterator.next();
                if (b || uoa.b()) {
                   b = true;
                }else {
                   goto label_0041 ;
                }
             }else if(!b){
                this$0.b.f(f, d);
             }
             a = this$0.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoid(null, a, g.class, "8")) {
                g a1 = a.a;
                if (a1 != null) {
                   a1.dispose();
                   break ;
                }
             }
          }
       }
       return;
    }
}
