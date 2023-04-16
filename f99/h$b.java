package f99.h$b;
import vu5.a;
import f99.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.e;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import zf6.k;
import ekd.i;

public class h$b implements a	// class@0022e9
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$b.class, "1")) {
          return;
       }
       h$b ta = this.a;
       if (ta.H != null) {
          return;
       }
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, h.class, "6")) {
          e uoe = ta.r.beginTransaction();
          uoe.v(R.id.profile_fragment_container_for_swipe, ta.B);
          uoe.A(ta.B, Lifecycle$State.STARTED).o();
       }
       if (this.a.getActivity() != null && ((QCurrentUser.ME.getId()).equals(this.a.w.getUserId()) && (this.a.w.isLongPhotos() || this.a.w.isAtlasPhotos()))) {
          boolean b = (!k.d() || k.e())? true: false;
          i.h(this.a.getActivity(), 0, b);
       }
    label_0084 :
       return;
    }
}
