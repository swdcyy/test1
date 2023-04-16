package com.kuaishou.merchant.anim.KwaishopAnimationModule$b$a;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import tkd.b;
import tkd.d;
import wr3.a;

public final class KwaishopAnimationModule$b$a implements Runnable	// class@0014dc
{
    public final KwaishopAnimationModule$b b;

    public void KwaishopAnimationModule$b$a(KwaishopAnimationModule$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$b$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$b b = this.b.b;
       if (b != null) {
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             d.a(0x548e73dd).Qi((int)this.b.c, (int)iterator.next().doubleValue());
          }
       }
       return;
    }
}
