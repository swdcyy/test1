package com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$a;
import ij7.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager;
import java.lang.StringBuilder;
import xv5.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import idb.e;
import idb.b;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class IMInitTaskManager$a implements d	// class@001d50
{
    public static final IMInitTaskManager$a a;

    static {
       IMInitTaskManager$a.a = new IMInitTaskManager$a();
    }
    public void IMInitTaskManager$a(){
       super();
    }
    public final void a(long p0,String p1,int p2){
       if (PatchProxy.isSupport(IMInitTaskManager$a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, IMInitTaskManager$a.class, "1")) {
          return;
       }
       a.p(p1, "pluginName");
       if (a.g(p1, "im_plugin") && p2 == 0x27d8) {
          _monitor_enter(IMInitTaskManager.class);
          if (PatchProxy.applyVoid(null, null, IMInitTaskManager.class, "9")) {
             _monitor_exit(IMInitTaskManager.class);
          }else {
             ArrayList b = IMInitTaskManager.b;
             a.c("IM-INIT TASK consume pendingTask: "+b);
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = b.iterator();
             while (iterator.hasNext()) {
                e uoe = IMInitTaskManager.a.get(iterator.next());
                if (uoe != null) {
                   uArrayList.add(uoe);
                }
             }
             Iterator iterator1 = CollectionsKt___CollectionsKt.f5(uArrayList, new b()).iterator();
             while (iterator1.hasNext()) {
                IMInitTaskManager.c.a(iterator1.next());
             }
             IMInitTaskManager.b.clear();
             _monitor_exit(IMInitTaskManager.class);
          }
       }
       return;
    }
}
