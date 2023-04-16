package com.yxcorp.plugin.setting.entries.holder.g$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;
import java.util.Objects;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.o;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.f;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public class g$a$a implements View$OnClickListener	// class@000853
{
    public final g$a b;

    public void g$a$a(g$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       g$a$a tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$a.class, "1")) {
          return;
       }
       if (this.b.r.b()) {
          tb = this.b;
          tb.R8(tb.r.a, false);
          b.e(this.b.r.a, "RECOMMENT_TO_PYMK", Boolean.valueOf(QCurrentUser.ME.isRecommendToOthers()));
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          int i = 1;
          if (!PatchProxy.applyVoid(null, tb, g$a.class, "3")) {
             d uod = new d(tb.r.a);
             uod.b1(KwaiDialogOption.d);
             uod.V0(i);
             uod.W0(R.string.arg_RES_7f1041a3);
             uod.y0(R.string.arg_RES_7f100d0b);
             uod.s0(new o(tb));
             uod.B0(R.drawable.arg_RES_7f0805f6);
             uod = b.c(uod);
             uod.L(new f(tb, R.layout.arg_RES_7f0d11ad));
             uod.X();
          }
          b.e(this.b.r.a, "RECOMMENT_TO_CONTACT_FRIEND", Boolean.valueOf((QCurrentUser.ME.isNotRecommendToContacts() ^ i)));
       }
       return;
    }
}
