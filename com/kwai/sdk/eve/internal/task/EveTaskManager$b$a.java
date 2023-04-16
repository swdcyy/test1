package com.kwai.sdk.eve.internal.task.EveTaskManager$b$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.task.EveTaskManager$b;
import java.lang.Object;
import zn7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import zn7.c;
import java.lang.Enum;
import java.util.Objects;
import com.kwai.sdk.eve.internal.task.EveTaskManager;
import java.lang.Boolean;
import wm7.a;
import fn7.b;
import vm7.a;
import msd.p;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import msd.l;
import msd.a;
import com.kwai.sdk.eve.internal.task.EveTaskManagerKt;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterKt;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import tn7.b;
import com.kwai.robust.PatchProxyResult;
import ao7.a;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$UpdateConfig;
import yn7.b;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import yn7.a;
import en7.b;
import en7.c;

public final class EveTaskManager$b$a implements Runnable	// class@0015c1
{
    public final EveTaskManager$b b;

    public void EveTaskManager$b$a(EveTaskManager$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       b a;
       String str2;
       String str3;
       String str4;
       boolean b6;
       Object obj = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, obj, EveTaskManager$b$a.class, "1")) {
          return;
       }
       char c = ' ';
       boolean b = false;
       EveLog.i$default("EveTaskManager#onNewPackage lifecycle "+obj.b.b.n()+c+obj.b.b.g(), b, 2, objArray);
       switch (c.c[obj.b.b.g().ordinal()]){
           case 1:
             b b1 = b.b;
             EveTaskManager$b b2 = obj.b.b;
             Objects.requireNonNull(b1);
             if (!PatchProxy.applyVoidOneRefs(b2, b1, b.class, "1")) {
                a.p(b2, "task");
                EveTaskLifecycle[] uEveTaskLife = new EveTaskLifecycle[]{EveTaskLifecycle.NONE,EveTaskLifecycle.UPDATING,EveTaskLifecycle.INSTALLED,EveTaskLifecycle.RUNNING,EveTaskLifecycle.OUTDATED,EveTaskLifecycle.PREWARMING,EveTaskLifecycle.TERMINATING};
                List list = CollectionsKt__CollectionsKt.L(uEveTaskLife);
                a uoa1 = new a(b2);
                Objects.requireNonNull(b2);
                if (!PatchProxy.applyVoidTwoRefs(list, uoa1, b2, uoa, "14")) {
                   a.p(list, "matches");
                   a.p(uoa1, "callback");
                   uoa = b2.g;
                   Objects.requireNonNull(uoa);
                   if (!PatchProxy.applyVoidTwoRefs(list, uoa1, uoa, b.class, "2")) {
                      a.p(list, "matches");
                      a.p(uoa1, "callback");
                      a = uoa.a;
                      _monitor_enter(a);
                      b d = uoa.d;
                      if (d != null) {
                         a.m(d);
                         if (list.contains(d)) {
                            uoa1.run();
                         }
                      }
                      uoa.c.add(new c(list, uoa1));
                      _monitor_exit(a);
                   }
                }
             }
             EveTaskManager$b$a b3 = obj.b;
             b3.c.g(b3.d, b3.b);
          label_024e :
             PatchProxy.onMethodExit(EveTaskManager$b$a.class, "1");
             return;
             break;
           case 2:
             EveTaskManager$b$a b4 = obj.b;
             EveTaskManager$b c1 = b4.c;
             EveTaskManager$b b5 = b4.b;
             EveTaskManager$b d1 = b4.d;
             Objects.requireNonNull(c1);
             EveTaskManager uEveTaskMana = EveTaskManager.class;
             if (PatchProxy.isSupport(uEveTaskMana) && PatchProxy.applyVoidThreeRefs(b5, d1, Boolean.FALSE, c1, EveTaskManager.class, "11")) {
                goto label_024e ;
             }else {
                String str = "EveTaskManager#reloadNewPack finish";
                String str1 = "EveTaskManager#reloadNewPack begin ";
                if (a.c.a()) {
                   if (PatchProxy.isSupport(uEveTaskMana)) {
                      str2 = str1;
                      str3 = str;
                      if (PatchProxy.applyVoidThreeRefs(b5, d1, Boolean.FALSE, c1, EveTaskManager.class, "13")) {
                         goto label_024e ;
                      }
                   }else {
                      str2 = str1;
                      str3 = str;
                   }
                   EveLog.i$default(str2+b5.n()+c+b, b, 2, null);
                   c1.d.d().d(b5);
                   EveLog.i$default("EveTaskManager#unload old task", b, 2, null);
                   c1.k(b5, b);
                   EveLog.i$default("EveTaskManager#free memory master", b, 2, null);
                   LuaNativeUtil.freeMemoryByTaskId(b5.n());
                   EveLog.i$default("EveTaskManager#load new task", b, 2, null);
                   c1.g(d1, b5);
                   EveInferenceManagerKt.e(b5, EveInferenceManagerKt.a(b5));
                   EveInferenceManagerKt.f(b5, EveInferenceManagerKt.b(b5));
                   EveTaskManagerKt.b(b5, EveTaskManagerKt.a(b5));
                   EveFeatureCenterKt.setFeatureAccessoryProvider(b5, EveFeatureCenterKt.getFeatureAccessoryProvider(b5));
                   EveLog.i$default("EveTaskManager#activate new task", b, 2, null);
                   c1.c(b5);
                   b5.s(EveTaskLifecycle.PREWARMING);
                   b5.s(EveTaskLifecycle.ACTIVATED);
                   EveLog.i$default(str3, b, 2, null);
                   goto label_024e ;
                }else {
                   str2 = str1;
                   if (PatchProxy.isSupport(uEveTaskMana)) {
                      str4 = str;
                      if (PatchProxy.applyVoidThreeRefs(b5, d1, Boolean.FALSE, c1, EveTaskManager.class, "12")) {
                         goto label_024e ;
                      }
                   }else {
                      str4 = str;
                   }
                   EveLog.i$default(str2+b5.n()+c+b, b, 2, null);
                   b obj1 = PatchProxy.apply(null, b5, uoa, "5");
                   if (obj1 != PatchProxyResult.class) {
                      b6 = obj1.booleanValue();
                   }else {
                      uoa = b5.h;
                      if (uoa != null) {
                         obj1 = uoa.R3();
                         if (obj1 != null) {
                            obj1 = obj1.updateConfig;
                            if (obj1 != null) {
                               b6 = obj1.allowHotUpdate;
                            }
                         }
                      }
                      b6 = 1;
                   }
                   if (b6 == null) {
                      EveLog.i$default("EveTaskManager#reloadNewPack can\'t hot update "+b5.n(), b, 2, null);
                      goto label_024e ;
                   }else {
                      c1.k(b5, b);
                      c1.g(d1, b5);
                      EveLog.i$default(str4, b, 2, null);
                      goto label_024e ;
                   }
                }
             }
             break;
           case 3:
             PatchProxy.onMethodExit(EveTaskManager$b$a.class, "1");
             return;
           case 4:
           case 6:
           case 5:
             PatchProxy.onMethodExit(EveTaskManager$b$a.class, "1");
             return;
           default:
             goto label_024e ;
       }
    }
}
