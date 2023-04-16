package ftd.w0;
import ntd.i;
import java.lang.Object;
import java.lang.Throwable;
import asd.c;
import ftd.x;
import qrd.i;
import kotlinx.coroutines.CoroutinesInternalError;
import java.lang.StringBuilder;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext;
import ftd.h0;
import ftd.t0;
import kotlinx.coroutines.internal.ThreadContextKt;
import ftd.x0;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import qrd.j0;
import qrd.l1;
import ntd.j;
import kotlin.TypeCastException;

public abstract class w0 extends i	// class@001682
{
    public int d;

    public void w0(int p0){
       super();
       this.d = p0;
    }
    public void d(Object p0,Throwable p1){
    }
    public abstract c e();
    public final Throwable f(Object p0){
       x ox = null;
       if (!p0 instanceof x) {
          p0 = ox;
       }
       if (p0 != null) {
          ox = p0.a;
       }
       return ox;
    }
    public Object g(Object p0){
       return p0;
    }
    public final void h(Throwable p0,Throwable p1){
       if (p0 == null && p1 == null) {
          return;
       }
       if (p0 != null && p1 != null) {
          i.a(p0, p1);
       }
       if (p0 == null) {
          p0 = p1;
       }
       String str = "Fatal exception in coroutines machinery for "+this+". "+"Please read KDoc to \'handleFatalException\' method and report this incident to maintainers";
       if (p0 == null) {
          a.L();
       }
       h0.b(this.e().getContext(), new CoroutinesInternalError(str, p0));
       return;
    }
    public abstract Object i();
    public final void run(){
       i tc = this.c;
       c uoc = this.e();
       if (uoc == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
       }
       t0 i = uoc.i;
       CoroutineContext context = i.getContext();
       Object obj = this.i();
       Object obj1 = ThreadContextKt.c(context, uoc.g);
       Throwable throwable = this.f(obj);
       z1 oz1 = (x0.e(this.d))? context.get(z1.p0): null;
       if (throwable == null && (oz1 != null && !oz1.E())) {
          CancellationException uCancellatio = oz1.O();
          this.d(obj, uCancellatio);
          i.resumeWith(Result.constructor-impl(j0.a(uCancellatio)));
       }else if(throwable != null){
          i.resumeWith(Result.constructor-impl(j0.a(throwable)));
       }else {
          i.resumeWith(Result.constructor-impl(this.g(obj)));
       }
       ThreadContextKt.a(context, obj1);
       tc.f();
       Object obj2 = Result.constructor-impl(l1.a);
       this.h(null, Result.exceptionOrNull-impl(obj2));
       return;
    }
}
