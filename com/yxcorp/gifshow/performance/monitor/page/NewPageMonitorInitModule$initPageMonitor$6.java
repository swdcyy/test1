package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.OnlineSystraceManager;
import kotlin.collections.CollectionsKt__CollectionsKt;
import fg6.a;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$6$b;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$6$a;
import java.util.Iterator;
import java.lang.Iterable;
import gf7.b;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$6$2$1;
import java.lang.Throwable;
import yf7.h;

public final class NewPageMonitorInitModule$initPageMonitor$6 extends Lambda implements a	// class@000ead
{
    public static final NewPageMonitorInitModule$initPageMonitor$6 INSTANCE;

    static {
       NewPageMonitorInitModule$initPageMonitor$6.INSTANCE = new NewPageMonitorInitModule$initPageMonitor$6();
    }
    public void NewPageMonitorInitModule$initPageMonitor$6(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Gson a;
       Iterator obj1;
       Map obj = PatchProxy.apply(null, this, NewPageMonitorInitModule$initPageMonitor$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-2022051331);
       a.o(obj, "Singleton.get\(OnlineSystraceManager::class.java\)");
       List list = CollectionsKt__CollectionsKt.E();
       a = a.a;
       obj = a.i(obj.b(), new NewPageMonitorInitModule$initPageMonitor$6$b().getType());
       if (obj != null) {
          obj1 = obj.get("onlineTraceEnablePages");
          if (obj1 != null) {
             obj1 = a.i(a.q(obj1), new NewPageMonitorInitModule$initPageMonitor$6$a().getType());
             a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­cePageConfig>>\(\) {}.type\)");
             list = obj1;
          }
       }
       obj1 = list.iterator();
       while (obj1.hasNext()) {
          PageMonitor.INSTANCE.registerPage(obj1.next().a(), NewPageMonitorInitModule$initPageMonitor$6$2$1.INSTANCE);
       }
       return list;
    }
}
