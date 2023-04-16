package bva.a;
import com.smile.gifshow.annotation.plugin.Factory;
import bva.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class a extends Factory	// class@00047e
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1380984872);
       a.o(obj, "Singleton.get\(HotSpotApiService::class.java\)");
       return obj;
    }
    public Object newInstance(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = e.b(b.a(-1961311520).a(RouteType.API, d.b), b.class);
          a.o(obj, "RetrofitManager.create\(\n¡­piService::class.java\n  \)");
       }
       return obj;
    }
}
