package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$a;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import re3.j;
import fe3.a;
import mrd.a;
import kotlin.jvm.internal.a;

public final class RenderAreaView$a implements View$OnLayoutChangeListener	// class@000c11
{
    public final RenderAreaView b;

    public void RenderAreaView$a(RenderAreaView p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       RenderAreaView$a uoa = this;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       int i3 = p4;
       if (PatchProxy.isSupport(RenderAreaView$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, RenderAreaView$a.class, "1")) {
             return;
          }
       }
       e.d(e.d, "LiveStage", "[Render] "+"onLayoutChange "+i+", "+i1+"  "+i2+", "+i3, null, 4, null);
       RenderAreaView g = uoa.b.G;
       if (g != null && (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4), g, j.class, "4"))) {
          a uoa1 = new a((i2 - i), (i3 - i1));
          if (a.g(g.d.i(), uoa1) ^ 1) {
             g.d.onNext(uoa1);
          }
       }
       return;
    }
}
