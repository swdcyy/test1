package dl9.t$g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dl9.t;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Integer;
import o07.o;

public final class t$g implements PopupInterface$h	// class@001fa5
{
    public final t b;

    public void t$g(t p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$g.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       t r = this.b.r;
       if (r != null) {
          RecyclerView recyclerView = r.h0();
          if (recyclerView != null) {
             recyclerView.requestDisallowInterceptTouchEvent(true);
          }
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(t$g.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, t$g.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       t$g tb = this.b;
       tb.w = null;
       t r = tb.r;
       if (r != null) {
          RecyclerView recyclerView = r.h0();
          if (recyclerView != null) {
             recyclerView.requestDisallowInterceptTouchEvent(false);
          }
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
