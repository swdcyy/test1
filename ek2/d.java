package ek2.d;
import android.view.View$OnClickListener;
import ek2.c;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.stayinfo.Content;
import com.kuaishou.live.core.show.stayinfo.ActionButton;
import t02.a0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import lnc.a1;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import hq5.a;
import tq5.c;

public final class d implements View$OnClickListener	// class@002749
{
    public final c b;
    public final StayInfo c;
    public final View$OnClickListener d;
    public final View$OnClickListener e;

    public void d(c p0,StayInfo p1,View$OnClickListener p2,View$OnClickListener p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       this.d.onClick(p0);
       String str = this.c.b().a().a();
       if (str != null) {
          c.a9(this.b).p2.r4(str, this.b.getContext());
          PatchProxy.onMethodExit(d.class, "1");
          return;
       }else {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!qCurrentUser.isLogined()) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103077));
             LoginParams loginParams = uoa.a();
             d.a(-1712118428).x00(this.b.getContext(), 45, loginParams, null);
             PatchProxy.onMethodExit(d.class, "1");
             return;
          }else {
             c.a9(this.b).Y.Wj(25);
             c.a9(this.b).w1.tc();
             PatchProxy.onMethodExit(d.class, "1");
             return;
          }
       }
    }
}
