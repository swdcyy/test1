package com.kuaishou.live.common.core.component.pendant.pendantgroup.i$e;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class i$e implements View$OnLayoutChangeListener	// class@001723
{
    public int b;
    public int c;
    public final i d;

    public void i$e(i p0){
       this.d = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(i$e.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, i$e.class, "1")) {
             return;
          }
       }
       if (p0.getVisibility()) {
          return;
       }else {
          i$e td = this.d;
          td = td.e2(td.e, p0.getId());
          int height = p0.getHeight();
          if (td != this.b || height != this.c) {
             this.b = td;
             this.c = height;
             this.d.q4(100, "onLayoutChange");
          }
          return;
       }
    }
}
