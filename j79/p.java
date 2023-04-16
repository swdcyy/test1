package j79.p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ic7.b;

public final class p implements g	// class@002789
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          b.a(p0);
       }
       return;
    }
}
