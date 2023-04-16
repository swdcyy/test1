package hi0.d;
import erd.c;
import msd.l;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class d implements c	// class@0026cd
{
    public final l a;
    public final CoreMemoryInfo b;

    public void d(l p0,CoreMemoryInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object a(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
       }else {
          a.p(p0, "t1");
          a.p(p1, "t2");
          this.a.invoke(this.b);
       }
       return l1.a;
    }
}
