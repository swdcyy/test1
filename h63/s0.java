package h63.s0;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import com.yxcorp.utility.n;
import java.lang.Math;

public class s0	// class@002c9a
{

    public void s0(){
       super();
    }
    public static int a(Activity p0,int p1){
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, os0, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!a1.i(p0) || p1 <= 0) {
          return 0;
       }else {
          return Math.max((int)((float)Math.min(n.k(p0), n.j(p0)) * ((float)p1 / 0x43cf0000)), a1.e(10.00f));
       }
    }
}
