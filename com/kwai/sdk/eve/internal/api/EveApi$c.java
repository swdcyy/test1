package com.kwai.sdk.eve.internal.api.EveApi$c;
import com.yxcorp.retrofit.a;
import brd.z;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import retrofit2.a;
import okhttp3.OkHttpClient;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import com.yxcorp.retrofit.c$a;
import okhttp3.Interceptor;

public final class EveApi$c extends a	// class@001461
{
    public final a a;

    public void EveApi$c(a p0,z p1,int p2){
       this.a = p0;
       super(p1, p2);
    }
    public String buildBaseUrl(){
       Object obj = PatchProxy.apply(null, this, EveApi$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.buildBaseUrl();
    }
    public a buildCall(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveApi$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.buildCall(p0);
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, EveApi$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.buildClient();
    }
    public Gson buildGson(){
       Object obj = PatchProxy.apply(null, this, EveApi$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataKt.a();
    }
    public c$a buildParams(){
       Object obj = PatchProxy.apply(null, this, EveApi$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.buildParams();
    }
    public z getExecuteScheduler(){
       Object obj = PatchProxy.apply(null, this, EveApi$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getExecuteScheduler();
    }
    public Interceptor getLoggingInterceptor(){
       return null;
    }
}
