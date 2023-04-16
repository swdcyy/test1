package com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$a;
import nsd.u;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Math;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$mainScope$2;
import msd.a;
import qrd.p;
import qrd.s;
import pz2.j;
import lp3.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import fg6.a;
import ag1.q;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import ag1.d;
import ftd.k0;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$dispatchToAbility$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import ag1.r;
import java.util.Map;
import ag1.t;
import crd.b;
import oh3.j;
import com.google.gson.JsonElement;
import java.lang.reflect.Method;
import nsd.q0;
import csd.b;
import dsd.e;
import msd.l;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$b;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$c;
import erd.g;
import ag1.s;

public final class LiveEffectBridge	// class@0010eb
{
    public final Map a;
    public final p b;
    public static final JsonObject c;
    public static final long d;
    public static final LiveEffectBridge$a e;

    static {
       LiveEffectBridge.e = new LiveEffectBridge$a(null);
       LiveEffectBridge.c = new JsonObject();
       LiveEffectBridge.d = Math.max(a.t().u("SOURCE_LIVE").b("sendToYTechMsgTimeout", 10), 5);
    }
    public void LiveEffectBridge(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = s.c(LiveEffectBridge$mainScope$2.INSTANCE);
    }
    public final boolean a(String p0,String p1,j p2,e p3){
       boolean b1;
       Object obj = this;
       Object obj1 = p1;
       Object obj2 = p2;
       LiveEffectBridge liveEffectBr = LiveEffectBridge.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveEffectBridge.class, "4");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       String str = "message";
       a.p(obj1, str);
       a.p(obj2, "promise");
       a.p(p3, "serviceManager");
       t ot = null;
       boolean b = false;
       if (a.g("commonBridge", p0)) {
          if (!PatchProxy.applyVoidThreeRefs(p1, p2, p3, this, LiveEffectBridge.class, "6")) {
             b.c0(LiveLogTag.LIVE_ABILITY, "dispatchToAbility", str, obj1);
             super();
             this.element = ot;
             obj3 = -1;
             this.element = a.a.h(obj1, q.class);
             if (this.element != null) {
                LiveEffectBridge$dispatchToAbility$1 obj4 = PatchProxy.apply(ot, obj, liveEffectBr, "1");
                if (obj4 == patchProxyRe) {
                   obj4 = obj.b.getValue();
                }
                obj4 = new LiveEffectBridge$dispatchToAbility$1(this, p3, this, p2, null);
                a.f(obj4, 0, null, patchProxyRe, 3, null);
             }else {
                d.a(obj2, obj3, "parsed as null: "+obj1, ot);
             }
          }
       }else {
          r obj5 = PatchProxy.applyOneRefs(obj1, obj, liveEffectBr, "5");
          if (obj5 != patchProxyRe) {
             b1 = obj5.booleanValue();
          }else {
             obj5 = a.a.h(obj1, r.class);
             if (obj5 != null) {
                b.d0(LiveLogTag.LIVE_ABILITY, "handleResponse", "responseMessage", obj5, "waitResponseMap", obj.a);
                char c = '_';
                t ot1 = obj.a.get(obj5.a()+c+obj5.c());
                ot1 = (ot1 != null)? ot1.a: ot;
                t ot2 = obj.a.get(obj5.a()+c+obj5.c());
                if (ot2 != null) {
                   ot = ot2.b;
                }
                j.a(ot);
                if (ot1 != null) {
                   if (obj5.b() == 1) {
                      obj3 = a.a.p(obj5.data);
                      a.o(obj3, "Gsons.KWAI_GSON.toJson\(responseMessage.data\)");
                      ot1.c(obj3);
                   }else {
                      int i = obj5.b();
                      obj5 = obj5.error;
                      if (obj5 == null) {
                         obj3 = "";
                      }
                      ot1.b(i, obj5);
                   }
                }
                ot = ot1;
             }
             if (ot != null) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (!b1) {
          label_017e :
             return b;
          }
       }
       b = true;
       goto label_017e ;
    }
    public final Object b(Method p0,Object p1,Object[] p2,c p3){
       q0 oq0 = new q0(2);
       oq0.b(p2);
       oq0.a(p3);
       p2 = new Object[oq0.c()];
       p0 = p0.invoke(p1, oq0.d(p2));
       if (p0 == b.h()) {
          e.c(p3);
       }
       return p0;
    }
    public final void c(int p0,Map p1,j p2,l p3){
       if (PatchProxy.isSupport(LiveEffectBridge.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, LiveEffectBridge.class, "2")) {
          return;
       }
       a.p(p1, "data");
       a.p(p2, "promise");
       a.p(p3, "function");
       b.d0(LiveLogTag.LIVE_ABILITY, "sendMessage", "reqType", Integer.valueOf(p0), "seqId", Integer.valueOf(p2.a()));
       String str = p0+'_'+p2.a();
       b uob = t.timer(LiveEffectBridge.d, TimeUnit.SECONDS).observeOn(d.a).subscribe(new LiveEffectBridge$b(this, str, p0), LiveEffectBridge$c.b);
       a.o(uob, "Observable.timer\(TIME_OU¡­ge\n          \)\n        }\)");
       this.a.put(str, new t(p2, uob));
       String str1 = a.a.q(new s(p0, p2.a(), p1));
       a.o(str1, "Gsons.KWAI_GSON.toJson\(\n¡­   data\n        \)\n      \)");
       p3.invoke(str1);
       return;
    }
}
