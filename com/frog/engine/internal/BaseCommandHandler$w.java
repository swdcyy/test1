package com.frog.engine.internal.BaseCommandHandler$w;
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

public class BaseCommandHandler$w extends FrogAsyncRequestListener	// class@00152a
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$w(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$w.class, "1")) {
          return;
       }
       SensorManager systemServic = this.a.mContext.getSystemService("sensor");
       if (systemServic == null) {
          this.a.callFuncFail(-1, "sensor unsupport", p1);
       }else {
          systemServic.unregisterListener(this.a.mCompassSensorEventListener);
          this.a.callFuncSuccess(p1);
       }
       return;
    }
}
