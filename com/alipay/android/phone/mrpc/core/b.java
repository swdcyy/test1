package com.alipay.android.phone.mrpc.core.b;
import org.apache.http.client.HttpClient;
import java.lang.String;
import com.alipay.android.phone.mrpc.core.c;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import java.lang.Object;
import java.lang.IllegalStateException;
import com.alipay.android.phone.mrpc.core.d;
import com.alipay.android.phone.mrpc.core.b$b;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import android.net.SSLSessionCache;
import org.apache.http.conn.ssl.SSLSocketFactory;
import android.net.SSLCertificateSocketFactory;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.params.ConnPerRoute;
import java.security.Security;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.HttpEntity;
import java.io.InputStream;
import org.apache.http.Header;
import java.lang.CharSequence;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.methods.HttpUriRequest;
import java.lang.StringBuilder;
import java.net.URI;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.HttpRequest;
import org.apache.http.HttpEntityEnclosingRequest;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import android.util.Base64;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import java.util.zip.GZIPOutputStream;
import com.alipay.android.phone.mrpc.core.k;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.HttpHost;
import org.apache.http.client.ResponseHandler;
import org.apache.http.protocol.HttpContext;
import org.apache.http.HttpResponse;

public final class b implements HttpClient	// class@000e47
{
    public final HttpClient d;
    public RuntimeException e;
    public b$b f;
    public static long a = 0xa0;
    public static String[] b;
    public static final HttpRequestInterceptor c;

    static {
       String[] stringArray = new String[]{"text/","application/xml","application/json"};
       b.b = stringArray;
       b.c = new c();
    }
    public void b(ClientConnectionManager p0,HttpParams p1){
       super();
       this.e = new IllegalStateException("AndroidHttpClient created and never closed");
       this.d = new d(this, p0, p1);
    }
    public static b$b a(b p0){
       return p0.f;
    }
    public static b a(String p0){
       BasicHttpParams uBasicHttpPa = new BasicHttpParams();
       HttpProtocolParams.setVersion(uBasicHttpPa, HttpVersion.HTTP_1_1);
       HttpProtocolParams.setUseExpectContinue(uBasicHttpPa, false);
       HttpConnectionParams.setStaleCheckingEnabled(uBasicHttpPa, true);
       HttpConnectionParams.setConnectionTimeout(uBasicHttpPa, 0x4e20);
       HttpConnectionParams.setSoTimeout(uBasicHttpPa, 0x7530);
       HttpConnectionParams.setSocketBufferSize(uBasicHttpPa, 8192);
       HttpClientParams.setRedirecting(uBasicHttpPa, true);
       HttpClientParams.setAuthenticating(uBasicHttpPa, false);
       HttpProtocolParams.setUserAgent(uBasicHttpPa, p0);
       SchemeRegistry schemeRegist = new SchemeRegistry();
       schemeRegist.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
       schemeRegist.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(0x7530, null), 443));
       ThreadSafeClientConnManager threadSafeCl = new ThreadSafeClientConnManager(uBasicHttpPa, schemeRegist);
       ConnManagerParams.setTimeout(uBasicHttpPa, 0xea60);
       ConnManagerParams.setMaxConnectionsPerRoute(uBasicHttpPa, new ConnPerRouteBean(10));
       ConnManagerParams.setMaxTotalConnections(uBasicHttpPa, 50);
       Security.setProperty("networkaddress.cache.ttl", "-1");
       HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
       return new b(threadSafeCl, uBasicHttpPa);
    }
    public static InputStream a(HttpEntity p0){
       InputStream content = p0.getContent();
       if (content == null) {
          return content;
       }
       Header contentEncod = p0.getContentEncoding();
       if (contentEncod == null) {
          return content;
       }
       String value = contentEncod.getValue();
       if (value == null) {
          return content;
       }
       if (value.contains("gzip")) {
          content = new GZIPInputStream(content);
       }
       return content;
    }
    public static String a(HttpUriRequest p0){
       String str2;
       StringBuilder str = "curl ";
       Header[] allHeaders = p0.getAllHeaders();
       int len = allHeaders.length;
       int i = 0;
       while (i < len) {
          object oobject = allHeaders[i];
          if (!(oobject.getName()).equals("Authorization") && !(oobject.getName()).equals("Cookie")) {
             str = str+"--header \""+(oobject.toString()).trim()+"\" ";
          }
          i = i + 1;
       }
       URI uRI = p0.getURI();
       if (p0 instanceof RequestWrapper) {
          HttpRequest original = p0.getOriginal();
          if (original instanceof HttpUriRequest) {
             uRI = original.getURI();
          }
       }
       String str1 = "\"";
       str = str+str1+uRI+str1;
       if (p0 instanceof HttpEntityEnclosingRequest) {
          HttpEntity entity = p0.getEntity();
          if (entity != null && entity.isRepeatable()) {
             if (entity.getContentLength() - 1024 < 0) {
                ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                entity.writeTo(uByteArrayOu);
                if (b.b(p0)) {
                   str.insert(0, "echo \'"+Base64.encodeToString(uByteArrayOu.toByteArray(), 2)+"\' | base64 -d > /tmp/$$.bin; ");
                   str2 = " --data-binary @/tmp/$$.bin";
                }else {
                   str = str+" --data-ascii \""+uByteArrayOu.toString()+str1;
                }
             }else {
                str2 = " [TOO MUCH DATA TO INCLUDE]";
             }
             str = str+str2;
          }
       }
       return str;
    }
    public static HttpRequestInterceptor a(){
       return b.c;
    }
    public static AbstractHttpEntity a(byte[] p0){
       ByteArrayEntity uByteArrayEn;
       if ((long)p0.length - b.a < 0) {
          uByteArrayEn = new ByteArrayEntity(p0);
       }else {
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
          gZIPOutputSt.write(p0);
          gZIPOutputSt.close();
          ByteArrayEntity uByteArrayEn1 = new ByteArrayEntity(uByteArrayOu.toByteArray());
          uByteArrayEn1.setContentEncoding("gzip");
          uByteArrayEn1.getContentLength();
          uByteArrayEn = uByteArrayEn1;
       }
       return uByteArrayEn;
    }
    public static void a(HttpRequest p0){
       p0.addHeader("Accept-Encoding", "gzip");
    }
    public static long b(String p0){
       return k.a(p0);
    }
    public static void b(HttpRequest p0){
       p0.addHeader("Connection", "Keep-Alive");
    }
    public static boolean b(HttpUriRequest p0){
       int len;
       Header[] headers = p0.getHeaders("content-encoding");
       if (headers != null) {
          len = headers.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (("gzip").equalsIgnoreCase(headers[i].getValue())) {
                   return true;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       Header[] headers1 = p0.getHeaders("content-type");
       if (headers1 != null) {
          int len1 = headers1.length;
          len = 0;
          while (len < len1) {
             object oobject = headers1[len];
             String[] b = b.b;
             int len2 = b.length;
             int i1 = 0;
             while (true) {
                if (i1 < len2) {
                   if ((oobject.getValue()).startsWith(b[i1])) {
                      return false;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   len = len + 1;
                }
             }
          }
       }
       return true;
    }
    public final void a(HttpRequestRetryHandler p0){
       this.d.setHttpRequestRetryHandler(p0);
    }
    public final Object execute(HttpHost p0,HttpRequest p1,ResponseHandler p2){
       return this.d.execute(p0, p1, p2);
    }
    public final Object execute(HttpHost p0,HttpRequest p1,ResponseHandler p2,HttpContext p3){
       return this.d.execute(p0, p1, p2, p3);
    }
    public final Object execute(HttpUriRequest p0,ResponseHandler p1){
       return this.d.execute(p0, p1);
    }
    public final Object execute(HttpUriRequest p0,ResponseHandler p1,HttpContext p2){
       return this.d.execute(p0, p1, p2);
    }
    public final HttpResponse execute(HttpHost p0,HttpRequest p1){
       return this.d.execute(p0, p1);
    }
    public final HttpResponse execute(HttpHost p0,HttpRequest p1,HttpContext p2){
       return this.d.execute(p0, p1, p2);
    }
    public final HttpResponse execute(HttpUriRequest p0){
       return this.d.execute(p0);
    }
    public final HttpResponse execute(HttpUriRequest p0,HttpContext p1){
       return this.d.execute(p0, p1);
    }
    public final ClientConnectionManager getConnectionManager(){
       return this.d.getConnectionManager();
    }
    public final HttpParams getParams(){
       return this.d.getParams();
    }
}
