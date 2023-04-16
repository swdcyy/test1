package com.frog.engine.internal.BaseCommandHandler$s;
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
import java.util.Objects;
import android.app.Application;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

public class BaseCommandHandler$s extends FrogAsyncRequestListener	// class@001526
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$s(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$s.class, "1")) {
          return;
       }
       if (this.a.checkParamInvalid(p0, p1)) {
          return;
       }
       BaseCommandHandler$s ta = this.a;
       if (ta.mContext == null) {
          ta.callFuncFail(-1, "content is null", p1);
          return;
       }else {
          String str = p0.getString("interval");
          if (TextUtils.isEmpty(str)) {
             str = "normal";
          }
          int i = 3;
          Objects.requireNonNull(str);
          int i1 = 1;
          if (!str.equals("ui")) {
             if (str.equals("game")) {
                i = 1;
             }
          }else {
             i = 2;
          }
          SensorManager systemServic = this.a.mContext.getSystemService("sensor");
          if (systemServic != null && (systemServic.getDefaultSensor(i1) == null || !systemServic.registerListener(this.a.mSensorEventListener, systemServic.getDefaultSensor(i1), i))) {
             this.a.callFuncFail(-1, "sensor unsupport", p1);
          }else {
             this.a.callFuncSuccess(p1);
          }
          return;
       }
    }
}
