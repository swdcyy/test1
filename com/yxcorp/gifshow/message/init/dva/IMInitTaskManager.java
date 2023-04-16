package com.yxcorp.gifshow.message.init.dva.IMInitTaskManager;
import com.kwai.plugin.dva.Dva;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$a;
import ij7.d;
import idb.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import idb.e;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import xv5.c;
import java.lang.StringBuilder;
import xv5.a;
import android.os.Looper;
import hw5.a;
import brd.a0;
import xv5.e;
import idb.c;
import idb.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$pendingTask$2;
import java.util.List;
import msd.l;
import trd.y;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$removeTask$1;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$b;
import z1.a;
import java.lang.Runnable;
import ekd.k1;
import t45.d;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$c;
import brd.z;

public final class IMInitTaskManager	// class@001d55
{
    public static final Map a;
    public static final ArrayList b;
    public static final IMInitTaskManager c;

    static {
       List a;
       IMInitTaskManager.c = new IMInitTaskManager();
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().u(IMInitTaskManager$a.a);
       a = a.a;
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(a, 10)), 16));
       Iterator iterator = a.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(obj.a, obj);
       }
       IMInitTaskManager.a = linkedHashMa;
       IMInitTaskManager.b = new ArrayList();
    }
    public void IMInitTaskManager(){
       super();
    }
    public static final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, IMInitTaskManager.class, "1")) {
          return;
       }
       a.p(p0, "taskType");
       IMInitTaskManager.c(p0, null);
       return;
    }
    public static final void c(String p0,String p1){
       IMInitTaskManager iMInitTaskMa = IMInitTaskManager.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, iMInitTaskMa, "2")) {
          return;
       }
       String str = "taskType";
       a.p(p0, str);
       if (!PatchProxy.isSupport(iMInitTaskMa) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.TRUE, null, IMInitTaskManager.class, "3")) {
          a.p(p0, str);
          e uoe = IMInitTaskManager.a.get(p0);
          if (uoe != null) {
             boolean b = c.d();
             String str1 = "IM-INIT TASK executeTask:";
             a.c(str1+p0+" removeTask:"+p1+" installed:"+b);
             if (b) {
                IMInitTaskManager.c.a(uoe);
             }else {
                a.c(str1+p0+" #onMainThread expect:"+uoe.c+' '+"actual:"+a.g(Looper.myLooper(), Looper.getMainLooper()));
                if (p1 != null) {
                   IMInitTaskManager.e(p1);
                }
                e.j(a.class, 0, 2, obj).R(new c(p0, uoe), new d(p0, p1, true));
             }
          }
       }
       return;
    }
    public static synchronized final void d(String p0,String p1,boolean p2){
       _monitor_enter(IMInitTaskManager.class);
       if (PatchProxy.isSupport(IMInitTaskManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, IMInitTaskManager.class, "5")) {
          _monitor_exit(IMInitTaskManager.class);
          return;
       }else {
          a.p(p0, "taskType");
          a.c("IM-INIT TASK pendingTask:"+p0+" removeTask:"+p1);
          if (p1 != null) {
             IMInitTaskManager.e(p1);
          }
          if (p2) {
             y.K0(IMInitTaskManager.b, new IMInitTaskManager$pendingTask$2(p0));
          }
          IMInitTaskManager.b.add(p0);
          _monitor_exit(IMInitTaskManager.class);
          return;
       }
    }
    public static synchronized final void e(String p0){
       _monitor_enter(IMInitTaskManager.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, IMInitTaskManager.class, "8")) {
          _monitor_exit(IMInitTaskManager.class);
          return;
       }else {
          y.K0(IMInitTaskManager.b, new IMInitTaskManager$removeTask$1(p0));
          _monitor_exit(IMInitTaskManager.class);
          return;
       }
    }
    public final void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMInitTaskManager.class, "4")) {
          return;
       }
       p0 = p0.d;
       if (p0.c != null) {
          k1.o(new IMInitTaskManager$b(p0));
       }else {
          a.o(d.c.d(new IMInitTaskManager$c(p0)), "KwaiSchedulers.ASYNC.sch¡­umer.accept\(it\) }\n      }");
       }
       return;
    }
}
