package e90.a;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e90.b;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;

public class a extends Factory	// class@001f06
{

    public void a(){
       super();
    }
    public Object newInstance(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = e.b(b.a(-1961311520).a(RouteType.API, d.b), b.class);
          a.o(obj, "RetrofitManager.create\(\n��Service::class.java\n    \)");
       }
       return obj;
    }
}