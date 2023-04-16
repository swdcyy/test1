package ltd.b;
import java.lang.Object;
import ltd.d;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class b	// class@001cc1
{
    public d a;

    public void b(){
       super();
    }
    public abstract void a(d p0,Object p1);
    public final d b(){
       b ta = this.a;
       if (ta == null) {
          a.S("atomicOp");
       }
       return ta;
    }
    public abstract Object c(d p0);
    public final void d(d p0){
       this.a = p0;
    }
}
