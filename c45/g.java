package c45.g;
import java.lang.String;
import com.kwai.android.longinus.o;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.android.longinus.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import com.kwai.android.longinus.n;
import com.kwai.android.longinus.m;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import msd.p;
import msd.q;

public final class g	// class@00041f
{
    public static final g a;
    public static final p b;
    public static final p c;
    public static final Method d;
    public static final Method e;
    public static final p f;
    public static final q g;

    static {
       Method method1;
       String str = String.class;
       g.a = new g();
       g.b = s.c(o.a);
       p op = s.c(l.a);
       g.c = op;
       Class value = op.getValue();
       Method method = null;
       if (value == null) {
          method1 = method;
       }else {
          Class[] uClassArray1 = new Class[]{str,str};
          method1 = value.getDeclaredMethod("i", uClassArray1);
       }
       g.d = method1;
       Class value1 = op.getValue();
       if (value1 != null) {
          Class[] uClassArray = new Class[]{str,str,Throwable.class};
          method = value1.getDeclaredMethod("e", uClassArray);
       }
       g.e = method;
       g.f = n.a;
       g.g = m.a;
    }
    public void g(){
       super();
    }
    public static final void a(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
       if (g.b.getValue().booleanValue()) {
          g.f.invoke(p0, p1);
       }
       return;
    }
    public static final void b(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "msg");
       if (g.b.getValue().booleanValue()) {
          g.g.invoke(p0, p1, p2);
       }
       return;
    }
}
