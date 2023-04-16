package nb6.d;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.OkHttpClient$Builder;
import com.kwai.framework.network.dns.KwaiDns;
import okhttp3.Dns;
import com.kwai.framework.network.cronet.CronetParameterInterceptor;
import okhttp3.Interceptor;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import d0d.c;
import nb6.d$a;
import d0d.g$b;
import okhttp3.EventListener$Factory;
import kotlin.jvm.internal.a;

public final class d	// class@001f26
{

    public static final OkHttpClient a(){
       OkHttpClient obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = new c();
       uoc.c(d$a.a);
       obj = new OkHttpClient$Builder().dns(new KwaiDns()).addInterceptor(new CronetParameterInterceptor()).addInterceptor(new CronetInterceptor()).eventListenerFactory(uoc.a()).build();
       a.o(obj, "OkHttpClient.Builder\(\)\n бн}.build\(\)\)\n      .build\(\)");
       return obj;
    }
}
