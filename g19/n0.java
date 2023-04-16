package g19.n0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.n0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.app.Activity;
import android.view.View;
import g59.m;
import androidx.appcompat.widget.AppCompatTextView;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class n0 extends PresenterV2	// class@0023cc
{
    public final a p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public AppCompatTextView s;

    public void n0(){
       super();
       this.p = new n0$a(this);
    }
    public void E8(){
       n0 tq1;
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "2")) {
          return;
       }
       n0 tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       this.r = SlidePlayViewModel.B0(tq.getParentFragment());
       if (!PatchProxy.applyVoid(objArray, this, on0, "3") && this.s == null) {
          Activity activity = this.getActivity();
          tq1 = this.q;
          if (tq1 == null) {
             a.S("mFragment");
          }
          this.s = m.a(activity, tq1, 0x7f0a3097);
       }
       on0 = this.r;
       if (on0 != null) {
          tq1 = this.q;
          if (tq1 == null) {
             a.S("mFragment");
          }
          on0.P(tq1, this.p);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       return;
    }
}
