package nkd.a$a;
import nkd.a;
import java.lang.Object;
import java.lang.Math;
import org.json.JSONObject;
import java.lang.String;

public class a$a	// class@001e3c
{
    public float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final a e;

    public void a$a(a p0){
       this.e = p0;
       super();
       this.a = new float[3]{0,0,0};
       this.b = new float[3]{0,0,0};
       this.c = new float[3]{0,0,0};
       this.d = new float[3]{0,0,0};
    }
    public final boolean a(float[] p0,float[] p1){
       int i = 0;
       if ((((((Math.abs(p1[i]) + Math.abs(p1[1])) + Math.abs(p1[2])) - Math.abs(p0[i])) - Math.abs(p0[1])) - Math.abs(p0[2])) > 0) {
          i = true;
       }
       return i;
    }
    public final double b(double p0){
       return ((double)Math.round((p0 * 1000000.00f)) / 1000000.00f);
    }
    public JSONObject c(){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("Acceleration.x", this.b((double)this.d[0]));
          jSONObject.put("Acceleration.y", this.b((double)this.d[1]));
          jSONObject.put("Acceleration.z", this.b((double)this.d[2]));
          jSONObject.put("Attitude.x", this.b((double)this.a[0]));
          jSONObject.put("Attitude.y", this.b((double)this.a[1]));
          jSONObject.put("Attitude.z", this.b((double)this.a[2]));
          jSONObject.put("Gravity.x", this.b((double)this.c[0]));
          jSONObject.put("Gravity.y", this.b((double)this.c[1]));
          jSONObject.put("Gravity.z", this.b((double)this.c[2]));
          jSONObject.put("Rate.x", this.b((double)this.b[0]));
          jSONObject.put("Rate.y", this.b((double)this.b[1]));
          jSONObject.put("Rate.z", this.b((double)this.b[2]));
          return e0;
       }catch(org.json.JSONException e0){
       }
    }
}
