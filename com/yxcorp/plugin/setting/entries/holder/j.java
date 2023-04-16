package com.yxcorp.plugin.setting.entries.holder.j;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.k$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.k;
import com.yxcorp.plugin.setting.helper.j;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.v;
import kgd.x;
import kgd.w;
import u07.a;
import com.kwai.library.widget.popup.common.c$b;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import k2b.e0;
import sgd.b;

public final class j implements u	// class@00086a
{
    public final k$a b;

    public void j(k$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       j tb = this.b;
       Objects.requireNonNull(tb);
       k$a uoa = k$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoa, "4")) {
       }else {
          String str = "personalise_reco";
          if (j.g(str)) {
             if (!PatchProxy.applyVoid(objArray, tb, uoa, "5")) {
                d uod = new d(tb.s.a);
                uod.b1(KwaiDialogOption.d);
                uod.B0(R.drawable.arg_RES_7f080bd1);
                uod.W0(R.string.arg_RES_7f1015ab);
                uod.y0(R.string.arg_RES_7f100a12);
                uod.S0(R.string.arg_RES_7f100608);
                uod.Q0(R.string.arg_RES_7f104caf);
                uod.s0(new v(tb));
                uod.w0(true);
                uod.u0(new x(tb));
                uod.t0(new w(tb));
                t$a uoa1 = a.c(uod);
                uoa1.V0(true);
                uoa1.B(0);
                uoa1.L(new b(R.layout.arg_RES_7f0d11af));
                uoa1.X();
             }
          }else {
             tb.s.e.m(tb.p, objArray, str, true);
          }
          b.k(tb.s.a, "PERSONAL_RECOM_PRIVACY", 0);
       }
       return;
    }
}
