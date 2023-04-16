package com.facebook.react.modules.websocket.WebSocketModule$a;
import okhttp3.WebSocketListener;
import com.facebook.react.modules.websocket.WebSocketModule;
import okhttp3.WebSocket;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Throwable;
import okhttp3.Response;
import java.util.Map;
import com.facebook.react.modules.websocket.WebSocketModule$b;
import okio.ByteString;

public class WebSocketModule$a extends WebSocketListener	// class@0012fd
{
    public final int a;
    public final WebSocketModule b;

    public void WebSocketModule$a(WebSocketModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onClosed(WebSocket p0,int p1,String p2){
       if (PatchProxy.isSupport(WebSocketModule$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, WebSocketModule$a.class, "3")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("id", this.a);
       writableMap.putInt("code", p1);
       writableMap.putString("reason", p2);
       this.b.sendEvent("websocketClosed", writableMap);
       return;
    }
    public void onClosing(WebSocket p0,int p1,String p2){
       if (PatchProxy.isSupport(WebSocketModule$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, WebSocketModule$a.class, "2")) {
          return;
       }
       p0.close(p1, p2);
       return;
    }
    public void onFailure(WebSocket p0,Throwable p1,Response p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WebSocketModule$a.class, "4")) {
          return;
       }
       this.b.notifyWebSocketFailed(this.a, p1.getMessage());
       return;
    }
    public void onMessage(WebSocket p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketModule$a.class, "5")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("id", this.a);
       writableMap.putString("type", "text");
       WebSocketModule$b uob = this.b.mContentHandlers.get(Integer.valueOf(this.a));
       if (uob != null) {
          uob.b(p1, writableMap);
       }else {
          writableMap.putString("data", p1);
       }
       this.b.sendEvent("websocketMessage", writableMap);
       return;
    }
    public void onMessage(WebSocket p0,ByteString p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketModule$a.class, "6")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("id", this.a);
       writableMap.putString("type", "binary");
       WebSocketModule$b uob = this.b.mContentHandlers.get(Integer.valueOf(this.a));
       if (uob != null) {
          uob.a(p1, writableMap);
       }else {
          writableMap.putString("data", p1.base64());
       }
       this.b.sendEvent("websocketMessage", writableMap);
       return;
    }
    public void onOpen(WebSocket p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketModule$a.class, "1")) {
          return;
       }
       this.b.mWebSocketConnections.put(Integer.valueOf(this.a), p0);
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("id", this.a);
       writableMap.putString("protocol", p1.header("Sec-WebSocket-Protocol", ""));
       this.b.sendEvent("websocketOpen", writableMap);
       return;
    }
}
