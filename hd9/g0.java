package hd9.g0;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import kd9.l0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;

public final class g0 implements g	// class@002610
{
    public final d b;

    public void g0(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "21")) {
       }else if(p0.a == 3 && tb.z != null){
          p0 = tb.p;
          if (p0 != null && tb.D != null) {
             p0.e();
          }
       }
       return;
    }
}
