package eja.m1$b;
import androidx.recyclerview.widget.RecyclerView$r;
import eja.m1;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import rja.c;
import qvb.i;
import ok.x;
import fja.l;
import java.lang.Boolean;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import k2b.e0;
import aja.k;

public class m1$b extends RecyclerView$r	// class@0026dc
{
    public final m1 a;

    public void m1$b(m1 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       m1$b uob = m1$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p1 && this.a.s.e()) {
          m1$b ta = this.a;
          if (ta.t == null && !ta.r.isEmpty()) {
             ta = this.a;
             if (!l.a(ta.s, ta.r).get().booleanValue()) {
                ta = this.a;
                Objects.requireNonNull(ta);
                m1 om1 = m1.class;
                if (!PatchProxy.applyVoidOneRefs(p0, ta, om1, "2")) {
                   RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
                   if (layoutManage != null && (layoutManage.getChildCount() > 0 && (layoutManage.getChildAt((layoutManage.getChildCount() - 1)).getLayoutParams().getViewAdapterPosition() >= (layoutManage.getItemCount() - 1) && !ta.r.hasMore()))) {
                      ta.t = true;
                      if (!PatchProxy.applyVoid(null, ta, om1, "3")) {
                         int i = (ta.r.isEmpty())? 0: ta.r.getCount() - 1;
                         k.h(i, ta.p);
                         k.g(ta.p);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
