package com.frog.engine.internal.BaseCommandHandler$o;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.network.webscoket.WebSocketManagerImpl;
import com.frog.engine.network.webscoket.WebSocketTaskImpl;
import java.nio.ByteBuffer;

public class BaseCommandHandler$o extends FrogAsyncRequestListener	// class@001522
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$o(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$o.class, "1")) {
          return;
       }
       if (this.a.checkParamInvalid(p0, p1)) {
          return;
       }
       WebSocketTaskImpl webScoketTas = WebSocketManagerImpl.getInstance().getWebScoketTask((int)p0.getNumber("taskId"));
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       if (webScoketTas != null) {
          if (p0.isStringType("data")) {
             webScoketTas.send(p0.getString("data"));
          }else if(p0.isByteArrayType("data")){
             webScoketTas.send(ByteBuffer.wrap(p0.getBytes("data")));
          }
          uFrogJSObjec.put("code", 1);
       }else {
          uFrogJSObjec.put("code", -1);
       }
       if (p1 != null) {
          p1.onResponse(uFrogJSObjec);
       }
       return;
    }
}
