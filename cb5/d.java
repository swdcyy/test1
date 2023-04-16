package cb5.d;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class d implements g	// class@000447
{
    public final l b;

    public void d(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
