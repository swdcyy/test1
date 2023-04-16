package com.kwai.live.gzone.accompanyplay.audience.s0;
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
import k37.b1;
import u07.u;
import k37.a1;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import f37.b0;

public class s0 implements g	// class@000bb1
{
    public final p0 b;

    public void s0(p0 p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s0.class, "1")) {
          return;
       }
       s0 tb = this.b;
       t$a uoa = new t$a(tb.getActivity());
       uoa.W0(R.string.arg_RES_7f102323);
       uoa.Q0(R.string.cancel);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.t0(new b1(p0));
       uoa.u0(new a1(this, p0));
       t$a uoa1 = f.e(uoa);
       tb.P8(uoa1.Y(PopupInterface.a));
       return;
    }
}
