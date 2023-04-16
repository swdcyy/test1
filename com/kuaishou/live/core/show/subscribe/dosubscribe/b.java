package com.kuaishou.live.core.show.subscribe.dosubscribe.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import lnc.a1;
import java.lang.CharSequence;
import u07.t$a;
import rk2.o;
import u07.u;
import u07.f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class b	// class@0010df
{

    public void b(){
       super();
    }
    public static void a(Activity p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       d uod = new d(p0);
       uod.X0(a1.p(R.string.arg_RES_7f102d62));
       uod.S0(R.string.arg_RES_7f102d19);
       uod.Q0(R.string.arg_RES_7f102bbf);
       uod.t0(new o(p1));
       t$a uoa = f.e(uod);
       uoa.w0(true);
       uoa.v(true);
       uoa.Y(PopupInterface.a);
       return;
    }
}
