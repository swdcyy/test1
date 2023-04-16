package com.kuaishou.merchant.anim.KwaishopAnimationModule$g$a;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.Double;
import android.view.View;
import tkd.b;
import tkd.d;
import wr3.a;
import java.lang.Integer;

public final class KwaishopAnimationModule$g$a implements Runnable	// class@0014e8
{
    public final KwaishopAnimationModule$g b;

    public void KwaishopAnimationModule$g$a(KwaishopAnimationModule$g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       double d;
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$g$a.class, "1")) {
          return;
       }
       KwaishopAnimationModule$g c = this.b.c;
       if (c != null) {
          Double uDouble = c.get("x");
          d = 0x3f000000;
          float f = (uDouble != null)? (float)uDouble.doubleValue(): 0x3f000000;
          Double uDouble1 = c.get("y");
          if (uDouble1 != null) {
             d = (float)uDouble1.doubleValue();
          }
          this.b.b.setPivotX(f);
          this.b.b.setPivotY(d);
       }
       KwaishopAnimationModule$g$a tb = this.b;
       d.a(0x548e73dd).dg(tb.b, tb.d, tb.e, tb.f, tb.g.intValue(), this.b.h);
       return;
    }
}
