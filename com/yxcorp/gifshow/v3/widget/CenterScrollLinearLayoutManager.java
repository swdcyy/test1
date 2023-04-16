package com.yxcorp.gifshow.v3.widget.CenterScrollLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.v3.widget.CenterScrollLinearLayoutManager$b;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Integer;
import usd.k;
import usd.q;
import usd.g;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.widget.CenterScrollLinearLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public final class CenterScrollLinearLayoutManager extends LinearLayoutManager	// class@001630
{
    public int r;
    public int s;
    public static final CenterScrollLinearLayoutManager$b t;

    static {
       CenterScrollLinearLayoutManager.t = new CenterScrollLinearLayoutManager$b(null);
    }
    public void CenterScrollLinearLayoutManager(Context p0,int p1,boolean p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.r = -1;
    }
    public void CenterScrollLinearLayoutManager(Context p0,int p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final void W0(int p0){
       this.s = p0;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CenterScrollLinearLayoutManager.class, "2")) {
          return;
       }
       a.p(p0, "recycler");
       a.p(p1, "state");
       super.onLayoutChildren(p0, p1);
       CenterScrollLinearLayoutManager tr = this.r;
       int i = -1;
       if (tr != i) {
          View view = this.findViewByPosition(tr);
          if (view != null && (view.getWidth() > 0 || view.getHeight() > 0)) {
             this.r = i;
             if (this.canScrollVertically()) {
                this.scrollVerticallyBy(((view.getTop() + (view.getHeight() / 2)) - (this.getHeight() / 2)), p0, p1);
             }else {
                this.scrollHorizontallyBy(((view.getLeft() + (view.getWidth() / 2)) - (this.getWidth() / 2)), p0, p1);
             }
          }
       }
       return;
    }
    public void scrollToPosition(int p0){
       CenterScrollLinearLayoutManager uCenterScrol = CenterScrollLinearLayoutManager.class;
       if (PatchProxy.isSupport(uCenterScrol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCenterScrol, "1")) {
          return;
       }
       p0 = q.C(p0, q.n1(0, this.getItemCount()));
       this.r = p0;
       super.scrollToPosition(p0);
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CenterScrollLinearLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CenterScrollLinearLayoutManager.class, "3")) {
          return;
       }
       a.p(p0, "recyclerView");
       Context context = p0.getContext();
       a.o(context, "recyclerView.context");
       CenterScrollLinearLayoutManager$a uoa = new CenterScrollLinearLayoutManager$a(context, this.s);
       uoa.p(q.C(p2, q.n1(0, this.getItemCount())));
       this.startSmoothScroll(uoa);
       return;
    }
}
