package kotlinx.coroutines.CoroutineDispatcher;
import asd.d;
import asd.a;
import kotlinx.coroutines.CoroutineDispatcher$Key;
import nsd.u;
import kotlin.coroutines.CoroutineContext$b;
import asd.c;
import ftd.t0;
import ftd.l;
import kotlin.TypeCastException;
import java.lang.String;
import kotlin.coroutines.CoroutineContext$a;
import asd.d$a;
import kotlin.coroutines.CoroutineContext;
import java.lang.StringBuilder;
import java.lang.Object;
import ftd.o0;
import java.lang.Runnable;

public abstract class CoroutineDispatcher extends a implements d	// class@001ccf
{
    public static final CoroutineDispatcher$Key b;

    static {
       CoroutineDispatcher.b = new CoroutineDispatcher$Key(null);
    }
    public void CoroutineDispatcher(){
       super(d.b0);
    }
    public final c I(c p0){
       return new t0(this, p0);
    }
    public void U(c p0){
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<*>");
       }
       l ol = p0.n();
       if (ol != null) {
          ol.m();
       }
       return;
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       return d$a.b(this, p0);
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       return d$a.c(this, p0);
    }
    public String toString(){
       return o0.a(this)+'@'+o0.b(this);
    }
    public abstract void u(CoroutineContext p0,Runnable p1);
    public void v(CoroutineContext p0,Runnable p1){
       this.u(p0, p1);
    }
    public boolean x(CoroutineContext p0){
       return true;
    }
    public final CoroutineDispatcher y(CoroutineDispatcher p0){
       return p0;
    }
}
