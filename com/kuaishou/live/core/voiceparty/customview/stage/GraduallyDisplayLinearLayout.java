package com.kuaishou.live.core.voiceparty.customview.stage.GraduallyDisplayLinearLayout;
import android.widget.LinearLayout;
import com.kuaishou.live.core.voiceparty.customview.stage.GraduallyDisplayLinearLayout$a;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

public class GraduallyDisplayLinearLayout extends LinearLayout	// class@0014c7
{
    public ObjectAnimator b;
    public float c;
    public static final Property d;

    static {
       GraduallyDisplayLinearLayout.d = new GraduallyDisplayLinearLayout$a(Float.class, "displayRatio");
    }
    public void GraduallyDisplayLinearLayout(Context p0){
       super(p0, null);
    }
    public void GraduallyDisplayLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GraduallyDisplayLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0x3f800000;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, GraduallyDisplayLinearLayout.class, "4")) {
          return;
       }
       GraduallyDisplayLinearLayout tb = this.b;
       if (tb != null && tb.isRunning()) {
          this.b.end();
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GraduallyDisplayLinearLayout.class, "6")) {
          return;
       }
       GraduallyDisplayLinearLayout tc = this.c;
       float f = 0x3f800000;
       if (!tc - f) {
          super.draw(p0);
          return;
       }else {
          p0.clipRect(((f - tc) * (float)this.getWidth()), 0, (float)this.getWidth(), (float)this.getHeight());
          super.draw(p0);
          return;
       }
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, GraduallyDisplayLinearLayout.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void setDisplayRatio(float p0){
       if (PatchProxy.isSupport(GraduallyDisplayLinearLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, GraduallyDisplayLinearLayout.class, "5")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
}
