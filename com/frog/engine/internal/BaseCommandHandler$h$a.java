package com.frog.engine.internal.BaseCommandHandler$h$a;
import java.lang.Runnable;
import com.frog.engine.internal.BaseCommandHandler$h;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.storage.FrogStorageManager;
import com.frog.engine.jsobject.FrogJSObject;
import org.json.JSONObject;

public class BaseCommandHandler$h$a implements Runnable	// class@001517
{
    public final FrogCommandResponseListener a;
    public final BaseCommandHandler$h b;

    public void BaseCommandHandler$h$a(BaseCommandHandler$h p0,FrogCommandResponseListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseCommandHandler$h$a.class, "1")) {
          return;
       }
       BaseCommandHandler mFrogStorage = this.b.a.mFrogStorageManager;
       if (mFrogStorage != null) {
          mFrogStorage.clean();
       }
       if (this.a != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", objArray), uFrogJSObjec);
          this.a.onResponse(uFrogJSObjec);
       }
       return;
    }
}
