package com.facebook.react.modules.websocket.WebSocketModule$$MethodInfoProvider;
import ge.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.module.model.MethodDescriptor;

public final class WebSocketModule$$MethodInfoProvider extends a	// class@0012fc
{

    public void WebSocketModule$$MethodInfoProvider(){
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, WebSocketModule$$MethodInfoProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new MethodDescriptor("sendBinary", 2, 0, "\(Ljava/lang/String;D\)V"));
       obj.add(new MethodDescriptor("removeListeners", 1, 0, "\(D\)V"));
       obj.add(new MethodDescriptor("ping", 1, 0, "\(D\)V"));
       obj.add(new MethodDescriptor("close", 3, 0, "\(DLjava/lang/String;D\)V"));
       obj.add(new MethodDescriptor("send", 2, 0, "\(Ljava/lang/String;D\)V"));
       obj.add(new MethodDescriptor("connect", 4, 0, "\(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D\)V"));
       obj.add(new MethodDescriptor("addListener", 1, 0, "\(Ljava/lang/String;\)V"));
       return obj;
    }
}
