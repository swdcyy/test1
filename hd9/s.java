package hd9.s;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.followshoot.f;

public final class s implements g	// class@00262a
{
    public final d b;

    public void s(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "22")) {
       }else {
          tb.G = p0.a;
          if (tb.w != null) {
             tb.w.setSpeed((0x3f800000 / p0.a));
          }
       }
       return;
    }
}
