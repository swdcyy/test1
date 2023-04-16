package com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Object;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import oi7.c;
import java.lang.Runnable;
import com.kwai.plugin.dva.feature.core.receiver.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import android.content.ComponentName;
import zi7.a;
import qrd.p;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import java.lang.StringBuilder;
import qj7.d;
import com.kwai.plugin.dva.feature.core.hook.a$a;
import com.kwai.plugin.dva.feature.core.receiver.a$b;
import oi7.b;
import oi7.a;

public class a	// class@000e5e
{

    public void a(){
       super();
    }
    public static boolean a(Context p0,Intent p1,ServiceConnection p2,int p3){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!a.c(p0, p1, new c(p0, p1, p2, p3))) {
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, a.class, "9");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             label_0051 :
                return b;
             }
          }
          b = p0.bindService(p1, p2, p3);
          goto label_0051 ;
       }else {
          return true;
       }
    }
    public static Class b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Map map = null;
       a obj = PatchProxy.applyOneRefs(p0, map, a.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "process");
          Map c = a.c;
          if (c == null) {
             a.S("sProcessToReceiverMap");
          }else {
             map = c;
          }
          obj1 = map.get(p0);
       }
       return obj1;
    }
    public static boolean c(Context p0,Intent p1,Runnable p2){
       Object obj2;
       a a;
       SplitSourceProvider splitSourceP = SplitSourceProvider.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeatureManager obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FeatureManager.a;
       if (!obj.f()) {
          return false;
       }
       ComponentName component = p1.getComponent();
       if (component == null) {
          return false;
       }
       String className = component.getClassName();
       if (className.isEmpty()) {
          return false;
       }
       Set obj1 = PatchProxy.applyOneRefs(className, null, a.class, "11");
       if (obj1 != patchProxyRe) {
       }else {
          SplitSourceProvider splitSourceP1 = obj.a().g();
          Objects.requireNonNull(splitSourceP1);
          obj1 = PatchProxy.apply(null, splitSourceP1, splitSourceP, "8");
          if (obj1 == patchProxyRe) {
             obj1 = splitSourceP1.i.getValue();
          }
          if (obj1.contains(className)) {
             Iterator iterator = splitSourceP1.e().entrySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   Iterator iterator1 = uEntry.getValue().iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         if (className.equals(iterator1.next())) {
                            obj1 = uEntry.getKey();
                         }
                      }else {
                         continue ;
                      }
                   }
                   if (obj2 == null) {
                      return false;
                   }else {
                      splitSourceP1 = FeatureManager.a.a().g();
                      Objects.requireNonNull(splitSourceP1);
                      Map map = PatchProxy.apply(null, splitSourceP1, splitSourceP, "9");
                      if (map == patchProxyRe) {
                         map = splitSourceP1.j.getValue();
                      }
                      String str = map.get(className);
                      if (str == null) {
                         str = "";
                      }
                      String str1 = str;
                      a = a.a;
                      str = a.b();
                      if (str1.equals(str)) {
                         return false;
                      }else {
                         Class uClass = a.b(str1);
                         if (a.b(str) == null || uClass == null) {
                            return false;
                         }else {
                            d.c("for "+className+", "+obj2+" will be installed.");
                            a.c(p0, obj2, str1, new a$a(obj2, str1, p2), 0x4e20);
                            return true;
                         }
                      }
                   }
                }
             }
          }
          obj2 = null;
          goto label_00a4 ;
       }
       obj2 = obj1;
       goto label_00a4 ;
    }
    public static ComponentName d(Context p0,Intent p1){
       a uoa = a.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, uoa, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c(p0, p1, new b(p0, p1))) {
          return p1.getComponent();
       }
       ComponentName uComponentNa = PatchProxy.applyTwoRefs(p0, p1, null, uoa, "7");
       if (uComponentNa != PatchProxyResult.class) {
       }else {
          uComponentNa = p0.startForegroundService(p1);
       }
       return uComponentNa;
    }
    public static ComponentName e(Context p0,Intent p1){
       a uoa = a.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c(p0, p1, new a(p0, p1))) {
          return p1.getComponent();
       }
       ComponentName uComponentNa = PatchProxy.applyTwoRefs(p0, p1, null, uoa, "5");
       if (uComponentNa != PatchProxyResult.class) {
       }else {
          uComponentNa = p0.startService(p1);
       }
       return uComponentNa;
    }
}
