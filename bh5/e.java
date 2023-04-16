package bh5.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import rkd.b;
import java.lang.Math;
import android.os.Build$VERSION;
import o56.a;
import android.content.Context;

public class e	// class@0004a7
{

    public void e(){
       super();
    }
    public static int a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = n.j(p0);
       if (!b.g()) {
          return i;
       }
       int i1 = n.k(p0);
       if (b.e()) {
          return Math.min(i1, i);
       }
       return Math.max(i1, i);
    }
    public static int b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (Build$VERSION.SDK_INT >= 24 && (p0 != null && p0.isInMultiWindowMode())) {
          return (int)((double)n.j(p0) * 0x3fe6666666666666);
       }
       int i = (int)((double)n.u(a.B) * 0x3fe6666666666666);
       double d = 0;
       if (p0 != null) {
          d = (int)((double)e.a(p0) * 0x3fe0000000000000);
       }
       if (d > i) {
          i = d;
       }
       return i;
    }
    public static int c(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((double)n.j(p0) * 0x3fe8000000000000);
    }
}
