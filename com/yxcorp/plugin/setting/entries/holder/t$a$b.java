package com.yxcorp.plugin.setting.entries.holder.t$a$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.t$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.t;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.o0;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.v;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class t$a$b implements View$OnClickListener	// class@000890
{
    public final t$a b;

    public void t$a$b(t$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a$b.class, "1")) {
          return;
       }
       t$a$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, t$a.class, "3")) {
          d uod = new d(tb.r.a);
          uod.b1(KwaiDialogOption.d);
          uod.W0(R.string.arg_RES_7f104a90);
          uod.y0(R.string.arg_RES_7f100d0c);
          uod.B0(R.drawable.arg_RES_7f082299);
          uod.s0(new o0(tb));
          uod = b.c(uod);
          uod.L(new v(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.e(this.b.r.a, "FINDME_BY_NUMBER", Boolean.valueOf((QCurrentUser.ME.isAllowFindByMobilee() ^ 0x01)));
       return;
    }
}
