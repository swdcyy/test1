package com.kuaishou.merchant.home2.dynamic.HomeTabView$a;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.merchant.home2.dynamic.HomeTabView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class HomeTabView$a implements View$OnLayoutChangeListener	// class@001702
{
    public final HomeTabView b;

    public void HomeTabView$a(HomeTabView p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(HomeTabView$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, HomeTabView$a.class, "1")) {
             return;
          }
       }
       this.b.a();
       return;
    }
}