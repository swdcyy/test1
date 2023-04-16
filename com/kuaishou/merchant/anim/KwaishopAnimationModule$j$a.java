package com.kuaishou.merchant.anim.KwaishopAnimationModule$j$a;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$j;
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

public final class KwaishopAnimationModule$j$a implements Runnable	// class@0014ed
{
    public final KwaishopAnimationModule$j b;

    public void KwaishopAnimationModule$j$a(KwaishopAnimationModule$j p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$j$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$j b = this.b.b;
       if (b != null) {
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             d.a(0x548e73dd).qm((int)this.b.c, (int)iterator.next().doubleValue());
          }
       }
       return;
    }
}
