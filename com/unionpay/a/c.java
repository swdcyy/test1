package com.unionpay.a.c;
import com.unionpay.a.d;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.unionpay.utils.j;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import com.unionpay.a.a;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.InputStream;
import com.unionpay.utils.b;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.IllegalStateException;
import java.io.IOException;
import javax.net.ssl.SSLHandshakeException;

public final class c	// class@000ff1
{
    public HttpURLConnection a;
    public byte[] b;
    public String c;
    public InputStream d;
    public d e;
    public Context f;

    public void c(d p0,Context p1){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.e = p0;
       this.f = p1;
    }
    public final int a(){
       HttpsURLConnection httpsURLConn;
       j.a("uppay", "HttpConn.connect\(\) +++");
       c te = this.e;
       int i = 1;
       if (te == null) {
          j.b("uppay", "params==null!!!");
          return i;
       }else {
          boolean b = false;
          try{
             URL uRL = te.a();
             if (("https").equals((uRL.getProtocol()).toLowerCase())) {
                httpsURLConn = uRL.openConnection();
                httpsURLConn.setSSLSocketFactory(new a(this.f).a().getSocketFactory());
             label_0046 :
                httpsURLConn.setRequestMethod(this.e.b());
                httpsURLConn.setReadTimeout(0xea60);
                httpsURLConn.setConnectTimeout(0x7530);
                httpsURLConn.setInstanceFollowRedirects(i);
                httpsURLConn.setUseCaches(b);
                HashMap hashMap = this.e.d();
                if (hashMap != null) {
                   Iterator iterator = hashMap.keySet().iterator();
                   while (iterator.hasNext()) {
                      String str = iterator.next();
                      httpsURLConn.setRequestProperty(str, hashMap.get(str));
                   }
                }
                String str1 = this.e.b();
                int i1 = -1;
                int i2 = str1.hashCode();
                if (i2 != 0x11336) {
                   if (i2 == 0x2590a0 && str1.equals("POST")) {
                      i1 = 1;
                   }
                }else if(str1.equals("GET")){
                   i1 = 0;
                }
                str1 = "UTF-8";
                if (i1 == i) {
                   httpsURLConn.setDoOutput(i);
                   OutputStreamWriter outputStream = new OutputStreamWriter(httpsURLConn.getOutputStream(), str1);
                   outputStream.write(this.e.c());
                   outputStream.flush();
                   outputStream.close();
                }
                httpsURLConn.connect();
                if (httpsURLConn.getResponseCode() == 200) {
                   InputStream inputStream = httpsURLConn.getInputStream();
                   this.d = inputStream;
                   if (inputStream != null) {
                      this.c = b.a(inputStream, str1);
                      i = 0;
                   }
                }else if(httpsURLConn.getResponseCode() == 401){
                   i = 8;
                }else {
                   j.b("uppay", "http status code:"+httpsURLConn.getResponseCode());
                }
             }else {
                httpsURLConn = uRL.openConnection();
                goto label_0046 ;
             }
          }catch(javax.net.ssl.SSLHandshakeException e1){
             e1.printStackTrace();
             i = 4;
          }catch(java.io.IOException e1){
             e1.printStackTrace();
          }catch(java.lang.IllegalStateException e1){
             e1.printStackTrace();
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          j.a("uppay", "HttpConn.connect\(\) ---");
          return i;
       }
    }
    public final String b(){
       return this.c;
    }
}
