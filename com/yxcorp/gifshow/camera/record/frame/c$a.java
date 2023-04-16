package com.yxcorp.gifshow.camera.record.frame.c$a;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.camera.record.frame.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public class c$a implements View$OnLayoutChangeListener	// class@000dd9
{
    public final View b;
    public final c c;

    public void c$a(c p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(c$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, c$a.class, "1")) {
             return;
          }
       }
       this.b.removeOnLayoutChangeListener(this);
       int i = g.f(this.c.e);
       if (this.c.M != i) {
          Object[] objArray1 = new Object[0];
          a.D().s("FrameBaseController", "screenMode change, mScreenRatioMode: "+this.c.M+" , screenMode: "+i, objArray1);
          this.c.E2();
       }
       p1.M = i;
       return;
    }
}
