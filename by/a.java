package by.a;
import by.a$b;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import by.a$a;
import by.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

public final class a	// class@0002ce
{
    public final float[] a;
    public float[] b;
    public float c;
    public int d;
    public int e;
    public long f;
    public SensorEventListener g;
    public long h;
    public SensorManager i;
    public g j;
    public int k;
    public final Context l;
    public final int m;
    public static final a$b n;

    static {
       a.n = new a$b(null);
    }
    public void a(Context p0,int p1,int p2){
       a.p(p0, "mContext");
       super();
       this.l = p0;
       this.m = p2;
       int i = 3;
       float[] uofloatArray = new float[i];
       this.a = uofloatArray;
       uofloatArray = new float[i];
       this.b = uofloatArray;
       this.e = i;
       i = (p1 > 0)? p1: 80;
       this.d = i;
       Object[] objArray = new Object[0];
       j0.f("AdShakeDetector", " need "+p1+" mapTo "+this.d+' ', objArray);
       this.g = new a$a(this);
       return;
    }
    public final float a(){
       return this.c;
    }
    public final void b(g p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       a.p(p0, "shakeListener");
       this.j = p0;
       this.c = 0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          Sensor systemServic = this.l.getSystemService("sensor");
          if (systemServic instanceof SensorManager) {
             objArray = systemServic;
          }
          this.i = objArray;
          if (objArray != null) {
             systemServic = objArray.getDefaultSensor(1);
             if (systemServic != null) {
                objArray.registerListener(this.g, systemServic, 3);
             }
          }
       }
    label_0040 :
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ti = this.i;
       if (ti != null) {
          ti.unregisterListener(this.g);
       }
       this.j = null;
       return;
    }
}
