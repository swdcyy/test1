package com.yxcorp.gifshow.homepage.presenter.g$a;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.homepage.presenter.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class g$a implements View$OnLayoutChangeListener	// class@0017c5
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(g$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, g$a.class, "1")) {
             return;
          }
       }
       if (p4 == p8 || (p4 || (p3 != p7 && p3))) {
          g$a tb = this.b;
          tb.R8(tb.r.getMeasuredWidth());
          tb = this.b;
          tb.P8(tb.r.getMeasuredWidth());
       }
       return;
    }
}
