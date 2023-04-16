package t7.f$a;
import java.lang.Object;
import nsd.u;
import msd.a;
import msd.q;
import java.lang.String;
import kotlin.jvm.internal.a;
import t7.f;
import kotlin.Result;
import android.os.Trace;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Map;
import nsd.s0;
import android.os.IBinder;
import java.lang.ClassLoader;
import com.android.kwai.platform.notification.core.HookNotificationBinderHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import android.app.NotificationManager;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import v7.a;
import kotlin.Pair;
import qrd.l1;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;

public final class f$a	// class@002475
{

    public void f$a(){
       super();
    }
    public void f$a(u p0){
       super();
    }
    public synchronized final void a(a p0,q p1){
       a.p(p0, "afterHook");
       a.p(p1, "methodAround");
       if (f.a) {
          return;
       }
       boolean b = true;
       f.a = b;
       Trace.beginSection("KwaiNotificationManager.step2-1-2");
       Class uClass = Class.forName("android.os.ServiceManager");
       Class[] uClassArray = new Class[b];
       int i = 0;
       uClassArray[i] = String.class;
       Method declaredMeth = uClass.getDeclaredMethod("getService", uClassArray);
       a.o(declaredMeth, "getServiceMethod");
       declaredMeth.setAccessible(b);
       Field declaredFiel = uClass.getDeclaredField("sCache");
       a.o(declaredFiel, "cacheField");
       declaredFiel.setAccessible(b);
       Throwable obj = null;
       Map obj1 = declaredFiel.get(obj);
       if (obj1 == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, android.os.IBinder>");
       }
       obj1 = s0.k(obj1);
       Trace.endSection();
       Trace.beginSection("KwaiNotificationManager.step2-1-3");
       Object[] objArray = new Object[b];
       objArray[i] = "notification";
       Object obj2 = declaredMeth.invoke(obj, objArray);
       if (obj2 == null) {
          throw new NullPointerException("null cannot be cast to non-null type android.os.IBinder");
       }
       a.o(uClass, "smClz");
       Class[] uClassArray1 = new Class[b];
       uClassArray1[i] = IBinder.class;
       p1 = Proxy.newProxyInstance(uClass.getClassLoader(), uClassArray1, new HookNotificationBinderHandler(obj2, p1));
       if (p1 == null) {
          throw new NullPointerException("null cannot be cast to non-null type android.os.IBinder");
       }
       obj1.put("notification", p1);
       Field declaredFiel1 = NotificationManager.class.getDeclaredField("sService");
       a.o(declaredFiel1, "sServiceField");
       declaredFiel1.setAccessible(b);
       declaredFiel1.set(obj, obj);
       AzerothCodeAdapter.b.logI("KwaiNotificationHook", "NotificationManager service has been replaced successfully!");
       a.f(a.c, "logger_hook_notification_manager_success", "manager replace", null, 4, null);
       p0.invoke();
       p0 = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(p0);
       if (obj != null) {
          AzerothCodeAdapter.b.logE("KwaiNotificationHook", "hook NotificationManager service meet something wrong!", obj);
          a.b(a.c, "logger_hook_notification_manager_error", null, null, obj, 4, null);
       }
       Trace.endSection();
       p0 = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(p0);
       if (obj != null) {
          AzerothCodeAdapter.b.logE("KwaiNotificationHook", "reflection service manager meet something wrong!", obj);
          a.b(a.c, "logger_hook_error", "reflection service manager meet something wrong!", null, obj, 4, null);
       }
       return;
    }
}
