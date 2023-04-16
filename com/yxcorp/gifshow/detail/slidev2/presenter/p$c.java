package com.yxcorp.gifshow.detail.slidev2.presenter.p$c;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import xe5.r;
import xe5.s;
import xe5.p;

public class p$c implements View$OnLayoutChangeListener	// class@0019ce
{
    public final p b;

    public void p$c(p p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(p$c.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, p$c.class, "1")) {
             return;
          }
       }
       p$c tb = this.b;
       if (tb.J == null) {
          return;
       }else {
          p2 = p0.getWidth();
          int height = p0.getHeight();
          Objects.requireNonNull(tb);
          p op = p.class;
          if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p2), Integer.valueOf(height), tb, op, "9")) {
             r or = tb.J.a();
             if (or.k != p2 || or.l != height) {
                or.k = p2;
                p2.l = height;
                p j = tb.J;
                j.b(j.a().h, tb.J.a().i);
             }
          }
          return;
       }
    }
}
