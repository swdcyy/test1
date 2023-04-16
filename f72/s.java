package f72.s;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import va1.n0;

public class s extends c	// class@0028d9
{
    public LiveDoubleListParam p;
    public static String sLivePresenterClassName = "LiveDoubleListFeedCornerPresenter";

    public void s(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       if (this.p.mCornerRadiusDp >= null) {
          n0.a(this.m8(), (float)a1.e((float)this.p.mCornerRadiusDp));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_EXPLORE_PARAM");
       return;
    }
}
