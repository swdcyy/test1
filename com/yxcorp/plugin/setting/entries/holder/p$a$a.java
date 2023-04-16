package com.yxcorp.plugin.setting.entries.holder.p$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.p$a;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.p;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import java.lang.CharSequence;
import kgd.j0;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.o;
import kgd.k0;
import u07.a;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class p$a$a implements View$OnClickListener	// class@000880
{
    public final p$a b;

    public void p$a$a(p$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p$a uoa = p$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a$a.class, "1")) {
          return;
       }
       d uod = new d(this.b.s.a);
       uod.b1(KwaiDialogOption.d);
       uod.B0(R.drawable.arg_RES_7f082296);
       p$a$a tb = this.b;
       Objects.requireNonNull(tb);
       String str = PatchProxy.apply(null, tb, uoa, "7");
       if (str != patchProxyRe) {
       }else if(QCurrentUser.ME.isPrivateLocation()){
          str = a1.p(R.string.arg_RES_7f1046a5);
       }else {
          str = a1.p(R.string.arg_RES_7f1016bf);
       }
       uod.X0(str);
       tb = this.b;
       Objects.requireNonNull(tb);
       str = PatchProxy.apply(null, tb, uoa, "6");
       if (str != patchProxyRe) {
       }else if(QCurrentUser.ME.isPrivateLocation()){
          str = a1.p(R.string.arg_RES_7f100d13);
       }else {
          str = a1.p(R.string.arg_RES_7f104d0d);
       }
       uod.z0(str);
       tb = this.b;
       Objects.requireNonNull(tb);
       String str1 = PatchProxy.apply(null, tb, uoa, "5");
       if (str1 != patchProxyRe) {
       }else if(QCurrentUser.ME.isPrivateLocation()){
          str1 = a1.p(R.string.arg_RES_7f1009cf);
       }else {
          str1 = a1.p(R.string.arg_RES_7f100825);
       }
       uod.T0(str1);
       uod.Q0(R.string.arg_RES_7f104caf);
       uod.s0(new j0(this));
       uod.u0(new o(this));
       uod.t0(new k0(this));
       t$a uoa1 = a.c(uod);
       uoa1.V0(true);
       uoa1.L(new b(R.layout.arg_RES_7f0d11af));
       uoa1.X();
       b.e(this.b.s.a, "LOCAL_INFORMATION", Boolean.valueOf((true ^ QCurrentUser.ME.isPrivateLocation())));
       return;
    }
}
