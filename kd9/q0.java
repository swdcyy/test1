package kd9.q0;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.n;
import java.lang.Object;
import lm6.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class q0 implements g	// class@002c65
{
    public final n b;

    public void q0(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "2")) {
       }else {
          tb.k2();
       }
       return;
    }
}
