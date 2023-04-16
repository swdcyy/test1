package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$c;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup;
import th0.f;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$c$a;
import java.lang.Runnable;

public final class LuckDrawDialog$c implements DialogInterface$OnShowListener	// class@001b11
{
    public final LuckDrawDialog b;

    public void LuckDrawDialog$c(LuckDrawDialog p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LuckDrawDialog$c.class, "1")) {
          return;
       }
       LuckDrawDialog z = this.b.z;
       if (z == null) {
          a.S("mRootView");
       }
       z.animate().withLayer().alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).setInterpolator(new f(0x3f800000, 0x3f800000)).withStartAction(new LuckDrawDialog$c$a(z)).start();
       PatchProxy.onMethodExit(LuckDrawDialog$c.class, "1");
       return;
    }
}
