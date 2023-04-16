package com.facebook.react.modules.network.NetworkingModule$$MethodInfoProvider;
import ge.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.module.model.MethodDescriptor;

public final class NetworkingModule$$MethodInfoProvider extends a	// class@0012c2
{

    public void NetworkingModule$$MethodInfoProvider(){
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, NetworkingModule$$MethodInfoProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new MethodDescriptor("abortRequest", 1, 0, "\(D\)V"));
       obj.add(new MethodDescriptor("removeListeners", 1, 0, "\(D\)V"));
       obj.add(new MethodDescriptor("clearCookies", 1, 0, "\(Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("sendRequest", 9, 0, "\(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ\)V"));
       obj.add(new MethodDescriptor("addListener", 1, 0, "\(Ljava/lang/String;\)V"));
       return obj;
    }
}
