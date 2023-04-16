package wg7.b;
import java.lang.Object;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.ContextWrapper;
import java.util.Objects;
import com.kwai.performance.stability.hack.a;
import android.os.Handler;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Throwable;
import java.lang.RuntimeException;
import kotlin.TypeCastException;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.Exception;
import wg7.e;
import com.kwai.performance.stability.hack.b$c;
import android.os.Build$VERSION;
import com.kwai.performance.stability.hack.b;
import msd.l;

public final class b	// class@002756
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final Intent a(BroadcastReceiver p0,IntentFilter p1,Context p2){
       Intent intent;
       Object[] obj6;
       Object obj7;
       Object obj = p1;
       Context obj1 = p2;
       a.q(obj, "filter");
       a.q(obj1, "context");
       Objects.requireNonNull(b.a);
       try{
          String str = String.class;
          obj1 = obj1.getBaseContext();
          Object[] obj2 = a.c(obj1, "mPackageInfo");
          Object obj3 = a.c(obj1, "mMainThread");
          Object[] obj4 = a.c(obj1, "mOuterContext");
          Object[] objArray = new Object[0];
          Object obj5 = a.a(obj3, "getInstrumentation", objArray);
          int i = 4;
          int i1 = 5;
          if (p0 != null) {
             Object[] objArray1 = new Object[0];
             obj6 = a.a(obj3, "getHandler", objArray1);
             if (obj6 != null) {
                if (obj2 != null && obj4 != null) {
                   Object[] objArray2 = new Object[i1];
                   objArray2[0] = p0;
                   objArray2[1] = obj4;
                   objArray2[2] = obj6;
                   objArray2[3] = obj5;
                   objArray2[i] = Boolean.TRUE;
                   obj7 = a.a(obj2, "getReceiverDispatcher", objArray2);
                }else {
                   obj2 = new Object[i1];
                   obj2[0] = p0;
                   obj2[1] = obj4;
                   obj2[2] = obj6;
                   obj2[3] = null;
                   obj2[i] = Boolean.TRUE;
                   obj2 = a.e(obj2);
                   obj4 = new Object[0];
                   obj7 = a.a(Class.forName("android.app.LoadedApk$ReceiverDispatcher").getConstructor(a.d(obj2)).newInstance(a.e(obj2)), "getIIntentReceiver", obj4);
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
             }
          }else {
             obj7 = null;
          }
          Object[] objArray3 = new Object[0];
          obj6 = new Object[0];
          Class[] uClassArray = new Class[]{Class.forName("android.app.IApplicationThread"),str,Class.forName("android.content.IIntentReceiver"),IntentFilter.class,str,Integer.TYPE};
          obj2 = new Object[]{a.a(obj3, "getApplicationThread", obj6),obj1.getPackageName(),obj7,obj,null,Integer.valueOf(0)};
          a.h(obj1, "baseContext");
          obj = Class.forName("android.app.IActivityManager").getDeclaredMethod("registerReceiver", uClassArray).invoke(a.b(Class.forName("android.app.ActivityManagerNative"), "getDefault", a.d(objArray3)).invoke(null, a.e(objArray3)), obj2);
          if (obj != null) {
             intent = obj;
          }else {
             throw new TypeCastException("null cannot be cast to non-null type android.content.Intent");
          }
       }catch(java.lang.Exception e0){
          obj1 = 0;
          e0.printStackTrace();
          e.b.b().a("HuaweiRegisterReceiverHacker", e0);
          intent = obj1;
       }
       return intent;
    }
    public static final boolean b(){
       boolean b = false;
       if (Build$VERSION.SDK_INT == 22 && e.b.a().a().invoke("EMUI").booleanValue()) {
          b = true;
       }
       return b;
    }
}
