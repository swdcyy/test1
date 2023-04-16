package hf9.g;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$e;
import hf9.f;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lf9.q;
import lf9.a;
import kf9.c;
import lf9.c;

public final class g implements HGalleryLayoutManager$e	// class@002646
{
    public final f a;

    public void g(f p0){
       this.a = p0;
       super();
    }
    public final void a(RecyclerView p0,View p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "1")) {
          return;
       }
       f.g2(this.a).t0().a(new c(1, p2));
       return;
    }
}
