package ie0.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import ie0.b;
import java.lang.Integer;
import k2b.u1;
import java.lang.Boolean;

public final class a	// class@00289f
{

    public void a(){
       super();
    }
    public static void a(String p0,String p1,String p2,long p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), null, a.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("reason", p2);
       oi3.d("resourceUrl", p0);
       oi3.d("result", p1);
       oi3.c("cost", Long.valueOf(p3));
       oi3.c("successSample", Integer.valueOf(b.a(true)));
       oi3.c("errorSample", Integer.valueOf(b.a(false)));
       u1.Y("resource_download", oi3.toString(), 9);
       return;
    }
    public static void b(String p0,String p1,boolean p2,long p3,String p4,String p5,String p6,String p7,boolean p8){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       object oobject3 = p5;
       object oobject4 = p6;
       object oobject5 = p7;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = oobject2;
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = oobject5;
          objArray[8] = Boolean.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       oi3.d("reason", p0);
       oi3.d("activityId", p1);
       oi3.a("isDemote", Boolean.valueOf(p2));
       oi3.c("cost", Long.valueOf(p3));
       oi3.d("resourceOrigin", oobject2);
       oi3.d("resourceUrl", oobject3);
       oi3.d("resourceKey", oobject4);
       oi3.d("result", oobject5);
       oi3.a("isTk", Boolean.valueOf(p8));
       oi3.c("successSample", Integer.valueOf(b.a(1)));
       oi3.c("errorSample", Integer.valueOf(b.a(0)));
       u1.Y("resource_fetch", oi3.toString(), 9);
       return;
    }
}
