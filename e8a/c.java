package e8a.c;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c implements g	// class@00209c
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
