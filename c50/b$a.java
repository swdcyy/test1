package c50.b$a;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yf6.h;
import c50.a;

public final class b$a implements k	// class@0002f0
{
    public static final b$a b;

    static {
       b$a.b = new b$a();
    }
    public void b$a(){
       super();
    }
    public Object get(){
       a uoa = PatchProxy.apply(null, this, b$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
}
