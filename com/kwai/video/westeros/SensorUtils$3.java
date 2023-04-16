package com.kwai.video.westeros.SensorUtils$3;
import java.lang.Runnable;
import com.kwai.video.westeros.SensorUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.hardware.SensorManager;
import java.lang.StringBuilder;
import com.kwai.camerasdk.log.Log;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import android.os.Handler;
import java.lang.Exception;

public class SensorUtils$3 implements Runnable	// class@000e63
{
    public final SensorUtils this$0;
    public final float val$interval;

    public void SensorUtils$3(SensorUtils p0,float p1){
       this.this$0 = p0;
       this.val$interval = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SensorUtils$3.class, "1")) {
          return;
       }
       this.this$0.unregisterListener();
       SensorManager sensorManage = this.this$0.getSensorManager();
       if (sensorManage == null) {
          return;
       }
       int i = 2;
       SensorUtils$3 tval$interva = this.val$interval;
       if ((double)tval$interva - 0x3f86872b020c49ba <= 0) {
          i = null;
          if ((double)tval$interva - 0x3f84af4f0d844d01 < 0 && (double)tval$interva - 0x3f84467381d7dbf5 > 0) {
             i = 0x2710;
          }
          if (SensorUtils.server_rate > 0) {
             Log.i("sensor", "set sensor rate from server:"+SensorUtils.server_rate);
             i = SensorUtils.server_rate;
          }
       }else if((double)tval$interva - 0x3faa1cac083126e9 <= 0){
          i = 1;
       }else if((double)tval$interva - 0x3fc999999999999a <= 0){
          i = 3;
       }
       String str = "updateInterval,rate:"+i+",interval:"+this.val$interval;
       String str1 = "SensorUtils";
       try{
          Log.i(str1, str);
          tval$interva = this.this$0;
          sensorManage.registerListener(tval$interva, tval$interva.accelertion_sensor_, i, tval$interva.handler);
          tval$interva = this.this$0;
          sensorManage.registerListener(tval$interva, tval$interva.gyro_sensor_, i, tval$interva.handler);
          tval$interva = this.this$0;
          sensorManage.registerListener(tval$interva, tval$interva.rotation_sensor_, i, tval$interva.handler);
          tval$interva = this.this$0;
          sensorManage.registerListener(tval$interva, tval$interva.gravity_sensor_, i, tval$interva.handler);
          SensorUtils$3 tthis$0 = this.this$0;
          sensorManage.registerListener(tthis$0, tthis$0.magnetic_sensor_, 1, tthis$0.handler);
       }catch(java.lang.Exception e0){
          Log.e("WSensorUtils", "registerListener : "+e0.toString());
       }
       return;
    }
}
