package androidx.lifecycle.CloseableCoroutineScope;
import java.io.Closeable;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ftd.c2;

public final class CloseableCoroutineScope implements Closeable, k0	// class@0007ba
{
    public final CoroutineContext coroutineContext;

    public void CloseableCoroutineScope(CoroutineContext p0){
       a.q(p0, "context");
       super();
       this.coroutineContext = p0;
    }
    public void close(){
       c2.g(this.getCoroutineContext());
    }
    public CoroutineContext getCoroutineContext(){
       return this.coroutineContext;
    }
}
