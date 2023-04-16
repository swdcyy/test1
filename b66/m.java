package b66.m;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import com.yxcorp.retrofit.a;
import b66.l;
import com.yxcorp.retrofit.e;

public class m extends Factory	// class@000427
{
    public static final z a;

    static {
       m.a = b.b(c.e("startup", 1));
    }
    public void m(){
       super();
    }
    public Object newInstance(){
       l ol = PatchProxy.apply(null, this, m.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = e.b(b.a(-1961311520).a(RouteType.API, m.a), l.class);
       }
       return ol;
    }
}
