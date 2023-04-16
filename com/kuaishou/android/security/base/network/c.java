package com.kuaishou.android.security.base.network.c;
import com.kuaishou.android.security.base.network.c$c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.security.base.network.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import com.kuaishou.android.security.base.network.a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuffer;
import org.json.JSONObject;
import javax.net.ssl.HttpsURLConnection;
import com.kuaishou.android.security.base.network.c$b;
import javax.net.ssl.HostnameVerifier;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.net.URLEncoder;
import javax.net.ssl.TrustManager;
import com.kuaishou.android.security.base.network.c$a;
import javax.net.ssl.SSLContext;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import java.lang.Exception;

public class c	// class@000ef0
{
    public static int a = 20000;
    public static int b = 20000;
    public static String c = "UTF-8";
    public static final HostnameVerifier d;

    static {
       c.d = new c$c();
    }
    public void c(){
       super();
    }
    public static f a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HttpURLConnection httpURLConne = new URL(p0).openConnection();
       httpURLConne.setRequestMethod(a.c.a());
       int responseCode = httpURLConne.getResponseCode();
       if (responseCode != 200) {
          return new f(responseCode, httpURLConne.getResponseMessage());
       }
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(httpURLConne.getInputStream()));
       httpURLConne = "";
       String str = uBufferedRea.readLine();
       while (str != null) {
          httpURLConne = httpURLConne+str;
       }
       uBufferedRea.close();
       return new f(responseCode, httpURLConne);
    }
    public static f a(String p0,JSONObject p1){
       URL obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new URL(p0);
       c.a();
       HttpsURLConnection httpsURLConn = obj.openConnection();
       httpsURLConn.setReadTimeout(c.a);
       httpsURLConn.setConnectTimeout(c.b);
       httpsURLConn.setRequestMethod(a.b.a());
       httpsURLConn.setDoInput(true);
       httpsURLConn.setRequestProperty("Content-Type", "application/json");
       HttpsURLConnection.setDefaultHostnameVerifier(new c$b());
       if (((obj.getProtocol()).toLowerCase()).equals("https")) {
          httpsURLConn.setHostnameVerifier(c.d);
       }
       OutputStream outputStream = httpsURLConn.getOutputStream();
       BufferedWriter uBufferedWri = new BufferedWriter(new OutputStreamWriter(outputStream, c.c));
       uBufferedWri.write(p1.toString());
       uBufferedWri.flush();
       uBufferedWri.close();
       outputStream.close();
       int responseCode = httpsURLConn.getResponseCode();
       if (responseCode == 200) {
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(httpsURLConn.getInputStream()));
          httpsURLConn = "";
          String str = uBufferedRea.readLine();
          while (str != null) {
             httpsURLConn = httpsURLConn+str;
          }
          uBufferedRea.close();
          return new f(responseCode, httpsURLConn);
       }else {
          return new f(responseCode, httpsURLConn.getResponseMessage());
       }
    }
    public static String a(JSONObject p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int i = 1;
       Iterator iterator = p0.keys();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Object obj1 = p0.get(str);
          if (i) {
             i = 0;
          }else {
             obj = obj+"&";
          }
          obj = obj+URLEncoder.encode(str, c.c)+"="+URLEncoder.encode(obj1.toString(), c.c);
       }
       return obj;
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, c.class, "1")) {
          return;
       }
       TrustManager[] trustManager = new TrustManager[1];
       c$a uoa = new c$a();
       int i = 0;
       try{
          trustManager[i] = uoa;
          SSLContext instance = SSLContext.getInstance("TLS");
          instance.init(null, trustManager, new SecureRandom());
          HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
