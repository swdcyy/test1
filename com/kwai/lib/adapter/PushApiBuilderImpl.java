package com.kwai.lib.adapter.PushApiBuilderImpl;
import gv6.c;
import java.lang.Object;
import java.lang.String;
import okhttp3.OkHttpClient;
import com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;
import com.kwai.lib.adapter.PushApiBuilderImpl$a;
import x97.l;
import c97.d;
import kotlin.jvm.internal.a;
import h97.i;
import x97.n;
import x97.k;
import x97.d;
import okhttp3.OkHttpClient$Builder;

public final class PushApiBuilderImpl implements c	// class@000817
{

    public void PushApiBuilderImpl(){
       super();
    }
    public String getApiHost(){
       return "http://push.gifshow.com";
    }
    public OkHttpClient getApiOkhttpClient(){
       a$b uob = a.h("push");
       uob.e(new PushApiBuilderImpl$a(this));
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
}
