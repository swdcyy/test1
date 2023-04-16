package com.frog.engine.internal.BaseCommandHandler$d;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.internal.BaseCommandHandler$d$a;
import java.lang.Runnable;
import android.os.AsyncTask;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;

public class BaseCommandHandler$d extends FrogAsyncRequestListener	// class@001512
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$d(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$d.class, "1")) {
          return;
       }
       if (p0 != null) {
          try{
             String str = p0.getString("key");
             if (!TextUtils.isEmpty(str)) {
                AsyncTask.execute(new BaseCommandHandler$d$a(this, str, p1));
                return;
             }
          }catch(java.lang.Exception e4){
             FrogLog.e("BaseCommandHandler", e4.getMessage());
          }
       }
    }
}
