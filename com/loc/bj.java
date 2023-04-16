package com.loc.bj;
import java.lang.Object;
import com.loc.bj$f;
import com.loc.m;
import java.util.UUID;
import java.lang.String;
import java.lang.Throwable;
import com.loc.ak;
import java.lang.Exception;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.net.ConnectException;
import java.net.SocketException;
import org.apache.http.conn.ConnectTimeoutException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.net.URLEncoder;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.bj$b;
import com.loc.bm;
import com.loc.bi;
import java.net.HttpURLConnection;
import com.loc.bj$c;
import java.net.URL;
import java.io.ByteArrayOutputStream;
import android.os.SystemClock;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;
import com.loc.an;
import com.loc.k;
import java.io.InterruptedIOException;
import java.io.IOException;
import com.loc.bl;
import com.loc.bg;
import com.loc.x;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.net.UnknownHostException;
import java.net.MalformedURLException;
import javax.net.ssl.SSLException;
import java.util.HashMap;
import com.loc.bc;
import com.loc.p;
import com.loc.bj$a;
import java.lang.Long;
import com.loc.bk;
import java.lang.ref.SoftReference;
import android.content.Context;
import javax.net.ssl.SSLContext;
import com.loc.bj$d;
import java.net.Proxy;
import com.loc.bg$a;
import com.loc.q;
import com.loc.bl$b;
import com.loc.bj$e;
import android.net.Uri;
import android.net.Uri$Builder;
import java.net.InetAddress;
import java.net.Inet6Address;
import java.net.Inet4Address;
import java.util.Objects;
import java.net.URLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import com.loc.m$f;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import android.os.Build$VERSION;

public final class bj	// class@00139b
{
    public boolean a;
    public SSLContext b;
    public Proxy c;
    public boolean d;
    public long e;
    public long f;
    public String g;
    public bg$a h;
    public bj$d i;
    public String j;
    public boolean l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public String s;
    public bj$f u;
    public static SoftReference k;
    public static SoftReference t;

    public void bj(){
       super();
       this.d = false;
       this.e = -1;
       this.f = 0;
       this.j = "";
       this.o = false;
       this.p = false;
       this.q = "";
       this.r = "";
       this.s = "";
       this.u = new bj$f(this);
       m.e();
       this.g = ((UUID.randomUUID().toString()).replaceAll("-", "")).toLowerCase();
    }
    public static int a(Exception p0){
       if (p0 instanceof SSLHandshakeException) {
          return 4101;
       }
       if (p0 instanceof SSLKeyException) {
          return 4102;
       }
       if (p0 instanceof SSLProtocolException) {
          return 4103;
       }
       if (p0 instanceof SSLPeerUnverifiedException) {
          return 4104;
       }
       if (p0 instanceof ConnectException) {
          return 6101;
       }
       if (p0 instanceof SocketException) {
          return 6102;
       }
       if (p0 instanceof ConnectTimeoutException) {
          return 2101;
       }
       if (p0 instanceof SocketTimeoutException) {
          return 2102;
       }
       return 0;
    }
    public static String a(bj p0){
       return p0.n;
    }
    public static String a(Map p0){
       if (p0 == null) {
          return null;
       }
       StringBuilder str = "";
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          String value = uEntry.getValue();
          if (value == null) {
             value = "";
          }
          if (str.length() > 0) {
             str = str+"&";
          }
          str = str+URLEncoder.encode(key)+"="+URLEncoder.encode(value);
       }
       return str;
    }
    public static void a(){
    }
    public static boolean a(bj p0,String p1){
       return p0.a(p1);
    }
    public static String b(Map p0){
       String str = "#";
       String str1 = "";
       List list = p0.get("sc");
       if (list != null && list.size() > 0) {
          String str2 = list.get(0);
          if (!TextUtils.isEmpty(str2)) {
             if (str2.contains(str)) {
                String[] stringArray = str2.split(str);
                if (stringArray.length > 1) {
                   str2 = stringArray[0];
                }
             }
             str1 = str2;
          }
       }
       return str1;
    }
    public static boolean b(bj p0){
       return p0.p;
    }
    public static boolean b(String p0){
       if (p0.contains("rest") || p0.contains("apilocate")) {
          return true;
       }
       return false;
    }
    public final bm a(bj$b p0){
       int i4;
       boolean b;
       bj uobj;
       bj ts;
       boolean b1;
       String str = "";
       int i = 0;
       try{
          bi.a();
          p0 = p0.a;
          Map headerFields = p0.getHeaderFields();
          int responseCode = p0.getResponseCode();
          int i1 = 2;
          int i2 = 1;
          int i3 = 0;
          if (headerFields != null) {
             List list = headerFields.get("gsid");
             if (list != null && list.size() > 0) {
                str = list.get(i3);
             }
             this.u.c.k = bj.b(headerFields);
             if (!TextUtils.isEmpty(this.j)) {
                if (this.o != null) {
                   if (headerFields.containsKey("sc")) {
                      b = this.a(headerFields, i3);
                      uobj = 1;
                   }else {
                      m.b(this.j);
                      b = false;
                      uobj = null;
                   }
                }else {
                   b = this.a(headerFields, i2);
                   uobj = 2;
                }
                if (b) {
                   if ((this.j).equals("loc")) {
                      ts = this.s;
                      if (TextUtils.isEmpty(ts)) {
                         ts = p0.getURL().getHost();
                      }
                      bj tj = this.j;
                      b1 = (uobj == i1)? true: false;
                      m.a(tj, b1, ts, ts, this.n);
                   }else {
                      ts = this.j;
                      b1 = (uobj == i1)? true: false;
                      m.b(ts, b1);
                   }
                }else if(uobj == i2){
                   bi.a(i3, this.j);
                }
             }else {
             label_009f :
                b = false;
             }
          }else {
             goto label_009f ;
          }
          if (responseCode == 200) {
             try{
                ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                this.u.b = SystemClock.elapsedRealtime();
                InputStream inputStream = p0.getInputStream();
                try{
                   try{
                      PushbackInputStream pushbackInpu = new PushbackInputStream(inputStream, i1);
                      byte[] uobyteArray = new byte[i1];
                      pushbackInpu.read(uobyteArray);
                      pushbackInpu.unread(uobyteArray);
                      GZIPInputStream gZIPInputStr = (uobyteArray[i3] == 31 && uobyteArray[i2] == -117)? new GZIPInputStream(pushbackInpu): pushbackInpu;
                      uobyteArray = new byte[1024];
                      i2 = gZIPInputStr.read(uobyteArray);
                      while (i2 != -1) {
                         uByteArrayOu.write(uobyteArray, i3, i2);
                      }
                      this.u.c();
                      an.c();
                      bm uobm = new bm();
                      uobm.a = uByteArrayOu.toByteArray();
                      uobm.b = headerFields;
                      uobm.c = this.g;
                      uobm.d = str;
                      uobm.e = b;
                      bi.a(p0.getURL(), uobm);
                      this.u.a((long)uobm.a.length);
                      uByteArrayOu.close();
                      if (inputStream != null) {
                         inputStream.close();
                      }
                      pushbackInpu.close();
                      gZIPInputStr.close();
                      return uobm;
                   }catch(org.apache.http.conn.ConnectTimeoutException e15){
                      int i5 = i;
                   }catch(java.net.SocketTimeoutException e15){
                      i5 = i;
                   }catch(java.io.IOException e15){
                      int i6 = i;
                   }
                }catch(org.apache.http.conn.ConnectTimeoutException e15){
                   i4 = i;
                }catch(java.net.SocketTimeoutException e15){
                   i4 = i;
                }catch(java.io.IOException e15){
                   i4 = i;
                }
             }catch(org.apache.http.conn.ConnectTimeoutException e15){
                i4 = i;
             }catch(java.net.SocketTimeoutException e15){
                i4 = i;
             }catch(java.io.IOException e15){
                i4 = i;
             }
          label_01c3 :
             if (e15 instanceof InterruptedIOException) {
                k ok = new k("IO ²Ù×÷Òì³£ - IOException", str, this.g);
                if (!TextUtils.isEmpty(e15.getMessage()) && (e15.getMessage()).equals("thread interrupted")) {
                   ok.j();
                }
                throw ok;
             }else {
                throw e15;
             }
          }else {
             k ok1 = new k("ÍøÂçÒì³£Ô­Òò£º"+p0.getResponseMessage()+" ÍøÂçÒì³£×´Ì¬Âë£º"+responseCode+"  "+str+" "+this.g, str, this.g);
             ok1.a(p0.getResponseMessage());
             ok1.a(headerFields);
             this.u.b(responseCode);
             this.u.a(10);
             ok1.h();
             throw ok1;
          }
       }catch(org.apache.http.conn.ConnectTimeoutException e15){
          i4 = i;
       }catch(java.net.SocketTimeoutException e15){
          i4 = i;
       }catch(java.io.IOException e15){
          i4 = i;
          goto label_01c3 ;
       }
    }
    public final bm a(bl p0){
       bj$b a;
       String str;
       bj uobj = null;
       try{
          this.b(p0);
          bm uobm = bi.b(this.m, this.j);
          if (uobm != null) {
             this.u.d();
             return uobm;
          }else {
             bj$b uob = this.c(p0);
             try{
                a = uob.a;
                this.u.b = SystemClock.elapsedRealtime();
                a.connect();
                this.u.a();
                byte[] uobyteArray = p0.e();
                if (uobyteArray == null || !uobyteArray.length) {
                   Map map = p0.d();
                   HashMap e = bg.e;
                   if (e != null) {
                      if (map != null) {
                         map.putAll(e);
                      }else {
                         map = e;
                      }
                   }
                   str = bj.a(map);
                   if (!TextUtils.isEmpty(str)) {
                      uobyteArray = x.a(str);
                   }
                }
                if (uobyteArray != null && uobyteArray.length > 0) {
                   str.b = SystemClock.elapsedRealtime();
                   OutputStream outputStream = a.getOutputStream();
                   DataOutputStream uDataOutputS = new DataOutputStream(outputStream);
                   uDataOutputS.write(uobyteArray);
                   uDataOutputS.close();
                   if (outputStream != null) {
                      outputStream.close();
                   }
                   this.u.b();
                }
                bm uobm1 = this.a(uob);
                this.u.a(uobm1);
                a.disconnect();
                this.u.d();
                return uobm1;
             }catch(javax.net.ssl.SSLException e14){
                int i = a;
             }catch(java.net.ConnectException e14){
                i = a;
             }catch(org.apache.http.conn.ConnectTimeoutException e14){
                i = a;
             }catch(java.net.MalformedURLException e14){
                i = a;
             }catch(java.net.UnknownHostException e14){
                i = a;
             }catch(java.net.SocketException e14){
                i = a;
             }catch(java.net.SocketTimeoutException e14){
                i = a;
             }catch(java.io.InterruptedIOException e0){
                i = a;
                this.u.b(7101);
                this.u.a(7);
                throw new k(e0);
             }catch(java.io.IOException e14){
                i = a;
             }catch(com.loc.k e14){
                i = a;
             }
             if (!e14.i() && e14.g() != 10) {
                this.u.a(e14.g());
             }
             ak.a(e14, "ht", "mPt");
             throw e14;
          }
       }catch(javax.net.ssl.SSLException e14){
       }catch(java.net.ConnectException e14){
       }catch(org.apache.http.conn.ConnectTimeoutException e14){
       }catch(java.net.MalformedURLException e14){
       }catch(java.net.UnknownHostException e14){
       }catch(java.net.SocketException e14){
       }catch(java.net.SocketTimeoutException e14){
       }catch(java.io.InterruptedIOException e0){
       }catch(java.io.IOException e14){
       }catch(com.loc.k e14){
          goto label_00eb ;
       }
    }
    public final void a(Map p0,HttpURLConnection p1){
       if (p0 != null) {
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             p1.addRequestProperty(str, p0.get(str));
          }
       }
       HashMap d = bg.d;
       if (d != null) {
          Iterator iterator1 = d.keySet().iterator();
          while (iterator1.hasNext()) {
             String str1 = iterator1.next();
             p1.addRequestProperty(str1, bg.d.get(str1));
          }
       }
       if (!(this.m).contains("/v3/iasdkauth") && (!TextUtils.isEmpty(this.j) && m.a(this.j))) {
          this.o = true;
          p1.addRequestProperty("lct", String.valueOf(m.c(this.j)));
       }
    label_0070 :
       p1.addRequestProperty("csid", this.g);
       if (this.a(this.u.c.e)) {
          bj tu = this.u;
          String str2 = (TextUtils.isEmpty(tu.c.c))? "": p.b(bc.a((tu.c.c).getBytes(), ("YXBtX25ldHdvcmtf").getBytes()));
          if (!TextUtils.isEmpty(str2)) {
             p1.addRequestProperty("sip", str2);
          }
          if (m.j) {
             bj$c uoc = m.g();
             if (uoc != null) {
                p1.addRequestProperty("nls", uoc.b());
                this.u.e = uoc;
             }
          }
          bj$a uoa = m.f();
          if (uoa != null) {
             p1.addRequestProperty("nlf", uoa.b());
             p1.d = uoa;
          }
       }
       return;
    }
    public final boolean a(String p0){
       if (this.l != null || (TextUtils.isEmpty(this.n) || (!(this.n).contains("rest") && ((this.n).contains("apilocate") || bj.b(p0))))) {
          return true;
       }
       return false;
    }
    public final boolean a(Map p0,boolean p1){
       bj uobj;
       String str = "#";
       boolean b = true;
       List list = p0.get("sc");
       if (list != null && list.size() > 0) {
          String str1 = list.get(0);
          if (!TextUtils.isEmpty(str1)) {
             if (str1.contains(str)) {
                String[] stringArray = str1.split(str);
                if (stringArray.length <= b || !("1").equals(stringArray[b])) {
                label_003c :
                   uobj = null;
                label_003d :
                   if (!uobj) {
                      return 0;
                   }else if(p1){
                      if (p0.containsKey("lct")) {
                         List list1 = p0.get("lct");
                         if (list1 != null && list1.size() > 0) {
                            String str2 = list1.get(0);
                            if (!TextUtils.isEmpty(str2)) {
                               b = m.a(this.j, Long.valueOf(str2).longValue());
                            }
                         }
                      }
                      b = false;
                   }
                   return b;
                }
             }
             uobj = 1;
             goto label_003d ;
          }else {
             goto label_003c ;
          }
       }else {
          goto label_003c ;
       }
    }
    public final bk b(){
       SoftReference t = bj.t;
       if (t == null || t.get() == null) {
          bj.t = new SoftReference(new bk(m.c, this.b));
       }
       bk uobk = (bj.k != null)? bj.t.get(): null;
       if (uobk == null) {
          uobk = new bk(m.c, this.b);
       }
       return uobk;
    }
    public final void b(bl p0){
       this.i = new bj$d(0);
       this.p = p0.y();
       this.c = p0.o();
       this.h = p0.t();
       this.l = p0.q();
       this.j = p0.z();
       this.a = q.a().a(p0.s());
       String str = (p0.u().b())? p0.m(): p0.l();
       try{
          this.m = str;
          this.m = bi.a(str, this.j);
          this.n = p0.g();
          if (("loc").equals(this.j)) {
             str = p0.l();
             String str1 = p0.m();
             if (!TextUtils.isEmpty(str)) {
                try{
                   this.r = new URL(str).getHost();
                }catch(java.lang.Exception e0){
                }
             }
          }
       label_009a :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final bj$b c(bl p0){
       String str1;
       String str2;
       String str = "TLS";
       bj tu = this.u;
       bj$f c = tu.c;
       c.a = tu.h.g;
       c.b = p0.u();
       tu.a = SystemClock.elapsedRealtime();
       Map map = p0.a();
       if (map == null) {
          map = new HashMap();
       }
       bj$e uoe = this.i.a(this.n);
       int a = bg.a;
       bj tm = this.m;
       Uri uri = Uri.parse(tm);
       String host = uri.getHost();
       if (a != 1) {
          if (a != 2) {
             str1 = "";
          }else {
             HashMap c1 = bg.c;
             str1 = (c1 != null)? c1.get(host): "";
             str2 = null;
          label_0054 :
             if (!TextUtils.isEmpty(str1)) {
                p0.w();
                tm = uri.buildUpon().encodedAuthority(str1).build().toString();
                if (str2) {
                   map.put("targetHost", host);
                   this.s = host;
                }
                if (str2 && this.a != null) {
                   uoe.a(str1);
                }
             }
          label_007f :
             this.m = tm;
             URL uRL = new URL(this.m);
             this.u.a(p0, uRL);
             if (bj.b(uRL.getHost()) && p0.c_()) {
                bl$b uob = p0.u();
                bj$c e = this.u.c.e;
                bj uobj = (this.a(e) && (uob.b() && (m.g || (uob.c() && m.e(e)))))? 1: null;
                if (uobj) {
                   this.u.b = SystemClock.elapsedRealtime();
                   InetAddress[] allByName = InetAddress.getAllByName(this.u.c.e);
                   String str3 = "]";
                   String str4 = "[";
                   if (allByName != null && (allByName.length > 0 && allByName[0] != null)) {
                      int b = (m.a() && m.c())? true: false;
                      ("---canUseIpv6---").concat(String.valueOf(b));
                      if (b) {
                         b = 0;
                         while (true) {
                            if (b < allByName.length) {
                               if (allByName[b] instanceof Inet6Address) {
                                  host = str4+allByName[b].getHostAddress()+str3;
                               }else {
                                  b = b + 1;
                               }
                            }else {
                            label_0139 :
                               host = "";
                            }
                         }
                      }else {
                         b = 0;
                         while (true) {
                            if (b < allByName.length) {
                               if (allByName[b] instanceof Inet4Address) {
                                  host = allByName[b].getHostAddress();
                                  break ;
                               }else {
                                  b = b + 1;
                               }
                            }else {
                               goto label_0139 ;
                            }
                         }
                      }
                      if (TextUtils.isEmpty(host)) {
                         object oobject = allByName[0];
                         host = oobject.getHostAddress();
                         if (oobject instanceof Inet6Address) {
                            host = str4+host+str3;
                         }
                      }
                   }else {
                      host = "";
                   }
                   uobj = this.u;
                   ("---onDNSEnd---ip=").concat(String.valueOf(host));
                   uobj.c.c = (host.replace(str4, "")).replace(str3, "");
                   uobj.c.g = SystemClock.elapsedRealtime() - uobj.b;
                   if (!TextUtils.isEmpty(host)) {
                      Uri uri1 = Uri.parse(this.m);
                      str3 = uri1.getHost();
                      uri1 = uri1.buildUpon().encodedAuthority(host).build();
                      this.n = str3;
                      map.put("host", str3);
                      if (this.a != null) {
                         uoe.b(str3);
                      }
                      this.m = uri1.toString();
                   }
                }
             }
          label_01af :
             if (this.a != null) {
                this.m = q.a(this.m);
             }
             Objects.toString(p0.u());
             uRL = new URL(this.m);
             tm = this.h;
             KeyManager[] keyManagerAr = null;
             URLConnection uRLConnectio = (tm != null)? tm.a(): keyManagerAr;
             if (uRLConnectio == null) {
                tm = this.c;
                uRLConnectio = (tm != null)? uRL.openConnection(tm): uRL.openConnection();
             }
          label_01e3 :
             if (this.a != null) {
                SoftReference k = bj.k;
                if (k == null || k.get() == null) {
                   bj.k = new SoftReference(SSLContext.getInstance(str));
                }
                k = bj.k;
                SSLContext sSLContext = (k != null)? k.get(): keyManagerAr;
                if (sSLContext == null) {
                   sSLContext = SSLContext.getInstance(str);
                }
                sSLContext.init(keyManagerAr, keyManagerAr, keyManagerAr);
                this.b = sSLContext;
                if (m$f.a) {
                   bk uobk = this.b();
                   if (uobk != null) {
                      uRLConnectio.setSSLSocketFactory(uobk);
                      uobk.a();
                   label_0238 :
                      uRLConnectio.setHostnameVerifier(uoe);
                   }
                }
                uRLConnectio.setSSLSocketFactory(this.b.getSocketFactory());
                goto label_0238 ;
             }else {
             }
             if (Build$VERSION.SDK != null) {
                uRLConnectio.setRequestProperty("Connection", "close");
             }
             int i = (int)((long)p0.v() - (this.u.c.g / 1000));
             this.a(map, uRLConnectio);
             uRLConnectio.setConnectTimeout(i);
             uRLConnectio.setReadTimeout(i);
             uRLConnectio.setRequestMethod("POST");
             uRLConnectio.setUseCaches(0);
             uRLConnectio.setDoInput(true);
             uRLConnectio.setDoOutput(true);
             return new bj$b(uRLConnectio);
          }
       }else {
          str1 = bg.b;
       }
       str2 = 1;
       goto label_0054 ;
    }
}
