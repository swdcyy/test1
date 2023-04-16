package jf9.a$a;
import android.view.View$OnClickListener;
import jf9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf9.e;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import y8c.d;
import java.util.List;
import g9c.a;
import lf9.q;
import lf9.a;
import kf9.c;
import lf9.c;
import androidx.recyclerview.widget.RecyclerView;

public final class a$a implements View$OnClickListener	// class@002a77
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       int i = this.b.P8().y.Q();
       int i1 = this.b.V8().get();
       if (i1 >= 0 && i1 <= this.b.P8().Q0().size()) {
          if (i != i1) {
             this.b.P8().r1().t0().a(new c(2, i));
             this.b.P8().h0().smoothScrollToPosition(i1);
          }else {
             this.b.W8();
          }
       }
       return;
    }
}
