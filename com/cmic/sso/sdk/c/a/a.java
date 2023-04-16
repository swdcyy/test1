package com.cmic.sso.sdk.c.a.a;
import com.cmic.sso.sdk.c.a.b;
import java.lang.Object;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.d.c;
import com.cmic.sso.sdk.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.cmic.sso.sdk.e.c;
import java.net.URL;
import android.net.Network;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import com.cmic.sso.sdk.c.c.b;
import java.io.OutputStream;
import java.io.InputStream;
import com.cmic.sso.sdk.c.d.b;
import java.io.Closeable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.c.d.a;
import java.lang.Exception;
import com.cmic.sso.sdk.d.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.EOFException;
import java.io.IOException;

public class a implements b	// class@000f3a
{

    public void a(){
       super();
    }
    public void a(c p0,c p1,a p2){
       int i1;
       Closeable uCloseable;
       CharSequence uCharSequenc;
       HttpURLConnection httpURLConne;
       Closeable uCloseable1;
       StringBuilder str2;
       a uoa1;
       HttpURLConnection httpURLConne1;
       int i3;
       int i4;
       b uob;
       OutputStream outputStream;
       a uoa = this;
       int i = p0;
       c uoc = p1;
       String str = "";
       String str1 = "请求地址: "+p0.a();
       try{
          c.b("ConnectionInterceptor", str1);
          URL uRL = new URL(p0.a());
          if (p0.h() != null) {
             c.b("ConnectionInterceptor", "开始wifi下取号");
             httpURLConne1 = p0.h().openConnection(uRL);
          }else {
             c.b("ConnectionInterceptor", "使用当前网络环境发送请求");
             httpURLConne1 = uRL.openConnection();
          }
          httpURLConne = httpURLConne1;
          try{
             Map map = p0.c();
             if (map != null) {
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                   String str3 = iterator.next();
                   httpURLConne.addRequestProperty(str3, map.get(str3));
                }
             }
             try{
                httpURLConne.setDoInput(true);
                i4 = false;
                httpURLConne.setInstanceFollowRedirects(i4);
                httpURLConne.setConnectTimeout(5000);
                httpURLConne.setReadTimeout(5000);
                httpURLConne.setDefaultUseCaches(i4);
                String str4 = p0.e();
                httpURLConne.setRequestMethod(str4);
                httpURLConne.setDoOutput(true);
                if (i instanceof b) {
                   httpURLConne.connect();
                   uob = i;
                   i3 = p2;
                   uob.a(i3);
                }else {
                   i3 = p2;
                }
                try{
                   c.b("ConnectionInterceptor", "请求参数:"+p0.d());
                   if (str4.endsWith("POST")) {
                      outputStream = httpURLConne.getOutputStream();
                      outputStream.write((p0.d()).getBytes("utf-8"));
                      outputStream.flush();
                   }else {
                      outputStream = null;
                   }
                   int responseCode = httpURLConne.getResponseCode();
                   try{
                      InputStream inputStream = httpURLConne.getInputStream();
                      try{
                         uob = 2048;
                         byte[] uobyteArray = new byte[uob];
                         StringBuilder str5 = "";
                         try{
                            i4 = inputStream.read(uobyteArray);
                            while (i4 > 0) {
                               str5 = str5+new String(uobyteArray, 0, i4, "utf-8");
                               str = str;
                            }
                            String str6 = str;
                            uob = new b(responseCode, httpURLConne.getHeaderFields(), str5);
                            uoa.a(outputStream);
                            uoa.a(inputStream);
                            httpURLConne.disconnect();
                            c.b("ConnectionInterceptor", "responseCode: "+responseCode);
                            str2 = "responseResult: ";
                            str = (TextUtils.isEmpty(str5))? str6: str5;
                            c.b("ConnectionInterceptor", str2+str);
                            if (responseCode != 200 && (responseCode != 301 && responseCode != 302)) {
                               uoa1 = a.a(responseCode);
                            label_023d :
                               uoc.a(uoa1);
                            label_0245 :
                               return;
                            }else {
                               uoc.a(uob);
                               goto label_0245 ;
                            }
                         }catch(java.lang.Exception e0){
                            i1 = str;
                            i4 = responseCode;
                         }
                      label_01c2 :
                         e0.printStackTrace();
                         c.a("ConnectionInterceptor", "请求失败: "+p0.a());
                         p2.a().a.add(e0);
                         int i2 = (e0 instanceof EOFException)? 0x30d72: 0x18ed6;
                         uoa.a(uCloseable1);
                         uoa.a(uCloseable);
                         if (httpURLConne) {
                            httpURLConne.disconnect();
                         }
                         c.b("ConnectionInterceptor", "responseCode: "+i2);
                         str2 = "responseResult: ";
                         str = (TextUtils.isEmpty(uCharSequenc))? i1: uCharSequenc;
                         c.b("ConnectionInterceptor", str2+str);
                         if (i2 != 200 && (i2 != 301 && i2 != 302)) {
                            uoa1 = a.a(i2);
                            goto label_023d ;
                         }else {
                            uoc.a(null);
                            goto label_0245 ;
                         }
                      }catch(java.lang.Exception e0){
                         i1 = str;
                         i4 = responseCode;
                      }
                      uCharSequenc = null;
                      goto label_01c2 ;
                   }catch(java.lang.Exception e0){
                      i1 = str;
                      uCloseable = null;
                      goto label_018b ;
                   }
                }catch(java.lang.Exception e0){
                   i1 = str;
                   uCloseable = null;
                   uCharSequenc = null;
                   i4 = -1;
                   goto label_01c2 ;
                }
             }catch(java.lang.Exception e0){
             }
             i1 = str;
             uCloseable = null;
             uCharSequenc = null;
             i4 = -1;
          }catch(java.lang.Exception e0){
             i3 = p2;
             goto label_01a8 ;
          }
       }catch(java.lang.Exception e0){
          i1 = str;
          uCloseable = null;
          uCharSequenc = null;
          httpURLConne = null;
       }
       uCloseable1 = null;
       goto label_01c2 ;
    }
    public final void a(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.io.IOException e1){
             e1.printStackTrace();
          }
       }
    }
}
