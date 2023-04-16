package nc9.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.s6;
import fe9.a;
import hc9.f;
import hc9.e;
import ug9.c;
import hd9.n;
import wd9.a;
import bd9.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import q2b.h$b;
import k2b.u1;
import android.content.Intent;
import java.lang.Number;
import ekd.j0;

public class b	// class@0032dd
{

    public void b(){
       super();
    }
    public static boolean a(b p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!s6.H()) {
          return b;
       }
       a a = p0.d(a.c).a;
       if (a != null && a.a().h() != null) {
          b = true;
       }
       return b;
    }
    public static boolean b(b p0){
       c obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (s6.H()) {
          obj = p0.d(c.c);
          if (obj.a != null && obj.b == null) {
             return true;
          }else {
             n j = n.j;
             if (p0.d(j).a != null && p0.d(j).i == null) {
                return true;
             }else {
                a uoa = p0.d(a.i);
                if (uoa.d != null && uoa.b != null) {
                   return TextUtils.x(p0.d(e.c).b);
                }
             }
          }
       }
       return false;
    }
    public static void c(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uob, "5")) {
          return;
       }
       int i = 5;
       if (p0 != i && p0 != 4) {
          return;
       }
       p0 = (p0 == i)? 1: 0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       String str = (p0)? "success": "fail";
       oi3.d("loading_status", str);
       oi3.d("resource_type", p1);
       uElementPack.params = oi3.e();
       p0 = (p0)? 7: 8;
       h$b uob1 = h$b.e(p0, "RESOURCE_LOADING");
       uob1.k(uElementPack);
       u1.r0(uob1);
       return;
    }
    public static int d(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return j0.b(p0, "magic_download_bar_mode", 0);
    }
}
