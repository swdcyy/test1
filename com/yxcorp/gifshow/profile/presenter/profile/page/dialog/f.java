package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
import java.lang.Object;
import java.lang.Long;
import com.kwai.framework.model.user.User;
import kzc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import c5c.n;
import u07.u;
import c5c.m;
import u07.f;
import c5c.o;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class f implements g	// class@00157d
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (tb.q.isFollowingOrFollowRequesting()) {
       }else {
          p0 = new d(tb.getActivity());
          p0.b1(KwaiDialogOption.e);
          p0.W0(R.string.arg_RES_7f104fe1);
          p0.S0(R.string.arg_RES_7f100f8f);
          p0.Q0(R.string.arg_RES_7f104fbb);
          p0.u0(new n(tb));
          p0.t0(new m(tb));
          f.e(p0).Y(new o(tb));
       }
       return;
    }
}
