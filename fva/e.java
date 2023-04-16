package fva.e;
import tx4.o;
import fva.b;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iva.a;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import jva.b;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import android.widget.FrameLayout;
import android.view.View;
import java.lang.Throwable;
import java.lang.Integer;

public final class e implements o	// class@002a07
{
    public final b a;

    public void e(b p0){
       this.a = p0;
       super();
    }
    public void a(e p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       ta.q = p0;
       if (p0 != null) {
          ta.u = new a(p0);
       }
       this.a.X8();
       ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "6")) {
          ta.W8();
          ta.E.h0().addOnScrollListener(ta.C);
       }
       b.P8(this.a).n1().setVisibility(0);
       FrameAutoPlayCard uFrameAutoPl = b.P8(this.a).n1();
       if (p0 != null) {
          objArray = p0.getView();
       }
       uFrameAutoPl.addView(objArray, -1, -1);
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, e.class, "2")) {
          return;
       }
       b.P8(this.a).n1().setVisibility(8);
       if (p1 != null) {
          p1.getMessage();
       }
       return;
    }
}
