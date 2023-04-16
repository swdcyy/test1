package com.kuaishou.live.widget.ShootMarqueeView$b;
import java.lang.Runnable;
import com.kuaishou.live.widget.ShootMarqueeView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.widget.ShootMarqueeView$c;

public class ShootMarqueeView$b implements Runnable	// class@001023
{
    public final int b;
    public final ShootMarqueeView c;

    public void ShootMarqueeView$b(ShootMarqueeView p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ShootMarqueeView$b.class, "1")) {
          return;
       }
       if (!this.c.v(this.b)) {
          ShootMarqueeView i = this.c.i;
          if (i != null) {
             i.a();
          }
       }
       return;
    }
}
