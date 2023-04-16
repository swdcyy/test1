package auc.c;
import t36.f$a;
import java.lang.Object;
import qsc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements f$a	// class@0002cf
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0.c();
       }
       return;
    }
}
