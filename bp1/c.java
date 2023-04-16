package bp1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.net.URLEncoder;
import java.lang.Exception;
import java.lang.Number;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMagicBoxConfig;
import java.lang.reflect.Type;
import wg3.a;
import va1.n0;
import java.lang.Math;

public class c	// class@0003d9
{

    public void c(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          return URLEncoder.encode(p0, "UTF-8");
       }
    }
    public static int b(){
       LiveConfigStartupResponse$LiveMagicBoxConfig obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.x(LiveConfigStartupResponse$LiveMagicBoxConfig.class);
       float f = 0x3fa66666;
       int i = (int)((double)n0.e() * 0x3fe999999999999a);
       if (obj != null) {
          obj = obj.mContentHeightRatio;
          if (obj > 0) {
             f = obj;
          }
       }
       return Math.min((int)((float)n0.f() * f), i);
    }
    public static int c(){
       LiveConfigStartupResponse$LiveMagicBoxConfig obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.x(LiveConfigStartupResponse$LiveMagicBoxConfig.class);
       float f = 0x3fc00000;
       int i = (int)((double)n0.e() * 0x3fe999999999999a);
       if (obj != null) {
          obj = obj.mAspectRatio;
          if (obj > 0) {
             f = obj;
          }
       }
       return Math.min((int)((float)n0.f() * f), i);
    }
}
