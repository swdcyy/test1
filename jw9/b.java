package jw9.b;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jw9.a;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;

public class b extends Factory	// class@002b7e
{

    public void b(){
       super();
    }
    public Object newInstance(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
          a.o(obj, "RetrofitManager.create\(c¡­onApiService::class.java\)");
       }
       return obj;
    }
}
