package bc9.c0$b;
import android.view.View$OnClickListener;
import bc9.c0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bc9.k;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import y8c.d;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.c;
import sa6.a;
import ec9.f1;
import ec9.a;
import cc9.k;
import androidx.recyclerview.widget.RecyclerView;

public final class c0$b implements View$OnClickListener	// class@0003de
{
    public final c0 b;

    public void c0$b(c0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0$b.class, "1")) {
          return;
       }
       int i = this.b.P8().t1().Q();
       int i1 = this.b.W8().get();
       if (i1 >= 0 && i1 <= this.b.P8().Q0().size()) {
          if (i != i1) {
             if (this.b.P8().r1().z()) {
                this.b.P8().r1().g().w0(new c(8));
             }
             this.b.P8().r1().r().t0().a(new k(2, i));
             this.b.P8().h0().smoothScrollToPosition(i1);
          }else {
             this.b.X8();
          }
       }
       return;
    }
}
