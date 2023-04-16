package com.frog.engine.internal.BaseCommandHandler$i;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.frog.engine.data.FrogInitParam;

public class BaseCommandHandler$i extends FrogSyncRequestListener	// class@001519
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$i(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$i.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       JSONObject jSONObject = null;
       BaseCommandHandler mInitParam = this.a.mInitParam;
       if (mInitParam != null) {
          jSONObject = mInitParam.getLaunchOption();
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), uFrogJSObjec);
       return uFrogJSObjec;
    }
}
