package c72.c;
import c72.b;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class c	// class@0004da
{
    public static final x a;

    static {
       c.a = Suppliers.a(b.b);
    }
    public void c(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.a.get().intValue();
    }
}
