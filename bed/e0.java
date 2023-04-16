package bed.e0;
import erd.o;
import bed.q0;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import ixc.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import bed.f0;

public final class e0 implements o	// class@000405
{
    public final q0 b;

    public void e0(q0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       MagicEmoji$MagicFace d = q0.d;
       if (p0 != d) {
          ot = PatchProxy.applyOneRefs(p0, tb, q0.class, "5");
          if (ot != PatchProxyResult.class) {
          }else if(!g.y(p0)){
             ot = t.just(p0);
          }else {
             ot = qa.s(c.class, LoadPolicy.SILENT_IMMEDIATE).w(new f0(tb, p0));
          }
       }else {
          ot = t.just(d);
       }
       return ot;
    }
}
