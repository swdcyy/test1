package com.yxcorp.plugin.setting.entries.holder.s$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.s$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.s;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.m0;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.r;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class s$a$a implements View$OnClickListener	// class@000889
{
    public final s$a b;

    public void s$a$a(s$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a$a.class, "1")) {
          return;
       }
       s$a$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, s$a.class, "3")) {
          d uod = new d(tb.q.a);
          uod.b1(KwaiDialogOption.d);
          uod.V0(true);
          uod.W0(R.string.arg_RES_7f104dd6);
          uod.y0(R.string.arg_RES_7f100d0d);
          uod.s0(new m0(tb));
          uod.B0(R.drawable.arg_RES_7f08229a);
          uod = b.c(uod);
          uod.L(new r(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.e(this.b.q.a, "POKE_BUCTION", Boolean.valueOf(QCurrentUser.ME.isAllowMissU()));
       return;
    }
}
