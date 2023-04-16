package com.yxcorp.plugin.setting.entries.holder.o0$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.o0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.o0;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import java.lang.CharSequence;
import kgd.p1;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.n0;
import kgd.q1;
import u07.a;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class o0$a$a implements View$OnClickListener	// class@00087c
{
    public final o0$a b;

    public void o0$a$a(o0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$a$a.class, "1")) {
          return;
       }
       o0$a$a tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o0$a uoa = o0$a.class;
       if (!PatchProxy.applyVoid(null, tb, uoa, "3")) {
          d uod = new d(tb.r.a);
          uod.b1(KwaiDialogOption.d);
          uod.B0(R.drawable.arg_RES_7f080605);
          String str = PatchProxy.apply(null, tb, uoa, "7");
          if (str != patchProxyRe) {
          }else if(QCurrentUser.ME.isPrivateUser()){
             str = a1.p(R.string.arg_RES_7f100503);
          }else {
             str = a1.p(R.string.arg_RES_7f1016be);
          }
          uod.X0(str);
          str = PatchProxy.apply(null, tb, uoa, "8");
          if (str != patchProxyRe) {
          }else if(QCurrentUser.ME.isPrivateUser()){
             str = a1.p(R.string.arg_RES_7f1046b1);
          }else {
             str = a1.p(R.string.arg_RES_7f104d11);
          }
          uod.z0(str);
          String str1 = PatchProxy.apply(null, tb, uoa, "6");
          if (str1 != patchProxyRe) {
          }else if(QCurrentUser.ME.isPrivateUser()){
             str1 = a1.p(R.string.arg_RES_7f1009cf);
          }else {
             str1 = a1.p(R.string.arg_RES_7f100825);
          }
          uod.T0(str1);
          uod.Q0(R.string.arg_RES_7f104caf);
          uod.s0(new p1(tb));
          uod.u0(new n0(tb));
          uod.t0(new q1(tb));
          t$a uoa1 = a.c(uod);
          uoa1.V0(true);
          uoa1.L(new b(R.layout.arg_RES_7f0d11af));
          uoa1.X();
       }
       b.e(this.b.r.a, "PRIVATE_USER", Boolean.valueOf(QCurrentUser.ME.isPrivateUser()));
       return;
    }
}
