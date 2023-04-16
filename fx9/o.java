package fx9.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import al9.a;
import kotlin.jvm.internal.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class o extends PresenterV2	// class@00237a
{
    public View p;
    public BaseFragment q;

    public void o(){
       super();
    }
    public void E8(){
       o tp;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "3")) {
          return;
       }
       o tq = this.q;
       if (!tq instanceof RecyclerFragment) {
          tq = objArray;
       }
       i oi = (tq != null)? tq.q(): objArray;
       if (oi instanceof a) {
          objArray = oi;
       }
       String str = "mDividerView";
       if (objArray != null && objArray.J0() == true) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setVisibility(8);
       }else {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.user_info_comment_divider);
       a.o(p0, "bindWidget\(rootView, R.i¡­ser_info_comment_divider\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.q = this.t8("FRAGMENT");
       return;
    }
}
