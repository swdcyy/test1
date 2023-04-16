package ltd.d0;
import kotlin.Result;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import qrd.j0;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import qrd.r0;
import java.util.ArrayDeque;
import java.util.Collection;
import kotlin.TypeCastException;
import java.util.Iterator;
import java.lang.Iterable;
import dsd.c;
import zsd.u;
import asd.c;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt;

public final class d0	// class@001cc4
{
    public static final String a;
    public static final String b;

    static {
       String str = Result.constructor-impl(Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
       if (Result.exceptionOrNull-impl(str) != null) {
          str = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
       }
       d0.a = str;
       str = Result.constructor-impl(d0.class.getCanonicalName());
       if (Result.exceptionOrNull-impl(str) != null) {
          str = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
       }
       d0.b = str;
    }
    public static void a(){
    }
    public static void b(){
    }
    public static final StackTraceElement c(String p0){
       return new StackTraceElement("\b\b\b\("+p0, "\b", "\b", -1);
    }
    public static final Pair d(Throwable p0){
       Pair pair;
       StackTraceElement[] stackTraceEl;
       Throwable cause = p0.getCause();
       if (cause != null && a.g(cause.getClass(), p0.getClass())) {
          StackTraceElement[] stackTrace = p0.getStackTrace();
          int len = stackTrace.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (d0.j(stackTrace[i])) {
                   len = 1;
                label_002b :
                   if (len) {
                      pair = r0.a(cause, stackTrace);
                      break ;
                   }else {
                      stackTraceEl = new StackTraceElement[0];
                      pair = r0.a(p0, stackTraceEl);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                len = 0;
                goto label_002b ;
             }
          }
       }else {
          stackTraceEl = new StackTraceElement[0];
          pair = r0.a(p0, stackTraceEl);
       }
       return pair;
    }
    public static final Throwable e(Throwable p0,Throwable p1,ArrayDeque p2){
       p2.addFirst(d0.c("Coroutine boundary"));
       StackTraceElement[] stackTrace = p0.getStackTrace();
       int i = d0.h(stackTrace, d0.a);
       int i1 = 0;
       if (i == -1) {
          stackTrace = new StackTraceElement[i1];
          Object[] objArray = p2.toArray(stackTrace);
          if (objArray == null) {
             throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
          }
          p1.setStackTrace(objArray);
          return p1;
       }else {
          StackTraceElement[] stackTraceEl = new StackTraceElement[(p2.size() + i)];
          for (int i2 = 0; i2 < i; i2 = i2 + 1) {
             stackTraceEl[i2] = stackTrace[i2];
          }
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             i2 = i + i1;
             stackTraceEl[i2] = iterator.next();
             i1 = i1 + 1;
          }
          p1.setStackTrace(stackTraceEl);
          return p1;
       }
    }
    public static final ArrayDeque f(c p0){
       ArrayDeque uArrayDeque = new ArrayDeque();
       StackTraceElement stackTraceEl = p0.getStackTraceElement();
       if (stackTraceEl != null) {
          uArrayDeque.add(stackTraceEl);
       }
       p0 = p0.getCallerFrame();
       while (p0 != null) {
          stackTraceEl = p0.getStackTraceElement();
          if (stackTraceEl != null) {
             uArrayDeque.add(stackTraceEl);
          }
       }
       return uArrayDeque;
    }
    public static final boolean g(StackTraceElement p0,StackTraceElement p1){
       boolean b = (p0.getLineNumber() == p1.getLineNumber() && (a.g(p0.getMethodName(), p1.getMethodName()) && (a.g(p0.getFileName(), p1.getFileName()) && a.g(p0.getClassName(), p1.getClassName()))))? true: false;
       return b;
    }
    public static final int h(StackTraceElement[] p0,String p1){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (a.g(p1, p0[i].getClassName())) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public static final void i(Throwable p0,Throwable p1){
       p0.initCause(p1);
    }
    public static final boolean j(StackTraceElement p0){
       return u.q2(p0.getClassName(), "\b\b\b", false, 2, null);
    }
    public static final void k(StackTraceElement[] p0,ArrayDeque p1){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (d0.j(p0[i])) {
             label_0011 :
                i = i + 1;
                len = p0.length - 1;
                if (len >= i) {
                   while (d0.g(p0[len], p1.getLast())) {
                      p1.removeLast();
                      len = len - 1;
                   }
                   p1.addFirst(p0[len]);
                   if (len != i) {
                      goto label_0030 ;
                   }
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_0011 ;
          }
       }
       return;
    }
    public static final Object l(Throwable p0,c p1){
       throw p0;
    }
    public static final Object m(Throwable p0,c p1){
       throw p0;
    }
    public static final Throwable n(Throwable p0,c p1){
       Pair pair = d0.d(p0);
       Throwable throwable = pair.component1();
       StackTraceElement[] stackTraceEl = pair.component2();
       Throwable throwable1 = ExceptionsConstuctorKt.f(throwable);
       if (throwable1 != null) {
          if (a.g(throwable1.getMessage(), throwable.getMessage()) ^ 0x01) {
             return p0;
          }else {
             ArrayDeque uArrayDeque = d0.f(p1);
             if (uArrayDeque.isEmpty()) {
                return p0;
             }else if(throwable != p0){
                d0.k(stackTraceEl, uArrayDeque);
             }
             p0 = d0.e(throwable, throwable1, uArrayDeque);
          }
       }
       return p0;
    }
    public static final Throwable o(Throwable p0){
       return p0;
    }
    public static final Throwable p(Throwable p0,c p1){
       return p0;
    }
    public static final Throwable q(Throwable p0){
       StackTraceElement stackTraceEl1;
       StackTraceElement[] stackTrace = p0.getStackTrace();
       int len = stackTrace.length;
       int i = d0.h(stackTrace, d0.b);
       int i1 = i + 1;
       int i2 = d0.h(stackTrace, d0.a);
       int i3 = 0;
       i2 = (i2 == -1)? 0: len - i2;
       len = (len - i) - i2;
       StackTraceElement[] stackTraceEl = new StackTraceElement[len];
       for (; i3 < len; i3 = i3 + 1) {
          if (!i3) {
             stackTraceEl1 = d0.c("Coroutine boundary");
          }else {
             i2 = i1 + i3;
             i2 = i2 - 1;
             stackTraceEl1 = stackTrace[i2];
          }
          stackTraceEl[i3] = stackTraceEl1;
       }
       p0.setStackTrace(stackTraceEl);
       return p0;
    }
    public static final Throwable r(Throwable p0){
       return p0;
    }
    public static final Throwable s(Throwable p0){
       Throwable cause = p0.getCause();
       if (cause != null) {
          int i = 1;
          if (!(a.g(cause.getClass(), p0.getClass()) ^ i)) {
             StackTraceElement[] stackTrace = p0.getStackTrace();
             int len = stackTrace.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (d0.j(stackTrace[i1])) {
                   label_002d :
                      if (i) {
                         return cause;
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i = 0;
                   goto label_002d ;
                }
             }
          }
       }
       return p0;
    }
}
