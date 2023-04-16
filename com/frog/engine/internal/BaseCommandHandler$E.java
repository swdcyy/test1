package com.frog.engine.internal.BaseCommandHandler$e;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.frog.engine.storage.FrogStorageManager;

public class BaseCommandHandler$e extends FrogSyncRequestListener	// class@001513
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$e(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       BaseCommandHandler mFrogStorage = this.a.mFrogStorageManager;
       JSONObject jSONObject = (mFrogStorage == null)? new JSONObject(): mFrogStorage.getStorageInfo();
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), uFrogJSObjec);
       return uFrogJSObjec;
    }
}
