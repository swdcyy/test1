package com.yxcorp.plugin.setting.entries.holder.e0$a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import android.app.Activity;
import u07.t$a;
import kgd.c1;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.g0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.setting.entries.holder.f0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import k2b.h;
import lnc.i3;
import com.yxcorp.plugin.setting.entries.holder.e0;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;

public class e0$a$a extends m	// class@00084d
{
    public final e0$a c;

    public void e0$a$a(e0$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a$a.class, "1")) {
          return;
       }
       e0$a$a tc = this.c;
       Objects.requireNonNull(tc);
       int i = 1;
       if (!PatchProxy.applyVoid(null, tc, e0$a.class, "3")) {
          d uod = new d(tc.p);
          uod.V0(i);
          uod.W0(R.string.arg_RES_7f103f7b);
          uod.y0(R.string.arg_RES_7f103f7a);
          uod.B0(R.drawable.arg_RES_7f0822a0);
          uod.s0(new c1(tc));
          uod = b.c(uod);
          uod.L(new g0(tc, R.layout.arg_RES_7f0d11ad));
          uod.Y(new f0(tc));
       }
       h oh = h.m("3312937", "PHOTO_VIEW_RECORD_BUTTON");
       i3 oi3 = i3.f();
       if (!e0.b()) {
          i = 2;
       }
       oi3.c("click_area", Integer.valueOf(i));
       oh.n(oi3.e());
       oh.i(this.c.p);
       return;
    }
}
