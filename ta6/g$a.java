package ta6.g$a;
import d0d.g$b;
import ta6.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import java.util.Random;
import k2b.u1;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import zb6.e;
import com.kwai.robust.PatchProxyResult;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Exception;
import ta6.a;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.w;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import java.lang.Long;
import java.lang.Integer;

public class g$a implements g$b	// class@00248f
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, g$a.class, "2")) {
          return;
       }
       double d = 0;
       try{
          d = a.t().getValue("apiInterceptorMetricsLogRatio", Double.TYPE, Double.valueOf(d)).doubleValue();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          c.C().t("KwaiRetrofitConfig", "Can\'t get the kSwitch value of apiInterceptorMetricsLogRatio, "+e0, objArray);
       }
       if (this.a.mRandom.nextDouble() - d <= 0) {
          u1.R("API_OKHTTP_INTERCEPTOR_METRICS", p0, 18);
       }
       return;
    }
    public void b(ClientStat$StatPackage p0,boolean p1,boolean p2){
       ClientStat$StatPackage apiCostDetai;
       ClientStat$ApiCostDetailStatEvent url;
       ClientStat$ApiCostDetailStatEvent obj;
       String str;
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, g$a.class, "1")) {
          return;
       }
       try{
          apiCostDetai = p0.apiCostDetailStatEvent;
          url = apiCostDetai.url;
          obj = PatchProxy.applyOneRefs(url, null, e.class, "1");
          if (obj != PatchProxyResult.class) {
             str = obj;
          }else {
             obj = null;
             HttpUrl httpUrl = HttpUrl.get(url);
             HttpUrl$Builder uBuilder = httpUrl.newBuilder();
             int i1 = httpUrl.querySize();
             int i2 = 0;
             while (i2 < i1) {
                String str1 = httpUrl.queryParameterName(i2);
                if (!TextUtils.x(str1) && (!str1.equals("token") && (!str1.equals("passToken") && (!str1.equals("client_salt") && (str1.endsWith(".api_st") || str1.endsWith(".h5_st")))))) {
                   uBuilder.setQueryParameter(str1, "");
                }
                i2 = i2 + 1;
             }
             str = uBuilder.build().toString();
          }
       }catch(java.lang.Exception e3){
          Object[] objArray = new Object[obj];
          c.C().t("UrlParamUtil", "clearUrlTokenData error, url = "+url+", e = "+e3.toString(), objArray);
       }
       apiCostDetai.url = str;
       int i = 0x4b316083;
       if (!p1 || p2) {
          p1.ratio = 0x3f800000;
          b.a(i).i1(p0, true);
          ClientStat$StatPackage apiCostDetai1 = p0.apiCostDetailStatEvent;
          PageMonitor.INSTANCE.trackPageRequestFail(apiCostDetai1.url, Integer.valueOf(apiCostDetai1.errorCode), p0.apiCostDetailStatEvent.errorMessage);
       }else {
          float f = a.b();
          if (this.a.mRandom.nextFloat() - f <= 0) {
             p2.ratio = f;
             b.a(i).j(p0);
          }
          b.a(-1343064608).E(p0.apiCostDetailStatEvent);
          ClientStat$StatPackage apiCostDetai2 = p0.apiCostDetailStatEvent;
          obj = apiCostDetai2.taskStart;
          PageMonitor.INSTANCE.trackPageRequestEnd(apiCostDetai2.url, obj, (apiCostDetai2.totalCost + obj), Long.valueOf((apiCostDetai2.requestStart + apiCostDetai2.requestCost)), Long.valueOf(p0.apiCostDetailStatEvent.responseStart));
       }
       this.a.logApiCostDetailLocally(p0.apiCostDetailStatEvent);
       return;
    }
}
