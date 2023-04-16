package vk7.g0;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import vk7.h0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Integer;
import m1.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class g0	// class@0026c8
{

    public void g0(){
       super();
    }
    public static int a(Context p0,String p1){
       boolean b;
       h0 oh0 = h0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g0.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (!h0.b || (("android.permission.ACCESS_FINE_LOCATION").equals(p1) || (!("android.permission.ACCESS_COARSE_LOCATION").equals(p1) && !("android.permission.READ_PHONE_STATE").equals(p1)))) {
          return b.b(p0, p1);
       }
       obj = PatchProxy.applyOneRefs(p1, null, oh0, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          Integer integer = h0.a.get(p1);
          b = (integer != null && !integer.intValue())? true: false;
       }
       if (b) {
          return 0;
       }else {
          int i = b.b(p0, p1);
          if (!i) {
             if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(i), null, oh0, "1")) {
                h0.a.put(p1, Integer.valueOf(i));
             }
             Log.g("PermissionChecker", p1+"=true");
          }
          return i;
       }
    }
}
