package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$c;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a implements View$OnClickListener	// class@001996
{
    public final int b;
    public final SlidingTabStrip c;
    public final SlidingTabStrip$c d;

    public void a(SlidingTabStrip$c p0,int p1,SlidingTabStrip p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.b == this.c.h) {
          return;
       }
       SlidingTabStrip$c h = this.d.h;
       if (h != null) {
          h.onClick(p0);
          if (this.d.g != null) {
             return;
          }
       }
       if (this.d.e != null) {
          return;
       }else {
          this.c.q(this.b, true);
          return;
       }
    }
}
