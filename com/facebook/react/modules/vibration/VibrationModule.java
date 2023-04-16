package com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContext;
import android.os.Vibrator;
import java.lang.Double;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Integer;

public class VibrationModule extends ReactContextBaseJavaModule	// class@0012fb
{

    public void VibrationModule(ReactApplicationContext p0){
       super(p0);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, VibrationModule.class, "3")) {
          return;
       }
       Vibrator systemServic = this.getReactApplicationContext().getSystemService("vibrator");
       if (systemServic != null) {
          systemServic.cancel();
       }
       return;
    }
    public String getName(){
       return "Vibration";
    }
    public void vibrate(double p0){
       VibrationModule vibrationMod = VibrationModule.class;
       if (PatchProxy.isSupport(vibrationMod) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, vibrationMod, "1")) {
          return;
       }
       int i = (int)p0;
       Vibrator systemServic = this.getReactApplicationContext().getSystemService("vibrator");
       if (systemServic != null) {
          systemServic.vibrate((long)i);
       }
       return;
    }
    public void vibrateByPattern(ReadableArray p0,int p1){
       VibrationModule vibrationMod = VibrationModule.class;
       if (PatchProxy.isSupport(vibrationMod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, vibrationMod, "2")) {
          return;
       }
       Vibrator systemServic = this.getReactApplicationContext().getSystemService("vibrator");
       if (systemServic != null) {
          long[] olongArray = new long[p0.size()];
          for (int i = 0; i < p0.size(); i = i + 1) {
             olongArray[i] = (long)p0.getInt(i);
          }
          systemServic.vibrate(olongArray, p1);
       }
       return;
    }
}
