package com.yxcorp.gifshow.dialog.kem.h;
import x9a.d0;
import com.yxcorp.gifshow.dialog.kem.h$a;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import x9a.k0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import wkd.b;
import te6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.dialog.kem.h$b;
import kzc.d;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import com.kwai.library.widget.popup.common.c$b;
import u07.t$a;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.dialog.kem.h$c;
import com.yxcorp.gifshow.dialog.kem.h$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class h extends d0	// class@001abf
{
    public final b d;
    public static final h$a e;

    static {
       h.e = new h$a(null);
    }
    public void h(Activity p0,KemCommonVideoDialogResponse p1,k0 p2){
       a.p(p0, "activity");
       a.p(p1, "dialogInfo");
       a.p(p2, "param");
       super(p0, p1, p2);
       this.d = b.a(-1427269270);
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       if (this.c()) {
          KemCommonVideoDialogResponse kemCommonVid = this.b();
          a.o(kemCommonVid, "data");
          h$b uob = new h$b(this, kemCommonVid);
          d uod = new d(this.a());
          uod.Z0(72);
          uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
          uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
          uod.L(uob);
          uod.A = new h$c(this);
          uod.Y(new h$d(this));
       }
       return;
    }
}
