package com.kwai.tokenshare.presenter.b;
import io.reactivex.g;
import fu7.c;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import brd.g;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import java.lang.String;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fu7.b;
import n3d.a;

public final class b implements g	// class@00193d
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.ME.isLogined()) {
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
       }else {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a1.p(R.string.arg_RES_7f103078));
          d.a(-1712118428).x00(tb.getContext(), 0, uoa.a(), new b(p0));
       }
       return;
    }
}
