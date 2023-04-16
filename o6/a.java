package o6.a;
import java.net.CookieManager;
import android.content.Context;
import o6.a$a;
import o6.a$b;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import u6.c;
import java.net.URL;
import java.net.Proxy;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.lang.System;
import javax.net.ssl.HttpsURLConnection;
import java.net.CookieStore;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpCookie;
import java.net.URI;
import java.lang.Throwable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.Proxy$Type;
import java.net.InetSocketAddress;
import java.lang.Integer;
import java.net.SocketAddress;

public final class a	// class@002764
{
    public static final CookieManager a;

    static {
       a.a = new CookieManager();
    }
    public static a$b a(Context p0,a$a p1){
       CookieManager a;
       a$a c;
       BufferedOutputStream uBufferedOut;
       a$b uob1;
       String str = "Keep-Alive";
       String str1 = "mspl";
       if (p0 == null) {
          return null;
       }
       c.f(str1, "conn config: "+p1);
       URL uRL = new URL(p1.a);
       Proxy proxy = a.b(p0);
       c.f(str1, "conn proxy: "+proxy);
       HttpURLConnection httpURLConne = (proxy != null)? uRL.openConnection(proxy): uRL.openConnection();
       System.setProperty("http.keepAlive", "false");
       if (httpURLConne instanceof HttpsURLConnection) {
       }
       a = a.a;
       if (a.getCookieStore().getCookies().size() > 0) {
          httpURLConne.setRequestProperty("Cookie", TextUtils.join(";", a.getCookieStore().getCookies()));
       }
       httpURLConne.setConnectTimeout(0x4e20);
       httpURLConne.setReadTimeout(0x7530);
       boolean b = true;
       httpURLConne.setInstanceFollowRedirects(b);
       httpURLConne.setRequestProperty("User-Agent", "msp");
       a$a b1 = p1.b;
       String str2 = "POST";
       if (b1 != null && b1.length > 0) {
          httpURLConne.setRequestMethod(str2);
          httpURLConne.setRequestProperty("Content-Type", "application/octet-stream;binary/octet-stream");
          httpURLConne.setRequestProperty("Accept-Charset", "UTF-8");
          httpURLConne.setRequestProperty("Connection", str);
          httpURLConne.setRequestProperty(str, "timeout=180, max=100");
       }else {
          httpURLConne.setRequestMethod("GET");
       }
       c = p1.c;
       if (c != null) {
          Iterator iterator = c.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getKey() == null) {
                continue ;
             }
             httpURLConne.setRequestProperty(uEntry.getKey(), uEntry.getValue());
          }
       }
       httpURLConne.setDoInput(b);
       if (str2.equals(httpURLConne.getRequestMethod())) {
          httpURLConne.setDoOutput(b);
       }
       if (str2.equals(httpURLConne.getRequestMethod())) {
          uBufferedOut = new BufferedOutputStream(httpURLConne.getOutputStream());
          uBufferedOut.write(p1.b);
          uBufferedOut.flush();
       }else {
          uBufferedOut = null;
       }
       BufferedInputStream uBufferedInp = new BufferedInputStream(httpURLConne.getInputStream());
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = 1024;
       byte[] uobyteArray = new byte[i];
       int i1 = uBufferedInp.read(uobyteArray, 0, i);
       while (i1 != -1) {
          uByteArrayOu.write(uobyteArray, 0, i1);
       }
       uByteArrayOu.flush();
       byte[] uobyteArray1 = uByteArrayOu.toByteArray();
       Map headerFields = httpURLConne.getHeaderFields();
       str2 = (headerFields != null && headerFields.get(null) != null)? TextUtils.join(",", headerFields.get(null)): null;
       List list = headerFields.get("Set-Cookie");
       if (list != null) {
          Iterator iterator1 = list.iterator();
          while (iterator1.hasNext()) {
             List list1 = HttpCookie.parse(iterator1.next());
             if (list1 == null || list1.isEmpty()) {
                continue ;
             }
             a.a.getCookieStore().add(uRL.toURI(), list1.get(0));
          }
       }
       a$b uob = new a$b(headerFields, str2, uobyteArray1);
       httpURLConne.disconnect();
       uBufferedInp.close();
       if (uBufferedOut != null) {
          uBufferedOut.close();
       }
       return uob;
    }
    public static Proxy b(Context p0){
       NetworkInfo activeNetwor;
       String str;
       Proxy proxy = null;
       try{
          activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo();
       }catch(java.lang.Exception e0){
          activeNetwor = e0;
       }
       try{
          if (activeNetwor != null && activeNetwor.isAvailable()) {
             str = (activeNetwor.getType() == 1)? "wifi": (activeNetwor.getExtraInfo()).toLowerCase();
          }else {
             str = "none";
          }
       }catch(java.lang.Exception e0){
       }
       if (str != null && !str.contains("wap")) {
          return e0;
       }else {
          str = System.getProperty("https.proxyHost");
          String property = System.getProperty("https.proxyPort");
          if (!TextUtils.isEmpty(str)) {
             proxy = new Proxy(Proxy$Type.HTTP, new InetSocketAddress(str, Integer.parseInt(property)));
          }
          return proxy;
       }
    }
}
