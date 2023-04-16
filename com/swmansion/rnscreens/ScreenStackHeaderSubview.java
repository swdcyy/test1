package com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import com.swmansion.rnscreens.ScreenStackHeaderSubview$Type;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;

public class ScreenStackHeaderSubview extends ReactViewGroup	// class@000cb7
{
    public int b;
    public int c;
    public ScreenStackHeaderSubview$Type d;

    public void ScreenStackHeaderSubview(ReactContext p0){
       super(p0);
       this.d = ScreenStackHeaderSubview$Type.RIGHT;
    }
    public ScreenStackHeaderSubview$Type getType(){
       return this.d;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public void onMeasure(int p0,int p1){
       if (View$MeasureSpec.getMode(p0) == 0x40000000 && View$MeasureSpec.getMode(p1) == 0x40000000) {
          this.b = View$MeasureSpec.getSize(p0);
          this.c = View$MeasureSpec.getSize(p1);
          ViewParent parent = this.getParent();
          if (parent != null) {
             this.forceLayout();
             parent.requestLayout();
          }
       }
       this.setMeasuredDimension(this.b, this.c);
       return;
    }
    public void setType(ScreenStackHeaderSubview$Type p0){
       this.d = p0;
    }
}
