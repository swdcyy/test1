package com.frog.engine.internal.BaseCommandHandler$y;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;

public class BaseCommandHandler$y extends FrogAsyncRequestListener	// class@00152c
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$y(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$y.class, "1")) {
          return;
       }
       SensorManager systemServic = this.a.mContext.getSystemService("sensor");
       if (systemServic == null) {
          this.a.callFuncFail(-1, "sensor unsupport", p1);
       }else {
          systemServic.unregisterListener(this.a.mGyroscopeSensorEventListener);
          this.a.callFuncSuccess(p1);
       }
       return;
    }
}
