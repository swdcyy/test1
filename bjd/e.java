package bjd.e;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class e implements Runnable	// class@00026e
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void run(){
       a.h(this.b.invoke(), "invoke\(...\)");
    }
}
