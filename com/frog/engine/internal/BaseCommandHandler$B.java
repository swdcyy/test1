package com.frog.engine.internal.BaseCommandHandler$b;
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
import com.frog.engine.internal.BaseCommandHandler$b$a;
import java.lang.Runnable;
import android.os.AsyncTask;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;

public class BaseCommandHandler$b extends FrogAsyncRequestListener	// class@00150f
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$b(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$b.class, "1")) {
          return;
       }
       if (p0 != null) {
          try{
             String str = p0.getString("key");
             if (!TextUtils.isEmpty(str)) {
                AsyncTask.execute(new BaseCommandHandler$b$a(this, str));
             }
          }catch(java.lang.Exception e4){
             FrogLog.e("BaseCommandHandler", e4.getMessage());
          }
       }
    }
}
