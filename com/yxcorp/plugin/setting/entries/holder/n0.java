package com.yxcorp.plugin.setting.entries.holder.n0;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.o0$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.o0;
import android.widget.TextView;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import k2b.e0;
import sgd.b;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.r1;
import kgd.t1;
import kgd.s1;
import u07.a;
import com.kwai.library.widget.popup.common.c$b;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public final class n0 implements u	// class@00087a
{
    public final o0$a b;

    public void n0(o0$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       o0$a uoa = o0$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoa, "4")) {
       }else if(QCurrentUser.ME.isPrivateUser()){
          tb.r.e.o(tb.p, "privacy_user", false, null, true);
          b.k(tb.r.a, "PRIVATE_USER", 0);
       }else if(PatchProxy.applyVoid(objArray, tb, uoa, "5")){
          d uod = new d(tb.r.a);
          uod.b1(KwaiDialogOption.d);
          uod.B0(R.drawable.arg_RES_7f082290);
          uod.W0(R.string.arg_RES_7f101cbe);
          uod.y0(R.string.arg_RES_7f100d12);
          uod.S0(R.string.arg_RES_7f103668);
          uod.Q0(R.string.arg_RES_7f104caf);
          uod.s0(new r1(tb));
          uod.w0(true);
          uod.u0(new t1(tb));
          uod.t0(new s1(tb));
          t$a uoa1 = a.c(uod);
          uoa1.V0(true);
          uoa1.B(0);
          uoa1.L(new b(R.layout.arg_RES_7f0d11af));
          uoa1.X();
       }
       b.k(tb.r.a, "PRIVATE_USER", 10);
       return;
    }
}
