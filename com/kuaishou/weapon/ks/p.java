package com.kuaishou.weapon.ks.p;
import javax.net.ssl.TrustManager;
import com.kuaishou.weapon.ks.p$1;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.ks.l;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.net.HttpURLConnection;
import java.io.InputStream;
import com.kuaishou.weapon.ks.q;
import android.text.TextUtils;
import org.json.JSONObject;
import java.io.OutputStream;
import java.lang.System;
import java.io.ByteArrayOutputStream;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import com.kuaishou.weapon.ks.n;
import javax.net.ssl.SSLContext;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import java.io.File;
import java.util.zip.GZIPInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import com.kuaishou.weapon.ks.d;
import com.kuaishou.weapon.ks.bs;
import java.lang.Throwable;

public class p	// class@00121b
{
    public boolean e;
    public static TrustManager[] a;
    public static SSLSocketFactory b;
    public static p f;
    public static Context g;

    static {
       TrustManager[] trustManager = new TrustManager[]{new p$1()};
       p.a = trustManager;
    }
    public void p(Context p0){
       this.e = false;
       p.g = p0;
    }
    public static p a(Context p0){
       if (p.f == null) {
          _monitor_enter(p.class);
          if (p.f == null) {
             p.f = new p(p0);
          }
          _monitor_exit(p.class);
       }
       return p.f;
    }
    public static void a(String p0){
       try{
          new l(p.g).c("plc001_scc_e", p0, true);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void a(X509Certificate[] p0){
       p.b(p0);
    }
    public static void b(X509Certificate[] p0){
       if (p0 != null && p0.length) {
          String name = p0[0].getIssuerX500Principal().getName();
          if (Pattern.compile(".*\(GeoTrust|VeriSign|Symantec|GlobalSign|Entrust|Thawte|DigiCert\).*", 2).matcher(name).matches()) {
             return;
          }else {
             p.a(name);
          }
       }
       return;
    }
    public final InputStream a(HttpURLConnection p0){
       if (p0 == null) {
          return null;
       }
       try{
          this.e = (("gzip").equalsIgnoreCase(p0.getContentEncoding()))? true: false;
          return p0.getInputStream();
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public String a(q p0){
       InputStream inputStream;
       ByteArrayOutputStream uByteArrayOu1;
       String str1;
       int i = 0;
       HttpURLConnection httpURLConne = this.a(p0.a, "POST");
       String str = p0.b();
       if (!TextUtils.isEmpty(str) && httpURLConne != null) {
          httpURLConne.setRequestProperty("Cookie", str);
       }
       str = p0.c();
       if (!TextUtils.isEmpty(str) && httpURLConne != null) {
          httpURLConne.setRequestProperty("env", str);
       }
       byte[] bytes = (p0.a() != null)? (p0.a().toString()).getBytes(): null;
       if (bytes != null && bytes.length > 0) {
          httpURLConne.setRequestProperty("Content-Length", String.valueOf(bytes.length));
          OutputStream outputStream = httpURLConne.getOutputStream();
          outputStream.write(bytes);
          outputStream.flush();
          outputStream.close();
       }
       if (httpURLConne.getResponseCode() == 200) {
          inputStream = httpURLConne.getInputStream();
          try{
             new l(p.g).b("plc001_t_d", (httpURLConne.getDate() - System.currentTimeMillis()));
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
             byte[] uobyteArray = new byte[1024];
             int i1 = inputStream.read(uobyteArray);
             while (i1 != -1) {
                uByteArrayOu.write(uobyteArray, e0, i1);
             }
             uByteArrayOu1 = uByteArrayOu;
             str1 = uByteArrayOu.toString();
             i = 1;
          }catch(java.lang.Exception e0){
          }
       }else {
          str1 = "code:"+httpURLConne.getResponseCode();
          inputStream = null;
          uByteArrayOu1 = inputStream;
       }
    }
    public String a(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       String str = "";
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = str+"&"+uEntry.getKey()+"="+uEntry.getValue();
       }
       return str.substring(1);
    }
    public HttpURLConnection a(String p0,String p1){
       HttpsURLConnection httpsURLConn;
       int i = 0;
       try{
          URL uRL = new URL(p0);
          if (("https").equals(uRL.getProtocol())) {
             httpsURLConn = uRL.openConnection();
             this.a(httpsURLConn);
          }else {
             httpsURLConn = uRL.openConnection();
          }
          HttpsURLConnection httpsURLConn1 = httpsURLConn;
          httpsURLConn1.setRequestMethod(p1);
          httpsURLConn1.setAllowUserInteraction(true);
          httpsURLConn1.setInstanceFollowRedirects(true);
          httpsURLConn1.setChunkedStreamingMode(0);
          httpsURLConn1.setConnectTimeout(0x4e20);
          httpsURLConn1.setReadTimeout(0x4e20);
          httpsURLConn1.setRequestProperty("Charset", "UTF-8");
          httpsURLConn1.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
          if (p1.equalsIgnoreCase("post")) {
             httpsURLConn1.setDoInput(true);
             httpsURLConn1.setDoOutput(true);
             httpsURLConn1.setUseCaches(0);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public void a(q p0,n p1){
       this.a(p0, p1, "GET");
    }
    public void a(q p0,n p1,String p2){
       OutputStream outputStream;
       InputStream inputStream;
       String str = null;
       HttpURLConnection httpURLConne = this.a(p0.a, p2);
       String str1 = p0.b();
       if (!TextUtils.isEmpty(str1) && httpURLConne != null) {
          httpURLConne.setRequestProperty("Cookie", str1);
       }
       str1 = p0.c();
       if (!TextUtils.isEmpty(str1) && httpURLConne != null) {
          httpURLConne.setRequestProperty("env", str1);
       }
       if (p2.equalsIgnoreCase("post")) {
          byte[] bytes = (p0.a() != null)? (p0.a().toString()).getBytes(): str;
          if (bytes != null && bytes.length > 0) {
             httpURLConne.setRequestProperty("Content-Length", String.valueOf(bytes.length));
             outputStream = httpURLConne.getOutputStream();
             outputStream.write(bytes);
             outputStream.flush();
             outputStream.close();
          }
       }
    label_0061 :
       int i = 0;
       if (httpURLConne.getResponseCode() == 200) {
          inputStream = httpURLConne.getInputStream();
          try{
             new l(p.g).b("plc001_t_d", (httpURLConne.getDate() - System.currentTimeMillis()));
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
             byte[] uobyteArray = new byte[1024];
             int i1 = inputStream.read(uobyteArray);
             while (i1 != -1) {
                uByteArrayOu.write(uobyteArray, i, i1);
             }
             i = 1;
             str = uByteArrayOu;
             uByteArrayOu = uByteArrayOu.toString();
          }catch(java.lang.Exception e0){
          }
       }else {
          outputStream = "code:"+httpURLConne.getResponseCode();
          inputStream = str;
       }
    }
    public synchronized final void a(HttpsURLConnection p0){
       if (p0 != null) {
          if (p.b == null) {
             SSLContext instance = SSLContext.getInstance("TLS");
             instance.init(null, p.a, new SecureRandom());
             p.b = instance.getSocketFactory();
          }
          SSLSocketFactory b = p.b;
          if (b != null) {
             p0.setSSLSocketFactory(b);
          }
       }
       return;
    }
    public final boolean a(InputStream p0,File p1){
       BufferedOutputStream uBufferedOut;
       byte[] uobyteArray;
       int i;
       boolean b;
       if (this.e != null) {
          try{
             GZIPInputStream gZIPInputStr = new GZIPInputStream(p0);
          }catch(java.io.IOException e0){
          }
       }
    }
    public boolean a(String p0,File p1){
       String str = "0";
       if (TextUtils.isEmpty(p0)) {
          HashMap hashMap = new HashMap();
          hashMap.put("e", "url is null");
          hashMap.put("l", "net2");
          if (!d.a(p.g).f("a1_p_s_p_s")) {
             str = "1";
          }
          hashMap.put("n", str);
          bs.a(p.g, "1002001", hashMap);
          return false;
       }else {
          HttpURLConnection httpURLConne = this.a(p0, "GET");
          InputStream inputStream = this.a(httpURLConne);
          boolean b = this.a(inputStream, p1);
          if (inputStream != null) {
             inputStream.close();
          }
          if (httpURLConne != null) {
             httpURLConne.disconnect();
          }
          return b;
       }
    }
    public void b(q p0,n p1){
       this.a(p0, p1, "POST");
    }
}
