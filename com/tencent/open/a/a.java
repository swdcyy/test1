package com.tencent.open.a.a;
import java.lang.Object;
import java.lang.String;
import com.tencent.open.a.b;
import com.tencent.open.log.SLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.net.URLEncoder;
import okhttp3.MultipartBody$Builder;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.tencent.open.utils.g;
import okhttp3.FormBody$Builder;
import okhttp3.FormBody;
import android.os.Build$VERSION;
import android.os.Build;
import com.tencent.open.a.a$a;
import okhttp3.ConnectionSpec;
import java.util.List;
import java.util.Arrays;
import okhttp3.Cache;
import okhttp3.Interceptor;

public class a	// class@000f3c
{
    public OkHttpClient b;
    public g c;
    public static a a;

    public void a(){
       super();
       this.b();
    }
    public static a a(){
       if (a.a == null) {
          a uoa = a.class;
          _monitor_enter(uoa);
          if (a.a == null) {
             a.a = new a();
          }
          _monitor_exit(uoa);
       }
       a.a.c();
       return a.a;
    }
    public b a(String p0,String p1){
       SLog.i("openSDK_LOG.OpenHttpService", "get.");
       if (!TextUtils.isEmpty(p1)) {
          String str = "?";
          int i = p1.indexOf(str);
          if (i == -1) {
             p0 = p0+str;
          }else if(i != (p0.length() - 1)){
             p0 = p0+"&";
          }
          p0 = p0+p1;
       }
       return new b(this.b.newCall(new Request$Builder().url(p0).get().build()).execute(), p1.length());
    }
    public b a(String p0,Map p1){
       String str = "";
       if (p1 == null || p1.isEmpty()) {
          return this.a(p0, str);
       }
       String str1 = str;
       Iterator iterator = p1.keySet().iterator();
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          String str3 = p1.get(str2);
          if (str3 != null) {
             str1 = str1+URLEncoder.encode(str2, "UTF-8")+"="+URLEncoder.encode(str3, "UTF-8")+"&";
          }
       }
       if (str1.length() > 0) {
          str1.deleteCharAt((str1.length() - 1));
       }
       return this.a(p0, str1);
    }
    public b a(String p0,Map p1,Map p2){
       if (p2 == null || !p2.size()) {
          return this.b(p0, p1);
       }
       String str = "openSDK_LOG.OpenHttpService";
       SLog.i(str, "post data, has byte data");
       MultipartBody$Builder uBuilder = new MultipartBody$Builder();
       if (p1 != null && p1.size() > 0) {
          Iterator iterator = p1.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             String str2 = p1.get(str1);
             if (str2 != null) {
                uBuilder.addFormDataPart(str1, str2);
             }
          }
       }
       Iterator iterator1 = p2.keySet().iterator();
       while (iterator1.hasNext()) {
          String str3 = iterator1.next();
          byte[] uobyteArray = p2.get(str3);
          if (uobyteArray != null && uobyteArray.length > 0) {
             uBuilder.addFormDataPart(str3, str3, RequestBody.create(MediaType.get("content/unknown"), uobyteArray));
             SLog.w(str, "post byte data.");
          }
       }
       MultipartBody multipartBod = uBuilder.build();
       return new b(this.b.newCall(new Request$Builder().url(p0).post(multipartBod).build()).execute(), (int)multipartBod.contentLength());
    }
    public void a(long p0,long p1){
       if ((long)this.b.connectTimeoutMillis() - p0 || (long)this.b.readTimeoutMillis() - p1) {
          SLog.i("openSDK_LOG.OpenHttpService", "setTimeout changed.");
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          this.b = this.b.newBuilder().connectTimeout(p0, mILLISECONDS).readTimeout(p1, mILLISECONDS).writeTimeout(p1, mILLISECONDS).build();
       }
       return;
    }
    public void a(g p0){
       this.c = p0;
       this.c();
    }
    public final void a(OkHttpClient$Builder p0){
    }
    public b b(String p0,Map p1){
       SLog.i("openSDK_LOG.OpenHttpService", "post data");
       FormBody$Builder uBuilder = new FormBody$Builder();
       if (p1 != null && p1.size() > 0) {
          Iterator iterator = p1.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             String str1 = p1.get(str);
             if (str1 != null) {
                uBuilder.add(str, str1);
             }
          }
       }
       FormBody uFormBody = uBuilder.build();
       return new b(this.b.newCall(new Request$Builder().url(p0).post(uFormBody).build()).execute(), (int)uFormBody.contentLength());
    }
    public final void b(){
       ConnectionSpec[] uConnectionS = new ConnectionSpec[]{ConnectionSpec.MODERN_TLS,ConnectionSpec.COMPATIBLE_TLS};
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectionSpecs(Arrays.asList(uConnectionS)).connectTimeout(0x3a98, mILLISECONDS).readTimeout(0x7530, mILLISECONDS).writeTimeout(0x7530, mILLISECONDS);
       uBuilder = uBuilder.cache(null).addInterceptor(new a$a("AndroidSDK_"+Build$VERSION.SDK+"_"+Build.DEVICE+"_"+Build$VERSION.RELEASE));
       this.a(uBuilder);
       this.b = uBuilder.build();
    }
    public final void c(){
       a tc = this.c;
       if (tc == null) {
          return;
       }
       int i = tc.a("Common_HttpConnectionTimeout");
       if (!i) {
          i = 0x3a98;
       }
       int i1 = this.c.a("Common_SocketConnectionTimeout");
       if (!i1) {
          i1 = 0x7530;
       }
       this.a((long)i, (long)i1);
       return;
    }
}
