package com.yxcorp.gifshow.detail.nonslide.presenter.share.f;
import erd.g;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.g;
import java.lang.Object;
import com.yxcorp.gifshow.share.fans.network.response.FansTopDialogResponse;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import java.lang.CharSequence;
import u07.t$a;
import w07.i;
import w07.l;
import z2a.m;
import u07.u;
import z2a.l;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import z2a.n;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import e17.i;

public final class f implements g	// class@0015e0
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (tb.r.booleanValue() || (tb.C == null && !tb.S8())) {
          boolean b = true;
          tb.B = b;
          FansTopDialogResponse mStatus = p0.mStatus;
          if (mStatus == b) {
             if (!PatchProxy.applyVoidOneRefs(p0, tb, g.class, "3")) {
                d uod = new d(tb.getActivity());
                uod.Z0(-1);
                uod.b1(KwaiDialogOption.d);
                uod.X0(p0.mTitle);
                uod.z0(p0.mContent);
                uod.T0(p0.mPositiveText);
                uod.Q0(R.string.cancel);
                uod.a0(new i());
                uod.u0(new m(tb, p0));
                uod.t0(new l(tb));
                uod.L(e.b);
                uod.z(b);
                uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
                uod.Y(new n(tb));
             }
          }else if(mStatus == 2){
             i.a(R.style.arg_RES_7f11066a, 0x7f100e19);
          }else if(mStatus == 3){
             i.a(R.style.arg_RES_7f11066a, 0x7f100e18);
          }
       }
       return;
    }
}
