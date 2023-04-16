package h63.u0$a;
import c77.s;
import h63.u0;
import java.lang.Object;
import c77.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Integer;
import java.util.BitSet;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.widget.HorizontalScrollView;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.app.Activity;
import h63.s0;

public class u0$a implements s	// class@002c9e
{
    public final u0 a;

    public void u0$a(u0 p0){
       this.a = p0;
       super();
    }
    public void a(r p0,boolean p1){
       u0$a uoa = u0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (!this.a.v.contains(p0)) {
          this.a.v.add(p0);
       }
       if (p1) {
          p0.a(this.b());
       }
       return;
    }
    public boolean b(){
       u0 obj = PatchProxy.apply(null, this, u0$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.r;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void c(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0$a.class, "4")) {
          return;
       }
       this.a.v.remove(p0);
       return;
    }
    public void d(boolean p0,int p1){
       u0$a uoa = u0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          this.a.u.clear(p1);
       }else {
          this.a.u.set(p1);
       }
       u0$a ta = this.a;
       u0 r = ta.r;
       int i = (!ta.u.cardinality())? 0: 8;
       r.setVisibility(i);
       Iterator iterator = this.a.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.b());
       }
       return;
    }
    public void e(int p0){
       u0$a uoa = u0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       boolean b = (p0 > 1)? true: false;
       this.d(b, 2);
       ViewGroup$MarginLayoutParams layoutParams = this.a.t.getLayoutParams();
       this.a.t.O(-1, -1);
       u0$a ta = this.a;
       ta.t.setFadingEdgeLength(n.c(ta.getContext(), 32.00f));
       this.a.t.setHorizontalFadingEdgeEnabled(1);
       this.a.t.setDisableLeftFadingEdge(1);
       this.a.t.setScrollSelectedTabToCenter(1);
       ta = this.a;
       ta.t.M(1, 1, s0.a(ta.getActivity(), 20));
       return;
    }
}
