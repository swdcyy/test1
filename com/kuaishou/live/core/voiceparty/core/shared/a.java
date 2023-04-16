package com.kuaishou.live.core.voiceparty.core.shared.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import crd.a;
import hp2.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hp2.t;
import pp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$b;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.live.core.voiceparty.core.shared.a$e;
import com.kuaishou.live.core.voiceparty.core.shared.a$f;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import hp2.e;
import java.util.Objects;
import com.kwai.statechart.StateChart;
import com.kwai.statechart.StateChart$b;
import com.kuaishou.live.core.voiceparty.core.shared.VoicePartyManager$StateBuilder$buildStateChart$$inlined$apply$lambda$1;
import msd.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.VoicePartyManager$StateBuilder$buildStateChart$1$2;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.core.voiceparty.core.shared.a$g;
import java.lang.Runnable;
import t45.c;
import hp2.c;
import com.kuaishou.live.core.voiceparty.core.shared.a$c;
import java.lang.System;
import ut7.h;

public abstract class a	// class@001400
{
    public final a$d a;
    public final a b;
    public StateChart c;

    public void a(){
       super();
       this.a = this.d();
       this.b = new a();
    }
    public final void a(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.h().j0(p0);
       return;
    }
    public final b b(a$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sub");
       b uob = p0.a().subscribe(new a$e(this), a$f.b);
       a.o(uob, "sub.events.subscribe\(\n  бн\n      { throw it }\n    \)");
       return uob;
    }
    public abstract a$a c();
    public abstract a$d d();
    public a$d e(){
       return this.a;
    }
    public e f(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e();
    }
    public final a g(){
       return this.b;
    }
    public abstract t h();
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a$a uoa = this.c();
       Objects.requireNonNull(uoa);
       StateChart stateChart = PatchProxy.apply(objArray, uoa, a$a.class, "1");
       if (stateChart != PatchProxyResult.class) {
       }else {
          StateChart$b uob = new StateChart$b();
          uob.b(new VoicePartyManager$StateBuilder$buildStateChart$$inlined$apply$lambda$1(uoa));
          uob.e(uoa.i(), VoicePartyManager$StateBuilder$buildStateChart$1$2.INSTANCE);
          uob.f(uoa.i());
          uob.f(uoa.b());
          uob.f(uoa.h());
          uob.f(uoa.f());
          uob.f(uoa.g());
          uob.f(uoa.e());
          uob.f(uoa.c());
          uob.f(uoa.d());
          uoa.a(uob);
          stateChart = uob.a();
       }
       this.c = stateChart;
       if (stateChart == null) {
          a.S("stateChart");
       }
       stateChart.s();
       if (SystemUtil.I()) {
          c.a(new a$g(this));
       }
       return;
    }
    public void j(){
    }
    public void k(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "reason");
       this.e().k().b = System.currentTimeMillis();
       this.b.dispose();
       a tc = this.c;
       if (tc == null) {
          a.S("stateChart");
       }
       tc.t(p0);
       return;
    }
    public final void l(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "observer");
       this.h().l0(p0);
       return;
    }
}
