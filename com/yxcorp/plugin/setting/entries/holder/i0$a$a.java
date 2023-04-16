package com.yxcorp.plugin.setting.entries.holder.i0$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.i0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import com.yxcorp.plugin.setting.entries.holder.i0;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.f1;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.h0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import k2b.e0;
import sgd.b;
import java.lang.Boolean;

public class i0$a$a implements View$OnClickListener	// class@000862
{
    public final i0$a b;

    public void i0$a$a(i0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       i0$a q;
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a$a.class, "1")) {
          return;
       }
       i0$a$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, i0$a.class, "3")) {
          d uod = new d(tb.q.a);
          uod.b1(KwaiDialogOption.d);
          uod.V0(true);
          uod.W0(R.string.arg_RES_7f1046c8);
          uod.y0(R.string.arg_RES_7f1046c9);
          uod.B0(R.drawable.arg_RES_7f080be4);
          uod.s0(new f1(tb));
          uod = b.c(uod);
          uod.L(new h0(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
          q = tb.q;
          i0 a = q.a;
          String str = (q.b())? "open": "close";
          b.h(a, "CLIPBOARD_READ", str);
       }
       q = this.b.q;
       b.e(q.a, "CLIPBOARD_READ", Boolean.valueOf(q.b()));
       return;
    }
}
