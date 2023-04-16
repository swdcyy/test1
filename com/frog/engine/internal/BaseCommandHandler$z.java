package com.frog.engine.internal.BaseCommandHandler$z;
import android.hardware.SensorEventListener;
import com.frog.engine.internal.BaseCommandHandler;
import java.lang.Object;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCallGameListener;
import com.frog.engine.internal.CommandExpandFuncListener;

public class BaseCommandHandler$z implements SensorEventListener	// class@00152d
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$z(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$z.class, "1")) {
          return;
       }
       p0 = p0.values;
       int i = p0[0];
       int i1 = 1;
       int i2 = p0[i1];
       int i3 = p0[2];
       if (this.a.mSendListener != null) {
          JSONObject jSONObject = new JSONObject();
          try{
             double d = (double)i;
             jSONObject.put("x", d);
             jSONObject.put("y", (double)i2);
             jSONObject.put("z", (double)i3);
          }catch(java.lang.Exception e7){
             FrogLog.e("BaseCommandHandler", Log.getStackTraceString(e7));
          }
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i1, "", jSONObject), uFrogJSObjec);
          this.a.mSendListener.sendCommandToNativeGame("ks.onAccelerometerChange", uFrogJSObjec, null);
       }
       return;
    }
}
