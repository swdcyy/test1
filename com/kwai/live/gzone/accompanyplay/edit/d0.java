package com.kwai.live.gzone.accompanyplay.edit.d0;
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
import n37.l0;
import u07.u;
import n37.k0;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class d0 implements g	// class@000bdf
{
    public final a0 b;

    public void d0(a0 p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       t$a uoa = new t$a(this.b.getActivity());
       uoa.W0(R.string.arg_RES_7f102323);
       uoa.Q0(R.string.cancel);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.t0(new l0(p0));
       uoa.u0(new k0(this, p0));
       t$a uoa1 = f.e(uoa);
       uoa1.Y(PopupInterface.a);
       return;
    }
}
