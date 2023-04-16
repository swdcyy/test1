package pp2.a;
import pp2.a$a;
import nsd.u;
import com.yxcorp.utility.SystemUtil;
import java.lang.Object;
import wa1.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;

public class a	// class@003ce1
{
    public final Collection b;
    public static final boolean c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
       a.c = SystemUtil.I();
    }
    public void a(){
       super();
       this.b = new i();
    }
    public final void j0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public final Collection k0(){
       return this.b;
    }
    public final void l0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
}
