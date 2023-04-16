package com.kwai.live.gzone.accompanyplay.audience.r0;
import io.reactivex.g;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k37.y0;
import u07.u;
import k37.z0;
import lnc.a1;
import f37.o0;
import com.kwai.live.gzone.accompanyplay.audience.r0$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import f37.b0;

public class r0 implements g	// class@000baf
{
    public final p0 b;

    public void r0(p0 p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "1")) {
          return;
       }
       r0 tb = this.b;
       t$a uoa = new t$a(tb.getActivity());
       uoa.S0(R.string.arg_RES_7f102366);
       uoa.Q0(R.string.cancel);
       uoa.W0(R.string.arg_RES_7f102326);
       uoa.u0(new y0(this, p0));
       uoa.t0(new z0(this, p0));
       t$a uoa1 = o0.a(uoa, a1.p(R.string.arg_RES_7f102322));
       tb.P8(uoa1.Y(new r0$a(this)));
       return;
    }
}
