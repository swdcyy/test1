package dc5.c;
import c97.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.KLog$KLogLevel;
import java.lang.Throwable;
import com.kwai.chat.kwailink.log.KLog;
import dc5.c$b;

public final class c	// class@0014b1
{
    public static final boolean a;

    static {
       c.a = d.a().i();
    }
    public void c(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "7")) {
          return;
       }
       c.i(KLog$KLogLevel.kDebug, p0, p1);
       return;
    }
    public static void b(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "9")) {
          return;
       }
       c.j(KLog$KLogLevel.kDebug, p0, p1, p2);
       return;
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "16")) {
          return;
       }
       c.i(KLog$KLogLevel.kError, p0, p1);
       return;
    }
    public static void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "18")) {
          return;
       }
       c.j(KLog$KLogLevel.kError, p0, p1, p2);
       return;
    }
    public static void e(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "17")) {
          return;
       }
       c.d(p0, "", p1);
       return;
    }
    public static KLog f(){
       return c$b.a;
    }
    public static void g(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "10")) {
          return;
       }
       c.i(KLog$KLogLevel.kInfo, p0, p1);
       return;
    }
    public static void h(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "11")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, "", p1, null, c.class, "12")) {
          c.j(KLog$KLogLevel.kInfo, p0, "", p1);
       }
       return;
    }
    public static void i(KLog$KLogLevel p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "2")) {
          return;
       }
       c.f().a("Message", p0, p1, p2);
       return;
    }
    public static void j(KLog$KLogLevel p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c.class, "3")) {
          return;
       }
       c.f().b("Message", p0, p1, p2, p3);
       return;
    }
    public static void k(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "13")) {
          return;
       }
       c.i(KLog$KLogLevel.kWarn, p0, p1);
       return;
    }
    public static void l(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "15")) {
          return;
       }
       c.j(KLog$KLogLevel.kWarn, p0, p1, p2);
       return;
    }
}
