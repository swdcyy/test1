package com.frog.engine.internal.BaseCommandHandler$c;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.frog.engine.storage.FrogStorageManager;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;

public class BaseCommandHandler$c extends FrogSyncRequestListener	// class@001510
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$c(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       String str = "key";
       FrogJSObject obj = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FrogJSObject();
       if (p0 != null) {
          try{
             String str1 = p0.getString(str);
             if (!TextUtils.isEmpty(str1)) {
                BaseCommandHandler mFrogStorage = this.a.mFrogStorageManager;
                JSONObject jSONObject = (mFrogStorage == null)? null: mFrogStorage.get(str1);
                if (jSONObject != null) {
                   FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), obj);
                   return obj;
                }else {
                   jSONObject = new JSONObject();
                   jSONObject.put(str, str1);
                   jSONObject.put("value", "");
                   jSONObject.put("type", "string");
                   FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), obj);
                   return obj;
                }
             }
          }catch(java.lang.Exception e7){
             FrogLog.e("BaseCommandHandler", e7.getMessage());
          }
       }
    }
}
