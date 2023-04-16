package ltd.j0;
import ftd.d3;
import java.lang.Object;
import java.lang.ThreadLocal;
import ltd.k0;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import ftd.d3$a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.a;
import kotlin.coroutines.EmptyCoroutineContext;
import java.lang.String;
import java.lang.StringBuilder;

public final class j0 implements d3	// class@001cce
{
    public final CoroutineContext$b b;
    public final Object c;
    public final ThreadLocal d;

    public void j0(Object p0,ThreadLocal p1){
       super();
       this.c = p0;
       this.d = p1;
       this.b = new k0(p1);
    }
    public Object V(CoroutineContext p0){
       this.d.set(this.c);
       return this.d.get();
    }
    public Object fold(Object p0,p p1){
       return d3$a.a(this, p0, p1);
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       CoroutineContext$a uoa = (a.g(this.getKey(), p0))? this: null;
       return uoa;
    }
    public CoroutineContext$b getKey(){
       return this.b;
    }
    public void i(CoroutineContext p0,Object p1){
       this.d.set(p1);
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       EmptyCoroutineContext iNSTANCE = (a.g(this.getKey(), p0))? EmptyCoroutineContext.INSTANCE: this;
       return iNSTANCE;
    }
    public CoroutineContext plus(CoroutineContext p0){
       return d3$a.d(this, p0);
    }
    public String toString(){
       return "ThreadLocal\(value="+this.c+", threadLocal = "+this.d+')';
    }
}
