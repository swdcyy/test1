package com.google.android.material.snackbar.SnackbarContentLayout;
import ik.e;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import cw9.c;
import android.text.Layout;

public class SnackbarContentLayout extends LinearLayout implements e	// class@0016ae
{
    public TextView b;
    public Button c;
    public int d;
    public int e;

    public void SnackbarContentLayout(Context p0){
       super(p0, null);
    }
    public void SnackbarContentLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.n5);
       this.d = typedArray.getDimensionPixelSize(0, -1);
       this.e = typedArray.getDimensionPixelSize(2, -1);
       typedArray.recycle();
    }
    public static void c(View p0,int p1,int p2){
       if (i0.a0(p0)) {
          i0.J0(p0, i0.H(p0), p1, i0.G(p0), p2);
       }else {
          p0.setPadding(p0.getPaddingLeft(), p1, p0.getPaddingRight(), p2);
       }
       return;
    }
    public void a(int p0,int p1){
       this.b.setAlpha(0);
       long l = (long)p1;
       long l1 = (long)p0;
       this.b.animate().alpha(0x3f800000).setDuration(l).setStartDelay(l1).start();
       if (!this.c.getVisibility()) {
          this.c.setAlpha(0);
          this.c.animate().alpha(0x3f800000).setDuration(l).setStartDelay(l1).start();
       }
       return;
    }
    public void b(int p0,int p1){
       this.b.setAlpha(0x3f800000);
       long l = (long)p1;
       long l1 = (long)p0;
       this.b.animate().alpha(0).setDuration(l).setStartDelay(l1).start();
       if (!this.c.getVisibility()) {
          this.c.setAlpha(0x3f800000);
          this.c.animate().alpha(0).setDuration(l).setStartDelay(l1).start();
       }
       return;
    }
    public final boolean d(int p0,int p1,int p2){
       SnackbarContentLayout snackbarCont;
       boolean b = true;
       if (p0 != this.getOrientation()) {
          this.setOrientation(p0);
          snackbarCont = 1;
       }else {
          snackbarCont = null;
       }
       if (this.b.getPaddingTop() != p1 || this.b.getPaddingBottom() != p2) {
          SnackbarContentLayout.c(this.b, p1, p2);
       }else {
          b = snackbarCont;
       }
       return b;
    }
    public Button getActionView(){
       return this.c;
    }
    public TextView getMessageView(){
       return this.b;
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a3a7c);
       this.c = this.findViewById(0x7f0a3a7a);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.d > null) {
          SnackbarContentLayout td = this.d;
          if (this.getMeasuredWidth() > td) {
             p0 = View$MeasureSpec.makeMeasureSpec(td, 0x40000000);
             super.onMeasure(p0, p1);
          }
       }
       int i = c.b(this.getResources(), R.dimen.arg_RES_7f0701c1);
       int i1 = c.b(this.getResources(), R.dimen.arg_RES_7f0701c0);
       int i2 = 0;
       int i3 = (this.b.getLayout().getLineCount() > 1)? 1: 0;
       if (i3 && (this.e > null && this.c.getMeasuredWidth() > this.e)) {
          if (this.d(1, i, (i - i1))) {
          label_0062 :
             i2 = 1;
          }
       }else if(i3){
          i = i1;
       }
       if (this.d(i2, i, i)) {
          goto label_0062 ;
       }
       if (i2) {
          super.onMeasure(p0, p1);
       }
       return;
    }
}
