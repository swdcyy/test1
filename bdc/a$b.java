package bdc.a$b;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bdc.b;
import bdc.a;

public final class a$b implements k	// class@00044e
{
    public static final a$b b;

    static {
       a$b.b = new a$b();
    }
    public void a$b(){
       super();
    }
    public Object get(){
       b uob = PatchProxy.apply(null, this, a$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = a.a();
       }
       return uob;
    }
}
