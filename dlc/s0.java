package dlc.s0;
import erd.g;
import dlc.t0;
import java.lang.Object;
import ub6.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.a;
import qvb.n0;

public final class s0 implements g	// class@00226f
{
    public final t0 b;

    public void s0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, t0.class, "3")) {
       }else if(tb.p.isEmpty()){
          tb.p.a();
       }
       return;
    }
}
