package com.kuaishou.merchant.anim.KwaishopAnimationModule$d$a;
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

public final class KwaishopAnimationModule$d$a implements Runnable	// class@0014e0
{
    public final KwaishopAnimationModule$d b;

    public void KwaishopAnimationModule$d$a(KwaishopAnimationModule$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, KwaishopAnimationModule$d$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$d$a tb = this.b;
       d.a(0x548e73dd).xZ(tb.b, tb.d, tb.c);
       PatchProxy.onMethodExit(KwaishopAnimationModule$d$a.class, "1");
       return;
    }
}
