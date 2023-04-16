package com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.ConcurrentHashMap;
import com.facebook.react.modules.network.e;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.net.URI;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.Double;
import java.util.Map;
import okhttp3.WebSocket;
import java.lang.Throwable;
import cb.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request$Builder;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.lang.CharSequence;
import okhttp3.Request;
import com.facebook.react.modules.websocket.WebSocketModule$a;
import okhttp3.WebSocketListener;
import okhttp3.Dispatcher;
import java.util.concurrent.ExecutorService;
import java.util.HashMap;
import java.util.List;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import okio.ByteString;
import java.lang.Exception;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.websocket.WebSocketModule$b;

public final class WebSocketModule extends NativeWebSocketModuleSpec	// class@0012ff
{
    public final Map mContentHandlers;
    public e mCookieHandler;
    public final Map mWebSocketConnections;
    public static final String TAG = "WebSocketModule";

    public void WebSocketModule(ReactApplicationContext p0){
       super(p0);
       this.mWebSocketConnections = new ConcurrentHashMap();
       this.mContentHandlers = new ConcurrentHashMap();
       this.mCookieHandler = new e(p0);
    }
    public static String getDefaultOrigin(String p0){
       int i1;
       Object[] objArray;
       String obj = PatchProxy.applyOneRefs(p0, null, WebSocketModule.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = "";
          URI uRI = new URI(p0);
          String scheme = uRI.getScheme();
          int i = scheme.hashCode();
          if (i != 3804) {
             if (i != 0x1cd17) {
                if (i != 0x310888) {
                   if (i == 0x5f008eb && scheme.equals("https")) {
                      i1 = 3;
                   }else {
                   label_0060 :
                      i1 = -1;
                   }
                }else if(scheme.equals("http")){
                   i1 = 2;
                }else {
                   goto label_0060 ;
                }
             }else if(scheme.equals("wss")){
                i1 = 0;
             }else {
                goto label_0060 ;
             }
          }else if(scheme.equals("ws")){
             i1 = 1;
          }else {
             goto label_0060 ;
          }
          if (i1) {
             if (i1 != 1) {
                if (i1 == 2 || i1 == 3) {
                   obj = obj+uRI.getScheme();
                }
             }else {
                obj = "http";
             }
          }else {
             obj = "https";
          }
          if (uRI.getPort() != -1) {
             objArray = new Object[]{obj,uRI.getHost(),Integer.valueOf(uRI.getPort())};
             p0 = String.format("%s://%s:%s", objArray);
          }else {
             objArray = new Object[]{obj,uRI.getHost()};
             p0 = String.format("%s://%s", objArray);
          }
          return p0;
       }catch(java.net.URISyntaxException e0){
          throw new IllegalArgumentException("Unable to set "+p0+" as default origin header");
       }
    }
    public void addListener(String p0){
    }
    public void close(double p0,String p1,double p2){
       if (PatchProxy.isSupport(WebSocketModule.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), p1, Double.valueOf(p2), this, WebSocketModule.class, "4")) {
          return;
       }
       int i = (int)p2;
       WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
       if (webSocket == null) {
          return;
       }
       int i1 = (int)p0;
       try{
          webSocket.close(i1, p1);
          this.mWebSocketConnections.remove(Integer.valueOf(i));
          this.mContentHandlers.remove(Integer.valueOf(i));
       }catch(java.lang.Exception e8){
          a.h("ReactNative", "Could not close WebSocket connection for id "+i, e8);
       }
       return;
    }
    public void connect(String p0,ReadableArray p1,ReadableMap p2,double p3){
       if (PatchProxy.isSupport(WebSocketModule.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Double.valueOf(p3), this, WebSocketModule.class, "3")) {
          return;
       }
       int i = (int)p3;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(10, sECONDS).writeTimeout(10, sECONDS);
       OkHttpClient okHttpClient = uBuilder.readTimeout(0, TimeUnit.MINUTES).build();
       Request$Builder uBuilder1 = new Request$Builder().tag(Integer.valueOf(i)).url(p0);
       String cookie = this.getCookie(p0);
       if (cookie != null) {
          uBuilder1.addHeader("Cookie", cookie);
       }
       cookie = "origin";
       if (p2 != null) {
          String str = "headers";
          if (p2.hasKey(str) && p2.getType(str).equals(ReadableType.Map)) {
             p2 = p2.getMap(str);
             ReadableMapKeySetIterator readableMapK = p2.keySetIterator();
             if (!p2.hasKey(cookie)) {
                uBuilder1.addHeader(cookie, WebSocketModule.getDefaultOrigin(p0));
             }
             while (readableMapK.hasNextKey()) {
                p0 = readableMapK.nextKey();
                if (ReadableType.String.equals(p2.getType(p0))) {
                   uBuilder1.addHeader(p0, p2.getString(p0));
                }else {
                   a.x("ReactNative", "Ignoring: requested "+p0+", value not a string");
                }
             }
             if (p1 != null && p1.size() > 0) {
                p0 = "";
                int i1 = 0;
                while (i1 < p1.size()) {
                   str = (p1.getString(i1)).trim();
                   if (!str.isEmpty()) {
                      String str1 = ",";
                      if (!str.contains(str1)) {
                         p0 = p0+str+str1;
                      }
                   }
                   i1 = i1 + 1;
                }
                if (p0.length() > 0) {
                   p0.replace((p0.length() - 1), p0.length(), "");
                   uBuilder1.addHeader("Sec-WebSocket-Protocol", p0);
                }
             }
             okHttpClient.newWebSocket(uBuilder1.build(), new WebSocketModule$a(this, i));
             okHttpClient.dispatcher().executorService().shutdown();
             return;
          }
       }
       uBuilder1.addHeader(cookie, WebSocketModule.getDefaultOrigin(p0));
       goto label_00c3 ;
    }
    public final String getCookie(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, WebSocketModule.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.mCookieHandler.get(new URI(WebSocketModule.getDefaultOrigin(p0)), new HashMap()).get("Cookie");
          if (obj == null || obj.isEmpty()) {
             return null;
          }
          return obj.get(0);
       }catch(java.net.URISyntaxException e0){
          throw new IllegalArgumentException("Unable to get cookie from "+p0);
       }catch(java.io.IOException e0){
       }
    }
    public String getName(){
       return "WebSocketModule";
    }
    public void notifyWebSocketFailed(int p0,String p1){
       WebSocketModule webSocketMod = WebSocketModule.class;
       if (PatchProxy.isSupport(webSocketMod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, webSocketMod, "9")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("id", p0);
       writableMap.putString("message", p1);
       this.sendEvent("websocketFailed", writableMap);
       return;
    }
    public void ping(double p0){
       WebSocketModule webSocketMod = WebSocketModule.class;
       if (PatchProxy.isSupport(webSocketMod) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, webSocketMod, "8")) {
          return;
       }
       int i = (int)p0;
       WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
       if (webSocket == null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("id", i);
          writableMap.putString("message", "client is null");
          this.sendEvent("websocketFailed", writableMap);
          writableMap = Arguments.createMap();
          writableMap.putInt("id", i);
          writableMap.putInt("code", 0);
          writableMap.putString("reason", "client is null");
          this.sendEvent("websocketClosed", writableMap);
          this.mWebSocketConnections.remove(Integer.valueOf(i));
          this.mContentHandlers.remove(Integer.valueOf(i));
          return;
       }else {
          try{
             webSocket.send(ByteString.EMPTY);
          }catch(java.lang.Exception e5){
             this.notifyWebSocketFailed(i, e5.getMessage());
          }
          return;
       }
    }
    public void removeListeners(double p0){
    }
    public void send(String p0,double p1){
       WebSocketModule webSocketMod = WebSocketModule.class;
       if (PatchProxy.isSupport(webSocketMod) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, webSocketMod, "5")) {
          return;
       }
       int i = (int)p1;
       WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
       if (webSocket == null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("id", i);
          writableMap.putString("message", "client is null");
          this.sendEvent("websocketFailed", writableMap);
          writableMap = Arguments.createMap();
          writableMap.putInt("id", i);
          writableMap.putInt("code", 0);
          writableMap.putString("reason", "client is null");
          this.sendEvent("websocketClosed", writableMap);
          this.mWebSocketConnections.remove(Integer.valueOf(i));
          this.mContentHandlers.remove(Integer.valueOf(i));
          return;
       }else {
          try{
             webSocket.send(p0);
          }catch(java.lang.Exception e4){
             this.notifyWebSocketFailed(i, e4.getMessage());
          }
          return;
       }
    }
    public void sendBinary(String p0,double p1){
       WebSocketModule webSocketMod = WebSocketModule.class;
       if (PatchProxy.isSupport(webSocketMod) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, webSocketMod, "6")) {
          return;
       }
       int i = (int)p1;
       WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
       if (webSocket == null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("id", i);
          writableMap.putString("message", "client is null");
          this.sendEvent("websocketFailed", writableMap);
          writableMap = Arguments.createMap();
          writableMap.putInt("id", i);
          writableMap.putInt("code", 0);
          writableMap.putString("reason", "client is null");
          this.sendEvent("websocketClosed", writableMap);
          this.mWebSocketConnections.remove(Integer.valueOf(i));
          this.mContentHandlers.remove(Integer.valueOf(i));
          return;
       }else {
          try{
             webSocket.send(ByteString.decodeBase64(p0));
          }catch(java.lang.Exception e4){
             this.notifyWebSocketFailed(i, e4.getMessage());
          }
          return;
       }
    }
    public void sendBinary(ByteString p0,int p1){
       WebSocketModule webSocketMod = WebSocketModule.class;
       if (PatchProxy.isSupport(webSocketMod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, webSocketMod, "7")) {
          return;
       }
       WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(p1));
       if (webSocket == null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("id", p1);
          writableMap.putString("message", "client is null");
          this.sendEvent("websocketFailed", writableMap);
          writableMap = Arguments.createMap();
          writableMap.putInt("id", p1);
          writableMap.putInt("code", 0);
          writableMap.putString("reason", "client is null");
          this.sendEvent("websocketClosed", writableMap);
          this.mWebSocketConnections.remove(Integer.valueOf(p1));
          this.mContentHandlers.remove(Integer.valueOf(p1));
          return;
       }else {
          try{
             webSocket.send(p0);
          }catch(java.lang.Exception e4){
             this.notifyWebSocketFailed(p1, e4.getMessage());
          }
          return;
       }
    }
    public void sendEvent(String p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketModule.class, "1")) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit(p0, p1);
       }
       return;
    }
    public void setContentHandler(int p0,WebSocketModule$b p1){
       WebSocketModule webSocketMod = WebSocketModule.class;
       if (PatchProxy.isSupport(webSocketMod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, webSocketMod, "2")) {
          return;
       }
       if (p1 != null) {
          this.mContentHandlers.put(Integer.valueOf(p0), p1);
       }else {
          this.mContentHandlers.remove(Integer.valueOf(p0));
       }
       return;
    }
}
