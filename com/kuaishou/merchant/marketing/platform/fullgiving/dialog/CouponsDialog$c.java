package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$c;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup;
import th0.f;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$c$a;
import java.lang.Runnable;

public final class CouponsDialog$c implements DialogInterface$OnShowListener	// class@001b0a
{
    public final CouponsDialog b;

    public void CouponsDialog$c(CouponsDialog p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CouponsDialog$c.class, "1")) {
          return;
       }
       CouponsDialog t = this.b.t;
       if (t != null) {
          t.animate().withLayer().alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).setDuration(3000).setInterpolator(new f(0x3f800000, 0x3f800000)).withStartAction(new CouponsDialog$c$a(t)).start();
       }
       PatchProxy.onMethodExit(CouponsDialog$c.class, "1");
       return;
    }
}
