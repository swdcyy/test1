package com.frog.engine.internal.BaseCommandHandler$f$a;
import java.lang.Runnable;
import com.frog.engine.internal.BaseCommandHandler$f;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.BaseCommandHandler;
import org.json.JSONObject;
import com.frog.engine.storage.FrogStorageManager;
import com.frog.engine.jsobject.FrogJSObject;

public class BaseCommandHandler$f$a implements Runnable	// class@001514
{
    public final FrogCommandResponseListener a;
    public final BaseCommandHandler$f b;

    public void BaseCommandHandler$f$a(BaseCommandHandler$f p0,FrogCommandResponseListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BaseCommandHandler$f$a.class, "1")) {
          return;
       }
       BaseCommandHandler mFrogStorage = this.b.a.mFrogStorageManager;
       JSONObject jSONObject = (mFrogStorage == null)? new JSONObject(): mFrogStorage.getStorageInfo();
       if (this.a != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), uFrogJSObjec);
          this.a.onResponse(uFrogJSObjec);
       }
       return;
    }
}
