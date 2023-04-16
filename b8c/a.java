package b8c.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.model.mix.Location;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Number;
import java.lang.Long;

public class a	// class@0003d0
{

    public void a(){
       super();
    }
    public static String a(String p0,String p1,String p2,int p3,int p4,Location p5){
       i3 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("collection_type", p0);
       obj.d("collection_title", p1);
       obj.d("collection_subtitle", p2);
       obj.c("collection_playing_num", Integer.valueOf((p3 + 1)));
       obj.c("collection_total_num", Integer.valueOf(p4));
       if (p5 != null) {
          obj.c("poi_id", Long.valueOf(p5.mId));
          obj.c("poi_distance", Long.valueOf(p5.mDistance));
       }
       return obj.e();
    }
}
