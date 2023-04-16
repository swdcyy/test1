package com.android.kwai.platform.notification.core.HookNotificationBinderInvocationHandler;
import java.lang.reflect.InvocationHandler;
import android.os.IBinder;
import java.lang.Class;
import msd.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.reflect.Method;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.Throwable;
import v7.a;
import kotlin.Pair;
import java.lang.Comparable;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Long;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import kotlin.Result;
import com.android.kwai.platform.notification.core.HookNotificationBinderInvocationHandler$invoke$$inlined$runCatching$lambda$1;
import qrd.j0;
import java.lang.StringBuilder;
import qrd.r0;
import java.util.Arrays;

public final class HookNotificationBinderInvocationHandler implements InvocationHandler	// class@000401
{
    public Object b;
    public final q c;

    public void HookNotificationBinderInvocationHandler(IBinder p0,Class p1,q p2){
       a.p(p0, "base");
       a.p(p1, "stub");
       a.p(p2, "mMethodAround");
       super();
       try{
          this.c = p2;
          Class[] uClassArray = new Class[]{IBinder.class};
          Object[] objArray = new Object[]{p0};
          p0 = p1.getDeclaredMethod("asInterface", uClassArray).invoke(null, objArray);
          a.o(p0, "asInterfaceMethod.invoke\(null, base\)");
          this.b = p0;
       }catch(java.lang.Exception e8){
          Throwable throwable = e8;
          AzerothCodeAdapter.b.logE("KwaiNotificationHook", "NotificationManager hooked failed, get original manager service has something wrong", throwable);
          a.b(a.c, "logger_fetch_origin_notification_manager_error", "NotificationManager hooked failed, get original manager service has something wrong", null, throwable, 4, null);
       }
       return;
    }
    public static final Object a(HookNotificationBinderInvocationHandler p0){
       p0 = p0.b;
       if (p0 == null) {
          a.S("mRawManager");
       }
       return p0;
    }
    public final Comparable b(Method p0){
       Integer integer;
       a.p(p0, "method");
       Class returnType = p0.getReturnType();
       a.o(returnType, "returnType");
       if (returnType.isPrimitive()) {
          if (a.g(returnType, Integer.TYPE) || (a.g(returnType, Short.TYPE) || (a.g(returnType, Long.TYPE) || a.g(returnType, Byte.TYPE)))) {
             integer = Integer.valueOf(-1);
          }else if(a.g(returnType, Character.TYPE)){
             integer = Character.valueOf(' ');
          }else if(a.g(returnType, Double.TYPE) || a.g(returnType, Float.TYPE)){
             integer = Float.valueOf(0);
          }else {
             integer = Boolean.FALSE;
          }
       }else if(returnType.equals(String.class)){
          integer = "";
       }else {
          integer = null;
       }
       return integer;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       a.p(p1, "method");
       if (this.b == null) {
          return null;
       }
       p0 = Result.constructor-impl(this.c.invoke(p1, p2, new HookNotificationBinderInvocationHandler$invoke$$inlined$runCatching$lambda$1(this, p1, p2)));
       try{
          Throwable throwable = Result.exceptionOrNull-impl(p0);
          if (throwable != null) {
             AzerothCodeAdapter.b.logE("KwaiNotificationHook", "NotificationManager invoke method around failed. method name is  "+p1.getName(), throwable);
             p0 = a.c;
             Pair[] pairArray = new Pair[]{r0.a("methodName", p1.getName())};
             p0.a("logger_call_notification_manager_error", "NotificationManager invoke method around failed.", pairArray, throwable);
             p0 = this.b;
             if (p0 == null) {
                a.S("mRawManager");
             }
             if (p2 == null) {
                p2 = new Object[0];
             }
             p0 = p1.invoke(p0, Arrays.copyOf(p2, p2.length));
          }
       }catch(java.lang.Exception e9){
          AzerothCodeAdapter.b.logE("KwaiNotificationHook", "NotificationManager invoke method for backup is failure. method name is "+p1.getName(), e9);
          Pair[] pairArray1 = new Pair[]{r0.a("methodName", p1.getName())};
          a.c.a("logger_call_notification_manager_error", "NotificationManager invoke method for backup is failure.", pairArray1, e9);
          p0 = this.b(p1);
       }
       return p0;
    }
}
