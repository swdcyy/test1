package com.frog.engine.network.webscoket.WebSocketTaskImpl$a;
import gwd.a;
import com.frog.engine.network.webscoket.WebSocketTaskImpl;
import java.net.URI;
import org.java_websocket.drafts.b;
import java.util.Map;
import com.frog.engine.network.webscoket.WebSocketListener;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import jwd.h;
import java.util.Iterator;
import jwd.f;
import java.util.HashMap;

public class WebSocketTaskImpl$a extends a	// class@001560
{
    public final WebSocketListener a;

    public void WebSocketTaskImpl$a(WebSocketTaskImpl p0,URI p1,b p2,Map p3,WebSocketListener p4){
       this.a = p4;
       super(p1, p2, p3);
    }
    public void onClose(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(WebSocketTaskImpl$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, WebSocketTaskImpl$a.class, "4")) {
          return;
       }
       this.a.onClose(p0, p1);
       return;
    }
    public void onError(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketTaskImpl$a.class, "5")) {
          return;
       }
       this.a.onError(p0);
       return;
    }
    public void onMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketTaskImpl$a.class, "2")) {
          return;
       }
       this.a.onMessage(p0);
       return;
    }
    public void onMessage(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketTaskImpl$a.class, "3")) {
          return;
       }
       this.a.onMessage(p0);
       return;
    }
    public void onOpen(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketTaskImpl$a.class, "1")) {
          return;
       }
       Iterator iterator = p0.iterateHttpFields();
       HashMap hashMap = new HashMap();
       while (iterator.hasNext()) {
          String str = iterator.next();
          hashMap.put(str, p0.getFieldValue(str));
       }
       this.a.onOpen(hashMap);
       return;
    }
}
