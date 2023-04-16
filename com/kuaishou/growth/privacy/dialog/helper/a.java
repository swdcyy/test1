package com.kuaishou.growth.privacy.dialog.helper.a;
import erd.g;
import com.kuaishou.growth.privacy.dialog.helper.e;
import android.app.Activity;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import u07.t$a;
import wf0.a;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class a implements g	// class@00070f
{
    public final e b;
    public final Activity c;

    public void a(e p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue() || (tb.a == null && !PatchProxy.applyVoidOneRefs(tc, tb, e.class, "6"))) {
          tb.a = true;
          p0 = new d(tc);
          p0.W0(R.string.arg_RES_7f1039bf);
          p0.y0(R.string.arg_RES_7f1039bd);
          p0.S0(R.string.arg_RES_7f1039be);
          p0.Q0(R.string.arg_RES_7f1039bc);
          p0.t0(new a(tb, tc));
          p0.L(new PopupInterface$g(R.layout.arg_RES_7f0d02f0));
          p0.z(false);
          p0.A(false);
          p0.Y(new d(tb, tc));
       }
    label_0060 :
       return;
    }
}
