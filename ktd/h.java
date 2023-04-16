package ktd.h;
import asd.c;
import kotlin.coroutines.EmptyCoroutineContext;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;

public final class h implements c	// class@001bdf
{
    public static final CoroutineContext b;
    public static final h c;

    static {
       h.c = new h();
       h.b = EmptyCoroutineContext.INSTANCE;
    }
    public void h(){
       super();
    }
    public CoroutineContext getContext(){
       return h.b;
    }
    public void resumeWith(Object p0){
    }
}
