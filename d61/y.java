package d61.y;
import java.lang.Object;
import android.app.Activity;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.l1;
import zs5.a;
import android.content.res.Resources;
import android.content.res.Configuration;

public final class y	// class@001f45
{

    public void y(){
       super();
    }
    public static void a(Activity p0,Runnable p1,Object p2,long p3){
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), null, y.class, "5")) {
          return;
       }
       if (y.b(p0)) {
          return;
       }
       if (y.d(p0)) {
          p0.setRequestedOrientation(1);
          k1.s(p1, p2, p3);
       }else {
          p1.run();
       }
       return;
    }
    public static boolean b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isFinishing() || p0.isDestroyed()))? true: false;
       return b;
    }
    public static boolean c(Activity p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return l1.a();
       }
       int i = (p0 instanceof a)? p0.u(): p0.getRequestedOrientation();
       if (i == -1) {
          return y.e(p0);
       }else if(i && (i == 8 || i == 6)){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public static boolean d(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return l1.a();
       }
       boolean i = (p0 instanceof a)? p0.u(): p0.getRequestedOrientation();
       i = (i && (i == 8 || i == 6))? true: false;
       return i;
    }
    public static boolean e(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getResources().getConfiguration().orientation == 2)? true: false;
       return b;
    }
    public static void f(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, y.class, "4")) {
          return;
       }
       if (p0 != null && y.d(p0)) {
          p0.setRequestedOrientation(1);
       }
       return;
    }
}
