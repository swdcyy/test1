package com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge$dispatchToAbility$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import lp3.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import pz2.j;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import java.lang.reflect.Method;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.live.basic.ability.LiveModuleAbility;
import lp3.c;
import ag1.q;
import com.kuaishou.live.common.core.component.effect.renderer.ReceivedData;
import java.lang.Boolean;
import dsd.a;
import fg6.a;
import kotlin.collections.ArraysKt___ArraysKt;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import ag1.r;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ag1.d;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;

public final class LiveEffectBridge$dispatchToAbility$1 extends SuspendLambda implements p	// class@0010e9
{
    public final j $promise;
    public final Ref$ObjectRef $receivedMessage;
    public final e $serviceManager;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public k0 p$;
    public final LiveEffectBridge this$0;

    public void LiveEffectBridge$dispatchToAbility$1(LiveEffectBridge p0,e p1,Ref$ObjectRef p2,j p3,c p4){
       this.this$0 = p0;
       this.$serviceManager = p1;
       this.$receivedMessage = p2;
       this.$promise = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveEffectBridge$dispatchToAbility$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       LiveEffectBridge$dispatchToAbility$1 uodispatchTo = new LiveEffectBridge$dispatchToAbility$1(this.this$0, this.$serviceManager, this.$receivedMessage, this.$promise, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveEffectBridge$dispatchToAbility$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       String str = "ret";
       Gson obj = PatchProxy.applyOneRefs(p0, this, LiveEffectBridge$dispatchToAbility$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveEffectBridge$dispatchToAbility$1 tlabel = this.label;
       LiveEffectBridge$dispatchToAbility$1 uodispatchTo = 2;
       int i = 1;
       if (tlabel != null) {
          if (tlabel != i) {
             if (tlabel == uodispatchTo) {
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
          }
          j0.n(p0);
       }else {
          j0.n(p0);
          p0 = this.p$;
          LiveBaseAbility ability = this.$serviceManager.a(LiveModuleAbility.class).getAbility(this.$receivedMessage.element.a().ability);
          Class class = ability.getClass();
          Method[] methods = class.getMethods();
          a.o(methods, "abilityClazz.methods");
          int len = methods.length;
          int i1 = 0;
          int i2 = 0;
          while (true) {
             if (i2 >= len) {
                throw new NoSuchElementException("Array contains no element matching the predicate.");
             }
             object oobject = methods[i2];
             a.o(oobject, "it");
             if (a.a(a.g(oobject.getName(), this.$receivedMessage.element.a().method)).booleanValue()) {
                a.o(oobject, "method");
                Class[] parameterTyp = oobject.getParameterTypes();
                a.o(parameterTyp, "method.parameterTypes");
                Object obj1 = a.a.c(this.$receivedMessage.element.a().params, ArraysKt___ArraysKt.ob(parameterTyp));
                if (obj1 == null) {
                   Object[] objArray = new Object[i1];
                   this.L$0 = p0;
                   this.L$1 = ability;
                   this.L$2 = class;
                   this.L$3 = oobject;
                   this.L$4 = obj1;
                   this.label = i;
                   p0 = this.this$0.b(oobject, ability, objArray, this);
                   if (p0 == obj) {
                      return obj;
                   }
                }else {
                   Object[] objArray1 = new Object[i];
                   objArray1[i1] = obj1;
                   this.L$0 = p0;
                   this.L$1 = ability;
                   this.L$2 = class;
                   this.L$3 = oobject;
                   this.L$4 = obj1;
                   this.label = uodispatchTo;
                   p0 = this.this$0.b(oobject, ability, objArray1, this);
                   if (p0 == obj) {
                      return obj;
                   }
                }
             }else {
                i2 = i2 + 1;
             }
          }
       }
       if (p0 != null) {
          obj = a.a;
          JsonElement jsonElement = obj.x(p0);
          a.o(jsonElement, "Gsons.KWAI_GSON.toJsonTree\(result\)");
          r or = new r(this.$receivedMessage.element.b(), this.$receivedMessage.element.seqId, 1, jsonElement, null);
          p0 = obj.q(tlabel);
          b.c0(LiveLogTag.LIVE_ABILITY, "Promise.onResult", str, p0);
          a.o(p0, str);
          this.$promise.c(p0);
       }else {
          d.a(this.$promise, -1, "invoke returns null", this.$receivedMessage.element);
       }
       return l1.a;
    }
}
