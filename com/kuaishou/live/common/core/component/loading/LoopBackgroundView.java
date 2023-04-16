package com.kuaishou.live.common.core.component.loading.LoopBackgroundView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import w51.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.l;
import java.lang.Math;

public class LoopBackgroundView extends View	// class@0014b3
{
    public int b;
    public boolean c;

    public void LoopBackgroundView(Context p0){
       super(p0);
       this.c = true;
    }
    public void LoopBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = true;
    }
    public void LoopBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = true;
    }
    public void draw(Canvas p0){
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LoopBackgroundView.class, "1")) {
          return;
       }
       Drawable background = this.getBackground();
       if (background != null && !this.getVisibility()) {
          Object obj = PatchProxy.apply(null, null, a.class, "12");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.a().c() && l.c("KEY_HIDE_LOOP_BACKGROUND_SWITCH", 0)){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             b = this.getRight() - this.getLeft();
             if (Math.abs(this.b) >= b) {
                this.b = this.b + b;
             }
             background.setBounds(0, 0, (b * 2), (this.getBottom() - this.getTop()));
             p0.save();
             p0.translate((float)this.b, 0);
             this.b = this.b - 5;
             background.draw(p0);
             p0.restore();
             if (this.c != null) {
                this.postInvalidateDelayed(25);
             }
          }
       }
    label_0089 :
       return;
    }
    public void setLooping(boolean p0){
       if (PatchProxy.isSupport(LoopBackgroundView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LoopBackgroundView.class, "2")) {
          return;
       }
       int i = (p0 && (this.c == null && !this.getVisibility()))? 1: 0;
       this.c = p0;
       if (i) {
          this.postInvalidate();
       }
       return;
    }
}
