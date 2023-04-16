package com.tencent.open.utils.HttpUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.os.Bundle;
import com.tencent.open.a.b;
import java.util.Map;
import com.tencent.open.log.d;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.a.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Class;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.a.a;
import java.net.URLEncoder;
import java.io.CharConversionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.nio.channels.ClosedChannelException;
import java.io.EOFException;
import java.nio.channels.FileLockInterruptionException;
import java.io.FileNotFoundException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.util.InvalidPropertiesFormatException;
import java.net.MalformedURLException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.WriteAbortedException;
import java.net.ProtocolException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.io.UnsupportedEncodingException;
import java.util.zip.ZipException;
import com.tencent.open.utils.HttpUtils$a;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.open.utils.HttpUtils$1;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import com.tencent.open.utils.h;
import android.os.SystemClock;
import com.tencent.open.utils.g;
import com.tencent.open.b.h;
import com.tencent.open.utils.HttpUtils$HttpStatusException;
import org.json.JSONException;
import com.tencent.open.utils.HttpUtils$NetworkUnavailableException;
import com.tencent.tauth.IRequestListener;
import java.lang.Runnable;
import com.tencent.open.utils.j;

public class HttpUtils	// class@000f71
{

    public void HttpUtils(){
       super();
    }
    public static int a(Context p0){
       String property = System.getProperty("http.proxyPort");
       int i = (!TextUtils.isEmpty(property))? Integer.parseInt(property): -1;
    }
    public static b a(String p0,String p1,Bundle p2){
       Map map;
       b uob;
       Bundle uBundle = (p2 != null)? new Bundle(p2): new Bundle();
       if (p1.equalsIgnoreCase("GET")) {
          map = HttpUtils.a(uBundle);
          p2 = d.b(uBundle);
          SLog.i("openSDK_LOG.HttpUtils", "-->openUrl encodedParam = (p2 != uBundle)?"+p2.toString()+" -- url = "+p0):"+map.toString()+" -- url = "+p0);
          uob = a.a().a(p0, map);
       }else if(p1.equalsIgnoreCase("POST")){
          map = HttpUtils.a(uBundle);
          Map map1 = HttpUtils.b(uBundle);
          if (map1 == null || !map1.size()) {
             uob = a.a().b(p0, map);
          }else {
             SLog.w("openSDK_LOG.HttpUtils", "openUrl: has binary "+map1.size());
             uob = a.a().a(p0, map, map1);
          }
       }else {
          SLog.e("openSDK_LOG.HttpUtils", "openUrl: http method "+p1+" is not supported.");
          throw new IOException("http method is not supported.");
       }
       return uob;
    }
    public static Map a(Bundle p0){
       HashMap hashMap = new HashMap();
       if (p0 != null && p0.size()) {
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object obj = p0.get(str);
             if (!obj instanceof String && !obj instanceof String[]) {
                SLog.w("openSDK_LOG.HttpUtils", "parseBundleToMap: the type "+obj.getClass()+" is unsupported");
             }else if(obj instanceof String[]){
                StringBuilder str1 = "";
                for (int i = 0; i < obj.length; i = i + 1) {
                   if (i) {
                      str1 = str1+",";
                   }
                   str1 = str1+obj[i];
                }
                hashMap.put(str, str1);
             }else {
                hashMap.put(str, obj);
             }
          }
       }
       return hashMap;
    }
    public static void a(Context p0,QQToken p1,String p2){
       int i = -1;
       if (p2.indexOf("add_share") <= i && (p2.indexOf("upload_pic") <= i && (p2.indexOf("add_topic") <= i && (p2.indexOf("set_user_face") <= i && (p2.indexOf("add_t") <= i && (p2.indexOf("add_pic_t") <= i && (p2.indexOf("add_pic_url") > i || p2.indexOf("add_video") > i))))))) {
          String[] stringArray = new String[]{p2};
          a.a(p0, p1, "requireApi", stringArray);
       }
       return;
    }
    public static String b(Context p0){
       return System.getProperty("http.proxyHost");
    }
    public static Map b(Bundle p0){
       HashMap hashMap = new HashMap(0);
       if (p0 != null && p0.size()) {
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object obj = p0.get(str);
             if (!obj instanceof byte[]) {
                continue ;
             }
             hashMap.put(str, obj);
          }
       }
       return hashMap;
    }
    public static String encodeUrl(Bundle p0){
       return HttpUtils.encodeUrl(HttpUtils.a(p0));
    }
    public static String encodeUrl(Map p0){
       if (p0 == null || !p0.size()) {
          return "";
       }
       StringBuilder str = "";
       int i = 1;
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (i) {
             i = 0;
          }else {
             str = str+"&";
          }
          str = str+URLEncoder.encode(str1)+"="+URLEncoder.encode(p0.get(str1));
       }
       return str;
    }
    public static int getErrorCodeFromException(IOException p0){
       if (p0 instanceof CharConversionException) {
          return -20;
       }
       if (p0 instanceof MalformedInputException) {
          return -21;
       }
       if (p0 instanceof UnmappableCharacterException) {
          return -22;
       }
       if (p0 instanceof ClosedChannelException) {
          return -24;
       }
       if (p0 instanceof EOFException) {
          return -26;
       }
       if (p0 instanceof FileLockInterruptionException) {
          return -27;
       }
       if (p0 instanceof FileNotFoundException) {
          return -28;
       }
       if (p0 instanceof HttpRetryException) {
          return -29;
       }
       if (p0 instanceof SocketTimeoutException) {
          return -8;
       }
       if (p0 instanceof InvalidPropertiesFormatException) {
          return -30;
       }
       if (p0 instanceof MalformedURLException) {
          return -3;
       }
       if (p0 instanceof InvalidClassException) {
          return -33;
       }
       if (p0 instanceof InvalidObjectException) {
          return -34;
       }
       if (p0 instanceof NotActiveException) {
          return -35;
       }
       if (p0 instanceof NotSerializableException) {
          return -36;
       }
       if (p0 instanceof OptionalDataException) {
          return -37;
       }
       if (p0 instanceof StreamCorruptedException) {
          return -38;
       }
       if (p0 instanceof WriteAbortedException) {
          return -39;
       }
       if (p0 instanceof ProtocolException) {
          return -40;
       }
       if (p0 instanceof SSLHandshakeException) {
          return -41;
       }
       if (p0 instanceof SSLKeyException) {
          return -42;
       }
       if (p0 instanceof SSLPeerUnverifiedException) {
          return -43;
       }
       if (p0 instanceof SSLProtocolException) {
          return -44;
       }
       if (p0 instanceof BindException) {
          return -45;
       }
       if (p0 instanceof ConnectException) {
          return -46;
       }
       if (p0 instanceof NoRouteToHostException) {
          return -47;
       }
       if (p0 instanceof PortUnreachableException) {
          return -48;
       }
       if (p0 instanceof SyncFailedException) {
          return -49;
       }
       if (p0 instanceof UTFDataFormatException) {
          return -50;
       }
       if (p0 instanceof UnknownHostException) {
          return -51;
       }
       if (p0 instanceof UnknownServiceException) {
          return -52;
       }
       if (p0 instanceof UnsupportedEncodingException) {
          return -53;
       }
       if (p0 instanceof ZipException) {
          return -54;
       }
       return -2;
    }
    public static HttpUtils$a getProxy(Context p0){
       if (p0 == null) {
          return null;
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (systemServic == null) {
          return null;
       }
       NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
       if (activeNetwor == null) {
          return null;
       }
       if (!activeNetwor.getType()) {
          String str = HttpUtils.b(p0);
          int i = HttpUtils.a(p0);
          if (!TextUtils.isEmpty(str) && i >= 0) {
             return new HttpUtils$a(str, i, null);
          }
       }
       return null;
    }
    public static JSONObject request(QQToken p0,Context p1,String p2,Bundle p3,String p4){
       String str2;
       String str3;
       QQToken qQToken;
       int i4;
       int i5;
       SocketTimeoutException socketTimeou;
       long l2;
       long l3;
       int intx;
       Context uContext = p1;
       String str = p2;
       String str1 = "openSDK_LOG.HttpUtils";
       SLog.i(str1, "OpenApi request");
       if (!k.b(p1)) {
          throw new HttpUtils$NetworkUnavailableException("network unavailable");
       }
       if (!(p2.toLowerCase()).startsWith("http")) {
          str2 = h.a().a(uContext, "https://openmobile.qq.com/")+str;
          str3 = h.a().a(uContext, "https://openmobile.qq.com/")+str;
          qQToken = p0;
       }else {
          qQToken = p0;
          str2 = str;
          str3 = str2;
       }
       HttpUtils.a(uContext, qQToken, str);
       JSONObject jSONObject = null;
       long l = SystemClock.elapsedRealtime();
       int i = g.a(uContext, p0.getAppId()).a("Common_HttpRetryCount");
       String str4 = "     url:";
       String str5 = "OpenConfig_test";
       SLog.v(str5, "config 1:Common_HttpRetryCount            config_value:"+i+"   appid:"+p0.getAppId()+str4+str3);
       int i1 = (!i)? 3: i;
       SLog.v(str5, "config 1:Common_HttpRetryCount            result_value:"+i1+"   appid:"+p0.getAppId()+str4+str3);
       long l1 = l;
    label_00c1 :
       int i2 = 0 + 1;
       Bundle uBundle = p3;
       str5 = p4;
       try{
          b uob = HttpUtils.a(str2, str5, uBundle);
          int i3 = uob.d();
          SLog.i(str1, "request statusCode "+i3);
          if (i3 == 200) {
             try{
                jSONObject = k.d(uob.a());
                try{
                   intx = jSONObject.getInt("ret");
                }catch(org.json.JSONException e0){
                   intx = -4;
                }catch( e0){
                }
                l3 = (long)e0.b();
                i2 = intx;
                l2 = (long)e0.c();
             label_0180 :
                h.a().a(str3, l1, l2, l3, i2);
                return jSONObject;
             }catch(java.net.SocketTimeoutException e0){
                socketTimeou = e0;
                i = jSONObject;
                i5 = i2;
             }catch(java.io.IOException e0){
                e0.printStackTrace();
                h.a().a(str3, l1, 0, 0, HttpUtils.getErrorCodeFromException(e0));
                throw e0;
             }catch(org.json.JSONException e0){
                e0.printStackTrace();
                h.a().a(str3, l1, 0, 0, -4);
                throw e0;
             }
             socketTimeou.printStackTrace();
             i2 = -8;
             l2 = 0;
             l3 = 0;
             if (i5 < i1) {
                l1 = SystemClock.elapsedRealtime();
                if (i5 >= i1) {
                   jSONObject = i;
                   goto label_0180 ;
                }else {
                   int i6 = i5;
                   i5 = i;
                   goto label_00c1 ;
                }
             }else {
                h.a().a(str3, l1, l2, l3, i2);
                throw socketTimeou;
             }
          }else {
             int i7 = 0;
             try{
                h oh = h.a();
                String str6 = str3;
                long l4 = l1;
                i = i3;
                l2 = 0;
                l3 = i7;
                try{
                   i2 = i;
                   oh.a(str6, l4, l2, l3, i2);
                   throw new HttpUtils$HttpStatusException(i);
                }catch(java.net.SocketTimeoutException e0){
                }catch(java.io.IOException e0){
                }catch(org.json.JSONException e0){
                }
                socketTimeou = e0;
                i = i4;
                goto label_016f ;
             }catch(java.net.MalformedURLException e0){
                e0.printStackTrace();
                h.a().a(str3, l1, 0, 0, -3);
                throw e0;
             }
          }
       }catch(java.net.SocketTimeoutException e0){
          i4 = jSONObject;
          i5 = i2;
          goto label_016b ;
       }catch(java.net.MalformedURLException e0){
       }catch(java.io.IOException e0){
       }catch(org.json.JSONException e0){
       }catch( e0){
       }
    }
    public static void requestAsync(QQToken p0,Context p1,String p2,Bundle p3,String p4,IRequestListener p5){
       SLog.i("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
       HttpUtils$1 u1 = new HttpUtils$1(p0, p1, p2, p3, p4, p5);
       j.a(v0);
    }
}
