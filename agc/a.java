package agc.a;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import agc.c;
import android.net.Uri;
import ekd.w0;
import agc.b;
import android.content.Context;
import xh7.b;
import xh7.a;
import agc.a$a;
import qh7.b;
import qh7.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class a	// class@000119
{

    public void a(){
       super();
    }
    public static void a(Activity p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       a.b(p0, p1, p2, null);
       return;
    }
    public static void b(Activity p0,String p1,Map p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "2")) {
          return;
       }
       if (b.a(p0, w0.f(p1), p2)) {
          if (p3 != null) {
             a.e(p3);
          }
          return;
       }else {
          a.d(p0, p1, p2, p3);
          return;
       }
    }
    public static void c(Activity p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "3")) {
          return;
       }
       a.d(p0, p1, p2, null);
       return;
    }
    public static void d(Activity p0,String p1,Map p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "4")) {
          return;
       }
       b uob = b.j(p0, p1);
       uob.h("EXTRA_CONTEXT_MAP", p2);
       if (p2 != null) {
          String str = "SOURCE_PAGE_FROM_PLC";
          if (p2.containsKey(str)) {
             uob.h("codSourcePage", p2.get(str));
          }
       }
       a.b(uob, new a$a(p1, p3));
       return;
    }
    public static void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "5")) {
          return;
       }
       try{
          p0.onSuccess();
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
}
