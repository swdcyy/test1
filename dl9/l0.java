package dl9.l0;
import erd.g;
import dl9.m0;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dl9.h0;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import e17.i;

public final class l0 implements g	// class@001f76
{
    public final m0 b;

    public void l0(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       ExceptionHandler.handleCaughtException(p0);
       String str = 0x7f101245;
       if (p0 instanceof KwaiException) {
          if (p0.getErrorCode() == 7806) {
             if (!PatchProxy.applyVoid(null, tb, m0.class, "15")) {
                p0 = new t$a(tb.getActivity());
                p0.y0(R.string.arg_RES_7f101249);
                p0.S0(R.string.arg_RES_7f101248);
                p0.Q0(R.string.cancel);
                p0.u0(new h0(tb));
                p0.A(true);
                f.e(p0).b0().Z();
             }
          }else if(TextUtils.x(p0.getMessage())){
             p0 = a1.p(str);
          }else {
             p0 = p0.getMessage();
          }
          i.d(R.style.arg_RES_7f11066a, p0);
       }else {
          i.a(R.style.arg_RES_7f11066a, str);
       }
       return;
    }
}
