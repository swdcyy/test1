package com.kuaishou.live.core.show.floatingwindow.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.floatingwindow.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import u07.t$a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kuaishou.live.core.show.floatingwindow.b;
import u07.u;
import u07.t;
import u07.j;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import s82.y;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import com.yxcorp.gifshow.util.rx.RxBus;
import s82.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import s82.c;
import java.lang.Runnable;

public final class a implements View$OnClickListener	// class@000b74
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, c.class, "9")) {
       }else if(!i9.a(a.a().a())){
          t$a uoa = new t$a(ActivityContext.g().e());
          uoa.W0(R.string.arg_RES_7f1021fe);
          uoa.y0(R.string.arg_RES_7f1021fd);
          uoa.S0(R.string.arg_RES_7f102d01);
          uoa.Q0(R.string.arg_RES_7f102852);
          uoa.u0(b.b);
          j.d(uoa);
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = tb.L.Z2.a();
          y oy = y.class;
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, oy, "6")) {
             ClientContent$ContentPackage uContentPack = y.b(liveStreamPa);
             ClientEvent$ElementPackage uElementPack = PatchProxy.applyOneRefs("MORE_FLOAT_BUTTON", objArray, oy, "14");
             if (uElementPack != PatchProxyResult.class) {
             }else {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MORE_FLOAT_BUTTON";
             }
             u1.u(true, uElementPack, uContentPack);
          }
          tb.K = true;
          tb.N.c(2);
          RxBus.f.b(new x(x.a(tb.getActivity())));
          new Handler().post(new c(tb));
       }
       return;
    }
}
