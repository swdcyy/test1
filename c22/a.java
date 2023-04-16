package c22.a;
import java.lang.Object;
import android.app.Activity;
import androidx.fragment.app.c;
import t02.r1;
import kq3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import p91.m;
import t02.a0;
import va1.o0;

public class a	// class@0004ac
{

    public void a(){
       super();
    }
    public static a a(Activity p0,c p1,r1 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == null) {
          return a.c(p0, p1, null);
       }
       return a.c(p0, p1, p2.v.t5());
    }
    public static a b(Activity p0,c p1,a0 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == null) {
          return a.c(p0, p1, null);
       }
       return a.c(p0, p1, p2.Z2.t5());
    }
    public static a c(Activity p0,c p1,e p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.a(p0, p1, p2);
    }
    public static a d(Activity p0,c p1,a0 p2,r1 p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = (p2 != null)? a.b(p0, p1, p2): a.a(p0, p1, p3);
       return uoa;
    }
}
