package bc9.n;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$e;
import bc9.l;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.f1;
import ec9.a;
import cc9.k;
import cc9.c;

public final class n implements HGalleryLayoutManager$e	// class@0003ff
{
    public final l a;

    public void n(l p0){
       this.a = p0;
       super();
    }
    public final void a(RecyclerView p0,View p1,int p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, n.class, "1")) {
          return;
       }
       this.a.g2().r().t0().a(new k(1, p2));
       return;
    }
}
