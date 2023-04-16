package com.yxcorp.gifshow.comment.emotion.detail.c;
import erd.g;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.t$a;
import lk9.j;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import e17.i;

public final class c implements g	// class@0010c4
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       String str = 0x7f101245;
       if (p0 instanceof KwaiException) {
          if (p0.getErrorCode() == 7806) {
             if (!PatchProxy.applyVoid(null, tb, e.class, "9") && tb.getActivity() != null) {
                p0 = new t$a(tb.getActivity());
                p0.y0(R.string.arg_RES_7f101249);
                p0.S0(R.string.arg_RES_7f101248);
                p0.Q0(R.string.cancel);
                p0.u0(new j(tb));
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
