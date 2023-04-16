package cr.h;
import java.lang.Object;
import cr.h$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cr.c$b;
import java.util.Map;
import com.kuaishou.android.vader.stat.ValueOrException;

public abstract class h	// class@001426
{

    public void h(){
       super();
    }
    public static h$a a(){
       Object obj = PatchProxy.apply(null, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$b();
    }
    public abstract Map b();
    public abstract Map c();
    public abstract int d();
    public abstract Map e();
    public abstract Map f();
    public abstract int g();
    public abstract int h();
    public abstract ValueOrException i();
    public abstract ValueOrException j();
    public abstract h$a k();
}
