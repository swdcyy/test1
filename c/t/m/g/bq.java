package c.t.m.g.bq;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.bq$d;
import c.t.m.g.bq$a;
import c.t.m.g.bq$c;
import java.util.HashMap;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.Map;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLException;
import java.lang.Throwable;
import android.util.Log;
import c.t.m.g.ba;
import java.io.ByteArrayOutputStream;
import c.t.m.g.az;

public class bq	// class@000bf4
{

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
    public static void a(String p0,byte[] p1,int p2,Object p3){
       String str1;
       String str = p0;
       byte[] uobyteArray = p1;
       int i = p3;
       URL uRL = null;
       bq$d uod = (i && i instanceof bq$d)? i: uRL;
       bq$a uoa = (i && i instanceof bq$a)? i: uRL;
       bq$c uoc = (i && i instanceof bq$c)? i: uRL;
       if (uoc != null) {
          uRL = new HashMap();
       }
       HashMap hashMap = uRL;
       int i1 = 0;
       HttpURLConnection httpURLConne = new URL(str).openConnection();
       httpURLConne.setRequestProperty("User-Agent", "Dalvik/1.6.0 \(Linux; U; Android 4.4; Nexus 5 Build/KRT16M\)");
       httpURLConne.setRequestProperty("Content-Type", "application/octet-stream");
       httpURLConne.setRequestMethod("POST");
       httpURLConne.setConnectTimeout(0x2710);
       httpURLConne.setDoOutput(true);
       httpURLConne.setFixedLengthStreamingMode(uobyteArray.length);
       httpURLConne.setRequestProperty("Connection", "close");
       bq.a(uobyteArray, httpURLConne.getOutputStream());
       int responseCode = httpURLConne.getResponseCode();
       if (responseCode != 200) {
          str1 = "net sdk error: "+responseCode;
          if (uod != null) {
             uod.b(str1);
          }
          if (uoa != null) {
             uoa.a(str1);
          }
          if (uoc != null && hashMap != null) {
             hashMap.put("resp_code", Integer.valueOf(responseCode));
             hashMap.put("msg_fail", str1);
             uoc.a(i1, hashMap);
          }
       }else {
          str1 = bq.a(httpURLConne.getHeaderField("content-type"));
          byte[] uobyteArray1 = bq.a(httpURLConne.getInputStream());
          if (uoa != null) {
             uoa.a(uobyteArray1);
          }
          if (uod != null) {
             uod.a(new String(uobyteArray1, str1));
          }
          if (uoc != null && hashMap != null) {
             hashMap.put("resp_code", Integer.valueOf(responseCode));
             hashMap.put("charset", str1);
             hashMap.put("byte_data", uobyteArray1);
             uoc.a(true, hashMap);
          }
       }
    label_00df :
       httpURLConne.disconnect();
    label_0134 :
       return;
    }
    public static void a(String p0,byte[] p1,Object p2){
       if (p1 != null) {
       }else {
          p1 = ba.a;
       }
       bq.a(p0, p1, 0, p2);
       return;
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
    public static byte[] a(String p0,Object p1){
       bq$d uod = (p1 != null && p1 instanceof bq$d)? p1: null;
       if (p1 != null && p1 instanceof bq$a) {
       }else {
          p1 = null;
       }
       URLConnection uRLConnectio = new URL(p0).openConnection();
       uRLConnectio.connect();
       byte[] uobyteArray = bq.a(uRLConnectio.getInputStream());
       if (p1 != null) {
          p1.a(uobyteArray);
       }
       if (uod) {
          uod.a(new String(uobyteArray, "UTF-8"));
       }
       return uobyteArray;
    }
}
