package a1d.e0;
import erd.g;
import a1d.h0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.http.response.AuthInfoResponse$AgreementInfo;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class e0 implements g	// class@00001f
{
    public final h0 b;

    public void e0(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "13")) {
       }else if(!tb.t.booleanValue() && (tb.s.isRequired == null || PatchProxy.applyVoid(objArray, tb, p0, "11"))){
          if (tb.q == null) {
             p0 = new a(tb.getActivity());
             p0.K0(KwaiBubbleOption.e);
             p0.o0(tb.r);
             p0.q0(true);
             p0.C0(tb.r.getTop());
             p0.F0(tb.getActivity().getString(R.string.arg_RES_7f103b0f));
             p0.T(2000);
             p0.P(true);
             p0.z(true);
             p0.A(false);
             tb.q = p0;
          }
          p.n(tb.q);
       }
       return;
    }
}
