package be9.d$b;
import com.yxcorp.gifshow.camerasdk.j$p;
import be9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import java.util.Objects;
import ekd.y0;

public final class d$b implements j$p	// class@00047a
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "1")) {
          return;
       }
       d h = this.a.h;
       if (h != null) {
          h.L0(true);
       }
       d$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, d.class, "8")) {
          h = ta.o;
          if (h != null) {
             h.d();
          }
       }
       return;
    }
}
