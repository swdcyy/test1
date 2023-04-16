package com.kuaishou.merchant.anim.KwaishopAnimationModule$d$b;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import wr3.a;
import android.view.View;

public final class KwaishopAnimationModule$d$b implements Runnable	// class@0014e1
{
    public final KwaishopAnimationModule$d b;

    public void KwaishopAnimationModule$d$b(KwaishopAnimationModule$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, KwaishopAnimationModule$d$b.class, "1")) {
          return;
       }
       KwaishopAnimationModule$d$b tb = this.b;
       d.a(0x548e73dd).Ru(tb.b, tb.d);
       PatchProxy.onMethodExit(KwaishopAnimationModule$d$b.class, "1");
       return;
    }
}
