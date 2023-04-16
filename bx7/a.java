package bx7.a;
import zw7.d;
import java.lang.Object;
import okhttp3.OkHttpClient;
import java.lang.String;
import com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;
import bx7.a$a;
import x97.l;
import c97.d;
import kotlin.jvm.internal.a;
import h97.i;
import x97.n;
import x97.k;
import x97.d;
import okhttp3.OkHttpClient$Builder;

public final class a implements d	// class@00039c
{

    public void a(){
       super();
    }
    public OkHttpClient a(){
       a$b uob = a.h("Kuaiwake");
       uob.e(new a$a(this));
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       i oi = uod.e();
       a.o(oi, "Azeroth.get\(\).initParams");
       n on = oi.b();
       a.o(on, "Azeroth.get\(\).initParams.apiRequesterParams");
       uob.f(on.a());
       uob.g(3);
       a.o(uob, "AzerothApiRequester.newB¡­\n    .setMaxRetryCount\(3\)");
       OkHttpClient okHttpClient = uob.c().build();
       a.o(okHttpClient, "AzerothApiRequester.newB¡­HttpClientBuilder.build\(\)");
       return okHttpClient;
    }
    public String getApiHost(){
       return "https://push.gifshow.com";
    }
}
