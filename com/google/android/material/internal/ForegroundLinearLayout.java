package com.google.android.material.internal.ForegroundLinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.Gravity;
import android.graphics.drawable.Drawable$Callback;

public class ForegroundLinearLayout extends LinearLayoutCompat	// class@00169c
{
    public Drawable q;
    public final Rect r;
    public final Rect s;
    public int t;
    public boolean u;
    public boolean v;

    public void ForegroundLinearLayout(Context p0){
       super(p0, null);
    }
    public void ForegroundLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ForegroundLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = new Rect();
       this.s = new Rect();
       this.t = 119;
       this.u = true;
       this.v = false;
       int[] ointArray = new int[false];
       TypedArray typedArray = k.h(p0, p1, c$b.U0, p2, 0, ointArray);
       this.t = typedArray.getInt(true, this.t);
       Drawable drawable = typedArray.getDrawable(false);
       if (drawable != null) {
          this.setForeground(drawable);
       }
       this.u = typedArray.getBoolean(2, true);
       typedArray.recycle();
       return;
    }
    public void draw(Canvas p0){
       super.draw(p0);
       ForegroundLinearLayout tq = this.q;
       if (tq != null) {
          if (this.v != null) {
             boolean b = false;
             this.v = b;
             ForegroundLinearLayout tr = this.r;
             ForegroundLinearLayout ts = this.s;
             int i = this.getRight() - this.getLeft();
             int i1 = this.getBottom() - this.getTop();
             if (this.u != null) {
                tr.set(b, b, i, i1);
             }else {
                tr.set(this.getPaddingLeft(), this.getPaddingTop(), (i - this.getPaddingRight()), (i1 - this.getPaddingBottom()));
             }
             Gravity.apply(this.t, tq.getIntrinsicWidth(), tq.getIntrinsicHeight(), tr, ts);
             tq.setBounds(ts);
          }
          tq.draw(p0);
       }
       return;
    }
    public void drawableHotspotChanged(float p0,float p1){
       super.drawableHotspotChanged(p0, p1);
       ForegroundLinearLayout tq = this.q;
       if (tq != null) {
          tq.setHotspot(p0, p1);
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       ForegroundLinearLayout tq = this.q;
       if (tq != null && tq.isStateful()) {
          this.q.setState(this.getDrawableState());
       }
       return;
    }
    public Drawable getForeground(){
       return this.q;
    }
    public int getForegroundGravity(){
       return this.t;
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       ForegroundLinearLayout tq = this.q;
       if (tq != null) {
          tq.jumpToCurrentState();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.v = p0 | this.v;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.v = true;
    }
    public void setForeground(Drawable p0){
       ForegroundLinearLayout tq = this.q;
       if (tq != p0) {
          if (tq != null) {
             tq.setCallback(null);
             this.unscheduleDrawable(this.q);
          }
          this.q = p0;
          if (p0 != null) {
             this.setWillNotDraw(false);
             p0.setCallback(this);
             if (p0.isStateful()) {
                p0.setState(this.getDrawableState());
             }
             if (this.t == 119) {
                p0.getPadding(new Rect());
             }
          }else {
             this.setWillNotDraw(true);
          }
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setForegroundGravity(int p0){
       if (this.t != p0) {
          if (!(0x800007 & p0)) {
             p0 = p0 | 0x800003;
          }
          if (!(p0 & 0x70)) {
             p0 = p0 | 0x30;
          }
          this.t = p0;
          if (p0 == 119 && this.q != null) {
             this.q.getPadding(new Rect());
          }
          this.requestLayout();
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (super.verifyDrawable(p0) || p0 == this.q)? true: false;
       return b;
    }
}
