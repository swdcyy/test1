package qj7.d;
import qj7.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qj7.c;
import java.lang.Throwable;

public final class d	// class@002280
{
    public static c a;

    static {
       d.a = new b();
    }
    public void d(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "1")) {
          return;
       }
       c a = d.a;
       if (a != null) {
          a.d(p0);
       }
       return;
    }
    public static void b(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "2")) {
          return;
       }
       c a = d.a;
       if (a != null) {
          a.a(p0, p1);
       }
       return;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "3")) {
          return;
       }
       c a = d.a;
       if (a != null) {
          a.e(p0);
       }
       return;
    }
}
