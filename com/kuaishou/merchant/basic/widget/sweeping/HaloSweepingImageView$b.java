package com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView$b;
import java.lang.Runnable;
import com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class HaloSweepingImageView$b implements Runnable	// class@0015ff
{
    public final HaloSweepingImageView b;
    public final float c;
    public final long d;
    public final float e;

    public void HaloSweepingImageView$b(HaloSweepingImageView p0,float p1,long p2,float p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, HaloSweepingImageView$b.class, "1")) {
          return;
       }
       this.b.f(this.c, this.d, this.e);
       return;
    }
}
