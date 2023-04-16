package btd.a;
import btd.p;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import btd.o;
import btd.a$a;
import btd.d;
import btd.d$a;
import nsd.u;

public abstract class a implements p	// class@0002df
{
    public final TimeUnit b;

    public void a(TimeUnit p0){
       a.p(p0, "unit");
       super();
       this.b = p0;
    }
    public o a(){
       a$a uoa = new a$a(this.c(), this, d.e.c(), null);
       return v7;
    }
    public final TimeUnit b(){
       return this.b;
    }
    public abstract double c();
}
