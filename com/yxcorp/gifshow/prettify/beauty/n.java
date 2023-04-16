package com.yxcorp.gifshow.prettify.beauty.n;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.prettify.beauty.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup;
import q0c.q0;
import java.lang.Runnable;
import ekd.k1;

public class n implements View$OnLayoutChangeListener	// class@001114
{
    public final m b;

    public void n(m p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(n.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, n.class, "1")) {
             return;
          }
       }
       this.b.q.removeOnLayoutChangeListener(this);
       k1.r(new q0(this), 0);
       return;
    }
}
