package ehd.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yfd.b;
import q87.c;
import k2b.u1;

public final class a	// class@000d1a
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "3")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "throwable");
       Object[] objArray = new Object[0];
       b.C().u(p0, p1, objArray);
       return;
    }
    public static final void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "content");
       Object[] objArray = new Object[0];
       b.C().w(p0, p1, objArray);
       return;
    }
    public static final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "4")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       a.b(p0, p1);
       u1.Y(p0, p1, 14);
       return;
    }
}
