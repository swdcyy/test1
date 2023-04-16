package bc9.p;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$f;
import bc9.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.c;
import java.util.Objects;
import java.util.LinkedHashSet;

public final class p implements HGalleryLayoutManager$f	// class@000401
{
    public final l a;

    public void p(l p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, op, "1")) {
          return;
       }
       c uoc = this.a.g2().h();
       Objects.requireNonNull(uoc);
       c uoc1 = c.class;
       if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoc, uoc1, "5")) {
          uoc.a.add(Integer.valueOf(p0));
       }
       return;
    }
}
