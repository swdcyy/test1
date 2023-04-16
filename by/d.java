package by.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import org.json.JSONObject;
import ol9.b;

public class d	// class@0002d1
{
    public double a;
    public double b;

    public void d(){
       super();
    }
    public static d a(){
       d obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d();
       LocationCityInfo locationCity = u.d();
       if (locationCity != null) {
          obj.a = locationCity.mLatitude;
          obj.b = locationCity.mLongitude;
       }
       return obj;
    }
    public JSONObject b(){
       JSONObject obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       b.b(obj, "latitude", this.a);
       b.b(obj, "longitude", this.b);
       return obj;
    }
}
