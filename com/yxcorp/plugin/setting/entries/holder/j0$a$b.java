package com.yxcorp.plugin.setting.entries.holder.j0$a$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.j0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.j0;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.h1;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.l0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class j0$a$b implements View$OnClickListener	// class@000867
{
    public final j0$a b;

    public void j0$a$b(j0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$a$b.class, "1")) {
          return;
       }
       j0$a$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, j0$a.class, "3")) {
          d uod = new d(tb.r.a);
          uod.b1(KwaiDialogOption.d);
          uod.V0(true);
          uod.W0(R.string.arg_RES_7f1000bb);
          uod.y0(R.string.arg_RES_7f1000ba);
          uod.s0(new h1(tb));
          uod.B0(R.drawable.arg_RES_7f082288);
          uod = b.c(uod);
          uod.L(new l0(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.e(this.b.r.a, "PERSONAL_RECOM_ADVERTISE", Boolean.valueOf(j.g("programmatic_ad")));
       return;
    }
}
