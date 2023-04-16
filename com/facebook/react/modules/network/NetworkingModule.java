package com.facebook.react.modules.network.NetworkingModule;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import android.content.Context;
import okhttp3.OkHttpClient;
import qe.e;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.OkHttpClient$Builder;
import java.util.Iterator;
import java.lang.Object;
import qe.c;
import okhttp3.Interceptor;
import com.facebook.react.modules.network.e;
import com.facebook.react.bridge.ReactContext;
import okhttp3.CookieJar;
import qe.a;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.network.NetworkingModule$d;
import okhttp3.Headers;
import com.facebook.react.bridge.WritableMap;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.facebook.react.bridge.Arguments;
import java.lang.Double;
import java.lang.Integer;
import java.util.Set;
import com.facebook.react.modules.network.NetworkingModule$e;
import com.facebook.react.modules.network.NetworkingModule$f;
import com.facebook.react.modules.network.NetworkingModule$g;
import com.facebook.react.modules.network.NetworkingModule$c;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.Void;
import android.os.AsyncTask;
import com.facebook.react.bridge.Callback;
import java.util.Objects;
import com.facebook.react.modules.network.b;
import com.kuaishou.webkit.CookieManager;
import com.facebook.react.modules.network.c;
import com.kuaishou.webkit.ValueCallback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import okhttp3.MultipartBody$Builder;
import okhttp3.MediaType;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Throwable;
import qe.j;
import okhttp3.Headers$Builder;
import okhttp3.RequestBody;
import java.io.InputStream;
import com.facebook.react.modules.network.i;
import qe.b;
import com.facebook.react.transientpage.TransientPageModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.transientpage.TransientEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import okhttp3.JavaNetCookieJar;
import java.net.CookieHandler;
import com.facebook.react.modules.network.e$b;
import okhttp3.ResponseBody;
import qe.g;
import vd.g;
import java.nio.charset.Charset;
import qe.h;
import java.lang.Boolean;
import cb.a;
import android.net.Uri;
import okhttp3.Request$Builder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.facebook.react.modules.network.NetworkingModule$1;
import java.util.concurrent.TimeUnit;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import okio.ByteString;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.Call;
import com.facebook.react.modules.network.NetworkingModule$a;
import okhttp3.Callback;
import java.lang.Exception;
import java.io.IOException;
import com.facebook.react.modules.network.NetworkingModule$b;
import com.facebook.react.modules.network.g;
import qe.f;

public final class NetworkingModule extends NativeNetworkingAndroidSpec	// class@0012cc
{
    public final OkHttpClient mClient;
    public final e mCookieHandler;
    public final a mCookieJarContainer;
    public final String mDefaultUserAgent;
    public final OkHttpClient mOriginClient;
    public final List mRequestBodyHandlers;
    public final Set mRequestIds;
    public final List mResponseHandlers;
    public boolean mShuttingDown;
    public final List mUriHandlers;
    public static NetworkingModule$d customClientBuilder;

    public void NetworkingModule(ReactApplicationContext p0){
       super(p0, null, e.a(p0), null);
    }
    public void NetworkingModule(ReactApplicationContext p0,String p1){
       super(p0, p1, e.a(p0), null);
    }
    public void NetworkingModule(ReactApplicationContext p0,String p1,OkHttpClient p2){
       super(p0, p1, p2, null);
    }
    public void NetworkingModule(ReactApplicationContext p0,String p1,OkHttpClient p2,List p3){
       OkHttpClient$Builder uBuilder1;
       super(p0);
       this.mRequestBodyHandlers = new ArrayList();
       this.mUriHandlers = new ArrayList();
       this.mResponseHandlers = new CopyOnWriteArrayList();
       OkHttpClient$Builder uBuilder = e.d(p0);
       if (p3 != null) {
          uBuilder1 = p2.newBuilder();
          Iterator iterator = p3.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             uBuilder1.addNetworkInterceptor(uoc.create());
             uBuilder.addNetworkInterceptor(uoc.create());
          }
          uBuilder1 = uBuilder1.build();
       }
       this.mClient = uBuilder1;
       this.mCookieHandler = new e(p0);
       a uoa = uBuilder1.cookieJar();
       this.mCookieJarContainer = uoa;
       uBuilder.cookieJar(uoa);
       this.mOriginClient = uBuilder.build();
       this.mShuttingDown = false;
       this.mDefaultUserAgent = p1;
       this.mRequestIds = new HashSet();
       return;
    }
    public void NetworkingModule(ReactApplicationContext p0,List p1){
       super(p0, null, e.a(p0), p1);
    }
    public static void applyCustomBuilder(OkHttpClient$Builder p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NetworkingModule.class, "1")) {
          return;
       }
       NetworkingModule$d customClient = NetworkingModule.customClientBuilder;
       if (customClient != null) {
          customClient.a(p0);
       }
       return;
    }
    public static void setCustomClientBuilder(NetworkingModule$d p0){
       NetworkingModule.customClientBuilder = p0;
    }
    public static boolean shouldDispatch(long p0,long p1){
       boolean b = ((p1 + 0x5f5e100) - p0 < 0)? true: false;
       return b;
    }
    public static WritableMap translateHeaders(Headers p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, null, NetworkingModule.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       int i = 0;
       while (i < p0.size()) {
          String str = p0.name(i);
          if (obj.containsKey(str)) {
             obj.putString(str, obj.getString(str)+", "+p0.value(i));
          }else {
             obj.putString(str, p0.value(i));
          }
          i = i + 1;
       }
       return Arguments.fromBundle(obj);
    }
    public void abortRequest(double p0){
       NetworkingModule networkingMo = NetworkingModule.class;
       if (PatchProxy.isSupport(networkingMo) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, networkingMo, "18")) {
          return;
       }
       int i = (int)p0;
       this.cancelRequest(i);
       this.removeRequest(i);
       return;
    }
    public void addListener(String p0){
    }
    public synchronized final void addRequest(int p0){
       NetworkingModule networkingMo = NetworkingModule.class;
       if (PatchProxy.isSupport(networkingMo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, networkingMo, "14")) {
          return;
       }
       this.mRequestIds.add(Integer.valueOf(p0));
       return;
    }
    public void addRequestBodyHandler(NetworkingModule$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "5")) {
          return;
       }
       this.mRequestBodyHandlers.add(p0);
       return;
    }
    public void addResponseHandler(NetworkingModule$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "6")) {
          return;
       }
       this.mResponseHandlers.add(p0);
       return;
    }
    public void addUriHandler(NetworkingModule$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "4")) {
          return;
       }
       this.mUriHandlers.add(p0);
       return;
    }
    public synchronized final void cancelAllRequests(){
       if (PatchProxy.applyVoid(null, this, NetworkingModule.class, "16")) {
          return;
       }
       Iterator iterator = this.mRequestIds.iterator();
       while (iterator.hasNext()) {
          this.cancelRequest(iterator.next().intValue());
       }
       this.mRequestIds.clear();
       return;
    }
    public final void cancelRequest(int p0){
       NetworkingModule networkingMo = NetworkingModule.class;
       if (PatchProxy.isSupport(networkingMo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, networkingMo, "19")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new NetworkingModule$c(this, this.getReactApplicationContext(), p0).execute(voidArray);
       return;
    }
    public void clearCookies(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "20")) {
          return;
       }
       NetworkingModule tmCookieHand = this.mCookieHandler;
       Objects.requireNonNull(tmCookieHand);
       if (!PatchProxy.applyVoidOneRefs(p0, tmCookieHand, e.class, "3")) {
          if (e.d) {
             Void[] voidArray = new Void[0];
             new b(tmCookieHand, tmCookieHand.b, p0).execute(voidArray);
          }else if(PatchProxy.applyVoidOneRefs(p0, tmCookieHand, e.class, "4")){
             CookieManager uCookieManag = tmCookieHand.b();
             if (uCookieManag != null) {
                uCookieManag.removeAllCookies(new c(tmCookieHand, p0));
             }
          }
       }
       return;
    }
    public final MultipartBody$Builder constructMultipartBody(ReadableArray p0,String p1,int p2,DeviceEventManagerModule$RCTDeviceEventEmitter p3){
       MultipartBody$Builder obj;
       String this;
       MediaType mediaType;
       if (PatchProxy.isSupport(NetworkingModule.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, NetworkingModule.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new MultipartBody$Builder();
       obj.setType(MediaType.parse(p1));
       int i = 0;
       int i1 = p0.size();
       while (true) {
          if (i >= i1) {
             return obj;
          }
          ReadableMap map = p0.getMap(i);
          Headers headers = this.extractHeaders(map.getArray("headers"), null);
          if (headers == null) {
             break ;
          }else {
             this = "content-type";
             String str = headers.get(this);
             if (str != null) {
                mediaType = MediaType.parse(str);
                headers = headers.newBuilder().removeAll(this).build();
             }else {
                mediaType = null;
             }
             this = "string";
             if (map.hasKey(this)) {
                obj.addPart(headers, RequestBody.create(mediaType, map.getString(this)));
             }else {
                this = "uri";
                if (map.hasKey(this)) {
                   if (mediaType == null) {
                      j.c(p3, p2, "Binary FormData part needs a content-type header.", null);
                      return null;
                   }else {
                      String str1 = map.getString(this);
                      InputStream inputStream = i.d(this.getReactApplicationContext(), str1);
                      if (inputStream == null) {
                         j.c(p3, p2, "Could not retrieve file for uri "+str1, null);
                         return null;
                      }else {
                         obj.addPart(headers, i.a(mediaType, inputStream));
                      }
                   }
                }else {
                   j.c(p3, p2, "Unrecognized FormData part.", null);
                }
             }
             i++;
          }
       }
       j.c(p3, p2, "Missing or invalid header format for FormData part.", null);
       return null;
    }
    public final Headers extractHeaders(ReadableArray p0,ReadableMap p1){
       String str2;
       int i5;
       char c;
       Object obj = this;
       ReadableArray readableArra = p0;
       Object obj1 = p1;
       b uob = b.class;
       Headers obj2 = PatchProxy.applyTwoRefs(readableArra, obj1, obj, NetworkingModule.class, "22");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = null;
       if (readableArra == null) {
          return obj2;
       }
       Headers$Builder uBuilder = new Headers$Builder();
       int i = p0.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < i) {
             ReadableArray array = readableArra.getArray(i2);
             if (array == null || array.size() != 2) {
                return obj2;
             }else {
                String str = array.getString(i1);
                StringBuilder str1 = PatchProxy.applyOneRefs(str, obj2, uob, "1");
                if (str1 != PatchProxyResult.class) {
                }else {
                   str1 = new StringBuilder(str.length());
                   i5 = str.length();
                   int i6 = 0;
                   while (i1 < i5) {
                      c = str.charAt(i1);
                      if (c > ' ' && c < 127) {
                         str1 = str1+c;
                      }else {
                         i6 = 1;
                      }
                      i1 = i1 + 1;
                      c = 0;
                   }
                   if (i6) {
                      str = str1;
                   }
                   str1 = str;
                }
                str2 = array.getString(1);
                StringBuilder str3 = PatchProxy.applyOneRefs(str2, null, uob, "2");
                if (str3 != PatchProxyResult.class) {
                }else {
                   str3 = new StringBuilder(str2.length());
                   int i3 = str2.length();
                   int i4 = 0;
                   i5 = 0;
                   while (i4 < i3) {
                      c = str2.charAt(i4);
                      if (c <= 31 || (c < 127 || c == 9)) {
                         str3 = str3+c;
                      }else {
                         i5 = 1;
                      }
                      i4 = i4 + 1;
                      c = 1;
                   }
                   if (i5) {
                      str2 = str3;
                   }
                   str3 = str2;
                }
                if (str1 == null || str3 == null) {
                   return null;
                }else {
                   uBuilder.add(str1, str3);
                   i2 = i2 + 1;
                   readableArra = p0;
                   obj2 = null;
                   i1 = 0;
                }
             }
          }else {
             String str4 = "user-agent";
             if (uBuilder.get(str4) == null) {
                NetworkingModule mDefaultUser = obj.mDefaultUserAgent;
                if (mDefaultUser != null) {
                   uBuilder.add(str4, mDefaultUser);
                }
             }
             str2 = (obj1 != null && obj1.hasKey("string"))? 1: 0;
             if (!str2) {
                uBuilder.removeAll("content-encoding");
                break ;
             }
             break ;
          }
       }
       return uBuilder.build();
    }
    public final DeviceEventManagerModule$RCTDeviceEventEmitter getEventEmitter(String p0){
       TransientPageModule transientPag = TransientPageModule.class;
       p0 = PatchProxy.applyOneRefs(p0, this, NetworkingModule.class, "23");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       TransientPageModule transientPag1 = null;
       if (this.getReactApplicationContextIfActiveOrWarn() == null) {
          return transientPag1;
       }
       if (this.getReactApplicationContext().hasNativeModule(transientPag)) {
          transientPag1 = this.getReactApplicationContext().getNativeModule(transientPag);
       }
       if (transientPag1 != null && transientPag1.isActive()) {
          return this.getReactApplicationContext().getJSModule(TransientEventEmitter.class);
       }else {
          return this.getReactApplicationContext().getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class);
       }
    }
    public String getName(){
       return "Networking";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, NetworkingModule.class, "2")) {
          return;
       }
       this.mCookieJarContainer.a(new JavaNetCookieJar(this.mCookieHandler));
       return;
    }
    public void onCatalystInstanceDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NetworkingModule.class, "3")) {
          return;
       }
       this.mShuttingDown = true;
       this.cancelAllRequests();
       NetworkingModule tmCookieHand = this.mCookieHandler;
       Objects.requireNonNull(tmCookieHand);
       if (!PatchProxy.applyVoid(objArray, tmCookieHand, e.class, "5") && e.d) {
          CookieManager uCookieManag = tmCookieHand.b();
          if (uCookieManag != null) {
             uCookieManag.removeExpiredCookie();
          }
          tmCookieHand.a.b();
       }
       this.mCookieJarContainer.b();
       this.mRequestBodyHandlers.clear();
       this.mResponseHandlers.clear();
       this.mUriHandlers.clear();
       return;
    }
    public void readWithProgress(DeviceEventManagerModule$RCTDeviceEventEmitter p0,int p1,ResponseBody p2){
       g e;
       if (PatchProxy.isSupport(NetworkingModule.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, NetworkingModule.class, "13")) {
          return;
       }
       long l = -1;
       try{
          g og = p2;
          e = og.e;
          try{
             l = og.contentLength();
          }catch(java.lang.ClassCastException e0){
          }
       }catch(java.lang.ClassCastException e0){
          e = e0;
       }
       Charset a = (p2.contentType() == null)? g.a: p2.contentType().charset(g.a);
       h oh = new h(a);
       InputStream inputStream = p2.byteStream();
       byte[] uobyteArray = new byte[8192];
       int i = inputStream.read(uobyteArray);
       while (i != -1) {
          j.b(p0, p1, oh.a(uobyteArray, i), e, e0);
       }
       inputStream.close();
       return;
    }
    public void removeListeners(double p0){
    }
    public synchronized void removeRequest(int p0){
       NetworkingModule networkingMo = NetworkingModule.class;
       if (PatchProxy.isSupport(networkingMo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, networkingMo, "15")) {
          return;
       }
       this.mRequestIds.remove(Integer.valueOf(p0));
       return;
    }
    public void removeRequestBodyHandler(NetworkingModule$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "8")) {
          return;
       }
       this.mRequestBodyHandlers.remove(p0);
       return;
    }
    public void removeResponseHandler(NetworkingModule$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "9")) {
          return;
       }
       this.mResponseHandlers.remove(p0);
       return;
    }
    public void removeUriHandler(NetworkingModule$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkingModule.class, "7")) {
          return;
       }
       this.mUriHandlers.remove(p0);
       return;
    }
    public void sendRequest(String p0,String p1,double p2,ReadableArray p3,ReadableMap p4,String p5,boolean p6,double p7,boolean p8){
       object oobject = p1;
       NetworkingModule networkingMo = NetworkingModule.class;
       if (PatchProxy.isSupport(networkingMo)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = Double.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Double.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, networkingMo, "10")) {
             return;
          }
       }
       this.sendRequestInternal(p0, p1, (int)p2, p3, p4, p5, p6, (int)p7, p8);
       return;
    }
    public void sendRequestInternal(String p0,String p1,int p2,ReadableArray p3,ReadableMap p4,String p5,boolean p6,int p7,boolean p8){
       NetworkingModule$e uoe;
       RequestBody requestBody;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       int i1 = p7;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       NetworkingModule networkingMo = NetworkingModule.class;
       if (PatchProxy.isSupport(networkingMo)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = oobject4;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, obj, networkingMo, "11")) {
             return;
          }
       }
       DeviceEventManagerModule$RCTDeviceEventEmitter eventEmitter = obj.getEventEmitter("sendRequestInternal");
       try{
          Uri uri = Uri.parse(p1);
          Iterator iterator = obj.mUriHandlers.iterator();
          while (true) {
             if (iterator.hasNext()) {
                NetworkingModule$g og = iterator.next();
                if (og.b(uri, oobject4)) {
                   j.a(eventEmitter, i, og.a(uri));
                   j.d(eventEmitter, i);
                   return;
                }
             }else {
                Throwable throwable = null;
                try{
                   Request$Builder uBuilder = new Request$Builder().url(oobject1);
                   if (i) {
                      uBuilder.tag(Integer.valueOf(p2));
                   }
                   Headers headers = obj.extractHeaders(oobject2, oobject3);
                   if (headers == null) {
                      j.c(eventEmitter, i, "Unrecognized headers format", throwable);
                      return;
                   }else {
                      String str = "attach_common_params";
                      NetworkingModule mOriginClien = (TextUtils.equals(headers.get(str), "false"))? obj.mOriginClient: obj.mClient;
                      headers = headers.newBuilder().removeAll(str).build();
                      OkHttpClient$Builder uBuilder1 = mOriginClien.newBuilder();
                      NetworkingModule.applyCustomBuilder(uBuilder1);
                      if (!p8) {
                         uBuilder1.cookieJar(CookieJar.NO_COOKIES);
                      }
                      if (p6) {
                         uBuilder1.addNetworkInterceptor(new NetworkingModule$1(obj, oobject4, eventEmitter, i));
                      }
                      if (i1 != mOriginClien.connectTimeoutMillis()) {
                         uBuilder1.connectTimeout((long)i1, TimeUnit.MILLISECONDS);
                      }
                      OkHttpClient okHttpClient = uBuilder1.build();
                      str = headers.get("content-type");
                      String str1 = headers.get("content-encoding");
                      uBuilder.headers(headers);
                      if (oobject3 != null) {
                         Iterator iterator1 = obj.mRequestBodyHandlers.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               uoe = iterator1.next();
                               if (uoe.b(oobject3)) {
                               label_0113 :
                                  if (oobject3 != null && ((p0.toLowerCase()).equals("get") || (p0.toLowerCase()).equals("head"))) {
                                     requestBody = i.c(p0);
                                     break ;
                                  }else if(uoe != null){
                                     requestBody = uoe.a(oobject3, str);
                                     break ;
                                  }else {
                                     String str2 = "string";
                                     if (oobject3.hasKey(str2)) {
                                        if (str == null) {
                                           j.c(eventEmitter, i, "Payload is set but no content-type header specified", throwable);
                                           return;
                                        }else {
                                           str2 = oobject3.getString(str2);
                                           MediaType mediaType = MediaType.parse(str);
                                           Object obj1 = PatchProxy.applyOneRefs(str1, throwable, oi, "1");
                                           boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): ("gzip").equalsIgnoreCase(str1);
                                           if (b) {
                                              RequestBody requestBody1 = PatchProxy.applyTwoRefs(mediaType, str2, throwable, oi, "4");
                                              if (requestBody1 != patchProxyRe) {
                                              }else {
                                                 try{
                                                    ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                                                    GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
                                                    gZIPOutputSt.write(str2.getBytes());
                                                    gZIPOutputSt.close();
                                                    requestBody1 = RequestBody.create(mediaType, uByteArrayOu.toByteArray());
                                                 }catch(java.io.IOException e0){
                                                    requestBody1 = throwable;
                                                 }
                                              }
                                           }else {
                                              Charset a = g.a;
                                              if (mediaType != null) {
                                                 a = mediaType.charset(a);
                                              }
                                              requestBody = RequestBody.create(mediaType, str2.getBytes(a));
                                              break ;
                                           }
                                        }
                                     }else {
                                        str2 = "base64";
                                        if (oobject3.hasKey(str2)) {
                                           if (str == null) {
                                              j.c(eventEmitter, i, "Payload is set but no content-type header specified", throwable);
                                              return;
                                           }else {
                                              requestBody = RequestBody.create(MediaType.parse(str), ByteString.decodeBase64(oobject3.getString(str2)));
                                              break ;
                                           }
                                        }else {
                                           str2 = "uri";
                                           if (oobject3.hasKey(str2)) {
                                              if (str == null) {
                                                 j.c(eventEmitter, i, "Payload is set but no content-type header specified", throwable);
                                                 return;
                                              }else {
                                                 str2 = oobject3.getString(str2);
                                                 InputStream inputStream = i.d(this.getReactApplicationContext(), str2);
                                                 if (inputStream == null) {
                                                    j.c(eventEmitter, i, "Could not retrieve file for uri "+str2, throwable);
                                                    return;
                                                 }else {
                                                    requestBody = i.a(MediaType.parse(str), inputStream);
                                                    break ;
                                                 }
                                              }
                                           }else {
                                              str2 = "formData";
                                              if (oobject3.hasKey(str2)) {
                                                 if (str == null) {
                                                    str = "multipart/form-data";
                                                 }
                                                 MultipartBody$Builder uBuilder2 = obj.constructMultipartBody(oobject3.getArray(str2), str, i, eventEmitter);
                                                 if (uBuilder2 == null) {
                                                    return;
                                                 }else {
                                                    requestBody = uBuilder2.build();
                                                    break ;
                                                 }
                                              }else {
                                                 requestBody = i.c(p0);
                                                 break ;
                                              }
                                           }
                                        }
                                     }
                                  }
                                  break ;
                               }else {
                                  continue ;
                               }
                            }
                         }
                         uBuilder.method(oobject, obj.wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                         obj.addRequest(i);
                         NetworkingModule$a uoa = new NetworkingModule$a(this, p2, eventEmitter, p5, p6);
                         okHttpClient.newCall(uBuilder.build()).enqueue(patchProxyRe);
                         return;
                      }
                      uoe = throwable;
                      goto label_0113 ;
                   }
                }catch(java.lang.Exception e0){
                   j.c(eventEmitter, i, e0.getMessage(), throwable);
                   return;
                }
             }
          }
       }catch(java.io.IOException e0){
          j.c(eventEmitter, i, e0.getMessage(), e0);
          return;
       }
    }
    public final RequestBody wrapRequestBodyWithProgressEmitter(RequestBody p0,DeviceEventManagerModule$RCTDeviceEventEmitter p1,int p2){
       if (PatchProxy.isSupport(NetworkingModule.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, NetworkingModule.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          NetworkingModule$b uob = new NetworkingModule$b(this, p1, p2);
          g og = PatchProxy.applyTwoRefs(p0, uob, null, i.class, "6");
          if (og != PatchProxyResult.class) {
          }else {
             og = new g(p0, uob);
          }
          return og;
       }
    }
}
