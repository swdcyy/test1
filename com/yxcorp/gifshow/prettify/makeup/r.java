package com.yxcorp.gifshow.prettify.makeup.r;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.prettify.makeup.v;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import f1c.d;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import f1c.f0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import u07.t$a;
import android.app.Activity;
import u07.f;
import com.yxcorp.gifshow.prettify.makeup.s;
import u07.u;
import f1c.p0;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class r implements View$OnClickListener	// class@001195
{
    public final v b;

    public void r(v p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       r tb = this.b;
       if (tb.f.a() != null && tb.f.a().getActivity() != null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, objArray, f0.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RESET_MAKEUP_POPUP";
             u1.u0(4, uElementPack, objArray);
          }
          t$a uoa = new t$a(tb.f.a().getActivity());
          uoa.y0(R.string.arg_RES_7f103192);
          uoa = f.e(uoa);
          uoa.S0(R.string.arg_RES_7f103191);
          uoa.Q0(R.string.arg_RES_7f103190);
          uoa.t0(s.b);
          uoa.u0(new p0(tb));
          uoa.v(true);
          uoa.X();
       }
       return;
    }
}
