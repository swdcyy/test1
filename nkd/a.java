package nkd.a;
import android.hardware.SensorEventListener;
import java.lang.Object;
import java.util.ArrayList;
import nkd.a$a;
import java.lang.String;
import org.json.JSONArray;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Objects;

public class a implements SensorEventListener	// class@001e3d
{
    public SensorManager b;
    public final List c;
    public a$a d;

    public void a(){
       super();
       this.c = new ArrayList();
       this.d = new a$a(this);
    }
    public String a(){
       JSONArray jSONArray = new JSONArray();
       a tc = this.c;
       _monitor_enter(tc);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          jSONArray.put(iterator.next().c());
       }
       _monitor_exit(tc);
       return jSONArray.toString();
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       a td;
       float[] uofloatArray;
       int type = p0.sensor.getType();
       int i = 0;
       int i1 = 3;
       if (type == 4) {
          td = this.d;
          p0 = p0.values;
          if (td.a(td.b, p0)) {
             uofloatArray = new float[i1];
             uofloatArray[i] = p0[i];
             uofloatArray[1] = p0[1];
             uofloatArray[2] = p0[2];
             td.b = uofloatArray;
          }
       }else if(type == 1){
          td = this.d;
          p0 = p0.values;
          if (td.a(td.d, p0)) {
             uofloatArray = new float[i1];
             uofloatArray[i] = p0[i];
             uofloatArray[1] = p0[1];
             uofloatArray[2] = p0[2];
             td.d = uofloatArray;
          }
       }else if(type == 9){
          td = this.d;
          p0 = p0.values;
          Objects.requireNonNull(td);
          uofloatArray = new float[i1];
          uofloatArray[i] = p0[i];
          uofloatArray[1] = p0[1];
          uofloatArray[2] = p0[2];
          td.c = uofloatArray;
       }else if(type == i1){
          td = this.d;
          p0 = p0.values;
          Objects.requireNonNull(td);
          uofloatArray = new float[i1];
          uofloatArray[i] = p0[i];
          uofloatArray[1] = p0[1];
          uofloatArray[2] = p0[2];
          td.a = uofloatArray;
       }
       return;
    }
}
