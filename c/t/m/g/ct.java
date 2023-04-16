package c.t.m.g.ct;
import android.hardware.SensorEventListener;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.hardware.SensorManager;
import android.os.Handler;
import android.hardware.Sensor;
import android.hardware.SensorEvent;

public class ct implements SensorEventListener	// class@000c22
{
    public final SensorManager a;
    public final boolean b;
    public boolean c;
    public double d;
    public static ct e;

    public void ct(Context p0){
       super();
       SensorManager systemServic = p0.getSystemService("sensor");
       this.a = systemServic;
       boolean b = (systemServic != null)? true: false;
       this.b = b;
       return;
    }
    public static ct a(Context p0){
       if (ct.e == null) {
          ct.e = new ct(p0);
       }
       return ct.e;
    }
    public void a(){
       if (this.b == null) {
          return;
       }
       if (this.c != null) {
          this.c = false;
          _monitor_enter(this);
          this.d = Double.NaN;
          _monitor_exit(this);
          this.a.unregisterListener(this);
       }
       return;
    }
    public void a(Handler p0){
       if (this.b == null) {
          return;
       }
       if (this.c == null) {
          Sensor defaultSenso = this.a.getDefaultSensor(11);
          if (defaultSenso != null && p0 != null) {
             this.a.registerListener(this, defaultSenso, 3, p0);
             this.c = true;
          }
       }
       return;
    }
    public double b(){
       if (this.c == null) {
          return Double.NaN;
       }
       _monitor_enter(this);
       _monitor_exit(this);
       return this.d;
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       if (p0.sensor.getType() == 11) {
          float[] uofloatArray = new float[16];
          float[] uofloatArray1 = new float[3];
          SensorManager.getRotationMatrixFromVector(uofloatArray, p0.values);
          SensorManager.getOrientation(uofloatArray, uofloatArray1);
          _monitor_enter(this);
          this.d = ((double)uofloatArray1[0] * 180.00f) / 0x400921fb4d12d84a;
          _monitor_exit(this);
       }
       return;
    }
}
