package b5d.j;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class j implements Runnable	// class@0003ae
{
    public final a b;

    public void j(a p0){
       this.b = p0;
    }
    public final void run(){
       a.o(this.b.invoke(), "invoke\(...\)");
    }
}
