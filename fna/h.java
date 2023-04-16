package fna.h;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class h implements g	// class@00297d
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
