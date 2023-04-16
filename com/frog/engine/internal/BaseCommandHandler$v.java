package com.frog.engine.internal.BaseCommandHandler$v;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;

public class BaseCommandHandler$v extends FrogAsyncRequestListener	// class@001529
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$v(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$v.class, "1")) {
          return;
       }
       if (p1 != null) {
          p0 = new FrogJSObject();
          BaseCommandHandler$v ta = this.a;
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", ta.getSystemInfo(ta.mWindowWidth, ta.mWindowHeight)), p0);
          p1.onResponse(p0);
       }
       return;
    }
}
