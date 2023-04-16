package cra.r;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.util.Random;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import k2b.u1;
import cra.w;
import q87.c;

public class r	// class@00238b
{
    public static boolean a;

    static {
       int i = 1;
       if (new Random().nextFloat() - ((float)a.t().a("growth_watch_video_log_ratio", i) / 100.00f) < 0) {
       }else {
          i = false;
       }
       r.a = i;
    }
    public void r(){
       super();
    }
    public static void a(String p0,String p1){
       r or = r.class;
       Object[] obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, or, "1")) {
          return;
       }
       Object obj1 = PatchProxy.apply(obj, obj, or, "2");
       boolean b = true;
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else if(a.a().c()){
          b = a.t().d("growth_watch_video_log_switch", b);
       }
       if (b) {
          if (r.a) {
             u1.R(p0, p1, 9);
          }
          obj = new Object[0];
          w.C().t(p0, p1, obj);
       }
       return;
    }
}
