package com.yxcorp.plugin.setting.entries.holder.o;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.p$a$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.yxcorp.plugin.setting.entries.holder.p$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.p;
import android.widget.TextView;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import k2b.e0;
import sgd.b;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.g0;
import kgd.i0;
import kgd.h0;
import u07.a;
import com.kwai.library.widget.popup.common.c$b;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public final class o implements u	// class@00087f
{
    public final p$a$a b;

    public void o(p$a$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       p$a$a b = this.b.b;
       Objects.requireNonNull(b);
       p$a uoa = p$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uoa, "3")) {
       }else if(QCurrentUser.ME.isPrivateLocation()){
          b.s.e.o(b.p, "privacy_location", false, null, true);
          b.k(b.s.a, "LOCAL_INFORMATION", 0);
       }else if(PatchProxy.applyVoid(objArray, b, uoa, "4")){
          d uod = new d(b.s.a);
          uod.b1(KwaiDialogOption.d);
          uod.B0(R.drawable.common_emptystate_noposition);
          uod.W0(R.string.arg_RES_7f101cbe);
          uod.y0(R.string.arg_RES_7f100d12);
          uod.S0(R.string.arg_RES_7f1014ea);
          uod.s0(new g0(b));
          uod.Q0(R.string.arg_RES_7f104caf);
          uod.w0(true);
          uod.u0(new i0(b));
          uod.t0(new h0(b));
          t$a uoa1 = a.c(uod);
          uoa1.V0(true);
          uoa1.B(0);
          uoa1.L(new b(R.layout.arg_RES_7f0d11af));
          uoa1.X();
       }
       b.k(b.s.a, "LOCAL_INFORMATION", 10);
       return;
    }
}
