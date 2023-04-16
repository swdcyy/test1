package com.kuaishou.live.gzone.barrage.BarrageView$b;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.barrage.BarrageView;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.animation.ObjectAnimator;

public class BarrageView$b implements View$OnLayoutChangeListener	// class@001c24
{
    public final BarrageView$e b;
    public final BarrageView c;

    public void BarrageView$b(BarrageView p0,BarrageView$e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(BarrageView$b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, BarrageView$b.class, "1")) {
             return;
          }
       }
       p0.removeOnLayoutChangeListener(this);
       BarrageView$b tb = this.b;
       BarrageView$b tc = this.c;
       BarrageView$e a = tb.a;
       p3 = tc.q * a;
       tb.c.setTranslationY((float)(p3 + (tc.o * (a + 1))));
       tb = this.b;
       tb.e.setDuration((long)((float)(this.c.j + tb.c.getWidth()) / this.c.e(this.b.d)));
       tb = this.b;
       float[] uofloatArray = new float[]{(float)this.c.j,(float)((- tb.c.getWidth()) - this.c.n[0])};
       tb.e.setFloatValues(uofloatArray);
       this.b.c.setVisibility(0);
       this.b.e.start();
       tb.b = false;
       return;
    }
}
