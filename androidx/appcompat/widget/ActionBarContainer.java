package androidx.appcompat.widget.ActionBarContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import w0.a;
import android.view.View;
import android.graphics.drawable.Drawable;
import a2.i0;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.graphics.drawable.Drawable$Callback;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.widget.HorizontalScrollView;
import android.view.ActionMode$Callback;
import android.view.ActionMode;

public class ActionBarContainer extends FrameLayout	// class@0005bd
{
    public boolean b;
    public View c;
    public View d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public int k;

    public void ActionBarContainer(Context p0){
       super(p0, null);
    }
    public void ActionBarContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       i0.v0(this, new a(this));
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c);
       int i = 0;
       this.f = typedArray.getDrawable(i);
       this.g = typedArray.getDrawable(2);
       this.k = typedArray.getDimensionPixelSize(13, -1);
       if (this.getId() == 0x7f0a3b0a) {
          this.i = true;
          this.h = typedArray.getDrawable(true);
       }
       typedArray.recycle();
       if (this.i != null) {
          if (this.h == null) {
          label_0045 :
             i = true;
          }
       }else if(this.f == null && this.g == null){
          goto label_0045 ;
       }
       this.setWillNotDraw(i);
       return;
    }
    public final int a(View p0){
       FrameLayout$LayoutParams layoutParams = p0.getLayoutParams();
       return ((p0.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
    }
    public final boolean b(View p0){
       boolean b = (p0 != null && (p0.getVisibility() == 8 || !p0.getMeasuredHeight()))? true: false;
       return b;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       ActionBarContainer tf = this.f;
       if (tf != null && tf.isStateful()) {
          this.f.setState(this.getDrawableState());
       }
       tf = this.g;
       if (tf != null && tf.isStateful()) {
          this.g.setState(this.getDrawableState());
       }
       tf = this.h;
       if (tf != null && tf.isStateful()) {
          this.h.setState(this.getDrawableState());
       }
       return;
    }
    public View getTabContainer(){
       return this.c;
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       ActionBarContainer tf = this.f;
       if (tf != null) {
          tf.jumpToCurrentState();
       }
       tf = this.g;
       if (tf != null) {
          tf.jumpToCurrentState();
       }
       tf = this.h;
       if (tf != null) {
          tf.jumpToCurrentState();
       }
       return;
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a007f);
       this.e = this.findViewById(0x7f0a009a);
    }
    public boolean onHoverEvent(MotionEvent p0){
       super.onHoverEvent(p0);
       return true;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = (this.b != null || super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       ActionBarContainer tg;
       super.onLayout(p0, p1, p2, p3, p4);
       ActionBarContainer tc = this.c;
       p2 = 8;
       p4 = 1;
       int i = 0;
       boolean b = (tc != null && tc.getVisibility() != p2)? true: false;
       if (tc != null && tc.getVisibility() != p2) {
          p2 = this.getMeasuredHeight();
          FrameLayout$LayoutParams bottomMargin = tc.getLayoutParams().bottomMargin;
          tc.layout(p1, ((p2 - tc.getMeasuredHeight()) - bottomMargin), p3, (p2 - bottomMargin));
       }
       if (this.i != null) {
          tc = this.h;
          if (tc != null) {
             tc.setBounds(i, i, this.getMeasuredWidth(), this.getMeasuredHeight());
          }else {
             p4 = 0;
          }
       }else if(this.f != null){
          if (!this.d.getVisibility()) {
             this.f.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
          }else {
             tg = this.e;
             if (tg != null && !tg.getVisibility()) {
                this.f.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
             }else {
                this.f.setBounds(i, i, i, i);
             }
          }
          i = 1;
       }
       this.j = b;
       if (b) {
          tg = this.g;
          if (tg != null) {
             tg.setBounds(tc.getLeft(), tc.getTop(), tc.getRight(), tc.getBottom());
          }
       }
       p4 = i;
       if (p4) {
          this.invalidate();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       ActionBarContainer tk;
       int i1;
       int i = Integer.MIN_VALUE;
       if (this.d == null && View$MeasureSpec.getMode(p1) == i) {
          tk = this.k;
          if (tk >= null) {
             p1 = View$MeasureSpec.makeMeasureSpec(Math.min(tk, View$MeasureSpec.getSize(p1)), i);
          }
       }
       super.onMeasure(p0, p1);
       if (this.d == null) {
          return;
       }else {
          p0 = View$MeasureSpec.getMode(p1);
          tk = this.c;
          if (tk != null && (tk.getVisibility() != 8 && p0 != 0x40000000)) {
             if (!this.b(this.d)) {
                i1 = this.a(this.d);
             }else if(!this.b(this.e)){
                i1 = this.a(this.e);
             }else {
                i1 = 0;
             }
             p0 = (p0 == i)? View$MeasureSpec.getSize(p1): Integer.MAX_VALUE;
             this.setMeasuredDimension(this.getMeasuredWidth(), Math.min((i1 + this.a(this.c)), p0));
          }
       label_0073 :
          return;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       super.onTouchEvent(p0);
       return true;
    }
    public void setPrimaryBackground(Drawable p0){
       ActionBarContainer tf = this.f;
       if (tf != null) {
          tf.setCallback(null);
          this.unscheduleDrawable(this.f);
       }
       this.f = p0;
       if (p0 != null) {
          p0.setCallback(this);
          ActionBarContainer td = this.d;
          if (td != null) {
             this.f.setBounds(td.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
          }
       }
       boolean b = true;
       if (this.i != null) {
          if (this.h != null) {
          label_0047 :
             b = false;
          }
       }else if(this.f == null && this.g == null){
       }
       this.setWillNotDraw(b);
       this.invalidate();
       this.invalidateOutline();
       return;
    }
    public void setSplitBackground(Drawable p0){
       ActionBarContainer th = this.h;
       if (th != null) {
          th.setCallback(null);
          this.unscheduleDrawable(this.h);
       }
       this.h = p0;
       int i = 0;
       if (p0 != null) {
          p0.setCallback(this);
          if (this.i != null) {
             ActionBarContainer th1 = this.h;
             if (th1 != null) {
                th1.setBounds(i, i, this.getMeasuredWidth(), this.getMeasuredHeight());
             }
          }
       }
       if (this.i != null) {
          if (this.h == null) {
          label_0031 :
             i = true;
          }
       }else if(this.f == null && this.g == null){
          goto label_0031 ;
       }
       this.setWillNotDraw(i);
       this.invalidate();
       this.invalidateOutline();
       return;
    }
    public void setStackedBackground(Drawable p0){
       ActionBarContainer tg = this.g;
       if (tg != null) {
          tg.setCallback(null);
          this.unscheduleDrawable(this.g);
       }
       this.g = p0;
       if (p0 != null) {
          p0.setCallback(this);
          if (this.j != null) {
             ActionBarContainer tg1 = this.g;
             if (tg1 != null) {
                tg1.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
             }
          }
       }
       boolean b = true;
       if (this.i != null) {
          if (this.h != null) {
          label_004b :
             b = false;
          }
       }else if(this.f == null && this.g == null){
       }
       this.setWillNotDraw(b);
       this.invalidate();
       this.invalidateOutline();
       return;
    }
    public void setTabContainer(ScrollingTabContainerView p0){
       ActionBarContainer tc = this.c;
       if (tc != null) {
          this.removeView(tc);
       }
       this.c = p0;
       if (p0 != null) {
          this.addView(p0);
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.width = -1;
          layoutParams.height = -2;
          p0.setAllowCollapse(false);
       }
       return;
    }
    public void setTransitioning(boolean p0){
       this.b = p0;
       int i = (p0)? 0x60000: 0x40000;
       this.setDescendantFocusability(i);
       return;
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       boolean b = (!p0)? true: false;
       ActionBarContainer tf = this.f;
       if (tf != null) {
          tf.setVisible(b, false);
       }
       tf = this.g;
       if (tf != null) {
          tf.setVisible(b, false);
       }
       tf = this.h;
       if (tf != null) {
          tf.setVisible(b, false);
       }
       return;
    }
    public ActionMode startActionModeForChild(View p0,ActionMode$Callback p1){
       return null;
    }
    public ActionMode startActionModeForChild(View p0,ActionMode$Callback p1,int p2){
       if (p2) {
          return super.startActionModeForChild(p0, p1, p2);
       }
       return null;
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (p0 != this.f || (this.i != null && (p0 != this.g || (this.j != null || (p0 != this.h || (this.i != null || super.verifyDrawable(p0)))))))? true: false;
       return b;
    }
}
