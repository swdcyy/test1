package com.kuaishou.android.security.base.util.k;
import java.util.ArrayList;
import java.lang.Object;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.security.base.util.k$b;
import com.kuaishou.android.security.base.util.k$a;
import javax.net.ssl.HostnameVerifier;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import java.lang.String;
import android.util.Base64;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;

public class k	// class@000f25
{
    public OkHttpClient a;
    public OkHttpClient$Builder b;
    public static k c;
    public static Interceptor e;
    public static ArrayList f;

    static {
       k.f = new ArrayList();
    }
    public void k(){
       super();
       this.a = null;
       this.b = null;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       long l = 15;
       OkHttpClient$Builder uBuilder = new OkHttpClient().newBuilder().connectTimeout(l, sECONDS).readTimeout(l, sECONDS).writeTimeout(l, sECONDS);
       uBuilder = uBuilder.hostnameVerifier(new k$b(null)).cookieJar(new k$a(this));
       this.b = uBuilder;
       uBuilder.hostnameVerifier(new k$b(null));
       Interceptor e = k.e;
       if (e != null) {
          this.b.addInterceptor(e);
       }
       this.a = this.b.build();
       k.f.add(new String(Base64.decode("Z2RmcC5rc2FwaXNydi5jb20=", 0)));
       k.f.add(new String(Base64.decode("Z2RmcC5naWZzaG93LmNvbQ==", 0)));
       k.f.add(new String(Base64.decode("Z2RmcC1rc2FwaXNydi55c3QuYWlzZWUudHY=", 0)));
       k.f.add(new String(Base64.decode("Z2RmcC1naWZzaG93LnlzdC5haXNlZS50dg==", 0)));
       k.f.add(new String(Base64.decode("Z2RmcHNlYy5naWZzaG93LmNvbQ==", 0)));
       k.f.add(new String(Base64.decode("Z2RmcHNlYy5rc2FwaXNydi5jb20=", 0)));
       k.f.add(new String(Base64.decode("Z2RmcC5rd2FpLXByby5jb20=", 0)));
       return;
    }
    public static ArrayList a(){
       return k.f;
    }
    public static void a(Interceptor p0){
       k.e = p0;
    }
    public static k c(){
       OkHttpClient obj = PatchProxy.apply(null, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.c == null) {
          obj = OkHttpClient.class;
          _monitor_enter(obj);
          if (k.c == null) {
             k.c = new k();
          }
          _monitor_exit(obj);
       }
       return k.c;
    }
    public OkHttpClient b(){
       return this.a;
    }
}
