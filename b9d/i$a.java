package b9d.i$a;
import nfd.t3;
import b9d.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;
import uy5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import nfd.v3;
import java.util.List;

public class i$a implements t3	// class@0003c3
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       int i = (p0)? 1: 2;
       uoa.t = i;
       boolean b = uoa.R8();
       if (b) {
          i$a ta = this.a;
          i s = ta.s;
          if (s != null && ta.v == null) {
             b.c("SearchHomeNewUserGuidePresenter", "onChange, isShow = "+p0);
             if (p0) {
                n.D(this.a.getActivity(), 100);
             }else {
                i p = this.a.p;
                if (p instanceof s) {
                   p.T7(this);
                }
                i$a ta1 = this.a;
                ta1.S8(ta1.s);
             }
             return;
          }
       }
       b.c("SearchHomeNewUserGuidePresenter", "onChange, isPageSelect = "+b+" mPendingHomeGuideConfigList = "+this.a.s+" mDisableShowGuide = "+this.a.v);
       return;
    }
}
