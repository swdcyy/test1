package com.yxcorp.gifshow.camera.record.frame.c$b;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class c$b implements View$OnLayoutChangeListener	// class@000dda
{
    public final int b;
    public final c c;

    public void c$b(c p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(c$b.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, c$b.class, "1")) {
             return;
          }
       }
       this.c.q.removeOnLayoutChangeListener(this);
       this.c.w2(this.b);
       return;
    }
}
