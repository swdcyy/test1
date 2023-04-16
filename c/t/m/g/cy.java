package c.t.m.g.cy;
import c.t.m.g.dl;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import c.t.m.g.az;
import c.t.m.g.cy$a;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import android.os.Bundle;
import java.lang.System;
import c.t.m.g.cd;
import java.lang.StringBuilder;
import c.t.m.g.bv;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.io.IOException;
import java.lang.Exception;

public class cy implements dl	// class@000c31
{

    public void cy(Context p0,String p1){
       super();
    }
    public static String a(String p0){
       String[] stringArray;
       if (p0 != null) {
          stringArray = p0.split(";");
          int len = stringArray.length;
          int i = 0;
          while (true) {
             if (i < len) {
                String str = (stringArray[i]).trim();
                int i1 = str.indexOf("charset=");
                if (-1 != i1) {
                   stringArray = str.substring((i1 + 8), str.length());
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
          return stringArray;
       }
       stringArray = "GBK";
       goto label_002b ;
    }
    public static void a(byte[] p0,OutputStream p1){
       p1.write(p0);
       p1.flush();
       p1.close();
    }
    public static byte[] a(InputStream p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(256);
       byte[] uobyteArray = az.a().a(512);
       int i = p0.read(uobyteArray);
       while (i != -1) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       p0.close();
       az.a().a(uobyteArray);
       return uByteArrayOu.toByteArray();
    }
    public static cy$a b(String p0,byte[] p1){
       HttpURLConnection httpURLConne = new URL(p0).openConnection();
       httpURLConne.setRequestProperty("User-Agent", "Dalvik/1.6.0 \(Linux; U; Android 4.4; Nexus 5 Build/KRT16M\)");
       httpURLConne.setRequestProperty("Content-Type", "application/octet-stream");
       httpURLConne.setRequestMethod("POST");
       httpURLConne.setConnectTimeout(0x2710);
       httpURLConne.setDoOutput(true);
       httpURLConne.setFixedLengthStreamingMode(p1.length);
       httpURLConne.setRequestProperty("Connection", "close");
       cy.a(p1, httpURLConne.getOutputStream());
       if (httpURLConne.getResponseCode() != 200) {
          httpURLConne.disconnect();
          return null;
       }else {
          cy$a uoa = new cy$a();
          uoa.a = cy.a(httpURLConne.getHeaderField("content-type"));
          uoa.b = cy.a(httpURLConne.getInputStream());
          uoa.c = httpURLConne.getHeaderField("x-android-sent-millis");
          return uoa;
       }
    }
    public Bundle a(String p0,byte[] p1){
       String str = ",";
       try{
          cy$a uoa = cy.b(p0, p1);
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          String str1 = "null";
          if (uoa == null) {
             throw new IOException("net sdk error: response is null");
          }
          cd.c().a("NET", "0,0,"+str1+str+l+str+bv.b());
          Bundle uBundle = new Bundle();
          uBundle.putString("req_key", "");
          cy$a c = uoa.c;
          if (!TextUtils.isEmpty(c)) {
             uBundle.putLong("data_header_time", Long.parseLong(c));
          }
          c = uoa.b;
          if (c == null) {
             uBundle.putByteArray("data_bytes", ("{}").getBytes("UTF-8"));
             uBundle.putString("data_charset", "utf-8");
             return uBundle;
          }else {
             uBundle.putByteArray("data_bytes", c);
             uBundle.putString("data_charset", uoa.a);
             return uBundle;
          }
       }catch(java.lang.Exception e8){
          throw new IOException(e8.getMessage());
       }
    }
}
