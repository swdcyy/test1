package ic9.f;
import erd.o;
import ic9.a;
import ic9.b;
import java.lang.Object;
import java.lang.Throwable;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class f implements o	// class@002674
{
    public final a b;
    public final b c;

    public void f(a p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       a.D().z("CompoundProcessor", "child check error. source:"+tb.b(), p0);
       tb.f(a.i);
       return this.c;
    }
}
