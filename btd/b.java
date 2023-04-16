package btd.b;
import btd.p;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import btd.o;
import btd.b$a;
import btd.d;
import btd.d$a;
import nsd.u;

public abstract class b implements p	// class@0002e1
{
    public final TimeUnit b;

    public void b(TimeUnit p0){
       a.p(p0, "unit");
       super();
       this.b = p0;
    }
    public o a(){
       b$a uoa = new b$a(this.c(), this, d.e.c(), null);
       return v7;
    }
    public final TimeUnit b(){
       return this.b;
    }
    public abstract long c();
}
