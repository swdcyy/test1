package asd.a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.p;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext;

public abstract class a implements CoroutineContext$a	// class@000286
{
    public final CoroutineContext$b key;

    public void a(CoroutineContext$b p0){
       a.p(p0, "key");
       super();
       this.key = p0;
    }
    public Object fold(Object p0,p p1){
       a.p(p1, "operation");
       return CoroutineContext$a$a.a(this, p0, p1);
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       a.p(p0, "key");
       return CoroutineContext$a$a.b(this, p0);
    }
    public CoroutineContext$b getKey(){
       return this.key;
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       a.p(p0, "key");
       return CoroutineContext$a$a.c(this, p0);
    }
    public CoroutineContext plus(CoroutineContext p0){
       a.p(p0, "context");
       return CoroutineContext$a$a.d(this, p0);
    }
}
