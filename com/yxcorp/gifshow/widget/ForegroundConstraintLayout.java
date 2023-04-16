package com.yxcorp.gifshow.widget.ForegroundConstraintLayout;
import tyc.q1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Gravity;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.ColorDrawable;
import com.kwai.robust.PatchProxyResult;

public class ForegroundConstraintLayout extends ConstraintLayout implements q1	// class@00184f
{
    public Drawable B;
    public final Rect C;
    public final Rect D;
    public int E;
    public boolean F;
    public boolean G;

    public void ForegroundConstraintLayout(Context p0){
       super(p0, null);
    }
    public void ForegroundConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ForegroundConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.C = new Rect();
       this.D = new Rect();
       this.E = 119;
       this.F = true;
       this.G = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.U0, p2, false);
       this.E = typedArray.getInt(true, this.E);
       Drawable drawable = typedArray.getDrawable(false);
       if (drawable != null) {
          this.setForeground(drawable);
       }
       this.F = typedArray.getBoolean(2, true);
       typedArray.recycle();
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForegroundConstraintLayout.class, "9")) {
          return;
       }
       super.draw(p0);
       ForegroundConstraintLayout tB = this.B;
       if (tB != null) {
          if (this.G != null) {
             boolean b = false;
             this.G = b;
             ForegroundConstraintLayout tC = this.C;
             ForegroundConstraintLayout tD = this.D;
             int i = this.getRight() - this.getLeft();
             int i1 = this.getBottom() - this.getTop();
             if (this.F != null) {
                tC.set(b, b, i, i1);
             }else {
                tC.set(this.getPaddingLeft(), this.getPaddingTop(), (i - this.getPaddingRight()), (i1 - this.getPaddingBottom()));
             }
             Gravity.apply(this.E, tB.getIntrinsicWidth(), tB.getIntrinsicHeight(), tC, tD);
             tB.setBounds(tD);
          }
          tB.draw(p0);
       }
       return;
    }
    public void drawableHotspotChanged(float p0,float p1){
       if (PatchProxy.isSupport(ForegroundConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ForegroundConstraintLayout.class, "10")) {
          return;
       }
       super.drawableHotspotChanged(p0, p1);
       ForegroundConstraintLayout tB = this.B;
       if (tB != null) {
          tB.setHotspot(p0, p1);
       }
       return;
    }
    public void drawableStateChanged(){
       if (PatchProxy.applyVoid(null, this, ForegroundConstraintLayout.class, "4")) {
          return;
       }
       super.drawableStateChanged();
       ForegroundConstraintLayout tB = this.B;
       if (tB != null && tB.isStateful()) {
          this.B.setState(this.getDrawableState());
       }
       return;
    }
    public Drawable getForeground(){
       return this.B;
    }
    public int getForegroundGravity(){
       return this.E;
    }
    public void jumpDrawablesToCurrentState(){
       if (PatchProxy.applyVoid(null, this, ForegroundConstraintLayout.class, "3")) {
          return;
       }
       super.jumpDrawablesToCurrentState();
       ForegroundConstraintLayout tB = this.B;
       if (tB != null) {
          tB.jumpToCurrentState();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ForegroundConstraintLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ForegroundConstraintLayout.class, "7")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.G = p0 | this.G;
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ForegroundConstraintLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ForegroundConstraintLayout.class, "8")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.G = true;
       return;
    }
    public void setForeground(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForegroundConstraintLayout.class, "5")) {
          return;
       }
       ForegroundConstraintLayout tB = this.B;
       if (tB != p0) {
          if (tB != null) {
             tB.setCallback(null);
             this.unscheduleDrawable(this.B);
          }
          this.B = p0;
          if (p0 != null) {
             this.setWillNotDraw(false);
             p0.setCallback(this);
             if (p0.isStateful()) {
                p0.setState(this.getDrawableState());
             }
             if (this.E == 119) {
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
    public void setForegroundColor(int p0){
       if (PatchProxy.isSupport(ForegroundConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ForegroundConstraintLayout.class, "6")) {
          return;
       }
       ForegroundConstraintLayout tB = this.B;
       if (tB instanceof ColorDrawable) {
          tB.mutate().setColor(p0);
       }else {
          this.setForeground(new ColorDrawable(p0));
       }
       return;
    }
    public void setForegroundGravity(int p0){
       if (PatchProxy.isSupport(ForegroundConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ForegroundConstraintLayout.class, "1")) {
          return;
       }
       if (this.E != p0) {
          if (!(0x800007 & p0)) {
             p0 = p0 | 0x800003;
          }
          if (!(p0 & 0x70)) {
             p0 = p0 | 0x30;
          }
          this.E = p0;
          if (p0 == 119 && this.B != null) {
             this.B.getPadding(new Rect());
          }
          this.requestLayout();
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForegroundConstraintLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.verifyDrawable(p0) || p0 == this.B)? true: false;
       return b;
    }
}
