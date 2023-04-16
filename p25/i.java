package p25.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import android.app.Activity;

public abstract class i extends PresenterV2	// class@002d53
{
    public Uri p;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.R8(this.p);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          activity.finish();
       }
       return;
    }
    public abstract void R8(Uri p0);
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("ROUTER_URI");
       return;
    }
}
