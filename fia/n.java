package fia.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.n$a;
import fia.n$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import bf5.r;
import bf5.d;
import vy6.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class n extends PresenterV2	// class@002930
{
    public BaseFragment p;
    public View q;
    public View r;
    public View s;
    public boolean t;
    public boolean u;
    public d v;
    public SlidePlayViewModel w;
    public boolean x;
    public final a y;
    public final e z;

    public void n(){
       super();
       this.y = new n$a(this);
       this.z = new n$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "5")) {
          return;
       }
       this.x = false;
       n tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       this.w = SlidePlayViewModel.B0(tp.getParentFragment());
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       Fragment parentFragme = tp.getParentFragment();
       if (!parentFragme instanceof r) {
          parentFragme = objArray;
       }
       if (parentFragme != null) {
          objArray = parentFragme.j6();
       }
       this.v = objArray;
       tp = this.w;
       if (tp != null) {
          n tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          tp.P(tp1, this.y);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       n tw = this.w;
       if (tw != null) {
          n tp = this.p;
          if (tp == null) {
             a.S("mFragment");
          }
          tw.D(tp, this.y);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "4")) {
          return;
       }
       a.p(p0, "rootView");
       this.q = m1.f(p0, 0x7f0a3a09);
       this.r = m1.f(p0, 0x7f0a3a43);
       this.s = m1.f(p0, 0x7f0a2596);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       return;
    }
}
