package b5c.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.profile.activity.UserProfileActivity;
import com.yxcorp.gifshow.profile.fragment.UserProfileFragment;
import java.util.Set;
import java.util.Collection;
import joc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class r extends PresenterV2	// class@0003b5
{
    public BaseFragment p;
    public n q;
    public Set r;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       if (this.getActivity() instanceof UserProfileActivity) {
          this.q = this.getActivity().H;
          r tp = this.p;
          if (tp instanceof UserProfileFragment) {
             this.r = tp.t7();
          }
          tp = this.q;
          if (tp != null) {
             r tr = this.r;
             if (tr != null) {
                tp.j(tr);
             }
          }
       }
    label_0037 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       r tq = this.q;
       if (tq != null) {
          r tr = this.r;
          if (tr != null) {
             tq.s(tr);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.r8("PROFILE_FRAGMENT");
       return;
    }
}
