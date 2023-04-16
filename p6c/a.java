package p6c.a;
import gv6.c;
import java.lang.Object;
import q56.e;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import okhttp3.OkHttpClient;
import com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;
import x97.l;
import q56.d;
import com.yxcorp.retrofit.e;
import za6.b;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;
import x97.d;
import okhttp3.OkHttpClient$Builder;

public final class a implements c	// class@00216e
{
    public final e a;

    public void a(){
       super();
       this.a = new e(RouteType.PUSH);
    }
    public String getApiHost(){
       String obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.a();
       a.o(obj, "apiRouter.host");
       return obj;
    }
    public OkHttpClient getApiOkhttpClient(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a$b obj = PatchProxy.apply(null, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.h("push");
       obj.e(this.a);
       d uod = PatchProxy.apply(null, this, uoa, "3");
       if (uod != patchProxyRe) {
       }else if(e.h().e()){
          uod = new d(new b());
       }else {
          uod = new d(b.a(-1961311520).e());
       }
       obj.f(uod);
       obj.g(3);
       a.o(obj, "AzerothApiRequester.newB¡­\n    .setMaxRetryCount\(3\)");
       OkHttpClient okHttpClient = obj.c().build();
       a.o(okHttpClient, "AzerothApiRequester.newB¡­HttpClientBuilder.build\(\)");
       return okHttpClient;
    }
}
