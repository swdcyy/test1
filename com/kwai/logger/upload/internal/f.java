package com.kwai.logger.upload.internal.f;
import java.lang.Object;
import com.kwai.logger.upload.internal.f$a;
import java.lang.String;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import c97.d;
import x97.b;
import brd.t;
import java.lang.System;
import com.middleware.security.MXSec;
import t38.a;
import android.util.Base64;
import okhttp3.FormBody$Builder;
import okhttp3.Request$Builder;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import com.kwai.logger.upload.model.LogStartResponse;
import java.lang.Class;
import com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;
import okhttp3.OkHttpClient$Builder;
import h97.i;
import x97.n;
import javax.net.ssl.SSLSocketFactory;
import ca7.q;
import javax.net.ssl.TrustManager;
import u87.k;
import javax.net.ssl.SSLContext;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import com.kwai.logger.upload.internal.e;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import java.util.Objects;
import u87.j;
import java.util.concurrent.Callable;
import u87.i;
import erd.o;
import com.kwai.logger.upload.internal.d;
import brd.z;
import lrd.b;

public class f	// class@000d29
{
    public String a;
    public String b;
    public OkHttpClient c;

    public void f(){
       super();
    }
    public static f b(){
       return f$a.a;
    }
    public final HttpUrl a(String p0){
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       String str = (d.a().j())? "http": "https";
       return uBuilder.scheme(str).host(b.b().c()).addPathSegments("rest/zt/notifier/log/").addPathSegment(p0).addQueryParameter("kpn", this.b).build();
    }
    public t c(String p0,String p1,String p2){
       return this.d(new Request$Builder().url(this.a("start")).post(new FormBody$Builder().add("version", "1.0.0").add("taskId", p0).add("channelType", p2).add("etime", Base64.encodeToString(MXSec.get().getMXWrapper().a("Obiwan", "bbd910da-fda5-49e7-8667-f57200dac474", 0, (String.valueOf((System.currentTimeMillis() / 1000))).getBytes()), 0)).add("extra", p1).build()).build(), LogStartResponse.class);
    }
    public final t d(Request p0,Class p1){
       SSLSocketFactory sSLSocketFac;
       int i;
       if (this.c == null) {
          OkHttpClient$Builder uBuilder = a.h("azeroth").c();
          if (d.a().e().b().c()) {
             sSLSocketFac = q.a();
          }else {
             TrustManager[] trustManager = new TrustManager[]{new k()};
             try{
                i = 0;
                SSLContext instance = SSLContext.getInstance("SSL");
                instance.init(i, trustManager, new SecureRandom());
                sSLSocketFac = instance.getSocketFactory();
             }catch(java.security.NoSuchAlgorithmException e1){
                e1.printStackTrace();
             }catch(java.security.KeyManagementException e1){
                e1.printStackTrace();
             }
             sSLSocketFac = i;
          }
          if (sSLSocketFac != null) {
             uBuilder.sslSocketFactory(sSLSocketFac, new e());
          }
          this.c = uBuilder.build();
       }
       Call uCall = this.c.newCall(p0);
       Objects.requireNonNull(uCall);
       return t.fromCallable(new j(uCall)).map(new i(this, p1)).map(d.b).subscribeOn(b.c());
    }
}
