package com.kuaishou.live.widget.ShootMarqueeView$a;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import com.kuaishou.live.widget.ShootMarqueeView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.widget.ShootMarqueeView$a$a;
import java.lang.Runnable;
import android.widget.TextView;

public class ShootMarqueeView$a implements ShootMarqueeView$c	// class@001022
{
    public final long a;
    public final ShootMarqueeView b;

    public void ShootMarqueeView$a(ShootMarqueeView p0,long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ShootMarqueeView$a.class, "1")) {
          return;
       }
       this.b.postDelayed(new ShootMarqueeView$a$a(this), this.a);
       return;
    }
}
