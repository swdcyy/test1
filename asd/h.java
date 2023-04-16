package asd.h;
import asd.c;
import dsd.c;
import asd.h$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import csd.b;
import kotlin.Result$Failure;
import kotlin.coroutines.CoroutineContext;
import java.lang.StackTraceElement;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class h implements c, c	// class@000237
{
    public final c b;
    public Object result;
    public static final AtomicReferenceFieldUpdater c;
    public static final h$a d;

    static {
       h.d = new h$a(null);
       h.c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");
    }
    public void h(c p0){
       a.p(p0, "delegate");
       super(p0, CoroutineSingletons.UNDECIDED);
    }
    public void h(c p0,Object p1){
       a.p(p0, "delegate");
       super();
       this.b = p0;
       this.result = p1;
    }
    public final Object b(){
       h tresult = this.result;
       CoroutineSingletons uNDECIDED = CoroutineSingletons.UNDECIDED;
       if (tresult == uNDECIDED) {
          if (h.c.compareAndSet(this, uNDECIDED, b.h())) {
             return b.h();
          }else {
             tresult = this.result;
          }
       }
       if (tresult == CoroutineSingletons.RESUMED) {
          tresult = b.h();
       }else if(!tresult instanceof Result$Failure){
          throw tresult.exception;
       }
       return tresult;
    }
    public c getCallerFrame(){
       h tb = this.b;
       if (!tb instanceof c) {
          tb = null;
       }
       return tb;
    }
    public CoroutineContext getContext(){
       return this.b.getContext();
    }
    public StackTraceElement getStackTraceElement(){
       return null;
    }
    public void resumeWith(Object p0){
       while (true) {
          h tresult = this.result;
          CoroutineSingletons uNDECIDED = CoroutineSingletons.UNDECIDED;
          if (tresult == uNDECIDED) {
             if (h.c.compareAndSet(this, uNDECIDED, p0)) {
                return;
             }
             continue ;
          }else if(tresult == b.h()){
             if (h.c.compareAndSet(this, b.h(), CoroutineSingletons.RESUMED)) {
                this.b.resumeWith(p0);
                return;
             }
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Already resumed");
    }
    public String toString(){
       return "SafeContinuation for "+this.b;
    }
}
