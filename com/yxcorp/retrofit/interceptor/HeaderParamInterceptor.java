package com.yxcorp.retrofit.interceptor.HeaderParamInterceptor;
import okhttp3.Interceptor;
import yid.e;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import com.yxcorp.retrofit.e;
import okhttp3.HttpUrl;
import java.lang.String;
import java.lang.StringBuilder;
import mjd.a;
import ujd.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.Request$Builder;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import com.yxcorp.retrofit.dryrun.a;

public class HeaderParamInterceptor implements Interceptor	// class@000973
{
    public final e a;
    public final boolean b;
    public final boolean c;

    public void HeaderParamInterceptor(e p0){
       super(p0, false, false);
    }
    public void HeaderParamInterceptor(e p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request1;
       Request request = p0.request();
       boolean b = (this.c == null && e.h().c(request.url().encodedPath()))? true: false;
       String str = "HeaderParamInterceptor";
       a.a(str, "enableNewCommonParams:"+this.b+" enableDryRun:"+b);
       if (!b && this.b == null) {
          return p0.proceed(request);
       }else if(this.a == null){
          return p0.proceed(request);
       }else if(b){
          String str1 = d.a(request, "dry_run_tag");
          if (TextUtils.isEmpty(str1)) {
             a.b(str, "uuid is empty");
          }
          if (this.b == null) {
             request1 = CommonParamsCompareManager.c().g(str1);
             if (request1 != null) {
             label_0078 :
                Headers$Builder uBuilder = request1.headers().newBuilder();
                Iterator iterator = this.a.v(request1).entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   uBuilder.add(key, uEntry.getValue());
                }
                uBuilder.add("Connection", "keep-alive");
                return a.a(p0, request, request1.newBuilder().headers(uBuilder.build()).build(), b, this.b, CommonParamsCompareManager$Type.REQUEST_HEADERS);
             }
          }
       }
    label_0077 :
       request1 = request;
       goto label_0078 ;
    }
}
