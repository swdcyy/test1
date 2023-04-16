package asd.e$a;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.l;
import java.lang.Object;
import kotlin.Result;

public final class e$a implements c	// class@000232
{
    public final CoroutineContext b;
    public final l c;

    public void e$a(CoroutineContext p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public CoroutineContext getContext(){
       return this.b;
    }
    public void resumeWith(Object p0){
       this.c.invoke(Result.box-impl(p0));
    }
}
