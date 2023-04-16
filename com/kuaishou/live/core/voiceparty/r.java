package com.kuaishou.live.core.voiceparty.r;
import fs2.a;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import android.app.Activity;
import dj2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import dj2.a;
import t02.a0;
import u07.u;
import dj2.b;
import com.kwai.library.widget.popup.common.c;

public final class r implements a	// class@0018f9
{
    public final s a;

    public void r(s p0){
       this.a = p0;
    }
    public final void a(Activity p0){
       s r = this.a.R;
       if (PatchProxy.applyVoidTwoRefs(r, p0, null, c.class, "1")) {
       }else {
          t$a uoa = new t$a(p0);
          uoa.y0(R.string.arg_RES_7f10381c);
          uoa.Q0(R.string.arg_RES_7f1012a9);
          uoa.S0(R.string.arg_RES_7f100606);
          uoa.z(false);
          uoa.A(false);
          t$a uoa1 = f.e(uoa);
          uoa1.u0(new a(r));
          uoa1.t0(b.b);
          uoa1.v(true);
          uoa1.k().Z();
       }
       return;
    }
}
