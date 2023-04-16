package eja.u0$a;
import android.view.View$OnAttachStateChangeListener;
import eja.u0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import y8c.q;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import g9c.d;
import android.util.Pair;
import im8.f;
import java.lang.Integer;
import nga.h;

public class u0$a implements View$OnAttachStateChangeListener	// class@0026fc
{
    public final u0 b;

    public void u0$a(u0 p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, u0$a.class, "1")) {
          return;
       }
       u0$a tb = this.b;
       if (tb.p == null) {
          return;
       }
       u0 q = tb.q;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyTwoRefs(p0, q, tb, u0.class, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          RecyclerView$ViewHolder childViewHol = q.h0().getChildViewHolder(p0);
          b = (childViewHol != null && (q.ia() == null || (!q.ia().f1(childViewHol.getItemViewType()) && !q.ia().h1(childViewHol.getItemViewType()))))? true: false;
       }
       if (!b) {
          return;
       }else {
          this.b.p.c(new Pair(this.b.s.get(), this.b.r), false);
          return;
       }
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
