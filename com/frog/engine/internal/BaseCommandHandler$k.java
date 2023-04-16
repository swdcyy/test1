package com.frog.engine.internal.BaseCommandHandler$k;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;

public class BaseCommandHandler$k extends FrogSyncRequestListener	// class@00151b
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$k(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$k.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = new FrogJSObject();
       BaseCommandHandler$k ta = this.a;
       FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", ta.getSystemInfo(ta.mWindowWidth, ta.mWindowHeight)), p0);
       return p0;
    }
}
