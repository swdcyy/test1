package com.meizu.cloud.pushsdk.c.c.e;
import com.meizu.cloud.pushsdk.c.c.a;
import java.lang.Object;
import java.net.HttpURLConnection;
import com.meizu.cloud.pushsdk.c.c.l;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.g;
import com.meizu.cloud.pushsdk.c.g.d;
import com.meizu.cloud.pushsdk.c.c.e$1;
import com.meizu.cloud.pushsdk.c.c.i;
import java.lang.IllegalStateException;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.g;
import java.io.OutputStream;
import com.meizu.cloud.pushsdk.c.g.l;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.c.c;
import java.util.Set;
import java.util.Iterator;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.c.a.a;
import com.meizu.cloud.pushsdk.c.c.k$a;
import java.net.URL;
import java.net.URLConnection;
import com.meizu.cloud.pushsdk.c.c.f;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.net.TrafficStats;

public class e implements a	// class@0014ce
{

    public void e(){
       super();
    }
    public static l a(HttpURLConnection p0){
       if (!p0.getDoInput()) {
          return null;
       }
       InputStream inputStream = (e.a(p0.getResponseCode()))? p0.getInputStream(): p0.getErrorStream();
       return new e$1(p0, g.a(g.a(inputStream)));
    }
    public static void a(HttpURLConnection p0,i p1){
       String str;
       String str1;
       int i = p1.c();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         str = "PATCH";
                      }else {
                         throw new IllegalStateException("Unknown method type.");
                      }
                   }else {
                      str1 = "HEAD";
                   }
                }else {
                   str1 = "DELETE";
                }
             }else {
                str = "PUT";
             }
          }else {
             str = "POST";
          }
          p0.setRequestMethod(str);
          e.b(p0, p1);
       label_0037 :
          return;
       }else {
          str1 = "GET";
       }
       p0.setRequestMethod(str1);
       goto label_0037 ;
    }
    public static boolean a(int p0){
       boolean b = (p0 >= 200 && p0 < 300)? true: false;
       return b;
    }
    public static void b(HttpURLConnection p0,i p1){
       j oj = p1.e();
       if (oj != null) {
          p0.setDoOutput(true);
          p0.addRequestProperty("Content-Type", oj.a().toString());
          c uoc = g.a(g.a(p0.getOutputStream()));
          oj.a(uoc);
          uoc.close();
       }
       return;
    }
    public k a(i p0){
       HttpURLConnection httpURLConne = this.b(p0);
       Iterator iterator = p0.d().b().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          String str1 = p0.a(str);
          a.b("current header name "+str+" value "+str1);
          httpURLConne.addRequestProperty(str, str1);
       }
       e.a(httpURLConne, p0);
       return new k$a().a(httpURLConne.getResponseCode()).a(p0.d()).a(httpURLConne.getResponseMessage()).a(p0).a(e.a(httpURLConne)).a();
    }
    public HttpURLConnection a(URL p0){
       HttpURLConnection httpURLConne = p0.openConnection();
       httpURLConne.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
       return httpURLConne;
    }
    public final HttpURLConnection b(i p0){
       URL uRL = new URL(p0.a().toString());
       if (MinSdkChecker.isSupportNotificationChannel()) {
          TrafficStats.setThreadStatsTag(0x779955e3);
       }
       HttpURLConnection httpURLConne = this.a(uRL);
       httpURLConne.setConnectTimeout(0xea60);
       httpURLConne.setReadTimeout(0xea60);
       httpURLConne.setUseCaches(false);
       httpURLConne.setDoInput(true);
       return httpURLConne;
    }
}
