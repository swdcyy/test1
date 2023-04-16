package com.kuaishou.live.gzone.barrage.c;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.barrage.BarrageView;
import com.kuaishou.live.gzone.barrage.BarrageView$g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import android.widget.RelativeLayout;
import android.animation.ObjectAnimator;

public class c implements View$OnLayoutChangeListener	// class@001c30
{
    public final BarrageView$g b;
    public final BarrageView c;

    public void c(BarrageView p0,BarrageView$g p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(c.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
             return;
          }
       }
       p0.removeOnLayoutChangeListener(this);
       c tb = this.b;
       c tc = this.c;
       BarrageView$e a = tb.a;
       p3 = tc.q * a;
       tb.g.setTranslationY((float)(p3 + (tc.o * (a + 1))));
       tb = this.b;
       tb.e.setDuration((long)((float)(this.c.j + tb.g.getWidth()) / this.c.e(this.b.d)));
       tb = this.b;
       float[] uofloatArray = new float[]{(float)this.c.j,(float)(- tb.g.getWidth()) * 0x3f8ccccd};
       tb.e.setFloatValues(uofloatArray);
       this.b.e.start();
       tb.b = false;
       return;
    }
}
