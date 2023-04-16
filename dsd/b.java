package dsd.b;
import asd.c;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import java.lang.IllegalStateException;
import java.lang.String;

public final class b implements c	// class@0014e7
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public CoroutineContext getContext(){
       throw new IllegalStateException("This continuation is already complete".toString());
    }
    public void resumeWith(Object p0){
       throw new IllegalStateException("This continuation is already complete".toString());
    }
    public String toString(){
       return "This continuation is already complete";
    }
}
