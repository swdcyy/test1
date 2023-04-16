package com.android.kwai.platform.notification.core.HookNotificationBinderHandler;
import java.lang.reflect.InvocationHandler;
import android.os.IBinder;
import msd.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.android.kwai.platform.notification.core.HookNotificationBinderHandler$stub$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.android.kwai.platform.notification.core.HookNotificationBinderHandler$iInterface$2;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import com.android.kwai.platform.notification.core.HookNotificationBinderInvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.StringBuilder;
import java.lang.Throwable;
import v7.a;
import kotlin.Pair;
import qrd.r0;

public final class HookNotificationBinderHandler implements InvocationHandler	// class@0003ff
{
    public final p b;
    public final p c;
    public final IBinder d;
    public final q e;

    public void HookNotificationBinderHandler(IBinder p0,q p1){
       a.p(p0, "base");
       a.p(p1, "mMethodAround");
       super();
       this.d = p0;
       this.e = p1;
       this.b = s.c(HookNotificationBinderHandler$stub$2.INSTANCE);
       this.c = s.c(HookNotificationBinderHandler$iInterface$2.INSTANCE);
    }
    public final Class a(){
       return this.c.getValue();
    }
    public final Class b(){
       return this.b.getValue();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       int i1;
       a.p(p1, "method");
       int i = 1;
       try{
          i1 = 0;
          if (a.g(p1.getName(), "queryLocalInterface")) {
             Class[] uClassArray = new Class[i];
             uClassArray[i1] = this.a();
             Class uClass = this.b();
             a.o(uClass, "stub");
             return Proxy.newProxyInstance(this.d.getClass().getClassLoader(), uClassArray, new HookNotificationBinderInvocationHandler(this.d, uClass, this.e));
          }else {
             HookNotificationBinderHandler td = this.d;
             if (p2 == null) {
                p2 = new Object[i1];
             }
             return p1.invoke(td, Arrays.copyOf(p2, p2.length));
          }
       }catch(java.lang.Exception e9){
          AzerothCodeAdapter.b.logE("KwaiNotificationHook", "HookNotificationBinderHandler has some wrong!. method name is "+p1.getName(), e9);
          i = new Pair[i];
          i[i1] = r0.a("methodName", p1.getName());
          a.c.a("logger_hook_notification_manager_error", "HookNotificationBinderHandler has some wrong! ", i, e9);
          return null;
       }
    }
}
