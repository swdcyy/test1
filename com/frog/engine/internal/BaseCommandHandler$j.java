package com.frog.engine.internal.BaseCommandHandler$j;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.network.FrogOkHttpManager;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;

public class BaseCommandHandler$j extends FrogSyncRequestListener	// class@00151a
{

    public void BaseCommandHandler$j(BaseCommandHandler p0){
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             FrogOkHttpManager.getInstance().abortTask(p0.getString("seqNO"));
          }catch(java.lang.Exception e4){
             FrogLog.e("BaseCommandHandler", e4);
          }
       }
    }
}
