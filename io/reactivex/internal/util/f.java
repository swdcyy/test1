package io.reactivex.internal.util.f;
import java.lang.Class;
import io.reactivex.exceptions.ProtocolViolationException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ird.a;
import java.util.concurrent.atomic.AtomicReference;
import crd.b;
import java.lang.Object;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class f	// class@0014d8
{

    public static void a(Class p0){
       String name = p0.getName();
       StringBuilder str = "It is not allowed to subscribe with a\(n\) "+name+" multiple times. Please create a fresh instance of "+name;
       a.l(new ProtocolViolationException(str+" and subscribe that to the target source instead."));
    }
    public static boolean b(AtomicReference p0,b p1,Class p2){
       a.c(p1, "next is null");
       if (p0.compareAndSet(null, p1)) {
          return true;
       }
       p1.dispose();
       if (p0.get() != DisposableHelper.DISPOSED) {
          f.a(p2);
       }
       return false;
    }
}
