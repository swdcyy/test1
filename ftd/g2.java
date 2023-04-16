package ftd.g2;
import ltd.e0;
import java.lang.String;
import ftd.f1;
import java.lang.Object;
import ftd.t1;
import ftd.u1;

public final class g2	// class@001643
{
    public static final e0 a;
    public static final e0 b;
    public static final e0 c;
    public static final e0 d;
    public static final e0 e;
    public static final f1 f;
    public static final f1 g;

    static {
       g2.a = new e0("COMPLETING_ALREADY");
       g2.b = new e0("COMPLETING_WAITING_CHILDREN");
       g2.c = new e0("COMPLETING_RETRY");
       g2.d = new e0("TOO_LATE_TO_CANCEL");
       g2.e = new e0("SEALED");
       g2.f = new f1(false);
       g2.g = new f1(true);
    }
    public static void a(){
    }
    public static void b(){
    }
    public static void c(){
    }
    public static void d(){
    }
    public static void e(){
    }
    public static void f(){
    }
    public static void g(){
    }
    public static final Object h(Object p0){
       if (p0 instanceof t1) {
          p0 = new u1(p0);
       }
       return p0;
    }
    public static final Object i(Object p0){
       u1 ou1 = (!p0 instanceof u1)? null: p0;
       if (ou1) {
          ou1 = ou1.a;
          if (ou1 != null) {
             p0 = ou1;
          }
       }
       return p0;
    }
}
