package ftd.t0;
import dsd.c;
import asd.c;
import ftd.w0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.u0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;
import java.lang.StackTraceElement;
import ftd.k;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import ftd.l;
import java.lang.Runnable;
import kotlin.jvm.internal.a;
import ftd.y;
import ftd.f3;
import ftd.g1;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import qrd.j0;
import qrd.l1;
import nsd.c0;
import ftd.o0;

public final class t0 extends w0 implements c, c	// class@001679
{
    public Object _reusableCancellableContinuation;
    public Object e;
    public final c f;
    public final Object g;
    public final CoroutineDispatcher h;
    public final c i;
    public static final AtomicReferenceFieldUpdater j;

    static {
       t0.j = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_reusableCancellableContinuation");
    }
    public void t0(CoroutineDispatcher p0,c p1){
       super(0);
       this.h = p0;
       this.i = p1;
       this.e = u0.a;
       if (!p1 instanceof c) {
          p1 = null;
       }
       this.f = p1;
       this.g = ThreadContextKt.b(this.getContext());
       this._reusableCancellableContinuation = null;
       return;
    }
    public static void j(){
    }
    public c e(){
       return this;
    }
    public c getCallerFrame(){
       return this.f;
    }
    public CoroutineContext getContext(){
       return this.i.getContext();
    }
    public StackTraceElement getStackTraceElement(){
       return null;
    }
    public Object i(){
       t0 te = this.e;
       this.e = u0.a;
       return te;
    }
    public final Throwable k(k p0){
       t0 t_reusableCa;
       while (true) {
          t_reusableCa = this._reusableCancellableContinuation;
          e0 b = u0.b;
          if (t_reusableCa == b) {
             if (t0.j.compareAndSet(this, b, p0)) {
                return null;
             }
             continue ;
          }else if(t_reusableCa == null){
             return null;
          }else if(t_reusableCa instanceof Throwable){
             if (t0.j.compareAndSet(this, t_reusableCa, null)) {
                return t_reusableCa;
             }
             throw new IllegalArgumentException("Failed requirement.".toString());
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Inconsistent state "+t_reusableCa.toString());
    }
    public final l l(){
       t0 t_reusableCa;
       while (true) {
          t_reusableCa = this._reusableCancellableContinuation;
          if (t_reusableCa == null) {
             this._reusableCancellableContinuation = u0.b;
             return null;
          }else if(t_reusableCa instanceof l){
             if (t0.j.compareAndSet(this, t_reusableCa, u0.b)) {
                return t_reusableCa;
             }
             continue ;
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Inconsistent state "+t_reusableCa.toString());
    }
    public final void m(CoroutineContext p0,Object p1){
       this.e = p1;
       this.d = 1;
       this.h.v(p0, this);
    }
    public final l n(){
       t0 t_reusableCa = this._reusableCancellableContinuation;
       if (!t_reusableCa instanceof l) {
          t_reusableCa = null;
       }
       return t_reusableCa;
    }
    public final boolean o(l p0){
       t0 t_reusableCa = this._reusableCancellableContinuation;
       boolean b = false;
       if (t_reusableCa == null) {
          return b;
       }
       if (!t_reusableCa instanceof l) {
          return true;
       }
       if (t_reusableCa == p0) {
          b = true;
       }
       return b;
    }
    public final boolean p(Throwable p0){
       while (true) {
          t0 t_reusableCa = this._reusableCancellableContinuation;
          e0 b = u0.b;
          if (a.g(t_reusableCa, b)) {
             if (t0.j.compareAndSet(this, b, p0)) {
                return true;
             }
             continue ;
          }else if(t_reusableCa instanceof Throwable){
             return true;
          }else if(t0.j.compareAndSet(this, t_reusableCa, null)){
             break ;
          }
       }
       return false;
    }
    public final void q(Object p0){
       CoroutineContext uCoroutineCo;
       z1 obj = y.b(p0);
       if (this.h.x(this.getContext())) {
          this.e = obj;
          this.d = 1;
          this.h.u(this.getContext(), this);
       }else {
          g1 og1 = f3.b.b();
          if (og1.j0()) {
             this.e = obj;
             this.d = 1;
             og1.b0(this);
          }else {
             og1.g0(1);
             obj = this.getContext().get(z1.p0);
             if (obj != null && !obj.E()) {
                this.resumeWith(Result.constructor-impl(j0.a(obj.O())));
                uCoroutineCo = 1;
             }else {
                uCoroutineCo = null;
             }
             if (!uCoroutineCo) {
                uCoroutineCo = this.getContext();
                this.i.resumeWith(p0);
                c0.d(1);
                ThreadContextKt.a(uCoroutineCo, ThreadContextKt.c(uCoroutineCo, this.g));
                c0.c(1);
             }
             do {
             } while (!og1.n0());
             c0.d(1);
             og1.A(1);
             c0.c(1);
          }
       }
       return;
    }
    public final boolean r(){
       z1 oz1 = this.getContext().get(z1.p0);
       if (oz1 == null || oz1.E()) {
          return false;
       }
       this.resumeWith(Result.constructor-impl(j0.a(oz1.O())));
       return true;
    }
    public void resumeWith(Object p0){
       CoroutineContext context = this.i.getContext();
       Object obj = y.b(p0);
       int i = 0;
       if (this.h.x(context)) {
          this.e = obj;
          this.d = i;
          this.h.u(context, this);
       }else {
          g1 og1 = f3.b.b();
          if (og1.j0()) {
             this.e = obj;
             this.d = i;
             og1.b0(this);
          }else {
             og1.g0(true);
             CoroutineContext context1 = this.getContext();
             this.i.resumeWith(p0);
             ThreadContextKt.a(context1, ThreadContextKt.c(context1, this.g));
             do {
             } while (!og1.n0());
             og1.A(true);
          }
       }
       return;
    }
    public final void s(Object p0){
       CoroutineContext context = this.getContext();
       this.i.resumeWith(p0);
       c0.d(1);
       ThreadContextKt.a(context, ThreadContextKt.c(context, this.g));
       c0.c(1);
    }
    public String toString(){
       return "DispatchedContinuation["+this.h+", "+o0.c(this.i)+']';
    }
}
