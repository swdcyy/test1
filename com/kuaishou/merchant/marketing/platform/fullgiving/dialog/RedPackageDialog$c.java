package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$c;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup;
import th0.f;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$c$a;
import java.lang.Runnable;

public final class RedPackageDialog$c implements DialogInterface$OnShowListener	// class@001b1b
{
    public final RedPackageDialog b;

    public void RedPackageDialog$c(RedPackageDialog p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RedPackageDialog$c.class, "1")) {
          return;
       }
       RedPackageDialog t = this.b.t;
       if (t != null) {
          t.animate().withLayer().alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).setDuration(3000).setInterpolator(new f(0x3f800000, 0x3f800000)).withStartAction(new RedPackageDialog$c$a(t)).start();
       }
       PatchProxy.onMethodExit(RedPackageDialog$c.class, "1");
       return;
    }
}
