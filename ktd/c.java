package ktd.c;
import kotlin.coroutines.CoroutineContext$a;
import ktd.c$a;
import nsd.u;
import java.lang.Throwable;
import java.lang.Object;
import msd.p;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;

public final class c implements CoroutineContext$a	// class@001bd9
{
    public final CoroutineContext$b b;
    public final Throwable c;
    public static final c$a d;

    static {
       c.d = new c$a(null);
    }
    public void c(Throwable p0){
       super();
       this.c = p0;
       this.b = c.d;
    }
    public Object fold(Object p0,p p1){
       return CoroutineContext$a$a.a(this, p0, p1);
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       return CoroutineContext$a$a.b(this, p0);
    }
    public CoroutineContext$b getKey(){
       return this.b;
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       return CoroutineContext$a$a.c(this, p0);
    }
    public CoroutineContext plus(CoroutineContext p0){
       return CoroutineContext$a$a.d(this, p0);
    }
}
