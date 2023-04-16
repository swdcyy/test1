package com.frog.engine.internal.BaseCommandHandler$u;
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
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

public class BaseCommandHandler$u extends FrogAsyncRequestListener	// class@001528
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$u(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$u.class, "1")) {
          return;
       }
       if (this.a.checkParamInvalid(p0, p1)) {
          return;
       }
       BaseCommandHandler$u ta = this.a;
       BaseCommandHandler mContext = ta.mContext;
       if (mContext == null) {
          ta.callFuncFail(-1, "content is null", p1);
          return;
       }else {
          SensorManager systemServic = mContext.getSystemService("sensor");
          if (systemServic != null && (systemServic.getDefaultSensor(2) != null && (systemServic.getDefaultSensor(1) == null || !systemServic.registerListener(this.a.mCompassSensorEventListener, systemServic.getDefaultSensor(3), 3)))) {
             this.a.callFuncFail(-1, "sensor unsupport", p1);
          }else {
             this.a.callFuncSuccess(p1);
          }
          return;
       }
    }
}
