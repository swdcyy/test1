package com.alipay.android.phone.mrpc.core.q;
import java.util.concurrent.Callable;
import com.alipay.android.phone.mrpc.core.ad;
import com.alipay.android.phone.mrpc.core.l;
import com.alipay.android.phone.mrpc.core.o;
import java.lang.Object;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.impl.client.BasicCookieStore;
import java.lang.String;
import java.lang.Long;
import org.apache.http.HttpResponse;
import com.alipay.android.phone.mrpc.core.HttpUrlHeader;
import org.apache.http.Header;
import java.util.HashMap;
import com.alipay.android.phone.mrpc.core.b;
import java.lang.System;
import com.alipay.android.phone.mrpc.core.u;
import java.lang.Thread;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import com.alipay.android.phone.mrpc.core.p;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.io.IOException;
import java.io.InputStream;
import com.alipay.android.phone.mrpc.core.t;
import com.alipay.android.phone.mrpc.core.ac;
import java.io.Closeable;
import com.alipay.android.phone.mrpc.core.r;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.net.URI;
import org.apache.http.client.methods.HttpUriRequest;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpRequest;
import com.kuaishou.webkit.CookieManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.params.HttpParams;
import android.net.Proxy;
import org.apache.http.HttpHost;
import java.net.URL;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import com.kuaishou.webkit.CookieSyncManager;
import com.alipay.android.phone.mrpc.core.HttpException;
import java.lang.Integer;
import java.net.URISyntaxException;

public final class q implements Callable	// class@000e57
{
    public l a;
    public Context b;
    public o c;
    public String d;
    public HttpUriRequest f;
    public HttpContext g;
    public CookieStore h;
    public CookieManager i;
    public AbstractHttpEntity j;
    public HttpHost k;
    public URL l;
    public int m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public static final HttpRequestRetryHandler e;

    static {
       q.e = new ad();
    }
    public void q(l p0,o p1){
       super();
       this.g = new BasicHttpContext();
       this.h = new BasicCookieStore();
       this.m = 0;
       this.n = false;
       this.o = false;
       this.p = null;
       this.a = p0;
       this.b = p0.a;
       this.c = p1;
    }
    public static long a(String[] p0){
       int i1;
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return 0;
          }
          if (("max-age").equalsIgnoreCase(p0[i])) {
             i1 = i + 1;
             if (p0[i1] != null) {
                break ;
             }
          }
          i = e0 + 1;
       }
       try{
          return Long.parseLong(p0[i1]);
       }catch(java.lang.Exception e0){
       }
    }
    public static HttpUrlHeader a(HttpResponse p0){
       HttpUrlHeader httpUrlHeade = new HttpUrlHeader();
       Header[] allHeaders = p0.getAllHeaders();
       int len = allHeaders.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = allHeaders[i];
          String name = oobject.getName();
          httpUrlHeade.setHead(name, oobject.getValue());
       }
       return httpUrlHeade;
    }
    public static HashMap a(String p0){
       String[] stringArray1;
       HashMap hashMap = new HashMap();
       String[] stringArray = p0.split(";");
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = stringArray[i];
          if (oobject.indexOf(61) == -1) {
             stringArray1 = new String[]{"Content-Type",oobject};
          }else {
             stringArray1 = oobject.split("=");
          }
          hashMap.put(stringArray1[0], stringArray1[1]);
       }
       return hashMap;
    }
    public static long b(HttpResponse p0){
       Header firstHeader1;
       long l;
       Header firstHeader = p0.getFirstHeader("Cache-Control");
       if (firstHeader != null) {
          String[] stringArray = (firstHeader.getValue()).split("=");
          if (stringArray.length >= 2) {
             try{
                return q.a(stringArray);
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
    }
    public final o a(){
       return this.c;
    }
    public final u a(HttpResponse p0,int p1,String p2){
       String str1;
       Thread.currentThread().getId();
       HttpEntity entity = p0.getEntity();
       String str = null;
       if (entity != null && p0.getStatusLine().getStatusCode() == 200) {
          Thread.currentThread().getId();
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          this.a(entity, uByteArrayOu);
          byte[] uobyteArray = uByteArrayOu.toByteArray();
          this.o = false;
          this.a.c((System.currentTimeMillis() - System.currentTimeMillis()));
          this.a.a((long)uobyteArray.length);
          p op = new p(q.a(p0), p1, p2, uobyteArray);
          long l = q.b(p0);
          Header contentType = p0.getEntity().getContentType();
          if (contentType != null) {
             HashMap hashMap = q.a(contentType.getValue());
             str = hashMap.get("charset");
             str1 = hashMap.get("Content-Type");
          }else {
             str1 = str;
          }
          op.b(str1);
          op.a(str);
          op.a(System.currentTimeMillis());
          try{
             op.b(l);
             uByteArrayOu.close();
             str = op;
          }catch(java.io.IOException e10){
             throw new RuntimeException("ArrayOutputStream close error!", e10.getCause());
          }
       }else if(entity == null){
          p0.getStatusLine().getStatusCode();
       }
       return str;
    }
    public final void a(HttpEntity p0,OutputStream p1){
       InputStream inputStream = b.a(p0);
       p0.getContentLength();
       try{
          int i = 2048;
          byte[] uobyteArray = new byte[i];
          int i1 = inputStream.read(uobyteArray);
          while (i1 != -1 && !this.c.h()) {
             p1.write(uobyteArray, 0, i1);
             this.c.f();
          }
          p1.flush();
          r.a(inputStream);
          return;
       }catch(java.lang.Exception e4){
          e4.getCause();
          throw new IOException("HttpWorker Request Error!"+e4.getLocalizedMessage());
       }
    }
    public final URI b(){
       String str = this.c.a();
       q td = this.d;
       if (td != null) {
          str = td;
       }
       if (str != null) {
          return new URI(str);
       }else {
          throw new RuntimeException("url should not be null");
       }
    }
    public final HttpUriRequest c(){
       q tf = this.f;
       if (tf != null) {
          return tf;
       }
       if (this.j == null) {
          byte[] uobyteArray = this.c.b();
          String str = this.c.b("gzip");
          if (uobyteArray != null) {
             this.j = (TextUtils.equals(str, "true"))? b.a(uobyteArray): new ByteArrayEntity(uobyteArray);
             this.j.setContentType(this.c.c());
          }
       }
       tf = this.j;
       if (tf != null) {
          HttpPost httpPost = new HttpPost(this.b());
          httpPost.setEntity(tf);
          this.f = httpPost;
       }else {
          this.f = new HttpGet(this.b());
       }
       return this.f;
    }
    public final Object call(){
       return this.d();
    }
    public final u d(){
       q oq;
       HttpHost httpHost1;
       HttpHost httpHost2;
       String str3;
       String str = "connectivity";
    label_0002 :
       int i = 0;
       try{
          NetworkInfo[] allNetworkIn = this.b.getSystemService(str).getAllNetworkInfo();
          HttpException httpExceptio = 1;
          if (allNetworkIn != null) {
             int statusCode = allNetworkIn.length;
             int i2 = 0;
             while (true) {
                if (i2 < statusCode) {
                   object oobject = allNetworkIn[i2];
                   if (oobject != null && (oobject.isAvailable() && oobject.isConnectedOrConnecting())) {
                      oq = 1;
                      break ;
                   }else {
                      i2 = i2 + 1;
                   }
                }
             }
             if (oq) {
                ArrayList uArrayList = this.c.d();
                if (uArrayList != null && !uArrayList.isEmpty()) {
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      this.c().addHeader(iterator.next());
                   }
                }
                b.a(this.c());
                b.b(this.c());
                this.c().addHeader("cookie", this.i().getCookie(this.c.a()));
                oq = this.g;
                try{
                   String str1 = "http.cookie-store";
                   oq.setAttribute(str1, this.h);
                   this.a.a().a(q.e);
                   long l = System.currentTimeMillis();
                   this.f();
                   this.f.getURI().toString();
                   HttpParams params = this.a.a().getParams();
                   try{
                      StringBuilder str2 = "http.route.default-proxy";
                      NetworkInfo activeNetwor = this.b.getSystemService(str).getActiveNetworkInfo();
                      HttpHost httpHost = null;
                      if (activeNetwor != null && activeNetwor.isAvailable()) {
                         String defaultHost = Proxy.getDefaultHost();
                         int defaultPort = Proxy.getDefaultPort();
                         if (defaultHost != null) {
                            httpHost1 = new HttpHost(defaultHost, defaultPort);
                         label_00d3 :
                            if (httpHost1 == null || (!TextUtils.equals(httpHost1.getHostName(), "127.0.0.1") || httpHost1.getPort() != 8087)) {
                               httpHost = httpHost1;
                            }
                            params.setParameter(str2, httpHost);
                            oq = this.k;
                            if (oq == null) {
                               URL uRL = this.h();
                               defaultHost = uRL.getHost();
                               HttpHost httpHost3 = new HttpHost(defaultHost, this.g(), uRL.getProtocol());
                               this.k = httpHost3;
                               httpHost2 = httpHost3;
                            }
                            if (this.g() == 80) {
                               httpHost2 = new HttpHost(this.h().getHost());
                            }
                            HttpResponse httpResponse = this.a.a().execute(httpHost2, this.f, this.g);
                            long l1 = System.currentTimeMillis() - l;
                            this.a.b(l1);
                            List cookies = this.h.getCookies();
                            if (this.c.e()) {
                               this.i().removeAllCookie();
                            }
                            try{
                               if (!cookies.isEmpty()) {
                                  Iterator iterator1 = cookies.iterator();
                                  while (iterator1.hasNext()) {
                                     Cookie uCookie = iterator1.next();
                                     if (uCookie.getDomain() != null) {
                                        str2 = uCookie.getName()+"="+uCookie.getValue()+"; domain="+uCookie.getDomain();
                                        str3 = (uCookie.isSecure())? "; Secure": "";
                                        this.i().setCookie(this.c.a(), str2+str3);
                                        CookieSyncManager.getInstance().sync();
                                     }
                                  }
                               }
                               statusCode = httpResponse.getStatusLine().getStatusCode();
                               str3 = httpResponse.getStatusLine().getReasonPhrase();
                               if (statusCode != 200) {
                                  if (statusCode != 304) {
                                     httpExceptio = null;
                                  }
                                  if (!httpExceptio) {
                                     throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
                                  }
                               }
                               u ou = this.a(httpResponse, statusCode, str3);
                               q oq1 = -1;
                               long l2 = (ou != null && ou.b() != null)? (long)ou.b().length: oq1;
                               if (!l2 - oq1 && ou instanceof p) {
                                  u ou1 = ou;
                                  try{
                                     Long.parseLong(ou1.a().getHead("Content-Length"));
                                  }catch(java.lang.Exception e0){
                                  }
                                  if (!TextUtils.isEmpty(this.f())) {
                                     this.f();
                                  }
                               }
                               if (this.c.a() != null && !TextUtils.isEmpty(this.f())) {
                                  goto label_022b ;
                               }
                               return ou;
                            }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
                            label_037a :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(2), String.valueOf(e0));
                            }catch(javax.net.ssl.SSLException e0){
                            label_035a :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(6), String.valueOf(e0));
                            }catch(org.apache.http.conn.ConnectionPoolTimeoutException e0){
                            label_033a :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(3), String.valueOf(e0));
                            }catch(org.apache.http.conn.ConnectTimeoutException e0){
                            label_031a :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(3), String.valueOf(e0));
                            }catch(java.net.SocketTimeoutException e0){
                            label_02f9 :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(4), String.valueOf(e0));
                            }catch(org.apache.http.NoHttpResponseException e0){
                            label_02d8 :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(5), String.valueOf(e0));
                            }catch(org.apache.http.conn.HttpHostConnectException e0){
                            label_02b9 :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               throw new HttpException(Integer.valueOf(8), String.valueOf(e0));
                            }catch(java.net.UnknownHostException e0){
                            label_0297 :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(9), String.valueOf(e0));
                            }catch(java.io.IOException e0){
                            label_0277 :
                               this.e();
                               if (this.c.f() != null) {
                                  e0.toString();
                               }
                               e0.toString();
                               throw new HttpException(Integer.valueOf(6), String.valueOf(e0));
                            }catch(java.io.IOException e0){
                            }catch(java.io.IOException e0){
                            }
                         }
                      }
                   label_00d2 :
                      httpHost1 = httpHost;
                      goto label_00d3 ;
                   }catch(javax.net.ssl.SSLHandshakeException e0){
                      this.e();
                      if (this.c.f() != null) {
                         e0.toString();
                      }
                      e0.toString();
                      throw new HttpException(Integer.valueOf(2), String.valueOf(e0));
                   }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
                   }catch(javax.net.ssl.SSLException e0){
                   }catch(org.apache.http.conn.ConnectionPoolTimeoutException e0){
                   }catch(org.apache.http.conn.ConnectTimeoutException e0){
                   }catch(java.net.SocketTimeoutException e0){
                   }catch(org.apache.http.NoHttpResponseException e0){
                   }catch(org.apache.http.conn.HttpHostConnectException e0){
                   }catch(java.net.UnknownHostException e0){
                   }catch(java.io.IOException e0){
                   }catch(java.lang.NullPointerException e1){
                   label_0258 :
                      this.e();
                      q tm = this.m;
                      if (tm <= null) {
                         int i1 = tm + 1;
                         this.m = i1;
                         goto label_0002 ;
                      }else {
                         e1.toString();
                         throw new HttpException(Integer.valueOf(i), String.valueOf(e1));
                      }
                   }catch(java.lang.NullPointerException e0){
                   }
                }catch(java.net.URISyntaxException e0){
                   throw new RuntimeException("Url parser error!", e0.getCause());
                }catch(javax.net.ssl.SSLHandshakeException e0){
                }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
                }catch(javax.net.ssl.SSLException e0){
                }catch(org.apache.http.conn.ConnectionPoolTimeoutException e0){
                }catch(org.apache.http.conn.ConnectTimeoutException e0){
                }catch(java.net.SocketTimeoutException e0){
                }catch(org.apache.http.NoHttpResponseException e0){
                }catch(org.apache.http.conn.HttpHostConnectException e0){
                }catch(java.net.UnknownHostException e0){
                }catch(java.io.IOException e0){
                }catch(java.lang.NullPointerException e1){
                }catch(java.lang.Exception e0){
                   this.e();
                   if (this.c.f() != null) {
                      e0.toString();
                   }
                   throw new HttpException(Integer.valueOf(i), String.valueOf(e0));
                }
             }else {
                throw new HttpException(Integer.valueOf(httpExceptio), "The network is not available");
             }
          }
          oq = null;
          goto label_0030 ;
       }catch(com.alipay.android.phone.mrpc.core.HttpException e0){
          this.e();
          if (this.c.f() != null) {
             e0.getCode();
             e0.getMsg();
          }
          e0.toString();
          throw e0;
       }catch(java.net.URISyntaxException e0){
       }catch(javax.net.ssl.SSLHandshakeException e0){
       }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
       }catch(javax.net.ssl.SSLException e0){
       }catch(org.apache.http.conn.ConnectionPoolTimeoutException e0){
       }catch(org.apache.http.conn.ConnectTimeoutException e0){
       }catch(java.net.SocketTimeoutException e0){
       }catch(org.apache.http.NoHttpResponseException e0){
       }catch(org.apache.http.conn.HttpHostConnectException e0){
       }catch(java.net.UnknownHostException e0){
       }catch(java.io.IOException e0){
       }catch(java.lang.NullPointerException e1){
       }catch(java.lang.Exception e0){
       }catch( e0){
       }
    }
    public final void e(){
       q tf = this.f;
       if (tf != null) {
          tf.abort();
       }
       return;
    }
    public final String f(){
       if (!TextUtils.isEmpty(this.q)) {
          return this.q;
       }
       String str = this.c.b("operationType");
       this.q = str;
       return str;
    }
    public final int g(){
       URL uRL = this.h();
       if (uRL.getPort() == -1) {
          return uRL.getDefaultPort();
       }
       return uRL.getPort();
    }
    public final URL h(){
       q tl = this.l;
       if (tl != null) {
          return tl;
       }
       URL uRL = new URL(this.c.a());
       this.l = uRL;
       return uRL;
    }
    public final CookieManager i(){
       q ti = this.i;
       if (ti != null) {
          return ti;
       }
       CookieManager instance = CookieManager.getInstance();
       this.i = instance;
       return instance;
    }
}
