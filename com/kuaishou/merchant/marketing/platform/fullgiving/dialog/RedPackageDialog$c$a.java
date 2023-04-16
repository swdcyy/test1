package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$c$a;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RedPackageDialog$c$a implements Runnable	// class@001b1a
{
    public final ViewGroup b;

    public void RedPackageDialog$c$a(ViewGroup p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, RedPackageDialog$c$a.class, "1")) {
          return;
       }
       this.b.setScaleX(0);
       this.b.setScaleY(0);
       this.b.setAlpha(0);
       PatchProxy.onMethodExit(RedPackageDialog$c$a.class, "1");
       return;
    }
}
