package com.yxcorp.gifshow.detail.common.information.quickcomment.a;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.util.List;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import java.lang.String;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import uy9.h;
import android.content.Context;
import n3d.a;
import m9a.t$c;

public final class a implements g	// class@001443
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (VisitorModeManager.g(6)) {
       }else if(tb.K != null){
          if (p0.intValue() >= 0) {
             b q = tb.Q;
             if (q != null && q.size() > p0.intValue()) {
                if (!QCurrentUser.me().isLogined()) {
                   LoginParams$a uoa = new LoginParams$a();
                   uoa.d(a1.p(R.string.arg_RES_7f103078));
                   d.a(-1712118428).x00(tb.t, 0, uoa.a(), new h(tb, p0));
                }else {
                   tb.y0(p0.intValue(), tb.Q.get(p0.intValue()));
                }
             }
          }else {
             tb.w0();
          }
       }
       return;
    }
}
