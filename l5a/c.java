package l5a.c;
import erd.g;
import l5a.d;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import u07.t$a;
import u07.f;
import lnc.a1;
import java.lang.CharSequence;
import l5a.b;
import u07.u;
import l5a.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import android.text.TextUtils;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import l5a.f;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class c implements g	// class@002d4e
{
    public final d b;
    public final int c;

    public void c(d p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       p0 = d.class;
       Object[] objArray = null;
       if (this.c == true) {
          if (!PatchProxy.applyVoid(objArray, tb, p0, "6")) {
             p0 = f.d(new d(ActivityContext.g().e()));
             p0.Z0(168);
             p0.V0(true);
             p0.X0(a1.p(R.string.arg_RES_7f1047b1));
             p0.z0(a1.p(R.string.arg_RES_7f1047af));
             p0.T0(a1.p(R.string.arg_RES_7f1047ae));
             p0.u0(new b(tb));
             tb.v = p0.Y(new e(tb));
          }
       }else if(TextUtils.isEmpty(tb.w) || PatchProxy.applyVoid(objArray, tb, p0, "7")){
          a uoa = new a(tb.getActivity());
          uoa.K0(KwaiBubbleOption.g);
          uoa.F0(a1.r(R.string.arg_RES_7f1047b0, tb.w));
          uoa.o0(tb.m8().findViewById(R.id.forward_button));
          uoa.T(d.A);
          uoa.P(true);
          uoa.M(new f(tb));
          tb.u = p.i(uoa);
       }
       return;
    }
}
