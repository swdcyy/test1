package com.frog.engine.internal.BaseCommandHandler$p;
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

public class BaseCommandHandler$p extends FrogAsyncRequestListener	// class@001523
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$p(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$p.class, "1")) {
          return;
       }
       if (this.a.checkParamInvalid(p0, p1)) {
          return;
       }
       double number = p0.getNumber("code");
       String str = p0.getString("reason");
       WebSocketTaskImpl webScoketTas = WebSocketManagerImpl.getInstance().getWebScoketTask((int)p0.getNumber("taskId"));
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       if (webScoketTas != null) {
          webScoketTas.close((int)number, str);
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
