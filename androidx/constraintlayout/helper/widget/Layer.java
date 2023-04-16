package androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintHelper;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Float;
import java.lang.Math;

public class Layer extends ConstraintHelper	// class@000665
{
    public boolean A;
    public boolean B;
    public float k;
    public float l;
    public float m;
    public ConstraintLayout n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public View[] x;
    public float y;
    public float z;

    public void Layer(Context p0){
       super(p0);
       this.k = Float.NaN;
       this.l = Float.NaN;
       this.m = Float.NaN;
       this.o = 0x3f800000;
       this.p = 0x3f800000;
       this.q = Float.NaN;
       this.r = Float.NaN;
       this.s = Float.NaN;
       this.t = Float.NaN;
       this.u = Float.NaN;
       this.v = Float.NaN;
       this.w = true;
       this.x = null;
       this.y = 0;
       this.z = 0;
    }
    public void Layer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = Float.NaN;
       this.l = Float.NaN;
       this.m = Float.NaN;
       this.o = 0x3f800000;
       this.p = 0x3f800000;
       this.q = Float.NaN;
       this.r = Float.NaN;
       this.s = Float.NaN;
       this.t = Float.NaN;
       this.u = Float.NaN;
       this.v = Float.NaN;
       this.w = true;
       this.x = null;
       this.y = 0;
       this.z = 0;
    }
    public void Layer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = Float.NaN;
       this.l = Float.NaN;
       this.m = Float.NaN;
       this.o = 0x3f800000;
       this.p = 0x3f800000;
       this.q = Float.NaN;
       this.r = Float.NaN;
       this.s = Float.NaN;
       this.t = Float.NaN;
       this.u = Float.NaN;
       this.v = Float.NaN;
       this.w = true;
       this.x = null;
       this.y = 0;
       this.z = 0;
    }
    public void o(AttributeSet p0){
       super.o(p0);
       boolean b = false;
       this.f = b;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a0);
          int indexCount = typedArray.getIndexCount();
          while (b < indexCount) {
             int index = typedArray.getIndex(b);
             if (index == 6) {
                this.A = true;
             }else if(index == 13){
                this.B = true;
             }
             b = b + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.n = this.getParent();
       if (this.A != null || this.B != null) {
          int visibility = this.getVisibility();
          float elevation = this.getElevation();
          int i = 0;
          while (i < this.c) {
             View viewById = this.n.getViewById(this.b[i]);
             if (viewById != null) {
                if (this.A != null) {
                   viewById.setVisibility(visibility);
                }
                if (this.B != null && elevation > 0) {
                   float f = viewById.getTranslationZ() + elevation;
                   viewById.setTranslationZ(f);
                }
             }
          label_0044 :
             i = i + 1;
          }
       }
       return;
    }
    public void s(ConstraintLayout p0){
       this.y();
       this.q = Float.NaN;
       this.r = Float.NaN;
       ConstraintWidget uConstraintW = this.getLayoutParams().b();
       uConstraintW.Y0(0);
       uConstraintW.z0(0);
       this.x();
       this.layout(((int)this.u - this.getPaddingLeft()), ((int)this.v - this.getPaddingTop()), ((int)this.s + this.getPaddingRight()), ((int)this.t + this.getPaddingBottom()));
       this.z();
    }
    public void setElevation(float p0){
       super.setElevation(p0);
       this.i();
    }
    public void setPivotX(float p0){
       this.k = p0;
       this.z();
    }
    public void setPivotY(float p0){
       this.l = p0;
       this.z();
    }
    public void setRotation(float p0){
       this.m = p0;
       this.z();
    }
    public void setScaleX(float p0){
       this.o = p0;
       this.z();
    }
    public void setScaleY(float p0){
       this.p = p0;
       this.z();
    }
    public void setTranslationX(float p0){
       this.y = p0;
       this.z();
    }
    public void setTranslationY(float p0){
       this.z = p0;
       this.z();
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       this.i();
    }
    public void t(ConstraintLayout p0){
       this.n = p0;
       float rotation = this.getRotation();
       if (!rotation) {
          if (!Float.isNaN(this.m)) {
             this.m = rotation;
          }
       }else {
          this.m = rotation;
       }
       return;
    }
    public void x(){
       if (this.n == null) {
          return;
       }
       if (this.w == null && (!Float.isNaN(this.q) && !Float.isNaN(this.r))) {
          return;
       }
       if (Float.isNaN(this.k) || Float.isNaN(this.l)) {
          View[] viewArray = this.n(this.n);
          int i = 0;
          int left = viewArray[i].getLeft();
          int top = viewArray[i].getTop();
          int right = viewArray[i].getRight();
          int bottom = viewArray[i].getBottom();
          for (; i < this.c; i = i + 1) {
             object oobject = viewArray[i];
             left = Math.min(left, oobject.getLeft());
             top = Math.min(top, oobject.getTop());
             right = Math.max(right, oobject.getRight());
             bottom = Math.max(bottom, oobject.getBottom());
          }
          this.s = (float)right;
          this.t = (float)bottom;
          this.u = (float)left;
          this.v = (float)top;
          this.q = (Float.isNaN(this.k))? (float)((left + right) / 2): this.k;
          if (Float.isNaN(this.l)) {
             this.r = (float)((top + bottom) / 2);
          }else {
             this.r = this.l;
          }
       }else {
          this.r = this.l;
          this.q = this.k;
       }
       return;
    }
    public final void y(){
       if (this.n == null) {
          return;
       }
       ConstraintHelper tc = this.c;
       if (tc == null) {
          return;
       }
       Layer tx = this.x;
       if (tx == null || tx.length != tc) {
          View[] viewArray = new View[tc];
          this.x = viewArray;
       }
       for (int i = 0; i < this.c; i = i + 1) {
          this.x[i] = this.n.getViewById(this.b[i]);
       }
       return;
    }
    public final void z(){
       if (this.n == null) {
          return;
       }
       if (this.x == null) {
          this.y();
       }
       this.x();
       double d = (Float.isNaN(this.m))? 0: Math.toRadians((double)this.m);
       float f = (float)Math.sin(d);
       float f1 = (float)Math.cos(d);
       Layer to = this.o;
       float f2 = to * f1;
       Layer tp = this.p;
       float f3 = (- tp) * f;
       float f4 = to * f;
       float f5 = tp * f1;
       int i = 0;
       while (i < this.c) {
          object oobject = this.x[i];
          int i1 = oobject.getLeft() + oobject.getRight();
          i1 = i1 / 2;
          int i2 = oobject.getTop() + oobject.getBottom();
          i2 = i2 / 2;
          float f6 = (float)i1 - this.q;
          float f7 = (float)i2 - this.r;
          float f8 = f2 * f6;
          float f9 = f3 * f7;
          f8 = f8 + f9;
          f8 = f8 - f6;
          f8 = f8 + this.y;
          f6 = f6 * f4;
          f9 = f5 * f7;
          f6 = f6 + f9;
          f6 = f6 - f7;
          f6 = f6 + this.z;
          oobject.setTranslationX(f8);
          oobject.setTranslationY(f6);
          oobject.setScaleY(this.p);
          oobject.setScaleX(this.o);
          if (!Float.isNaN(this.m)) {
             oobject.setRotation(this.m);
          }
          i = i + 1;
       }
       return;
    }
}
