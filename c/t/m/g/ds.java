package c.t.m.g.ds;
import com.tencent.map.geolocation.TencentPoi;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Double;
import java.lang.StringBuilder;

public class ds implements TencentPoi	// class@000c53
{
    public String a;
    public String b;
    public String c;
    public double d;
    public String e;
    public double f;
    public double g;
    public String h;

    public void ds(TencentPoi p0){
       super();
       this.a = p0.getName();
       this.b = p0.getAddress();
       this.c = p0.getCatalog();
       this.d = p0.getDistance();
       this.e = p0.getUid();
       this.f = p0.getLatitude();
       this.g = p0.getLongitude();
       this.h = p0.getDirection();
    }
    public void ds(JSONObject p0){
       super();
       this.a(p0);
    }
    public final void a(JSONObject p0){
       this.a = p0.optString("name");
       this.b = p0.optString("addr");
       this.c = p0.optString("catalog");
       this.d = p0.optDouble("dist");
       this.e = p0.optString("uid");
       this.f = p0.optDouble("latitude");
       this.g = p0.optDouble("longitude");
       this.b(p0);
    }
    public final void b(JSONObject p0){
       this.h = p0.optString("direction", "");
       if (Double.isNaN(this.f)) {
          this.f = p0.optDouble("pointy");
       }
       if (Double.isNaN(this.g)) {
          this.g = p0.optDouble("pointx");
       }
       return;
    }
    public String getAddress(){
       return this.b;
    }
    public String getCatalog(){
       return this.c;
    }
    public String getDirection(){
       return this.h;
    }
    public double getDistance(){
       return this.d;
    }
    public double getLatitude(){
       return this.f;
    }
    public double getLongitude(){
       return this.g;
    }
    public String getName(){
       return this.a;
    }
    public String getUid(){
       return this.e;
    }
    public String toString(){
       return "PoiData{"+"name="+this.a+","+"addr="+this.b+","+"catalog="+this.c+","+"dist="+this.d+","+"latitude="+this.f+","+"longitude="+this.g+","+"direction="+this.h+","+"}";
    }
}
