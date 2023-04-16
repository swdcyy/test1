package com.kuaishou.merchant.anim.KwaishopAnimationModule$c$a;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$c;
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

public final class KwaishopAnimationModule$c$a implements Runnable	// class@0014de
{
    public final KwaishopAnimationModule$c b;

    public void KwaishopAnimationModule$c$a(KwaishopAnimationModule$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$c$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$c b = this.b.b;
       if (b != null) {
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             d.a(0x548e73dd).p5((int)this.b.c, (int)iterator.next().doubleValue());
          }
       }
       return;
    }
}
