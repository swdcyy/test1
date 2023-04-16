package io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.ExceptionHelper$Termination;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.exceptions.CompositeException;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Error;

public final class ExceptionHelper	// class@0014cb
{
    public static final Throwable a;

    static {
       ExceptionHelper.a = new ExceptionHelper$Termination();
    }
    public static boolean a(AtomicReference p0,Throwable p1){
       boolean b;
       CompositeException uCompositeEx;
       while (true) {
          Throwable throwable = p0.get();
          if (throwable == ExceptionHelper.a) {
             return false;
          }
          b = true;
          if (throwable == null) {
             uCompositeEx = p1;
          }else {
             Throwable[] throwableArr = new Throwable[2];
             throwableArr[0] = throwable;
             throwableArr[b] = p1;
             uCompositeEx = new CompositeException(throwableArr);
          }
          if (p0.compareAndSet(throwable, uCompositeEx)) {
             break ;
          }
       }
       return b;
    }
    public static Throwable b(AtomicReference p0){
       Throwable throwable = p0.get();
       Throwable a = ExceptionHelper.a;
       if (throwable != a) {
          throwable = p0.getAndSet(a);
       }
       return throwable;
    }
    public static Exception c(Throwable p0){
       if (p0 instanceof Exception) {
          return p0;
       }
       throw p0;
    }
    public static RuntimeException d(Throwable p0){
       if (p0 instanceof Error) {
          throw p0;
       }
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
