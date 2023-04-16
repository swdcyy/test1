package kotlinx.coroutines.android.AndroidExceptionPreHandler;
import kotlinx.coroutines.CoroutineExceptionHandler;
import asd.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import java.lang.Thread;
import android.os.Build$VERSION;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Modifier;

public final class AndroidExceptionPreHandler extends a implements CoroutineExceptionHandler	// class@001930
{
    public Object _preHandler;

    public void AndroidExceptionPreHandler(){
       super(CoroutineExceptionHandler.u0);
       this._preHandler = this;
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       Object obj1;
       Thread thread = Thread.currentThread();
       if (Build$VERSION.SDK_INT >= 28) {
          thread.getUncaughtExceptionHandler().uncaughtException(thread, p1);
       }else {
          Method method = this.preHandler();
          Object obj = null;
          if (method != null) {
             Object[] objArray = new Object[0];
             obj1 = method.invoke(obj, objArray);
          }else {
             obj1 = obj;
          }
          if (obj1 instanceof Thread$UncaughtExceptionHandler) {
             obj = obj1;
          }
          if (obj != null) {
             obj.uncaughtException(thread, p1);
          }
       }
       return;
    }
    public final Method preHandler(){
       AndroidExceptionPreHandler t_preHandler = this._preHandler;
       if (t_preHandler != this) {
          return t_preHandler;
       }
       Method method = null;
       int i = 0;
       Class[] uClassArray = new Class[i];
       Method declaredMeth = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", uClassArray);
       if (Modifier.isPublic(declaredMeth.getModifiers()) && Modifier.isStatic(declaredMeth.getModifiers())) {
          i = 1;
       }
       if (i) {
          method = declaredMeth;
       }
       this._preHandler = method;
       return method;
    }
}
