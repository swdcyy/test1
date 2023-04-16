package k99.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.app.Activity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.m3;
import ekd.m1;

public final class q extends PresenterV2	// class@002b8d
{
    public View p;
    public QPhoto q;

    public void q(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "3")) {
          return;
       }
       q tp = this.p;
       if (tp != null) {
          if (tp != null) {
             objArray = tp.getLayoutParams();
          }
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          int i = a1.d(R.dimen.arg_RES_7f07031f);
          Activity activity = this.getActivity();
          q tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          objArray.topMargin = i + m3.e(activity, tq);
          tp = this.p;
          if (tp != null) {
             tp.requestLayout();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.p = m1.f(p0, 0x7f0a3698);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       return;
    }
}
