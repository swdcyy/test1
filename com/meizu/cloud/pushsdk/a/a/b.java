package com.meizu.cloud.pushsdk.a.a.b;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.System;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.a.a.a;
import java.util.Map;
import com.meizu.cloud.pushsdk.a.a.c;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import android.util.Base64;
import java.net.URL;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import org.json.JSONObject;
import org.json.JSONException;
import java.net.MalformedURLException;

public class b	// class@00148f
{
    public static final String a = "b";
    public static final Object b;
    public static b c;

    static {
       b.b = new Object();
    }
    public void b(Context p0){
       try{
          super();
          System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       a.a(p0);
       return;
    }
    public static b a(Context p0){
       Object b;
       if (b.c == null) {
          b = b.b;
          _monitor_enter(b);
          if (b.c == null) {
             b.c = new b(p0);
          }
          _monitor_exit(b);
       }
       return b.c;
    }
    public c a(String p0,Map p1,String p2){
       c uoc;
       p1 = this.a(p1);
       try{
          uoc = this.b(p0, p1, p2);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          uoc = null;
       }
       return uoc;
    }
    public final Map a(Map p0){
       HashMap hashMap;
       if (p0 == null) {
          hashMap = new HashMap(2);
       }
       byte[] uobyteArray = a.a().c();
       if (uobyteArray != null && uobyteArray.length > 0) {
          String str = new String(uobyteArray);
          DebugLogger.d(b.a, "attach x_s_key: "+str);
          hashMap.put("X-S-Key", str);
       }else {
          uobyteArray = a.a().b();
          if (uobyteArray != null && uobyteArray.length > 0) {
             String str1 = new String(a.a().b());
             DebugLogger.d(b.a, "attach x_a_key: "+str1);
             hashMap.put("X-A-Key", str1);
          }
       }
       return hashMap;
    }
    public final void a(HttpURLConnection p0,byte[] p1){
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(p0.getOutputStream());
       gZIPOutputSt.write(p1);
       try{
          gZIPOutputSt.flush();
          gZIPOutputSt.close();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(URLConnection p0){
       try{
          String headerField = p0.getHeaderField("X-S-Key");
          DebugLogger.d(b.a, "get x_s_key = "+headerField);
          if (!TextUtils.isEmpty(headerField)) {
             a.a().a(headerField);
          }
          return;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public final byte[] a(InputStream p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = p0.read();
       while (i != -1) {
          uByteArrayOu.write(i);
       }
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       try{
          uByteArrayOu.close();
          return uobyteArray;
       }catch(java.io.IOException e0){
       }
    }
    public final c b(String p0,Map p1,String p2){
       InputStream inputStream;
       String a;
       byte[] uobyteArray1;
       c uoc1;
       c uoc = null;
       if (p2 != null) {
          byte[] uobyteArray = a.a().a(p2.getBytes());
          String str = (uobyteArray != null)? new String(Base64.encode(uobyteArray, 2)): uoc;
          try{
             HttpURLConnection httpURLConne = new URL("https://norma-external-collect.meizu.com/push/android/external/add.do").openConnection();
             httpURLConne.setRequestMethod(p0);
             httpURLConne.setDoInput(true);
             httpURLConne.setDoOutput(true);
             httpURLConne.setUseCaches(false);
             httpURLConne.setConnectTimeout(0x7530);
             httpURLConne.setReadTimeout(0x7530);
             httpURLConne.setRequestProperty("Connection", "keep-alive");
             httpURLConne.setRequestProperty("Charset", "UTF-8");
             httpURLConne.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
             httpURLConne.setRequestProperty("Content-Encoding", "gzip");
             if (p1 != null && p1.size() > 0) {
                Iterator iterator = p1.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   httpURLConne.setRequestProperty(key, uEntry.getValue());
                }
             }
             try{
                if (str != null) {
                   this.a(httpURLConne, str.getBytes());
                }
                try{
                   int responseCode = httpURLConne.getResponseCode();
                   a = b.a;
                   DebugLogger.d(a, "code = "+responseCode);
                   this.a(httpURLConne);
                   this.b(httpURLConne);
                   inputStream = httpURLConne.getInputStream();
                   if (inputStream != null) {
                      uobyteArray1 = this.a(inputStream);
                      if (uobyteArray1 != null) {
                         String str1 = new String(uobyteArray1);
                         String str2 = "body = "+str1;
                         try{
                            DebugLogger.d(a, str2);
                            new JSONObject(str1).getInt("code");
                         }catch(org.json.JSONException e8){
                            e8.printStackTrace();
                         }
                      }
                   }else {
                      uobyteArray1 = uoc;
                   }
                }catch(java.lang.Exception e7){
                }catch(java.io.IOException e0){
                label_0101 :
                   httpURLConne.disconnect();
                }
             }catch(java.lang.Exception e7){
                inputStream = uoc;
             }
             DebugLogger.e(b.a, "realStringPartRequest error "+e7.getMessage());
             if (inputStream) {
             label_00fe :
                inputStream.close();
                goto label_0101 ;
             }else {
                goto label_0101 ;
             }
          }catch(java.net.MalformedURLException e7){
             e7.printStackTrace();
          }
       }
    }
    public final void b(URLConnection p0){
       try{
          DebugLogger.d(b.a, "get keyTimeout = "+p0.getHeaderField("Key-Timeout"));
          return;
       }catch(java.lang.NullPointerException e0){
       }
    }
}
