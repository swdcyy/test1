package com.frog.engine.internal.BaseCommandHandler$r;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import android.os.Vibrator;
import android.os.Build$VERSION;
import android.os.VibrationEffect;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.internal.FrogLog;

public class BaseCommandHandler$r extends FrogAsyncRequestListener	// class@001525
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$r(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$r.class, "1")) {
          return;
       }
       BaseCommandHandler$r ta = this.a;
       BaseCommandHandler mContext = ta.mContext;
       if (mContext == null) {
          ta.callFuncFail(-1, "content is null", p1);
          return;
       }else {
          Vibrator systemServic = mContext.getSystemService("vibrator");
          if (systemServic == null || !systemServic.hasVibrator()) {
             this.a.callFuncFail(-1, "vibrator is null", p1);
          }else if(Build$VERSION.SDK_INT >= 26){
             systemServic.vibrate(VibrationEffect.createOneShot(400, -1));
          }else {
             systemServic.vibrate(400);
          }
          this.a.callFuncSuccess(p1);
          return;
       }
    }
}
