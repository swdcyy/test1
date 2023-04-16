package iz8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.u;
import android.app.Activity;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import yx.j0;
import qrd.l1;
import java.lang.Exception;

public final class a extends PresenterV2	// class@00273b
{
    public QPhoto p;
    public QPhoto q;
    public View r;
    public final boolean s;

    public void a(){
       super(false);
    }
    public void a(boolean p0){
       super();
       this.s = p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       u ou = d.a(-1694791652);
       Activity activity = this.getActivity();
       View view = this.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       uoa = PatchProxy.apply(objArray, this, uoa, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.p;
          if (uoa == null) {
             uoa = this.q;
             if (uoa == null) {
                throw new Exception("nether mQphoto nor mLandscapePhoto");
             }
          }
       }
       View view1 = ou.wK(activity, view, uoa.getEntity(), this.s);
       if (view1 != null) {
          objArray = new Object[0];
          j0.f("AdDetailMonitor", "show ad monitor view ", objArray);
          objArray = view1;
       }
       this.r = objArray;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       View view = this.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       view.removeView(this.r);
       this.r = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       this.q = this.t8("Landscape_LAND_ITEM_PHOTO");
       return;
    }
}
