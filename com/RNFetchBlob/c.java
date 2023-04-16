package com.RNFetchBlob.c;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.Object;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Exception;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import com.RNFetchBlob.c$a;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLContext;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import com.RNFetchBlob.c$b;
import javax.net.ssl.HostnameVerifier;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class c	// class@000d68
{

    public static void a(ReactContext p0,String p1){
       if (p0 == null) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("event", "warn");
       writableMap.putString("detail", p1);
       p0.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RNFetchBlobMessage", writableMap);
       return;
    }
    public static String b(String p0){
       int i1;
       String str = null;
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0.getBytes());
          byte[] uobyteArray = instance.digest();
          StringBuilder str1 = "";
          int len = uobyteArray.length;
          for (int i = 0; i < len; i = i + 1) {
             Object[] objArray = new Object[]{Integer.valueOf(i1)};
             i1 = uobyteArray[i] & 0x00ff;
             str1 = str1+String.format("%02x", objArray);
          }
          return str1;
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          return str;
       }
    }
    public static OkHttpClient$Builder c(OkHttpClient p0){
       try{
          c$a uoa = new c$a();
          TrustManager[] trustManager = new TrustManager[]{uoa};
          SSLContext instance = SSLContext.getInstance("SSL");
          instance.init(null, trustManager, new SecureRandom());
          OkHttpClient$Builder uBuilder = p0.newBuilder();
          uBuilder.sslSocketFactory(instance.getSocketFactory(), uoa);
          uBuilder.hostnameVerifier(new c$b());
          return uBuilder;
       }catch(java.lang.Exception e5){
          throw new RuntimeException(e5);
       }
    }
}
