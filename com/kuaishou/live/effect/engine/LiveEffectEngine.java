package com.kuaishou.live.effect.engine.LiveEffectEngine;
import ny2.a;
import com.kuaishou.live.effect.base.Manager;
import androidx.lifecycle.LifecycleOwner;
import iy2.d;
import jz2.a;
import ty2.a;
import jy2.a;
import dz2.c$a;
import hz2.a;
import sz2.c;
import uy2.a$a;
import hf3.a;
import qr5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.util.List;
import pp.c;
import lz2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager;
import ny2.e;
import zy2.a;
import az2.a;
import uy2.a;
import ny2.b;
import ny2.c;
import lz2.c;
import iy2.f$a;
import iy2.v;
import pz2.e;
import pz2.g;
import rz2.f;
import com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager;
import com.kuaishou.live.effect.engine.commoneffect.LiveCommonEffectManager;
import qy2.a;
import com.kuaishou.live.effect.engine.face.LiveFaceEffectManager;
import ny2.d;
import vy2.a;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.util.Set;
import pz2.c;
import pz2.a;
import java.lang.Long;
import com.kuaishou.live.effect.engine.render.LiveEffectRenderManager$a;
import com.kwai.robust.PatchProxyResult;
import py2.a;
import ky2.a;
import androidx.lifecycle.LiveData;
import ky2.a$b;
import trd.t;
import nz2.h;

public final class LiveEffectEngine extends Manager implements a	// class@001af7
{
    public final List c;
    public v d;
    public LiveEffectRenderManager e;
    public LiveCommonEffectManager f;
    public LiveFaceEffectManager g;
    public LiveEffectBannedBizManager h;
    public final a i;
    public final d j;
    public final a k;
    public final a l;
    public final a m;
    public final c$a n;
    public final a o;
    public final c p;
    public final a$a q;
    public final a r;
    public final b s;

    public void LiveEffectEngine(LifecycleOwner p0,d p1,a p2,a p3,a p4,c$a p5,a p6,c p7,a$a p8,a p9,b p10){
       List list;
       Object[] objArray1;
       d uod = this;
       Object obj = p1;
       List obj1 = p2;
       Object obj2 = p3;
       Object obj3 = p4;
       Object obj4 = p5;
       Object obj5 = p6;
       LiveEffectRenderManager obj6 = p7;
       Object obj7 = p8;
       Object obj8 = p9;
       Object obj9 = p10;
       a.p(p0, "lifecycleOwner");
       a.p(obj, "effectAbility");
       a.p(obj1, "disableModel");
       a.p(obj2, "engineConfig");
       a.p(obj3, "localRenderVcAttach");
       a.p(obj4, "renderContextDependency");
       a.p(obj5, "renderLogDependency");
       a.p(obj6, "effectResourceLoader");
       a.p(obj7, "logDependency");
       a.p(obj8, "longConnection");
       a.p(obj9, "streamInfoReader");
       super(p0);
       uod.j = obj;
       uod.k = obj1;
       uod.l = obj2;
       uod.m = obj3;
       uod.n = obj4;
       uod.o = obj5;
       uod.p = obj6;
       uod.q = obj7;
       uod.r = obj8;
       uod.s = obj9;
       obj1 = LiveEffectLogTag.LIVE_EFFECT_ENGINE.appendTag("LiveEffectEngine");
       uod.c = obj1;
       uod.i = new a();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uod, LiveEffectEngine.class, "3")) {
          list = obj1;
          objArray1 = objArray;
       }else {
          LiveEffectRenderManager liveEffectRe = v6;
          obj6 = v6;
          list = obj1;
          objArray1 = null;
          liveEffectRe = new LiveEffectRenderManager(this.c(), new e(uod), p6, p5, obj2.b, p4);
          uod.e = obj6;
       }
       if (!PatchProxy.applyVoid(objArray1, uod, LiveEffectEngine.class, "2")) {
          a uoa = new a(obj7, new b(uod), new c(), obj2.a);
          LiveEffectEngine e = uod.e;
          if (e == null) {
             a.S("renderManager");
          }
          uod.d = new v(e.e, uoa, obj2.c, obj);
       }
       if (!PatchProxy.applyVoid(objArray1, uod, LiveEffectEngine.class, "5")) {
          uod.h = new LiveEffectBannedBizManager(this.c(), obj8, uod);
       }
       if (obj2.d == null && !PatchProxy.applyVoid(objArray1, uod, LiveEffectEngine.class, "4")) {
          LiveCommonEffectManager liveCommonEf = new LiveCommonEffectManager(this.c(), obj2.e, this, p7, p9, p10);
          uod.f = obj;
       }
       if (!PatchProxy.applyVoid(objArray1, uod, LiveEffectEngine.class, "6")) {
          uod.g = new LiveFaceEffectManager(this.c(), obj9, new d(uod));
       }
       b.S(list, "init", "isEffectDisabled", Boolean.valueOf(this.d()));
       return;
    }
    public void B0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "14")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       LiveEffectEngine ti = this.i;
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoidOneRefs(p0, ti, a.class, "6")) {
          a.p(p0, str);
          ti.a.add(p0);
       }
       return;
    }
    public void C0(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEffectEngine.class, "16")) {
          return;
       }
       String str = "effectTask";
       a.p(p0, str);
       b.T(this.c, "[sendMsgToRender]", "task", p0, "msg", p1);
       LiveEffectEngine te = this.e;
       if (te == null) {
          a.S("renderManager");
       }
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, te, LiveEffectRenderManager.class, "2")) {
          a.p(p0, str);
          int i = p0.p();
          if (i != 1) {
             if (i != 2) {
                b.S(te.c, "[sendMsgToRender] renderType not support", "magicFaceId", Long.valueOf(p0.b()));
             }else {
                te.e.f(p1);
             }
          }else {
             te.e.b(p0, p1);
          }
       }
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, LiveEffectEngine.class, "10")) {
          return;
       }
       b.P(this.c, "[clearRenderingEffectTask]");
       LiveEffectEngine td = this.d;
       if (td == null) {
          a.S("effectManager");
       }
       td.d();
       return;
    }
    public c H(){
       LiveEffectEngine obj = PatchProxy.apply(null, this, LiveEffectEngine.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("effectManager");
       }
       return obj.e();
    }
    public void H0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "9")) {
          return;
       }
       a.p(p0, "taskList");
       if (this.d()) {
          b.P(this.c, "[addEffectTasks] effectDisabled");
          return;
       }else {
          LiveEffectEngine td = this.d;
          if (td == null) {
             a.S("effectManager");
          }
          td.b(p0);
          return;
       }
    }
    public void S0(long p0){
       LiveEffectEngine liveEffectEn = LiveEffectEngine.class;
       if (PatchProxy.isSupport(liveEffectEn) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveEffectEn, "12")) {
          return;
       }
       liveEffectEn = this.d;
       if (liveEffectEn == null) {
          a.S("effectManager");
       }
       liveEffectEn.a(p0);
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "17")) {
          return;
       }
       String str = "consumer";
       a.p(p0, str);
       LiveEffectEngine tf = this.f;
       if (tf != null && !PatchProxy.applyVoidOneRefs(p0, tf, LiveCommonEffectManager.class, "2")) {
          a.p(p0, str);
          b.P(tf.c, "[registerConsumer]");
          tf.e.add(p0);
       }
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "18")) {
          return;
       }
       String str = "consumer";
       a.p(p0, str);
       LiveEffectEngine tf = this.f;
       if (tf != null && !PatchProxy.applyVoidOneRefs(p0, tf, LiveCommonEffectManager.class, "3")) {
          a.p(p0, str);
          b.P(tf.c, "[unregisterConsumer]");
          tf.e.remove(p0);
       }
       return;
    }
    public final boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveEffectEngine obj = PatchProxy.apply(objArray, this, LiveEffectEngine.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.k;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, a.class, "4");
       if (objArray1 == patchProxyRe) {
          a$b value = obj.c.getValue();
          if (value != null) {
             objArray = value.a();
          }
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          return objArray1.booleanValue();
       }else {
          Objects.requireNonNull(a.i);
          return a.h;
       }
    }
    public void g1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "15")) {
          return;
       }
       String str = "listener";
       a.p(p0, str);
       LiveEffectEngine ti = this.i;
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoidOneRefs(p0, ti, a.class, "7")) {
          a.p(p0, str);
          ti.a.remove(p0);
       }
       return;
    }
    public void j1(long p0){
       LiveEffectEngine liveEffectEn = LiveEffectEngine.class;
       if (PatchProxy.isSupport(liveEffectEn) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveEffectEn, "13")) {
          return;
       }
       liveEffectEn = this.d;
       if (liveEffectEn == null) {
          a.S("effectManager");
       }
       liveEffectEn.i(p0);
       return;
    }
    public void o1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "8")) {
          return;
       }
       a.p(p0, "task");
       this.H0(t.k(p0));
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectEngine.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       LiveEffectEngine td = this.d;
       if (td == null) {
          a.S("effectManager");
       }
       td.h();
       h.a();
       return;
    }
}
