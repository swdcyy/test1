package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$h;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import java.lang.String;
import ut7.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PauseEvent;
import op2.k;
import op2.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$ResumeEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$QualityEvent;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$SeekEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$VolumeEvent;
import ut7.h;
import qrd.l1;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import op2.f;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$c$a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$c$b;
import hp2.c;
import hp2.c$a;
import hp2.c$b;
import hp2.c$d;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class TheaterManager$h extends c	// class@001473
{
    public a f;
    public final TheaterManager g;

    public void TheaterManager$h(TheaterManager p0,String p1){
       this.g = p0;
       super(p1);
    }
    public boolean d(e p0){
       TheaterManager$h tf;
       List qualityList;
       TheaterManager$h tf2;
       TheaterManager$QualityEvent obj = PatchProxy.applyOneRefs(p0, this, TheaterManager$h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       boolean b = true;
       if (p0 instanceof TheaterManager$PauseEvent) {
          this.g.f().onPause();
          tf = this.f;
          if (tf != null) {
             tf.pause();
          }
       }else if(p0 instanceof TheaterManager$ResumeEvent){
          this.g.f().onResume();
          tf = this.f;
          if (tf != null) {
             tf.resume();
          }
       }else if(p0 instanceof TheaterManager$QualityEvent){
          obj = this.g.f();
          LiveQualityItem liveQualityI = p0.a();
          TheaterManager$h tf1 = this.f;
          if (tf1 != null) {
             qualityList = tf1.getQualityList();
             if (qualityList != null) {
             label_0063 :
                obj.y(liveQualityI, qualityList);
                tf2 = this.f;
                if (tf2 != null) {
                   tf2.b(p0.a());
                }
             }
          }
          qualityList = CollectionsKt__CollectionsKt.E();
          goto label_0063 ;
       }else if(p0 instanceof TheaterManager$SeekEvent){
          this.g.f().W();
          tf2 = this.f;
          if (tf2 != null) {
             tf2.a(p0.a);
          }
       }else if(p0 instanceof TheaterManager$VolumeEvent){
          tf2 = this.f;
          if (tf2 != null) {
             tf2.c(p0.a, p0.b);
          }
       }else {
          b = false;
       }
       return b;
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TheaterManager$h.class, "1")) {
       }else {
          a.p(p0, "logic");
          a.p(p1, "reason");
          this.g.l(p0);
          this.f = p0;
          this.a().h(true);
          f uof = this.a().a();
          a.m(uof);
          this.g.f().P(uof);
       }
       return;
    }
    public void f(h p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager$h.class, "2")) {
          return;
       }
       String str = "reason";
       a.p(p0, str);
       TheaterManager$h tg = this.g;
       Objects.requireNonNull(tg);
       f obj = PatchProxy.applyOneRefs(p0, tg, TheaterManager.class, "16");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, str);
          if (p0 instanceof TheaterManager$c$a) {
             i = 1;
          }else if(p0 instanceof TheaterManager$c$b){
             i = 2;
          }else if(p0 instanceof c){
             if (a.g(p0, c$a.d)) {
                i = 5;
             }else if(a.g(p0, c$b.d)){
                i = 4;
             }else if(a.g(p0, c$d.d)){
                i = 3;
             }
          }
          i = 0;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "play complete, reason = "+i);
       obj = this.a().a();
       a.m(obj);
       this.g.f().B(i, obj);
       TheaterManager$h tf = this.f;
       if (tf != null) {
          tf.release();
          this.f = null;
       }
       this.a().h(false);
       this.a().i(0);
       this.a().f(0);
       this.g.j(i);
       return;
    }
}
