package dl.b;
import bl.o;
import dl.a;
import dl.c;
import java.lang.Object;
import java.lang.reflect.AccessibleObject;

public abstract class b	// class@0014c3
{
    public static final b a;

    static {
       a uoa = (o.a < 9)? new a(): new c();
       b.a = uoa;
    }
    public void b(){
       super();
    }
    public static b a(){
       return b.a;
    }
    public abstract void b(AccessibleObject p0);
}
