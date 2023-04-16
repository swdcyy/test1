package hf9.h;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$g;
import hf9.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lf9.q;
import lf9.a;
import kf9.c;
import lf9.c;

public final class h implements HGalleryLayoutManager$g	// class@002647
{
    public final f a;

    public void h(f p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       f.g2(this.a).t0().a(new c(2, p0));
       return;
    }
}
