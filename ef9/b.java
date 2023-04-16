package ef9.b;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b implements Runnable	// class@002133
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void run(){
       a.o(this.b.invoke(), "invoke\(...\)");
    }
}
