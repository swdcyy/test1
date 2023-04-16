package c.t.m.g.dr;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;

public class dr	// class@000c52
{
    public double a;
    public double b;
    public double c;
    public float d;
    public String e;
    public String f;

    public void dr(){
       super();
    }
    public void dr(JSONObject p0){
       super();
       this.a = p0.optDouble("latitude", 0);
       this.b = p0.optDouble("longitude", 0);
       this.c = p0.optDouble("altitude", 0);
       this.d = (float)p0.optDouble("accuracy", 0);
       this.e = p0.optString("name", null);
       this.f = p0.optString("addr", null);
    }
    public static dr a(dr p0){
       dr uodr = new dr();
       if (p0 != null) {
          uodr.a = p0.a;
          uodr.b = p0.b;
          uodr.c = p0.c;
          uodr.d = p0.d;
          uodr.e = p0.e;
          uodr.f = p0.f;
       }
       return uodr;
    }
}
