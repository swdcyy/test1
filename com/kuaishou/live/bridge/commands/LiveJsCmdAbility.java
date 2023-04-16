package com.kuaishou.live.bridge.commands.LiveJsCmdAbility;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.LiveJsCmdAbility$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdAbility$onExecute$1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import lp3.e;
import com.kuaishou.live.basic.ability.LiveModuleAbility;
import lp3.c;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import java.lang.reflect.Method;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import dsd.a;
import kotlin.collections.ArraysKt___ArraysKt;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.kuaishou.live.bridge.commands.LiveJsCmdAbility$b;
import dsd.e;
import java.util.NoSuchElementException;
import o63.m;
import o63.m$a;

public final class LiveJsCmdAbility extends AbstractLiveJsCommand	// class@000dee
{

    public void LiveJsCmdAbility(){
       super();
    }
    public Class a(){
       return LiveJsCmdAbility$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       LiveJsCmdAbility$onExecute$1 l$6;
       LiveJsCmdAbility$onExecute$1 l$5;
       LiveJsCmdAbility$onExecute$1 l$4;
       LiveJsCmdAbility$onExecute$1 l$3;
       LiveJsCmdAbility$onExecute$1 l$2;
       LiveJsCmdAbility$onExecute$1 l$1;
       LiveJsCmdAbility$onExecute$1 l$0;
       Ref$ObjectRef element;
       Object obj = this;
       LiveJsCmdAbility$onExecute$1 obj1 = p0;
       c uoc = p2;
       LiveJsCmdAbility$onExecute$1 obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdAbility.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       if (uoc instanceof LiveJsCmdAbility$onExecute$1) {
          obj2 = uoc;
          LiveJsCmdAbility$onExecute$1 label = obj2.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj2.label = label - i;
          label_0033 :
             label = obj2.result;
             Object obj3 = b.h();
             int LiveJsCmdAbility$onExecute$1 label1 = obj2.label;
             int i1 = 2;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == i1) {
                      j0.n(label);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   label1 = obj2.L$8;
                   obj1 = obj2.L$7;
                   l$6 = obj2.L$6;
                   l$5 = obj2.L$5;
                   l$4 = obj2.L$4;
                   l$3 = obj2.L$3;
                   l$2 = obj2.L$2;
                   l$1 = obj2.L$1;
                   l$0 = obj2.L$0;
                   j0.n(label);
                }
             }else {
                j0.n(label);
                e uoe = (!obj1 instanceof LiveJsCmdAbility$a)? null: obj1;
                l$3 = uoe;
                if (l$3 != null) {
                   l$4 = new Ref$ObjectRef();
                   LiveBaseAbility ability = this.h().a(LiveModuleAbility.class).getAbility(l$3.a);
                   l$4.element = ability;
                   l$5 = ability.getClass();
                   l$6 = new Ref$ObjectRef();
                   Method[] methods = l$5.getMethods();
                   a.o(methods, "abilityClazz.methods");
                   label1 = methods.length;
                   int i2 = 0;
                   while (true) {
                      if (i2 >= label1) {
                         throw new NoSuchElementException("Array contains no element matching the predicate.");
                      }
                      object oobject = methods[i2];
                      a.o(oobject, "it");
                      if (a.a(a.g(oobject.getName(), l$3.b)).booleanValue()) {
                         l$6.element = oobject;
                         Ref$ObjectRef label11 = new Ref$ObjectRef();
                         element = l$6.element;
                         a.o(element, "method");
                         Class[] parameterTyp = element.getParameterTypes();
                         a.o(parameterTyp, "method.parameterTypes");
                         Object obj4 = ArraysKt___ArraysKt.ob(parameterTyp);
                         a.o(obj4, "method.parameterTypes.first\(\)");
                         obj2.L$0 = obj;
                         obj2.L$1 = obj1;
                         Object obj5 = p1;
                         obj2.L$2 = obj5;
                         obj2.L$3 = l$3;
                         obj2.L$4 = l$4;
                         obj2.L$5 = l$5;
                         obj2.L$6 = l$6;
                         obj2.L$7 = label11;
                         obj2.L$8 = label11;
                         obj2.label = 1;
                         label = obj.d(l$3.c, obj4, obj2);
                         if (label == obj3) {
                            return obj3;
                         }else {
                            l$0 = obj;
                            l$2 = obj5;
                            l$1 = obj1;
                            Ref$ObjectRef objectRef = label11;
                         }
                      }else {
                         i2 = i2 + 1;
                      }
                   }
                   return label;
                }else {
                   return m.g.c("invalid request params");
                }
             }
             label1.element = label;
             obj2.L$0 = l$0;
             obj2.L$1 = l$1;
             obj2.L$2 = l$2;
             obj2.L$3 = l$3;
             obj2.L$4 = l$4;
             obj2.L$5 = l$5;
             obj2.L$6 = l$6;
             obj2.L$7 = obj1;
             obj2.label = i1;
             h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(obj2));
             Object[] objArray = new Object[i1];
             objArray[0] = obj1.element;
             objArray[1] = new LiveJsCmdAbility$b(oh);
             l$6.element.invoke(l$4.element, objArray);
             label = oh.b();
             if (label == b.h()) {
                e.c(obj2);
             }
             if (label == obj3) {
                return obj3;
             }else {
                goto label_017b ;
             }
          }
       }
       obj2 = new LiveJsCmdAbility$onExecute$1(obj, uoc);
       goto label_0033 ;
    }
}
