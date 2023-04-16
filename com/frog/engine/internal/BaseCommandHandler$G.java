package com.frog.engine.internal.BaseCommandHandler$g;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.storage.FrogStorageManager;
import org.json.JSONObject;

public class BaseCommandHandler$g extends FrogSyncRequestListener	// class@001516
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$g(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$g.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       BaseCommandHandler mFrogStorage = this.a.mFrogStorageManager;
       if (mFrogStorage != null) {
          mFrogStorage.clean();
       }
       mFrogStorage = new FrogJSObject();
       FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", null), mFrogStorage);
       return mFrogStorage;
    }
}
