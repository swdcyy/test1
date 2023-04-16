package io.reactivex.internal.operators.mixed.a;
import java.lang.Object;
import erd.o;
import brd.d;
import java.util.concurrent.Callable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.Throwable;
import drd.a;
import brd.y;
import brd.q;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import brd.e0;
import brd.d0;
import io.reactivex.internal.operators.single.SingleToObservable;

public final class a	// class@0012e0
{

    public static boolean a(Object p0,o p1,d p2){
       if (!p0 instanceof Callable) {
          return false;
       }
       e uoe = null;
       p0 = p0.call();
       if (p0 != null) {
          p0 = p1.apply(p0);
          a.c(p0, "The mapper returned a null CompletableSource");
          uoe = p0;
       }
       if (uoe == null) {
          EmptyDisposable.complete(p2);
       }else {
          uoe.a(p2);
       }
       return true;
    }
    public static boolean b(Object p0,o p1,y p2){
       if (!p0 instanceof Callable) {
          return false;
       }
       q oq = null;
       p0 = p0.call();
       if (p0 != null) {
          p0 = p1.apply(p0);
          a.c(p0, "The mapper returned a null MaybeSource");
          oq = p0;
       }
       if (oq == null) {
          EmptyDisposable.complete(p2);
       }else {
          oq.b(MaybeToObservable.b(p2));
       }
       return true;
    }
    public static boolean c(Object p0,o p1,y p2){
       if (!p0 instanceof Callable) {
          return false;
       }
       e0 uoe0 = null;
       p0 = p0.call();
       if (p0 != null) {
          p0 = p1.apply(p0);
          a.c(p0, "The mapper returned a null SingleSource");
          uoe0 = p0;
       }
       if (uoe0 == null) {
          EmptyDisposable.complete(p2);
       }else {
          uoe0.b(SingleToObservable.b(p2));
       }
       return true;
    }
}
