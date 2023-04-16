package com.kwai.framework.logger.uploader.e;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import aa6.d;
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
import com.yxcorp.retrofit.e;
import ta6.e;
import ua6.b;
import ua6.b$a;
import ia0.c;
import yid.e;
import com.kwai.framework.network.dns.KwaiDns;
import okhttp3.Dns;
import com.yxcorp.retrofit.throttling.v2.ThrottlingInterceptorV2;
import okhttp3.Interceptor;
import com.yxcorp.retrofit.interceptor.DynamicParamsInterceptor;
import android.content.Context;
import com.yxcorp.retrofit.c$a;
import com.yxcorp.retrofit.interceptor.CommonParamsInterceptor;
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

public class e extends g	// class@001677
{
    public g$b a;

    public void e(RouteType p0,z p1){
       super(p0, p1);
       this.a = new d(this);
    }
    public OkHttpClient buildClient(){
       OkHttpClient$Builder uBuilder;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = PatchProxy.apply(null, this, uoe, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 120;
       if (PatchProxy.isSupport(uoe)) {
          uBuilder = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoe, "3");
          if (uBuilder != patchProxyRe) {
          label_00d8 :
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
       boolean b = e.h().e();
       uBuilder.dns(new KwaiDns()).addInterceptor(new ThrottlingInterceptorV2()).addInterceptor(new DynamicParamsInterceptor(new e(), e.h().f(), b, true)).addInterceptor(new CommonParamsInterceptor(b.c.a().e().e(), b, true)).addInterceptor(new ThrottlingInterceptor()).addInterceptor(new TimeoutInterceptor()).addInterceptor(new ContentLengthInterceptor()).addInterceptor(new KeyConfigBlockingInterceptor()).addInterceptor(new APIDegradeInterceptor()).addInterceptor(new ConvertToIOExceptionInterceptor()).addInterceptor(new CronetParameterInterceptor()).addInterceptor(new CronetInterceptor(this.mRouteType.mName));
       goto label_00d8 ;
    }
    public EventListener$Factory getEventListenerFactory(){
       c obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.c(this.a);
       return obj.a();
    }
}
