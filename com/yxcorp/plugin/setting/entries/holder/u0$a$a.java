package com.yxcorp.plugin.setting.entries.holder.u0$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.u0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.u0;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.z1;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.t0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class u0$a$a implements View$OnClickListener	// class@000894
{
    public final u0$a b;

    public void u0$a$a(u0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0$a$a.class, "1")) {
          return;
       }
       u0$a$a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 1;
       if (!PatchProxy.applyVoid(null, tb, u0$a.class, "3")) {
          d uod = new d(tb.q.a);
          uod.b1(KwaiDialogOption.d);
          uod.V0(i);
          uod.W0(R.string.arg_RES_7f103bc5);
          uod.y0(R.string.arg_RES_7f100d0e);
          uod.B0(R.drawable.arg_RES_7f08228c);
          uod.s0(new z1(tb));
          uod = b.c(uod);
          uod.L(new t0(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.e(this.b.q.a, "COMMON_FOLLOW", Boolean.valueOf((QCurrentUser.ME.isCloseSameFollow() ^ i)));
       return;
    }
}
