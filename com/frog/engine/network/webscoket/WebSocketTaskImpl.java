package com.frog.engine.network.webscoket.WebSocketTaskImpl;
import com.frog.engine.network.webscoket.WebSocketTask;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import gwd.a;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.network.webscoket.WebSocketRequest;
import com.frog.engine.network.webscoket.WebSocketListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import kwd.b;
import org.java_websocket.drafts.c;
import java.util.Collections;
import com.frog.engine.network.webscoket.WebSocketTaskImpl$a;
import java.net.URI;
import org.java_websocket.drafts.b;
import java.util.Map;
import fwd.a;
import java.lang.RuntimeException;
import java.nio.ByteBuffer;

public class WebSocketTaskImpl implements WebSocketTask	// class@001561
{
    public a mWebSocketClient;

    public void WebSocketTaskImpl(){
       super();
    }
    public void close(int p0,String p1){
       WebSocketTaskImpl webSocketTas = WebSocketTaskImpl.class;
       if (PatchProxy.isSupport(webSocketTas) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, webSocketTas, "2")) {
          return;
       }
       if (p0 > 0) {
          this.mWebSocketClient.close(p0, p1);
       }else {
          this.mWebSocketClient.close(1000, p1);
       }
       return;
    }
    public void connect(WebSocketRequest p0,WebSocketListener p1){
       c uoc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebSocketTaskImpl.class, "1")) {
          return;
       }
       if (this.mWebSocketClient != null) {
          throw new RuntimeException("WebSocketTask ≤ªø…∏¥”√");
       }
       WebSocketRequest protocols = p0.protocols;
       if (protocols == null || protocols.isEmpty()) {
          uoc = new c();
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = protocols.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new b(iterator.next()));
          }
          uoc = new c(Collections.EMPTY_LIST, uArrayList);
       }
       WebSocketTaskImpl$a uoa = new WebSocketTaskImpl$a(this, URI.create(p0.url), uoc, p0.headers, p1);
       this.mWebSocketClient = uoc;
       uoc.setTcpNoDelay(p0.tcpNoDelay);
       this.mWebSocketClient.setConnectionLostTimeout(0);
       this.mWebSocketClient.connect();
       return;
    }
    public void send(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketTaskImpl.class, "3")) {
          return;
       }
       this.mWebSocketClient.send(p0);
       return;
    }
    public void send(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketTaskImpl.class, "4")) {
          return;
       }
       this.mWebSocketClient.send(p0);
       return;
    }
}
