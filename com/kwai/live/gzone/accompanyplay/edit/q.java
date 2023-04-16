package com.kwai.live.gzone.accompanyplay.edit.q;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.s;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n37.k;
import java.util.HashMap;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import io.reactivex.subjects.PublishSubject;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n37.s;
import u07.u;
import dj2.b;
import u07.f;
import n37.w;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class q implements View$OnClickListener	// class@000c15
{
    public final s b;

    public void q(s p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, s.class, "7")) {
       }else {
          s q = tb.q;
          if (!q.m.get(q.d).isItemValueChanged()) {
             tb.q.j.onNext(new Object());
             tb.q.k.onNext(tb.p.mFleetId);
          }else {
             t$a uoa = new t$a(tb.getActivity());
             uoa.W0(R.string.arg_RES_7f10236c);
             uoa.S0(R.string.arg_RES_7f1023c9);
             uoa.Q0(R.string.arg_RES_7f102349);
             uoa.t0(new s(tb));
             uoa.u0(b.b);
             tb.x = f.e(uoa).Y(new w(tb));
          }
       }
       return;
    }
}
