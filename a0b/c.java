package a0b.c;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c implements Runnable	// class@000008
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void run(){
       a.o(this.b.invoke(), "invoke\(...\)");
    }
}
