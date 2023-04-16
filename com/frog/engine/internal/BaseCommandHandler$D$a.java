package com.frog.engine.internal.BaseCommandHandler$d$a;
import java.lang.Runnable;
import com.frog.engine.internal.BaseCommandHandler$d;
import java.lang.String;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.BaseCommandHandler;
import org.json.JSONObject;
import com.frog.engine.storage.FrogStorageManager;
import com.frog.engine.jsobject.FrogJSObject;

public class BaseCommandHandler$d$a implements Runnable	// class@001511
{
    public final String a;
    public final FrogCommandResponseListener b;
    public final BaseCommandHandler$d c;

    public void BaseCommandHandler$d$a(BaseCommandHandler$d p0,String p1,FrogCommandResponseListener p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseCommandHandler$d$a.class, "1")) {
          return;
       }
       BaseCommandHandler mFrogStorage = this.c.a.mFrogStorageManager;
       Object[] objArray1 = (mFrogStorage == null)? objArray: mFrogStorage.get(this.a);
       if (this.b != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          if (objArray1 != null) {
             FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", objArray1), uFrogJSObjec);
             this.b.onResponse(uFrogJSObjec);
          }else {
             FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-1, "", objArray), uFrogJSObjec);
             this.b.onResponse(uFrogJSObjec);
          }
       }
       return;
    }
}
