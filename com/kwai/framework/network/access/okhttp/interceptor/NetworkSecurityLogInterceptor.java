package com.kwai.framework.network.access.okhttp.interceptor.NetworkSecurityLogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.network.access.okhttp.interceptor.NetworkSecurityLogInterceptor$a;
import java.lang.reflect.Type;
import f66.d;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.lang.StringBuilder;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okio.b;
import okio.c;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import java.nio.ByteBuffer;
import okhttp3.Response$Builder;

public class NetworkSecurityLogInterceptor implements Interceptor	// class@00179a
{
    public boolean a;
    public List b;
    public List c;
    public final Charset d;

    public void NetworkSecurityLogInterceptor(){
       super();
       this.a = false;
       this.b = null;
       this.c = null;
       this.d = Charset.forName("UTF-8");
       this.a();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NetworkSecurityLogInterceptor.class, "2")) {
          return;
       }
       NetworkSecurityLogInterceptor$a value = a.t().getValue("obiwanNetworkCacheAPIList", NetworkSecurityLogInterceptor$a.class, objArray);
       if (value != null) {
          this.a = true;
          this.b = value.whiteList;
          this.c = value.blackList;
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkSecurityLogInterceptor.class, "6")) {
          return;
       }
       d.g("network", "SecNetworkTag", p0);
       return;
    }
    public Response intercept(Interceptor$Chain p0){
       Headers headers1;
       String str7;
       NetworkSecurityLogInterceptor d;
       Object obj = this;
       Response obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NetworkSecurityLogInterceptor networkSecur = NetworkSecurityLogInterceptor.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, networkSecur, "3");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (obj.a == null) {
          this.a();
          if (obj.a == null) {
             return obj1.proceed(p0.request());
          }
       }
       obj2 = p0.request().url().encodedPath();
       if (TextUtils.x(obj2)) {
          return obj1.proceed(p0.request());
       }else if(obj.c.contains(obj2)){
          return obj1.proceed(p0.request());
       }else if(obj.b.contains(obj2)){
          Request request = p0.request();
          String str = "\"";
          if (!PatchProxy.applyVoidOneRefs(request, obj, networkSecur, "5")) {
             StringBuilder str1 = "curl"+" -X "+request.method();
             Headers headers = request.headers();
             int i = headers.size();
             int i1 = 0;
             int i2 = 0;
             String str2 = null;
             while (i2 < i) {
                String str3 = headers.name(i2);
                String str4 = headers.value(i2);
                int i3 = str4.length() - 1;
                StringBuilder str5 = 34;
                if (str4.charAt(i1) == str5 && str4.charAt(i3) == str5) {
                   String str6 = "\\\"";
                   headers1 = headers;
                   str4 = str6+str4.substring(1, i3)+str6;
                }else {
                   headers1 = headers;
                   str7 = 1;
                }
                if (("Accept-Encoding").equalsIgnoreCase(str3) && ("gzip").equalsIgnoreCase(str4)) {
                   str2 = 1;
                }
                str1 = str1+" -H "+str+str3+": "+str4+str;
                i2 = i2 + 1;
                headers = headers1;
                i1 = 0;
             }
             RequestBody requestBody = request.body();
             if (requestBody != null) {
                b uob = new b();
                requestBody.writeTo(uob);
                d = obj.d;
                MediaType mediaType = requestBody.contentType();
                if (mediaType != null) {
                   d = mediaType.charset(obj.d);
                }
                str1 = str1+" --data $\'"+(uob.readString(d)).replace("\n", "\\n")+"\'";
             }
             str7 = (str2)? " --compressed ": " ";
             obj.b(str1+str7+request.url());
          }
          obj1 = obj1.proceed(request);
          MediaType obj3 = PatchProxy.applyOneRefs(obj1, obj, networkSecur, "4");
          if (obj3 != patchProxyRe) {
             obj1 = obj3;
          }else if(obj1.body() != null && obj1.body().contentType() != null){
             obj3 = obj1.body().contentType();
             byte[] uobyteArray = obj1.body().bytes();
             if (!TextUtils.x(obj1.toString()) && uobyteArray.length > 0) {
                byte[] bytes = (obj1.toString()).getBytes();
                byte[] uobyteArray1 = PatchProxy.applyTwoRefs(bytes, uobyteArray, obj, networkSecur, "8");
                if (uobyteArray1 != patchProxyRe) {
                }else {
                   byte[] bytes1 = ("{").getBytes();
                   uobyteArray1 = ("}").getBytes();
                   byte[] bytes2 = ("\"header\"").getBytes();
                   byte[] bytes3 = ("\"body\"").getBytes();
                   byte[] bytes4 = (",").getBytes();
                   byte[] bytes5 = str.getBytes();
                   byte[] bytes6 = (":").getBytes();
                   ByteBuffer uByteBuffer = ByteBuffer.allocate(((((((((bytes1.length + uobyteArray1.length) + bytes2.length) + bytes3.length) + bytes4.length) + (bytes5.length * 4)) + bytes.length) + uobyteArray.length) + (bytes6.length * 2)));
                   uByteBuffer.put(bytes1);
                   uByteBuffer.put(bytes2);
                   uByteBuffer.put(bytes6);
                   uByteBuffer.put(bytes5);
                   uByteBuffer.put(bytes);
                   uByteBuffer.put(bytes5);
                   uByteBuffer.put(bytes4);
                   uByteBuffer.put(bytes3);
                   uByteBuffer.put(bytes6);
                   uByteBuffer.put(bytes5);
                   uByteBuffer.put(uobyteArray);
                   uByteBuffer.put(bytes5);
                   uByteBuffer.put(uobyteArray1);
                   uobyteArray1 = uByteBuffer.array();
                }
                if (!PatchProxy.applyVoidOneRefs(uobyteArray1, obj, networkSecur, "7")) {
                   d.f("network", "SecNetworkTag", uobyteArray1);
                }
             }
          label_020d :
             obj1 = obj1.newBuilder().body(ResponseBody.create(obj3, uobyteArray)).build();
          }else {
             obj.b("response body is null");
          }
          return obj1;
       }else {
          return obj1.proceed(p0.request());
       }
    }
}
