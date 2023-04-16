package kotlinx.coroutines.android.HandlerContext$b;
import java.lang.Runnable;
import kotlinx.coroutines.android.HandlerContext;
import ftd.k;
import java.lang.Object;
import qrd.l1;
import kotlinx.coroutines.CoroutineDispatcher;

public final class HandlerContext$b implements Runnable	// class@001932
{
    public final HandlerContext b;
    public final k c;

    public void HandlerContext$b(HandlerContext p0,k p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       this.c.N(this.b, l1.a);
    }
}
