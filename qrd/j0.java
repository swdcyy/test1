package qrd.j0;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.Result$Failure;
import msd.l;
import kotlin.Result;
import msd.a;

public final class j0	// class@0022ce
{

    public static final Object a(Throwable p0){
       a.p(p0, "exception");
       return new Result$Failure(p0);
    }
    public static final Object b(Object p0,l p1,l p2){
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       p0 = (throwable == null)? p1.invoke(p0): p2.invoke(throwable);
       return p0;
    }
    public static final Object c(Object p0,Object p1){
       if (Result.isFailure-impl(p0)) {
          return p1;
       }
       return p0;
    }
    public static final Object d(Object p0,l p1){
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable == null) {
       }else {
          p0 = p1.invoke(throwable);
       }
       return p0;
    }
    public static final Object e(Object p0){
       j0.n(p0);
       return p0;
    }
    public static final Object f(Object p0,l p1){
       p0 = (Result.isSuccess-impl(p0))? Result.constructor-impl(p1.invoke(p0)): Result.constructor-impl(p0);
       return p0;
    }
    public static final Object g(Object p0,l p1){
       p0 = (Result.isSuccess-impl(p0))? Result.constructor-impl(p1.invoke(p0)): Result.constructor-impl(p0);
    label_0021 :
       return p0;
    }
    public static final Object h(Object p0,l p1){
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          p1.invoke(throwable);
       }
       return p0;
    }
    public static final Object i(Object p0,l p1){
       if (Result.isSuccess-impl(p0)) {
          p1.invoke(p0);
       }
       return p0;
    }
    public static final Object j(Object p0,l p1){
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable == null) {
       }else {
          p0 = Result.constructor-impl(p1.invoke(throwable));
       }
       return p0;
    }
    public static final Object k(Object p0,l p1){
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable == null) {
       }else {
          p0 = Result.constructor-impl(p1.invoke(throwable));
       }
       return p0;
    }
    public static final Object l(Object p0,l p1){
       p0 = Result.constructor-impl(p1.invoke(p0));
       return p0;
    }
    public static final Object m(a p0){
       p0 = Result.constructor-impl(p0.invoke());
       return p0;
    }
    public static final void n(Object p0){
       if (!p0 instanceof Result$Failure) {
          return;
       }
       throw p0.exception;
    }
}
