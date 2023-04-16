package com.RNFetchBlob.RNFetchBlobReq;
import java.lang.Runnable;
import android.content.BroadcastReceiver;
import java.util.HashMap;
import okhttp3.ConnectionPool;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import okhttp3.OkHttpClient;
import com.facebook.react.bridge.Callback;
import com.RNFetchBlob.RNFetchBlobReq$ResponseFormat;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.lang.Object;
import l4.a;
import java.lang.Boolean;
import com.RNFetchBlob.RNFetchBlobReq$ResponseType;
import com.RNFetchBlob.RNFetchBlobReq$RequestType;
import android.content.Context;
import okhttp3.Call;
import java.lang.Long;
import android.app.DownloadManager;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import okhttp3.Headers;
import java.util.Objects;
import com.RNFetchBlob.a;
import java.io.File;
import com.facebook.react.bridge.ReactContext;
import java.lang.Exception;
import com.RNFetchBlob.c;
import android.content.Intent;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.app.DownloadManager$Query;
import android.database.Cursor;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.net.Uri;
import android.content.ContentResolver;
import android.app.DownloadManager$Request;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import android.content.IntentFilter;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.RNFetchBlob.b;
import okhttp3.OkHttpClient$Builder;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkCapabilities;
import java.net.Proxy;
import javax.net.SocketFactory;
import okhttp3.Request$Builder;
import java.net.URL;
import java.net.MalformedURLException;
import com.RNFetchBlob.RNFetchBlobReq$b;
import java.lang.Enum;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okhttp3.Request;
import com.RNFetchBlob.RNFetchBlobReq$1;
import okhttp3.Interceptor;
import com.RNFetchBlob.RNFetchBlobReq$2;
import java.util.concurrent.TimeUnit;
import com.RNFetchBlob.RNFetchBlobReq$a;
import okhttp3.Callback;
import java.lang.Throwable;

public class RNFetchBlobReq extends BroadcastReceiver implements Runnable	// class@000d60
{
    public WeakReference b;
    public a c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ReadableArray i;
    public ReadableMap j;
    public Callback k;
    public long l;
    public long m;
    public a n;
    public RNFetchBlobReq$RequestType o;
    public RNFetchBlobReq$ResponseType p;
    public RNFetchBlobReq$ResponseFormat q;
    public WritableMap r;
    public boolean s;
    public ArrayList t;
    public OkHttpClient u;
    public static HashMap v;
    public static HashMap w;
    public static HashMap x;
    public static HashMap y;
    public static ConnectionPool z;

    static {
       RNFetchBlobReq.v = new HashMap();
       RNFetchBlobReq.w = new HashMap();
       RNFetchBlobReq.x = new HashMap();
       RNFetchBlobReq.y = new HashMap();
       RNFetchBlobReq.z = new ConnectionPool();
    }
    public void RNFetchBlobReq(ReactApplicationContext p0,ReadableMap p1,String p2,String p3,String p4,ReadableMap p5,String p6,ReadableArray p7,OkHttpClient p8,Callback p9){
       super();
       this.q = RNFetchBlobReq$ResponseFormat.Auto;
       this.s = false;
       this.t = new ArrayList();
       this.b = new WeakReference(p0);
       this.e = p3.toUpperCase();
       a uoa = new a(p1);
       this.c = uoa;
       this.d = p2;
       this.f = p4;
       this.j = p5;
       this.k = p9;
       this.g = p6;
       this.i = p7;
       this.u = p8;
       this.p = (uoa.a.booleanValue() || this.c.b != null)? RNFetchBlobReq$ResponseType.FileStorage: RNFetchBlobReq$ResponseType.KeepInMemory;
       if (p6 != null) {
          this.o = RNFetchBlobReq$RequestType.SingleFile;
       }else if(p7 != null){
          this.o = RNFetchBlobReq$RequestType.Form;
       }else {
          this.o = RNFetchBlobReq$RequestType.WithoutBody;
       }
       return;
    }
    public static void a(Context p0,String p1){
       if (RNFetchBlobReq.v.containsKey(p1)) {
          RNFetchBlobReq.v.get(p1).cancel();
          RNFetchBlobReq.v.remove(p1);
       }
       if (RNFetchBlobReq.w.containsKey(p1)) {
          long[] olongArray = new long[]{RNFetchBlobReq.w.get(p1).longValue()};
          p0.getApplicationContext().getSystemService("download").remove(olongArray);
       }
       return;
    }
    public static RNFetchBlobProgressConfig d(String p0){
       if (!RNFetchBlobReq.x.containsKey(p0)) {
          return null;
       }
       return RNFetchBlobReq.x.get(p0);
    }
    public final String b(HashMap p0,String p1){
       String str = p0.get(p1);
       if (str != null) {
          return str;
       }
       String str1 = p0.get(p1.toLowerCase());
       if (str1 == null) {
          str1 = "";
       }
       return str1;
    }
    public final String c(Headers p0,String p1){
       String str = p0.get(p1);
       if (str != null) {
          return str;
       }
       String str1 = (p0.get(p1.toLowerCase()) == null)? "": p0.get(p1.toLowerCase());
       return str1;
    }
    public void e(){
       if (RNFetchBlobReq.v.containsKey(this.d)) {
          RNFetchBlobReq.v.remove(this.d);
       }
       if (RNFetchBlobReq.w.containsKey(this.d)) {
          RNFetchBlobReq.w.remove(this.d);
       }
       if (RNFetchBlobReq.y.containsKey(this.d)) {
          RNFetchBlobReq.y.remove(this.d);
       }
       if (RNFetchBlobReq.x.containsKey(this.d)) {
          RNFetchBlobReq.x.remove(this.d);
       }
       RNFetchBlobReq tn = this.n;
       if (tn != null) {
          try{
             Objects.requireNonNull(tn);
             a i = tn.i;
             if (i != null && i.exists()) {
                tn.i.delete();
             }
          }catch(java.lang.Exception e1){
             c.a(tn.a.get(), e1.getLocalizedMessage());
          }
       }
    }
    public void onReceive(Context p0,Intent p1){
       Object[] objArray;
       Object[] objArray1;
       String str2;
       Object[] objArray2;
       String str = "mime";
       ReactApplicationContext reactApplica = this.b.get();
       int i = 3;
       if (reactApplica == null) {
          objArray = new Object[i];
          objArray[0] = "Broadcast.onReceive:The context has been destroyed unexpectedly.";
          objArray[1] = null;
          objArray[2] = null;
          this.k.invoke(objArray);
          return;
       }else if(("android.intent.action.DOWNLOAD_COMPLETE").equals(p1.getAction())){
          Context applicationC = reactApplica.getApplicationContext();
          if (!p1.getExtras().getLong("extra_download_id") - this.m) {
             this.e();
             DownloadManager$Query query = new DownloadManager$Query();
             long[] olongArray = new long[]{this.m};
             query.setFilterById(olongArray);
             DownloadManager systemServic = applicationC.getSystemService("download");
             systemServic.query(query);
             Cursor uCursor = systemServic.query(query);
             String str1 = "Download manager failed to download from  ";
             if (uCursor == null) {
                objArray = new Object[i];
                objArray[0] = str1+this.f+". Query was unsuccessful ";
                objArray[1] = null;
                objArray[2] = null;
                this.k.invoke(objArray);
                return;
             }else if(uCursor.moveToFirst()){
                int intx = uCursor.getInt(uCursor.getColumnIndex("status"));
                if (intx == 16) {
                   objArray1 = new Object[i];
                   objArray1[0] = str1+this.f+". Status Code = "+intx;
                   objArray1[1] = null;
                   objArray1[2] = null;
                   this.k.invoke(objArray1);
                   uCursor.close();
                   return;
                }else {
                   str1 = uCursor.getString(uCursor.getColumnIndex("local_uri"));
                   if (str1 != null && (this.c.d.hasKey(str) && (this.c.d.getString(str)).contains("image"))) {
                      String[] stringArray = new String[]{"_data"};
                      Cursor uCursor1 = applicationC.getContentResolver().query(Uri.parse(str1), stringArray, null, null, null);
                      if (uCursor1 != null) {
                         uCursor1.moveToFirst();
                         str2 = uCursor1.getString(0);
                         uCursor1.close();
                      label_0110 :
                         uCursor.close();
                         String str3 = "path";
                         if (this.c.d.hasKey(str3)) {
                            try{
                               str = this.c.d.getString(str3);
                               if (new File(str).exists()) {
                                  objArray2 = new Object[i];
                                  objArray2[0] = null;
                                  objArray2[1] = str3;
                                  objArray2[2] = str;
                                  this.k.invoke(objArray2);
                               }else {
                                  throw new Exception("Download manager download failed, the file does not downloaded to destination.");
                               }
                            }catch(java.lang.Exception e14){
                               e14.printStackTrace();
                               objArray1 = new Object[]{e14.getLocalizedMessage(),null};
                               this.k.invoke(objArray1);
                            }
                         }else if(str2 == null){
                            objArray1 = new Object[i];
                            objArray1[0] = "Download manager could not resolve downloaded file path.";
                            objArray1[1] = str3;
                            objArray1[2] = null;
                            this.k.invoke(objArray1);
                         }else {
                            objArray2 = new Object[i];
                            objArray2[0] = null;
                            objArray2[1] = str3;
                            objArray2[2] = str2;
                            this.k.invoke(objArray2);
                         }
                      }
                   }
                }
             }
             str2 = null;
             goto label_0110 ;
          }
       }
    }
    public void run(){
       String str4;
       DownloadManager$Request request;
       ReactApplicationContext reactApplica;
       Object[] objArray;
       RNFetchBlobReq c;
       a b;
       Request$Builder uBuilder2;
       a uoa;
       RNFetchBlobReq rNFetchBlobR = this;
       String str = ";base64";
       String str1 = "post";
       String str2 = "Content-Type";
       a d = rNFetchBlobR.c.d;
       String str3 = "path";
       int i = 2;
       if (d != null) {
          str4 = "useDownloadManager";
          if (d.hasKey(str4) && rNFetchBlobR.c.d.getBoolean(str4)) {
             request = new DownloadManager$Request(Uri.parse(rNFetchBlobR.f));
             str1 = "notification";
             if (rNFetchBlobR.c.d.hasKey(str1) && rNFetchBlobR.c.d.getBoolean(str1)) {
                request.setNotificationVisibility(1);
             }else {
                request.setNotificationVisibility(i);
             }
             str1 = "title";
             if (rNFetchBlobR.c.d.hasKey(str1)) {
                request.setTitle(rNFetchBlobR.c.d.getString(str1));
             }
             str1 = "description";
             if (rNFetchBlobR.c.d.hasKey(str1)) {
                request.setDescription(rNFetchBlobR.c.d.getString(str1));
             }
             if (rNFetchBlobR.c.d.hasKey(str3)) {
                request.setDestinationUri(Uri.parse("file://"+rNFetchBlobR.c.d.getString(str3)));
             }
             str1 = "mime";
             if (rNFetchBlobR.c.d.hasKey(str1)) {
                request.setMimeType(rNFetchBlobR.c.d.getString(str1));
             }
             ReadableMapKeySetIterator readableMapK = rNFetchBlobR.j.keySetIterator();
             str2 = "mediaScannable";
             if (rNFetchBlobR.c.d.hasKey(str2) && rNFetchBlobR.c.d.hasKey(str2)) {
                request.allowScanningByMediaScanner();
             }
             while (readableMapK.hasNextKey()) {
                str1 = readableMapK.nextKey();
                request.addRequestHeader(str1, rNFetchBlobR.j.getString(str1));
             }
             reactApplica = rNFetchBlobR.b.get();
             if (reactApplica == null) {
                return;
             }else {
                Context applicationC = reactApplica.getApplicationContext();
                long l = applicationC.getSystemService("download").enqueue(request);
                rNFetchBlobR.m = l;
                RNFetchBlobReq.w.put(rNFetchBlobR.d, Long.valueOf(l));
                UniversalReceiver.e(applicationC, rNFetchBlobR, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                return;
             }
          }
       }
       RNFetchBlobReq d1 = rNFetchBlobR.d;
       str4 = ((rNFetchBlobR.c.c).isEmpty())? "": "."+rNFetchBlobR.c.c;
       a g = rNFetchBlobR.c.g;
       String str5 = "The context has been destroyed unexpectedly";
       int i1 = 0;
       object oobject = null;
       if (g != null) {
          d1 = c.b(g);
          if (d1 == null) {
             d1 = rNFetchBlobR.d;
          }
          ReactApplicationContext reactApplica1 = rNFetchBlobR.b.get();
          if (reactApplica1 == null) {
             objArray = new Object[]{str5,oobject,oobject};
             rNFetchBlobR.k.invoke(objArray);
             this.e();
             return;
          }else {
             File uFile = new File(b.d(reactApplica1, d1)+str4);
             if (uFile.exists()) {
                objArray = new Object[]{oobject,str3,uFile.getAbsolutePath()};
                rNFetchBlobR.k.invoke(objArray);
                return;
             }
          }
       }
       c = rNFetchBlobR.c;
       b = c.b;
       if (b != null) {
          rNFetchBlobR.h = b;
       }else if(c.a.booleanValue()){
          ReactApplicationContext reactApplica2 = rNFetchBlobR.b.get();
          if (reactApplica2 == null) {
             objArray = new Object[]{str5,oobject,oobject};
             rNFetchBlobR.k.invoke(objArray);
             this.e();
             return;
          }else {
             rNFetchBlobR.h = b.d(reactApplica2, d1)+str4;
          }
       }
       try{
          OkHttpClient$Builder uBuilder = (rNFetchBlobR.c.e.booleanValue())? c.c(rNFetchBlobR.u): rNFetchBlobR.u.newBuilder();
          OkHttpClient$Builder uBuilder1 = uBuilder;
          if (rNFetchBlobR.c.f.booleanValue()) {
             reactApplica = rNFetchBlobR.b.get();
             if (reactApplica == null) {
                objArray = new Object[]{"Cannot get available WiFi connections for the context has been destroyed unexpectedly.",oobject,oobject};
                rNFetchBlobR.k.invoke(objArray);
                this.e();
                return;
             }else {
                ConnectivityManager systemServic = reactApplica.getSystemService("connectivity");
                Network[] allNetworks = systemServic.getAllNetworks();
                int len = allNetworks.length;
                int i2 = 0;
                while (true) {
                   if (i2 < len) {
                      object oobject1 = allNetworks[i2];
                      NetworkInfo networkInfo = systemServic.getNetworkInfo(oobject1);
                      NetworkCapabilities networkCapab = systemServic.getNetworkCapabilities(oobject1);
                      if (networkCapab == null || (networkInfo == null || (networkInfo.isConnected() && networkCapab.hasTransport(1)))) {
                         uBuilder1.proxy(Proxy.NO_PROXY);
                         uBuilder1.socketFactory(oobject1.getSocketFactory());
                         d1 = 1;
                      label_0266 :
                         if (!d1) {
                            objArray = new Object[]{"No available WiFi connections.",null,null};
                            rNFetchBlobR.k.invoke(objArray);
                            this.e();
                            return;
                         }
                      }else {
                         i2 = i2 + 1;
                         networkCapab = null;
                      }
                   }else {
                      d1 = null;
                      goto label_0266 ;
                   }
                }
             }
          }
          try{
             uBuilder2 = new Request$Builder();
             uBuilder2.url(new URL(rNFetchBlobR.f));
          }catch(java.net.MalformedURLException e0){
             e0.printStackTrace();
          }
          HashMap hashMap = new HashMap();
          RNFetchBlobReq j = rNFetchBlobR.j;
          if (j != null) {
             ReadableMapKeySetIterator readableMapK1 = j.keySetIterator();
             while (readableMapK1.hasNextKey()) {
                String str6 = readableMapK1.nextKey();
                str5 = rNFetchBlobR.j.getString(str6);
                if (str6.equalsIgnoreCase("RNFB-Response")) {
                   if (str5.equalsIgnoreCase("base64")) {
                      rNFetchBlobR.q = RNFetchBlobReq$ResponseFormat.BASE64;
                   }else if(str5.equalsIgnoreCase("utf8")){
                      rNFetchBlobR.q = RNFetchBlobReq$ResponseFormat.UTF8;
                      continue ;
                   }else {
                      continue ;
                   }
                }else {
                   uBuilder2.header(str6.toLowerCase(), str5);
                   hashMap.put(str6.toLowerCase(), str5);
                   continue ;
                }
             }
          }
          if (!(rNFetchBlobR.e).equalsIgnoreCase(str1) && ((rNFetchBlobR.e).equalsIgnoreCase("put") || (rNFetchBlobR.e).equalsIgnoreCase("patch"))) {
             str4 = (rNFetchBlobR.b(hashMap, str2)).toLowerCase();
             if (rNFetchBlobR.i != null) {
                rNFetchBlobR.o = RNFetchBlobReq$RequestType.Form;
             }else if(str4.isEmpty()){
                if (!str4.equalsIgnoreCase("")) {
                   uBuilder2.header(str2, "application/octet-stream");
                }
                rNFetchBlobR.o = RNFetchBlobReq$RequestType.SingleFile;
             }
             RNFetchBlobReq g1 = rNFetchBlobR.g;
             if (g1 != null) {
                if (g1.startsWith("RNFetchBlob-file://") || (rNFetchBlobR.g).startsWith("RNFetchBlob-content://")) {
                   rNFetchBlobR.o = RNFetchBlobReq$RequestType.SingleFile;
                }else if((str4.toLowerCase()).contains(str) || (str4.toLowerCase()).startsWith("application/octet")){
                   str = (str4.replace(str, "")).replace(";BASE64", "");
                   if (hashMap.containsKey("content-type")) {
                      hashMap.put("content-type", str);
                   }
                   if (hashMap.containsKey(str2)) {
                      hashMap.put(str2, str);
                   }
                   rNFetchBlobR.o = RNFetchBlobReq$RequestType.SingleFile;
                }else {
                   rNFetchBlobR.o = RNFetchBlobReq$RequestType.AsIs;
                }
             }
          }else {
             rNFetchBlobR.o = RNFetchBlobReq$RequestType.WithoutBody;
          }
          boolean b1 = (rNFetchBlobR.b(hashMap, "Transfer-Encoding")).equalsIgnoreCase("chunked");
          int i3 = RNFetchBlobReq$b.a[rNFetchBlobR.o.ordinal()];
          if (i3 != 1) {
             if (i3 != 2) {
                if (i3 != 3) {
                   if (i3 == 4) {
                      if (!(rNFetchBlobR.e).equalsIgnoreCase(str1) && ((rNFetchBlobR.e).equalsIgnoreCase("put") || (rNFetchBlobR.e).equalsIgnoreCase("patch"))) {
                         byte[] uobyteArray = new byte[0];
                         uBuilder2.method(rNFetchBlobR.e, RequestBody.create(null, uobyteArray));
                      }else {
                         uBuilder2.method(rNFetchBlobR.e, null);
                      }
                   }
                }else {
                   uoa = new a(rNFetchBlobR.b.get(), rNFetchBlobR.d);
                   uoa.a(b1);
                   uoa.j(rNFetchBlobR.o);
                   uoa.g(rNFetchBlobR.i);
                   uoa.i(MediaType.parse("multipart/form-data; boundary="+"RNFetchBlob-"+rNFetchBlobR.d));
                   rNFetchBlobR.n = uoa;
                   uBuilder2.method(rNFetchBlobR.e, uoa);
                }
             }else {
                uoa = new a(rNFetchBlobR.b.get(), rNFetchBlobR.d);
                uoa.a(b1);
                uoa.j(rNFetchBlobR.o);
                uoa.h(rNFetchBlobR.g);
                uoa.i(MediaType.parse(rNFetchBlobR.b(hashMap, "content-type")));
                rNFetchBlobR.n = uoa;
                uBuilder2.method(rNFetchBlobR.e, uoa);
             }
          }else {
             uoa = new a(rNFetchBlobR.b.get(), rNFetchBlobR.d);
             uoa.a(b1);
             uoa.j(rNFetchBlobR.o);
             uoa.h(rNFetchBlobR.g);
             uoa.i(MediaType.parse(rNFetchBlobR.b(hashMap, "content-type")));
             rNFetchBlobR.n = uoa;
             uBuilder2.method(rNFetchBlobR.e, uoa);
          }
          Request request1 = uBuilder2.build();
          uBuilder1.addNetworkInterceptor(new RNFetchBlobReq$1(rNFetchBlobR));
          uBuilder1.addInterceptor(new RNFetchBlobReq$2(rNFetchBlobR, request1));
          a k = rNFetchBlobR.c.k;
          if (k >= 0) {
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             uBuilder1.connectTimeout(k, mILLISECONDS);
             uBuilder1.readTimeout(rNFetchBlobR.c.k, mILLISECONDS);
          }
          uBuilder1.connectionPool(RNFetchBlobReq.z);
          uBuilder1.retryOnConnectionFailure(false);
          uBuilder1.followRedirects(rNFetchBlobR.c.m.booleanValue());
          uBuilder1.followSslRedirects(rNFetchBlobR.c.m.booleanValue());
          uBuilder1.retryOnConnectionFailure(1);
          Call uCall = uBuilder1.build().newCall(request1);
          RNFetchBlobReq.v.put(rNFetchBlobR.d, uCall);
          uCall.enqueue(new RNFetchBlobReq$a(rNFetchBlobR));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          this.e();
          Object[] objArray1 = new Object[]{"RNFetchBlob request error: "+e0.getMessage()+e0.getCause()};
          rNFetchBlobR.k.invoke(objArray1);
       }
       return;
    }
}
