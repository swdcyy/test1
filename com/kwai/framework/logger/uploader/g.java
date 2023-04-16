package com.kwai.framework.logger.uploader.g;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import aa6.e;
import okhttp3.OkHttpClient;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.EventListener$Factory;
import com.kwai.framework.network.dns.KwaiDns;
import okhttp3.Dns;
import com.yxcorp.retrofit.throttling.v2.ThrottlingInterceptorV2;
import okhttp3.Interceptor;
import com.yxcorp.retrofit.throttling.ThrottlingInterceptor;
import com.yxcorp.retrofit.interceptor.TimeoutInterceptor;
import com.yxcorp.retrofit.interceptor.ContentLengthInterceptor;
import com.kwai.framework.network.keyconfig.KeyConfigBlockingInterceptor;
import com.kwai.framework.network.keyconfig.degrade.APIDegradeInterceptor;
import com.yxcorp.retrofit.interceptor.ConvertToIOExceptionInterceptor;
import com.kwai.framework.network.cronet.CronetParameterInterceptor;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import d0d.c;
import d0d.g$b;

public class g extends g	// class@000ba4
{
    public g$b a;

    public void g(RouteType p0,z p1){
       super(p0, p1);
       this.a = new e(this);
    }
    public OkHttpClient buildClient(){
       OkHttpClient$Builder uBuilder;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = PatchProxy.apply(null, this, og, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 120;
       if (PatchProxy.isSupport(og)) {
          uBuilder = PatchProxy.applyOneRefs(Integer.valueOf(i), this, og, "3");
          if (uBuilder != patchProxyRe) {
          label_00a1 :
             return uBuilder.build();
          }
       }
       long l = (long)i;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       uBuilder = new OkHttpClient$Builder().connectTimeout(l, sECONDS).readTimeout(l, sECONDS).writeTimeout(l, sECONDS);
       EventListener$Factory eventListene = this.getEventListenerFactory();
       if (eventListene != null) {
          uBuilder.eventListenerFactory(eventListene);
       }
       uBuilder.dns(new KwaiDns()).addInterceptor(new ThrottlingInterceptorV2()).addInterceptor(new ThrottlingInterceptor()).addInterceptor(new TimeoutInterceptor()).addInterceptor(new ContentLengthInterceptor()).addInterceptor(new KeyConfigBlockingInterceptor()).addInterceptor(new APIDegradeInterceptor()).addInterceptor(new ConvertToIOExceptionInterceptor()).addInterceptor(new CronetParameterInterceptor()).addInterceptor(new CronetInterceptor(this.mRouteType.mName));
       goto label_00a1 ;
    }
    public EventListener$Factory getEventListenerFactory(){
       c obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.c(this.a);
       return obj.a();
    }
}
