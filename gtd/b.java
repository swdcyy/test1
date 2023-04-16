package gtd.b;
import kotlin.Result;
import kotlinx.coroutines.android.HandlerContext;
import android.os.Looper;
import android.os.Handler;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import qrd.j0;
import gtd.a;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.reflect.Method;
import kotlin.TypeCastException;
import android.os.Handler$Callback;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import asd.c;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import android.view.Choreographer;
import ftd.k;
import csd.b;
import dsd.e;
import ftd.j2;
import ftd.z0;
import kotlin.coroutines.EmptyCoroutineContext;
import gtd.b$a;
import kotlin.coroutines.CoroutineContext;
import java.lang.Runnable;
import kotlinx.coroutines.CoroutineDispatcher;
import gtd.b$b;
import android.view.Choreographer$FrameCallback;
import kotlin.jvm.internal.a;

public final class b	// class@00170d
{
    public static final a a;
    public static Choreographer choreographer;

    static {
       a uoa = Result.constructor-impl(new HandlerContext(b.b(Looper.getMainLooper(), true), "Main"));
       if (Result.isFailure-impl(uoa)) {
          uoa = null;
       }
       b.a = uoa;
    }
    public static void a(){
    }
    public static final Handler b(Looper p0,boolean p1){
       Class[] uClassArray;
       Object[] objArray;
       if (!p1) {
          return new Handler(p0);
       }
       if (Build$VERSION.SDK_INT >= 28) {
          uClassArray = new Class[]{Looper.class};
          objArray = new Object[]{p0};
          p0 = Handler.class.getDeclaredMethod("createAsync", uClassArray).invoke(null, objArray);
          if (p0 != null) {
             return p0;
          }
          throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
       }else {
          try{
             uClassArray = new Class[]{Looper.class,Handler$Callback.class,Boolean.TYPE};
             objArray = new Object[]{p0,null,Boolean.TRUE};
             return Handler.class.getDeclaredConstructor(uClassArray).newInstance(objArray);
          }catch(java.lang.NoSuchMethodException e0){
             return new Handler(p0);
          }
       }
    }
    public static final Object c(c p0){
       l obj;
       Choreographer choreographe = b.choreographer;
       int i = 1;
       if (choreographe != null) {
          l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p0), i);
          ol.u();
          b.g(choreographe, ol);
          obj = ol.r();
          if (obj == b.h()) {
             e.c(p0);
          }
          return obj;
       }else {
          obj = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p0), i);
          obj.u();
          z0.g().u(EmptyCoroutineContext.INSTANCE, new b$a(obj));
          Object obj1 = obj.r();
          if (obj1 == b.h()) {
             e.c(p0);
          }
          return obj1;
       }
    }
    public static final a d(Handler p0){
       return b.f(p0, null, 1, null);
    }
    public static final a e(Handler p0,String p1){
       return new HandlerContext(p0, p1);
    }
    public static a f(Handler p0,String p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       return b.e(p0, p1);
    }
    public static final void g(Choreographer p0,k p1){
       p0.postFrameCallback(new b$b(p1));
    }
    public static final void h(k p0){
       Choreographer choreographe = b.choreographer;
       if (choreographe != null) {
       }else {
          choreographe = Choreographer.getInstance();
          if (choreographe == null) {
             a.L();
          }
          b.choreographer = choreographe;
       }
       b.g(choreographe, p0);
       return;
    }
}
