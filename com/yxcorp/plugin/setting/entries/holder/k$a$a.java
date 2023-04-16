package com.yxcorp.plugin.setting.entries.holder.k$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.k$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.k;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.yxcorp.plugin.setting.helper.j;
import lnc.a1;
import java.lang.CharSequence;
import kgd.t;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.j;
import kgd.u;
import u07.a;
import com.yxcorp.plugin.setting.entries.holder.l;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class k$a$a implements View$OnClickListener	// class@00086b
{
    public final k$a b;

    public void k$a$a(k$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a$a.class, "1")) {
          return;
       }
       k$a$a tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k$a uoa = k$a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, uoa, "3")) {
          d uod = new d(tb.s.a);
          uod.b1(KwaiDialogOption.d);
          uod.B0(R.drawable.arg_RES_7f080bd1);
          uod.W0(R.string.arg_RES_7f1012b1);
          String str = PatchProxy.apply(objArray, tb, uoa, "7");
          if (str != patchProxyRe) {
          }else if(j.g("personalise_reco")){
             str = a1.p(R.string.arg_RES_7f100d0f);
          }else {
             str = a1.p(R.string.arg_RES_7f104d10);
          }
          uod.z0(str);
          String str1 = PatchProxy.apply(objArray, tb, uoa, "6");
          if (str1 != patchProxyRe) {
          }else if(j.g("personalise_reco")){
             str1 = a1.p(R.string.arg_RES_7f100825);
          }else {
             str1 = a1.p(R.string.arg_RES_7f103af1);
          }
          uod.T0(str1);
          uod.Q0(R.string.arg_RES_7f104caf);
          uod.s0(new t(tb));
          uod.u0(new j(tb));
          uod.t0(new u(tb));
          t$a uoa1 = a.c(uod);
          uoa1.V0(true);
          uoa1.L(new l(tb, R.layout.arg_RES_7f0d11af));
          uoa1.X();
       }
       k$a s = this.b.s;
       b.e(s.a, "PERSONAL_RECOM_PRIVACY", Boolean.valueOf(j.g("personalise_reco")));
       return;
    }
}
