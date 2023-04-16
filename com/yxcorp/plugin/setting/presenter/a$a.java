package com.yxcorp.plugin.setting.presenter.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import tgd.a;
import u07.u;
import u07.b;
import tgd.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import pgd.y;
import java.lang.Integer;
import k2b.e0;
import sgd.b;

public class a$a implements View$OnClickListener	// class@0008d4
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 1;
       if (!PatchProxy.applyVoid(null, tb, a.class, "5")) {
          d uod = new d(tb.s);
          uod.b1(KwaiDialogOption.d);
          uod.V0(i);
          uod.W0(R.string.arg_RES_7f10406d);
          uod.y0(R.string.arg_RES_7f104d0b);
          uod.s0(new a(tb));
          uod.B0(R.drawable.arg_RES_7f0805e1);
          uod = b.c(uod);
          uod.L(new c(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.b(this.b.s, "PUSH_MYCOMMENT_TO_OTHERS", Integer.valueOf(y.b(f.k(QCurrentUser.ME))), (i ^ QCurrentUser.ME.isAllowPushMyCommentsToOther()));
       return;
    }
}
