package ic9.e;
import erd.o;
import ic9.a;
import ic9.b;
import java.lang.Object;
import java.lang.Throwable;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class e implements o	// class@002673
{
    public final a b;
    public final b c;

    public void e(a p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       e tb = this.b;
       a.D().z("CompoundProcessor", "child obtain error. source:"+tb.b(), p0);
       tb.f(a.i);
       return this.c;
    }
}
