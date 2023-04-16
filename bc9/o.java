package bc9.o;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$g;
import bc9.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.c;
import sa6.a;
import ec9.f1;
import ec9.a;
import cc9.k;

public final class o implements HGalleryLayoutManager$g	// class@000400
{
    public final l a;

    public void o(l p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "1")) {
          return;
       }
       if (this.a.g2().z()) {
          this.a.g2().g().w0(new c(8));
       }
       this.a.g2().r().t0().a(new k(2, p0));
       return;
    }
}
