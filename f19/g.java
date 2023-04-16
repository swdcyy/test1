package f19.g;
import f19.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.c;
import uc6.c;
import sd5.d;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class g extends b	// class@002288
{
    public BaseFragment I;
    public d J;

    public void g(){
       super(null, 1, null);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "3")) {
          return;
       }
       if (!c.S(this.P8())) {
          return;
       }
       g tJ = this.J;
       if (tJ != null) {
          c uoc = tJ.N();
          if (uoc != null) {
             objArray = uoc.m();
          }
       }
       this.q = objArray;
       super.E8();
       return;
    }
    public void J8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "4")) {
          return;
       }
       if (c.S(this.P8())) {
          b tp = this.p;
          ViewGroup$LayoutParams layoutParams = (tp != null)? tp.getLayoutParams(): objArray;
          if (!layoutParams instanceof FrameLayout$LayoutParams) {
             layoutParams = objArray;
          }
          int i = 0;
          if (layoutParams != null) {
             layoutParams.gravity = i;
          }
          View view = this.R8();
          layoutParams = (view != null)? view.getLayoutParams(): objArray;
          if (!layoutParams instanceof FrameLayout$LayoutParams) {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             objArray1.gravity = i;
          }
          tp = this.r;
          layoutParams = (tp != null)? tp.getLayoutParams(): objArray;
          if (layoutParams instanceof FrameLayout$LayoutParams) {
             objArray = layoutParams;
          }
          if (objArray != null) {
             objArray.gravity = 17;
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.doBindView(p0);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.W7(uod);
       this.J = uod;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.I = obj;
       return;
    }
}
