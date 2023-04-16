package com.yxcorp.gifshow.powermode.PowerModeHelper;
import java.lang.Object;
import com.yxcorp.gifshow.powermode.PowerModeHelper$KSDeviceThermalState;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import android.os.PowerManager;
import com.yxcorp.gifshow.powermode.PowerModeHelper$a;
import android.os.PowerManager$OnThermalStatusChangedListener;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class PowerModeHelper	// class@0012d7
{
    public PowerModeHelper$KSDeviceThermalState a;
    public static PowerModeHelper b;

    public void PowerModeHelper(){
       super();
       this.a = PowerModeHelper$KSDeviceThermalState.NOMINAL;
       if (a.b() != null) {
          this.a(a.b());
       }
       return;
    }
    public static PowerModeHelper b(){
       PowerModeHelper powerModeHel = PowerModeHelper.class;
       Object obj = PatchProxy.apply(null, null, powerModeHel, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PowerModeHelper.b == null) {
          _monitor_enter(powerModeHel);
          if (PowerModeHelper.b == null) {
             PowerModeHelper.b = new PowerModeHelper();
          }
          _monitor_exit(powerModeHel);
       }
       return PowerModeHelper.b;
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PowerModeHelper.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 29) {
          p0.getSystemService("power").addThermalStatusListener(new PowerModeHelper$a(this));
       }
       return;
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, PowerModeHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.a.mStateId);
    }
}
