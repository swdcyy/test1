package com.frog.engine.network.webscoket.WebSocketManagerImpl;
import com.frog.engine.network.webscoket.WebSocketManager;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Map;
import com.frog.engine.network.webscoket.WebSocketTaskImpl;
import com.frog.engine.network.webscoket.WebSocketRequest;
import com.frog.engine.network.webscoket.WebSocketListener;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.network.webscoket.WebSocketManagerImpl$a;
import com.frog.engine.network.FrogExternalInterceptor;
import java.lang.Number;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import org.json.JSONObject;
import java.lang.Throwable;
import android.util.Log;
import java.nio.ByteBuffer;

public class WebSocketManagerImpl implements WebSocketManager	// class@00155d
{
    public FrogExternalInterceptor interceptor;
    public Object mLock;
    public final Map mWebSocketTaskMap;
    public static WebSocketManagerImpl sInstance;

    public void WebSocketManagerImpl(){
       super();
       this.mWebSocketTaskMap = new LinkedHashMap();
       this.mLock = new Object();
    }
    public static WebSocketManagerImpl getInstance(){
       WebSocketManagerImpl webSocketMan = WebSocketManagerImpl.class;
       Object obj = PatchProxy.apply(null, null, webSocketMan, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (WebSocketManagerImpl.sInstance == null) {
          _monitor_enter(webSocketMan);
          WebSocketManagerImpl.sInstance = new WebSocketManagerImpl();
          _monitor_exit(webSocketMan);
       }
       return WebSocketManagerImpl.sInstance;
    }
    public void close(int p0,int p1,String p2){
       if (PatchProxy.isSupport(WebSocketManagerImpl.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, WebSocketManagerImpl.class, "9")) {
          return;
       }
       WebSocketManagerImpl tmLock = this.mLock;
       _monitor_enter(tmLock);
       WebSocketTaskImpl webSocketTas = this.mWebSocketTaskMap.get(Integer.valueOf(p0));
       if (webSocketTas != null) {
          webSocketTas.close(p1, p2);
       }
       _monitor_exit(tmLock);
       return;
    }
    public void connect(WebSocketRequest p0,WebSocketListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketManagerImpl.class, "6")) {
          return;
       }
       FrogLog.d("WebSocketManagerImpl", "connect "+p0);
       WebSocketTaskImpl webSocketTas = new WebSocketTaskImpl();
       WebSocketManagerImpl tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mWebSocketTaskMap.put(Integer.valueOf(p0.taskId), webSocketTas);
       _monitor_exit(tmLock);
       webSocketTas.connect(p0, new WebSocketManagerImpl$a(this, p1, p0));
       return;
    }
    public FrogExternalInterceptor getInterceptor(){
       return this.interceptor;
    }
    public int getSize(){
       WebSocketManagerImpl obj = PatchProxy.apply(null, this, WebSocketManagerImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.mWebSocketTaskMap.size();
    }
    public List getTaskList(){
       WebSocketManagerImpl obj = PatchProxy.apply(null, this, WebSocketManagerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ArrayList uArrayList = new ArrayList();
       Map$Entry uEntry = this.mWebSocketTaskMap.entrySet().iterator().next();
       if (uEntry != null && (uEntry.getKey() != null && uEntry.getValue() != null)) {
          uArrayList.add(uEntry.getKey());
       }
    label_003f :
       _monitor_exit(obj);
       return uArrayList;
    }
    public WebSocketTaskImpl getWebScoketTask(int p0){
       WebSocketManagerImpl webSocketMan = WebSocketManagerImpl.class;
       if (PatchProxy.isSupport(webSocketMan)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, webSocketMan, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       webSocketMan = this.mLock;
       _monitor_enter(webSocketMan);
       _monitor_exit(webSocketMan);
       return this.mWebSocketTaskMap.get(Integer.valueOf(p0));
    }
    public boolean isEnable(String p0){
       WebSocketManagerImpl obj = PatchProxy.applyOneRefs(p0, this, WebSocketManagerImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       boolean b = (this.mWebSocketTaskMap.get(p0) != null)? true: false;
       _monitor_exit(obj);
       return b;
    }
    public void send(int p0,String p1){
       WebSocketManagerImpl webSocketMan = WebSocketManagerImpl.class;
       if (PatchProxy.isSupport(webSocketMan) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, webSocketMan, "7")) {
          return;
       }
       webSocketMan = this.mLock;
       _monitor_enter(webSocketMan);
       WebSocketTaskImpl webSocketTas = this.mWebSocketTaskMap.get(Integer.valueOf(p0));
       if (webSocketTas != null) {
          try{
             JSONObject jSONObject = new JSONObject(p1);
             if (jSONObject.has("data")) {
                webSocketTas.send(jSONObject.optString("data"));
             }
          }catch(org.json.JSONException e4){
             FrogLog.e("WebSocketManagerImpl", "send parse error "+Log.getStackTraceString(e4));
          }
       }
    }
    public void send(int p0,ByteBuffer p1){
       WebSocketManagerImpl webSocketMan = WebSocketManagerImpl.class;
       if (PatchProxy.isSupport(webSocketMan) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, webSocketMan, "8")) {
          return;
       }
       webSocketMan = this.mLock;
       _monitor_enter(webSocketMan);
       WebSocketTaskImpl webSocketTas = this.mWebSocketTaskMap.get(Integer.valueOf(p0));
       if (webSocketTas != null) {
          webSocketTas.send(p1);
       }
       _monitor_exit(webSocketMan);
       return;
    }
    public void setInterceptor(FrogExternalInterceptor p0){
       this.interceptor = p0;
    }
}
