package dx9.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import dx9.c$a;
import dx9.c$b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$i;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class c extends PresenterV2	// class@001fe9
{
    public AppBarLayout p;
    public CoordinatorLayout q;
    public final RecyclerView r;
    public RecyclerView$Adapter s;
    public final int[] t;
    public boolean u;
    public final Runnable v;
    public final RecyclerView$i w;

    public void c(RecyclerFragment p0){
       super();
       int[] ointArray = new int[2];
       this.t = ointArray;
       this.v = new c$a(this);
       this.w = new c$b(this);
       this.r = p0.h0();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       RecyclerView$Adapter adapter = this.r.getAdapter();
       this.s = adapter;
       if (adapter != null) {
          adapter.F0(this.w);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c ts = this.s;
       if (ts != null) {
          ts.I0(this.w);
       }
       k1.m(this.v);
       return;
    }
    public final int P8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p0.getLocationInWindow(this.t);
       return (this.t[1] + p0.getHeight());
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       if (this.u != null) {
          return;
       }
       k1.r(this.v, 300);
       this.u = true;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a1261);
       this.q = p0.findViewById(0x7f0a0976);
       return;
    }
}
