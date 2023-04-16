package com.kuaishou.weapon.ks.o;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.weapon.ks.q;
import java.lang.String;
import com.kuaishou.weapon.ks.d;
import com.kuaishou.weapon.ks.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import javax.net.ssl.TrustManager;
import com.kuaishou.weapon.ks.o$1;
import javax.net.ssl.SSLContext;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient$Builder;
import com.kuaishou.weapon.ks.o$2;
import javax.net.ssl.HostnameVerifier;
import java.io.InputStream;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class o	// class@001219
{
    public static int a;
    public static int b;
    public static OkHttpClient c;

    public void o(){
       super();
    }
    public static String a(Context p0,q p1){
       String str;
       int i = 2;
       int i1 = d.a(p0).b("plc001_pd_n_s", i);
       if (!i1) {
       label_000e :
          str = p.a(p0).a(p1);
       }else if(i1 == 1){
          if (i1 == i) {
             String str1 = o.a(p1);
             if (TextUtils.isEmpty(str1)) {
                goto label_000e ;
             }else {
                str = str1;
             }
          }else {
             str = p.a(p0).a(p1);
             if (!TextUtils.isEmpty(str)) {
             label_003c :
                int i2 = (!TextUtils.isEmpty(str) && str.equals("{\"result\":1,\"error_msg\":\"\"}"))? -1: o.a + 1;
                o.a = i2;
                return str;
             }
          }
       }
       str = o.a(p1);
       goto label_003c ;
    }
    public static String a(q p0){
       OkHttpClient okHttpClient = o.a();
       RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), p0.a().toString());
       Request$Builder uBuilder = new Request$Builder();
       if (TextUtils.isEmpty(p0.a)) {
          return null;
       }
       uBuilder = uBuilder.url(p0.a);
       if (!TextUtils.isEmpty(p0.c())) {
          uBuilder.addHeader("env", p0.c());
       }
       if (!TextUtils.isEmpty(p0.b())) {
          uBuilder.addHeader("Cookie", p0.b());
       }
       return okHttpClient.newCall(uBuilder.post(requestBody).build()).execute().body().string();
    }
    public static OkHttpClient a(){
       if (o.c == null) {
          o oo = o.class;
          _monitor_enter(oo);
          if (o.c == null) {
             TrustManager[] trustManager = new TrustManager[]{new o$1()};
             SSLContext instance = SSLContext.getInstance("SSL");
             instance.init(null, trustManager, new SecureRandom());
             SSLSocketFactory socketFactor = instance.getSocketFactory();
             OkHttpClient$Builder uBuilder = new OkHttpClient$Builder();
             uBuilder.sslSocketFactory(socketFactor);
             uBuilder.hostnameVerifier(new o$2());
             o.c = uBuilder.build();
          }
          _monitor_exit(oo);
       }
       return o.c;
    }
    public static boolean a(Context p0,InputStream p1,File p2){
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(p2));
       byte[] uobyteArray = new byte[1024];
       int i = p1.read(uobyteArray);
       while (i != -1) {
          uBufferedOut.write(uobyteArray, b, i);
          uBufferedOut.flush();
       }
       b = true;
       try{
          uBufferedOut.close();
          return b;
       }catch(java.io.IOException e0){
       }
    }
    public static boolean a(Context p0,String p1,File p2){
       boolean b;
       boolean i = d.a(p0).b("plc001_pd_n_s", 2);
       if (!i) {
       label_000e :
          b = p.a(p0).a(p1, p2);
       }else if(i == 1){
          if (i == 2) {
             i = o.b(p0, p1, p2);
             if (!i) {
                goto label_000e ;
             }
          }else {
             i = p.a(p0).a(p1, p2);
             if (i) {
             }
          }
       }
       b = o.b(p0, p1, p2);
       int i1 = (b)? -1: o.b + 1;
       o.b = i1;
       return b;
    }
    public static boolean b(Context p0,String p1,File p2){
       return o.a(p0, o.a().newCall(new Request$Builder().get().url(p1).build()).execute().body().byteStream(), p2);
    }
}
