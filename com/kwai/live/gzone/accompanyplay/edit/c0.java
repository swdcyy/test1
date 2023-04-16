package com.kwai.live.gzone.accompanyplay.edit.c0;
import io.reactivex.g;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import n37.i0;
import u07.u;
import n37.j0;
import lnc.a1;
import f37.o0;
import com.kwai.live.gzone.accompanyplay.edit.c0$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class c0 implements g	// class@000bdd
{
    public final a0 b;

    public void c0(a0 p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       t$a uoa = new t$a(this.b.getActivity());
       uoa.S0(R.string.arg_RES_7f102366);
       uoa.Q0(R.string.cancel);
       uoa.W0(R.string.arg_RES_7f102326);
       uoa.z0("");
       uoa.u0(new i0(this, p0));
       uoa.t0(new j0(this, p0));
       t$a uoa1 = o0.a(uoa, a1.p(R.string.arg_RES_7f102322));
       uoa1.Y(new c0$a(this));
       return;
    }
}
