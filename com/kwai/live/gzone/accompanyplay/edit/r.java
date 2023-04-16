package com.kwai.live.gzone.accompanyplay.edit.r;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.s;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import lnc.a1;
import java.lang.CharSequence;
import n37.r;
import u07.u;
import dj2.b;
import u07.f;
import n37.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class r implements View$OnClickListener	// class@000c16
{
    public final s b;

    public void r(s p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, s.class, "8")) {
       }else {
          t$a uoa = new t$a(tb.getActivity());
          uoa.X0(a1.r(R.string.arg_RES_7f102346, tb.p.mEditingTitle));
          uoa.S0(R.string.arg_RES_7f1023c9);
          uoa.Q0(R.string.arg_RES_7f10232e);
          uoa.t0(new r(tb));
          uoa.u0(b.b);
          tb.w = f.e(uoa).Y(new x(tb));
       }
       return;
    }
}
