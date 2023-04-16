package bh9.u;
import com.yxcorp.gifshow.camera.record.base.b$b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh9.t;
import java.lang.Iterable;
import ok.o;
import qk.y;

public class u implements b$b	// class@0004aa
{
    public final boolean b;
    public static final u c;

    static {
       u.c = new u(true);
    }
    public void u(boolean p0){
       super();
       this.b = p0;
    }
    public Object d(List p0){
       u ou = PatchProxy.applyOneRefs(p0, this, u.class, "1");
       if (ou != PatchProxyResult.class) {
       }else {
          ou = new u(y.b(p0, t.b));
       }
       return ou;
    }
}
