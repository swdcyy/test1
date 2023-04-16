package cy9.g$a;
import com.yxcorp.gifshow.widget.m;
import cy9.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.popup.common.c$b;
import u07.t$a;
import u07.f;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c;

public class g$a extends m	// class@001e37
{
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       d uod = new d(this.c.getActivity());
       uod.v(true);
       t$a uoa = f.e(uod);
       uoa.V0(true);
       uoa.x0(17);
       uoa.X0(a1.p(R.string.arg_RES_7f10066d));
       uoa.z0(a1.p(R.string.arg_RES_7f100669));
       uoa.T0(a1.p(R.string.arg_RES_7f10067a));
       uoa.X();
       return;
    }
}
