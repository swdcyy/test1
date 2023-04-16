package ftd.u2;
import java.lang.Runnable;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.k;
import java.lang.Object;
import qrd.l1;

public final class u2 implements Runnable	// class@000ecf
{
    public final CoroutineDispatcher b;
    public final k c;

    public void u2(CoroutineDispatcher p0,k p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       this.c.N(this.b, l1.a);
    }
}
