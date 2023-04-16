package or1.a;
import n91.f;
import msd.a;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class a implements f	// class@00355e
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public final long s(){
       Object obj = this.b.invoke();
       a.o(obj, "invoke\(...\)");
       return obj.longValue();
    }
}
