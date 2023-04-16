package ah1.c;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class c extends Model	// class@00009b
{

    public void c(String p0,Object p1,boolean p2,boolean p3){
       a.p(p0, "name");
       super(p0, p1, p2, p3);
    }
    public void c(String p0,Object p1,boolean p2,boolean p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final void e(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "source");
       this.d(p0, p1);
       return;
    }
}
