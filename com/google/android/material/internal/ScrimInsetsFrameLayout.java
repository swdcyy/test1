package com.google.android.material.internal.ScrimInsetsFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.ScrimInsetsFrameLayout$a;
import android.view.View;
import a2.z;
import a2.i0;
import a2.u0;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable$Callback;

public class ScrimInsetsFrameLayout extends FrameLayout	// class@0016a3
{
    public Drawable b;
    public Rect c;
    public Rect d;

    public void ScrimInsetsFrameLayout(Context p0){
       super(p0, null);
    }
    public void ScrimInsetsFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ScrimInsetsFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new Rect();
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.M4, p2, R.style.arg_RES_7f1104bf, ointArray);
       this.b = typedArray.getDrawable(0);
       typedArray.recycle();
       this.setWillNotDraw(true);
       i0.I0(this, new ScrimInsetsFrameLayout$a(this));
    }
    public void a(u0 p0){
    }
    public void draw(Canvas p0){
       super.draw(p0);
       int width = this.getWidth();
       int height = this.getHeight();
       if (this.c != null && this.b != null) {
          p0.translate((float)this.getScrollX(), (float)this.getScrollY());
          this.d.set(0, 0, width, this.c.top);
          this.b.setBounds(this.d);
          this.b.draw(p0);
          this.d.set(0, (height - this.c.bottom), width, height);
          this.b.setBounds(this.d);
          this.b.draw(p0);
          ScrimInsetsFrameLayout tc = this.c;
          this.d.set(0, tc.top, tc.left, (height - tc.bottom));
          this.b.setBounds(this.d);
          this.b.draw(p0);
          tc = this.c;
          this.d.set((width - tc.right), tc.top, width, (height - tc.bottom));
          this.b.setBounds(this.d);
          this.b.draw(p0);
          p0.restoreToCount(p0.save());
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ScrimInsetsFrameLayout tb = this.b;
       if (tb != null) {
          tb.setCallback(this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       ScrimInsetsFrameLayout tb = this.b;
       if (tb != null) {
          tb.setCallback(null);
       }
       return;
    }
}
