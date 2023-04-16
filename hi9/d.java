package hi9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.camerasdk.models.Page;
import com.kwai.camerasdk.config.CameraConfig;
import b65.u;
import com.kwai.framework.abtest.f;
import xf6.g;
import xf6.l;
import com.kwai.camerasdk.config.ExtendConfig;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Math;
import o56.c;
import android.graphics.Point;
import lnc.i5;

public final class d	// class@002690
{

    public void d(){
       super();
    }
    public static boolean a(){
       CameraConfig obj = PatchProxy.apply(null, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = u.b(Page.kRecordPage);
       boolean b = true;
       if (!f.a("dualCameraMode")) {
          int i = (g.o1() && l.c("whats_up_use_multi_camera", false))? 1: 0;
          if (!i) {
          label_0040 :
             b = false;
          label_0041 :
             return b;
          }
       }
       if (obj != null && obj.mExtendConfig.mSupportMultiCamera > null) {
          goto label_0041 ;
       }else {
          goto label_0040 ;
       }
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (d.e() - 0x3f078788 >= 0) {
          i = (int)Math.max((((float)n.y(a.b()) - (((float)n.u(a.b()) * 0x3f400000) * 0x3f400000)) / 2.00f), (float)i);
       }
       return i;
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((double)((float)(n.y(a.b()) - (d.b() * 2)) / 0x3f400000) / 0x402f000000000000);
    }
    public static int d(){
       Object obj = PatchProxy.apply(null, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (n.y(a.b()) - (d.b() * 2));
    }
    public static float e(){
       Point obj = PatchProxy.apply(null, null, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = n.s(a.a().a());
       return ((float)obj.x / (float)(obj.y - i5.a(a.b())));
    }
    public static int f(){
       Object obj = PatchProxy.apply(null, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(((float)d.g() / 0x3f400000) / 7.00f);
    }
    public static int g(){
       Object obj = PatchProxy.apply(null, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((double)d.d() * 0x3fd3333333333333);
    }
    public static int h(){
       Object obj = PatchProxy.apply(null, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (d.f() - 2);
    }
}
