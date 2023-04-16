package nfd.k1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import sy5.a;
import com.google.gson.JsonObject;
import ecd.d;

public class k1	// class@001dc4
{

    public void k1(){
       super();
    }
    public static void a(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(k1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, k1.class, "6")) {
          return;
       }
       a uoa = a.k();
       uoa.e("couponId", p0);
       JsonObject jsonObject = uoa.j();
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{"variety",p1,"",jsonObject,Boolean.valueOf(p2)};
          if (PatchProxy.applyVoid(objArray, null, uod, "7")) {
          label_005a :
             return;
          }
       }
       d.e("variety", p1, "", jsonObject, null, null, p2);
       goto label_005a ;
    }
}
