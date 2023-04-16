package asd.e;
import kotlin.coroutines.CoroutineContext;
import msd.l;
import asd.c;
import asd.e$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import csd.b;
import msd.p;
import kotlin.NotImplementedError;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import qrd.l1;
import nsd.c0;
import dsd.e;

public final class e	// class@000233
{

    public static final c a(CoroutineContext p0,l p1){
       return new e$a(p0, p1);
    }
    public static final c b(l p0,c p1){
       a.p(p0, "$this$createCoroutine");
       a.p(p1, "completion");
       return new h(IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(p0, p1)), b.h());
    }
    public static final c c(p p0,Object p1,c p2){
       a.p(p0, "$this$createCoroutine");
       a.p(p2, "completion");
       return new h(IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.c(p0, p1, p2)), b.h());
    }
    public static final CoroutineContext d(){
       throw new NotImplementedError("Implemented as intrinsic");
    }
    public static void e(){
    }
    public static final void f(c p0,Object p1){
       p0.resumeWith(Result.constructor-impl(p1));
    }
    public static final void g(c p0,Throwable p1){
       p0.resumeWith(Result.constructor-impl(j0.a(p1)));
    }
    public static final void h(l p0,c p1){
       a.p(p0, "$this$startCoroutine");
       a.p(p1, "completion");
       IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(p0, p1)).resumeWith(Result.constructor-impl(l1.a));
    }
    public static final void i(p p0,Object p1,c p2){
       a.p(p0, "$this$startCoroutine");
       a.p(p2, "completion");
       IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.c(p0, p1, p2)).resumeWith(Result.constructor-impl(l1.a));
    }
    public static final Object j(l p0,c p1){
       c0.e(0);
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p1));
       p0.invoke(oh);
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p1);
       }
       c0.e(1);
       return p0;
    }
}
