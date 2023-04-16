package d61.g0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.activitycontext.ActivityContext;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;

public class g0	// class@001f1c
{

    public void g0(){
       super();
    }
    public static void a(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, og0, "3")) {
          return;
       }
       if (ActivityContext.g().h()) {
          i.f(R.style.arg_RES_7f110668, a1.p(p0), true);
       }
       return;
    }
    public static void b(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, og0, "1")) {
          return;
       }
       g0.c(a1.p(p0));
       return;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g0.class, "2")) {
          return;
       }
       if (ActivityContext.g().h()) {
          i.f(R.style.arg_RES_7f110669, p0, true);
       }
       return;
    }
    public static void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g0.class, "4")) {
          return;
       }
       if (SystemUtil.I() && ActivityContext.g().h()) {
          g0.c("[仅debug包可见]"+p0);
       }
       return;
    }
    public static void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g0.class, "5")) {
          return;
       }
       if (SystemUtil.K() && ActivityContext.g().h()) {
          g0.c("[仅debug|huidu包可见]"+p0);
       }
       return;
    }
}
