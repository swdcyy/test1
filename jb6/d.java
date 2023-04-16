package jb6.d;
import jb6.c;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import fjd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class d	// class@001b42
{
    public static final x a;

    static {
       d.a = Suppliers.a(c.b);
    }
    public void d(){
       super();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a.get();
    }
}
