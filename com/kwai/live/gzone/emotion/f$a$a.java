package com.kwai.live.gzone.emotion.f$a$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.emotion.f$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import u07.t$a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Integer;
import java.lang.CharSequence;
import y47.e;
import u07.u;
import com.kwai.live.gzone.emotion.e;
import u07.f;
import com.kwai.live.gzone.emotion.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.live.gzone.emotion.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import d61.y;
import a57.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class f$a$a extends m	// class@000cdc
{
    public final f$a c;

    public void f$a$a(f$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a$a.class, "1")) {
          return;
       }
       f$a$a tc = this.c;
       f$a p = tc.p;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p, tc, f$a.class, "4") && a1.i(tc.getActivity())) {
          t$a uoa1 = new t$a(tc.getActivity());
          Object[] objArray = new Object[]{Integer.valueOf(p.mPrice)};
          uoa1.z0(String.format(a1.p(R.string.arg_RES_7f102413), objArray));
          uoa1.W0(R.string.arg_RES_7f102418);
          uoa1.w0(0);
          uoa1.S0(R.string.arg_RES_7f102416);
          uoa1.Q0(R.string.cancel);
          uoa1.t0(new e(tc));
          uoa1.u0(new e(tc, p));
          t$a uoa2 = f.e(uoa1);
          tc.u.x = uoa2.Y(new g(tc));
       }
       f z = this.c.u.z;
       if (z != null) {
          ClientContent$LiveStreamPackage liveStreamPa = z.a();
          boolean b = y.d(this.c.getActivity());
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(b), null, uoa, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_LIVE_GZONE_EMO_UNLOCK";
             uElementPack.type = 1;
             uElementPack.params = a.b(b);
             u1.u(1, uElementPack, a.a(liveStreamPa));
          }
       }
       return;
    }
}
