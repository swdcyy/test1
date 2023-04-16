package com.kuaishou.merchant.anim.KwaishopAnimationModule$e$a$a;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import wr3.a;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e;
import android.view.View;

public final class KwaishopAnimationModule$e$a$a implements Runnable	// class@0014e3
{
    public final KwaishopAnimationModule$e$a b;

    public void KwaishopAnimationModule$e$a$a(KwaishopAnimationModule$e$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, KwaishopAnimationModule$e$a$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$e$a$a tb = this.b;
       KwaishopAnimationModule$e$a b = tb.b;
       d.a(0x548e73dd).xZ(tb.c, b.d, b.c);
       PatchProxy.onMethodExit(KwaishopAnimationModule$e$a$a.class, "1");
       return;
    }
}
