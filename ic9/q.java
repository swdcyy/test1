package ic9.q;
import erd.g;
import ic9.a;
import java.lang.Object;
import java.lang.Throwable;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class q implements g	// class@00267f
{
    public final a b;

    public void q(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a.D().z("CompoundProcessor", "child apply error. source:"+this.b.b(), p0);
    }
}
