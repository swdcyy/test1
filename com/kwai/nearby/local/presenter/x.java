package com.kwai.nearby.local.presenter.x;
import com.kwai.nearby.local.pendant.NearbyPendantView$b;
import com.kwai.nearby.local.presenter.w;
import com.kwai.nearby.model.NearbyPendantInfo$NearbyPendantConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import com.kwai.nearby.model.WidgetState;
import cd7.h;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dd7.a1;
import android.content.Context;
import n3d.a;
import wkd.b;
import vc7.i0;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import bsb.a;
import brd.t;
import cjd.e;
import erd.o;
import dd7.f1;
import erd.g;
import crd.b;

public class x implements NearbyPendantView$b	// class@000fde
{
    public final NearbyPendantInfo$NearbyPendantConfig a;
    public final w b;

    public void x(w p0,NearbyPendantInfo$NearbyPendantConfig p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       x tb = this.b;
       h.a("ENTER", tb.p, this.a, tb.y);
       tb = this.a;
       if (tb.mClickLinkNeedLogin != null) {
          x tb1 = this.b;
          Objects.requireNonNull(tb1);
          if (!PatchProxy.applyVoidOneRefs(tb, tb1, w.class, "12")) {
             if (!QCurrentUser.ME.isLogined()) {
                LoginParams$a uoa = new LoginParams$a();
                uoa.d(a1.p(R.string.arg_RES_7f103078));
                d.a(-1712118428).x00(tb1.getActivity(), 0, uoa.a(), new a1(tb));
             }else {
                w.P8(tb.mLinkUrl);
             }
          }
       }else {
          w.P8(tb.mLinkUrl);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       x tb = this.b;
       x ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, w.class, "15")) {
          h.a("CLOSE", tb.p, ta, tb.y);
          tb.X7(b.a(-319613407).r(ta.mWidgetId, a.c(tb.D.getType())).map(new e()).subscribe(new f1(tb, ta)));
       }
       return;
    }
}
