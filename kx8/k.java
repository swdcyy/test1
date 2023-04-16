package kx8.k;
import com.yxcorp.gifshow.activity.web.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class k	// class@002c41
{
    public static final x a;

    static {
       k.a = Suppliers.a(a.b);
    }
    public void k(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, k.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = k.a.get();
       }
       return obj.booleanValue();
    }
}
