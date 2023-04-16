package kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext;
import java.io.Serializable;
import java.lang.Object;
import msd.p;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public final class EmptyCoroutineContext implements CoroutineContext, Serializable	// class@001c7c
{
    public static final EmptyCoroutineContext INSTANCE;
    public static final long serialVersionUID;

    static {
       EmptyCoroutineContext.INSTANCE = new EmptyCoroutineContext();
    }
    public void EmptyCoroutineContext(){
       super();
    }
    public Object fold(Object p0,p p1){
       a.p(p1, "operation");
       return p0;
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       a.p(p0, "key");
       return null;
    }
    public int hashCode(){
       return 0;
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       a.p(p0, "key");
       return this;
    }
    public CoroutineContext plus(CoroutineContext p0){
       a.p(p0, "context");
       return p0;
    }
    public final Object readResolve(){
       return EmptyCoroutineContext.INSTANCE;
    }
    public String toString(){
       return "EmptyCoroutineContext";
    }
}
