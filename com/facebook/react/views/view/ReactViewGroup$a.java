package com.facebook.react.views.view.ReactViewGroup$a;
import android.view.View$OnLayoutChangeListener;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class ReactViewGroup$a implements View$OnLayoutChangeListener	// class@00143a
{
    public final ReactViewGroup b;

    public void ReactViewGroup$a(ReactViewGroup p0){
       super();
       this.b = p0;
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(ReactViewGroup$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, ReactViewGroup$a.class, "1")) {
             return;
          }
       }
       if (this.b.getRemoveClippedSubviews()) {
          this.b.updateSubviewClipStatus(p0);
       }
       return;
    }
}