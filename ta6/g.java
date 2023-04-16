package ta6.g;
import com.yxcorp.retrofit.a;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import ta6.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.util.Random;
import ta6.g$a;
import pjd.c;
import java.lang.Object;
import wkd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jb6.b;
import retrofit2.a;
import ajd.a;
import d0d.g;
import com.yxcorp.retrofit.model.a;
import com.kwai.framework.network.degrade.g;
import okhttp3.OkHttpClient;
import yid.e;
import ia0.c;
import okhttp3.OkHttpClient$Builder;
import com.kwai.framework.network.cronet.CronetParameterInterceptor;
import okhttp3.Interceptor;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import com.google.gson.Gson;
import fg6.a;
import com.kwai.framework.network.NetworkSecurityLogInterceptor;
import brd.t;
import java.lang.annotation.Annotation;
import com.kwai.framework.network.b;
import erd.g;
import java.util.List;
import ljd.a;
import java.util.Iterator;
import ljd.b;
import com.kwai.framework.network.a;
import cjd.a;
import com.kwai.framework.network.regions.c;
import com.kwai.framework.network.regions.b;
import erd.o;
import pb6.j;
import java.lang.Integer;
import ia0.b;
import com.kwai.framework.network.dns.KwaiDns;
import okhttp3.Dns;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfigBlockingInterceptor;
import com.kwai.framework.network.regions.APISchedulingInterceptor;
import com.kwai.framework.network.f;
import hjd.b;
import lkd.b;
import ok.o;
import com.kwai.framework.network.idc.interceptor.RouterInterceptor;
import com.kwai.framework.network.regions.APIScheduledResultLogInterceptor;
import com.kwai.framework.network.keyconfig.degrade.APIDegradeInterceptor;
import com.kwai.framework.network.etag.ETagInterceptor;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfigDecryptInterceptor;
import ta6.b;
import java.lang.Enum;
import ok.n;
import java.lang.Boolean;
import ia0.d;
import com.yxcorp.retrofit.e;
import com.kwai.framework.network.g;
import java.util.Arrays;
import okhttp3.EventListener$Factory;
import d0d.c;
import d0d.g$b;
import java.lang.Number;
import pb6.o;
import com.kwai.framework.network.keyconfig.BaseConfig;
import com.kwai.framework.network.keyconfig.ApiRetryPolicy;
import fjd.b;
import jb6.d;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import com.kwai.sdk.switchconfig.a;
import com.google.protobuf.nano.MessageNano;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;

public class g extends a	// class@002490
{
    public final g$b mApiLogger;
    public final Random mRandom;
    public final RouteType mRouteType;

    public void g(RouteType p0,z p1){
       super(p1, a.a.getInt("ApiRetryTimes", 1));
       this.mRandom = new Random();
       this.mApiLogger = new g$a(this);
       this.mRouteType = p0;
    }
    public static c lambda$createBasicOkhttpClientBuilder$0(){
       return b.a(0x3c63ef10);
    }
    public static c lambda$getAdvancedInterceptors$1(){
       return b.a(0x3c63ef10);
    }
    public String buildBaseUrl(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b(this.mRouteType);
    }
    public a buildCall(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(new g(new a(g.i().l(p0))));
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.buildClient();
    }
    public e buildCommonParams(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1479227965).e();
    }
    public final void buildCronetInterceptor(OkHttpClient$Builder p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "12")) {
          return;
       }
       p0.addInterceptor(new CronetParameterInterceptor()).addInterceptor(new CronetInterceptor(p1));
       return;
    }
    public Gson buildGson(){
       return a.a;
    }
    public final void buildNetworkLogInterceptor(OkHttpClient$Builder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       if (this.enableInterceptorUpgrade()) {
          return;
       }
       p0.addInterceptor(new NetworkSecurityLogInterceptor());
       return;
    }
    public t buildObservableBeforeRetry(t p0,a p1,Annotation[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = super.buildObservableBeforeRetry(p0, p1, p2);
       if (!this.enableInterceptorUpgrade()) {
          p0 = p0.doOnNext(new b());
       }else {
          Iterator iterator = a.b("start").iterator();
          while (iterator.hasNext()) {
             p0 = iterator.next().a(p0, p1);
          }
       }
       p0 = p0.doOnError(a.a(new a(p1))).doOnNext(new c()).retryWhen(new b());
       if (!this.enableInterceptorUpgrade()) {
          p0 = p0.doOnNext(new j());
       }
       return this.globalResponseProcessor(p0, p1);
    }
    public final OkHttpClient$Builder createBasicOkhttpClientBuilder(int p0){
       Iterator obj;
       b b;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b.a(0x5283973c).c();
       OkHttpClient$Builder uBuilder = super.createOkHttpClientBuilder(p0);
       uBuilder.dns(new KwaiDns());
       if (!this.enableInterceptorUpgrade()) {
          uBuilder.addInterceptor(new DegradeConfigBlockingInterceptor());
          if (!this.enableAdvanceInterceptor()) {
             b = b.b;
             uBuilder.addInterceptor(new APISchedulingInterceptor(f.a, b)).addInterceptor(new RouterInterceptor(b));
          }
       }
       uBuilder.addInterceptor(new APIScheduledResultLogInterceptor()).addInterceptor(new APIDegradeInterceptor()).addInterceptor(new ETagInterceptor());
       if (!this.enableInterceptorUpgrade()) {
          uBuilder.addInterceptor(new DegradeConfigDecryptInterceptor());
          obj = b.a.iterator();
          while (obj.hasNext()) {
             uBuilder.addInterceptor(obj.next());
          }
       }
       return uBuilder;
    }
    public OkHttpClient$Builder createOkHttpClientBuilder(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       OkHttpClient$Builder uBuilder = this.createBasicOkhttpClientBuilder(p0);
       this.buildNetworkLogInterceptor(uBuilder);
       this.buildCronetInterceptor(uBuilder, this.mRouteType.name());
       return uBuilder;
    }
    public final OkHttpClient$Builder createOkHttpClientBuilderWithInterceptors(List p0,int p1){
       Interceptor obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       OkHttpClient$Builder uBuilder = this.createBasicOkhttpClientBuilder(p1);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          n.j(obj);
          uBuilder.addInterceptor(obj);
       }
       this.buildNetworkLogInterceptor(uBuilder);
       this.buildCronetInterceptor(uBuilder, this.mRouteType.name());
       return uBuilder;
    }
    public boolean enableAdvanceInterceptor(){
       Object obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-934836570).a();
    }
    public boolean enableInterceptorUpgrade(){
       Object obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h().d();
    }
    public boolean enableNewCommonParams(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h().e();
    }
    public List getAdvancedInterceptors(){
       b b;
       Interceptor[] obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Interceptor[]{new APISchedulingInterceptor(g.a, b),new RouterInterceptor(b)};
       b = b.b;
       return Arrays.asList(obj);
    }
    public EventListener$Factory getEventListenerFactory(){
       c obj = PatchProxy.apply(null, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.c(this.mApiLogger);
       obj.b = true;
       return obj.a();
    }
    public Interceptor getLoggingInterceptor(){
       return null;
    }
    public c getRegionScheduler(){
       Object obj = PatchProxy.apply(null, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3c63ef10);
    }
    public int getRetryRandomizedTimeMs(){
       BaseConfig obj = PatchProxy.apply(null, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = b.a(0x3d855db5).h();
       if (obj == null || obj.a() == null) {
          return 0;
       }
       return obj.a().apiRetryIntervalRandMs;
    }
    public b getRouterProvider(){
       Object obj = PatchProxy.apply(null, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a();
    }
    public t globalResponseProcessor(t p0,a p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.enableInterceptorUpgrade()) {
          obj = a.b("end").iterator();
          while (obj.hasNext()) {
             p0 = obj.next().a(p0, p1);
          }
          return p0;
       }else {
          obj = b.e.iterator();
          while (obj.hasNext()) {
             p0 = obj.next().a(p0, p1);
          }
          return p0;
       }
    }
    public void logApiCostDetailLocally(ClientStat$ApiCostDetailStatEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "19")) {
          return;
       }
       try{
          if (!a.t().d("apiRequestCostDetailsLogWhitelist", false)) {
             return;
          }else {
             p0 = ClientStat$ApiCostDetailStatEvent.parseFrom(MessageNano.toByteArray(p0));
             HttpUrl httpUrl = HttpUrl.get(p0.url);
             p0.url = new HttpUrl$Builder().scheme(httpUrl.scheme()).host(httpUrl.host()).encodedPath(httpUrl.encodedPath()).build().toString();
             Log.g("ApiCostDetailStatEvent", (p0.toString()).replace("\\u0022", ""));
          }
       }catch(java.lang.Exception e5){
          Log.d("ApiCostDetailStatEvent", "Couldn\'t log api cost."+e5);
       }
       return;
    }
}
