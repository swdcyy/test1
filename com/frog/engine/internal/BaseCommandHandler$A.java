package com.frog.engine.internal.BaseCommandHandler$a;
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
import com.frog.engine.storage.FrogStorageManager;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;

public class BaseCommandHandler$a extends FrogSyncRequestListener	// class@00150d
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$a(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public FrogJSObject onResponse(FrogJSObject p0){
       BaseCommandHandler obj = PatchProxy.applyOneRefs(p0, this, BaseCommandHandler$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             String str = p0.getString("key");
             if (!TextUtils.isEmpty(str)) {
                obj = this.a.mFrogStorageManager;
                if (obj != null) {
                   obj.remove(str);
                }
             }
          }catch(java.lang.Exception e4){
             FrogLog.e("BaseCommandHandler", e4.getMessage());
          }
       }
    }
}
