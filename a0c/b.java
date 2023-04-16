package a0c.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.k1;
import java.lang.Math;
import a0c.g;
import q87.c;
import qe6.b;
import e17.i;
import r16.f;
import lnc.x6;
import lnc.y6;
import hn5.n;
import hn5.m;
import android.content.Context;
import java.lang.System;

public class b	// class@000007
{
    public static long a;

    public void b(){
       super();
    }
    public static boolean a(Activity p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Math.abs(k1.t(b.a)) - 1000 < 0) {
          obj = new Object[0];
          g.C().t("CameraButtonUtils", "checkCanEnterCameraActivity: twice opening is too close", obj);
          return 0;
       }else if(!b.b()){
          i.a(R.style.arg_RES_7f11066a, 0x7f10305c);
          return 0;
       }else {
          f uof = y6.r(f.class);
          if (uof != null && (m.a().U3(p0) && uof.n2())) {
             i.a(R.style.arg_RES_7f11066a, 0x7f100a5c);
             return 0;
          }else {
             b.a = System.currentTimeMillis();
             return true;
          }
       }
    }
}
