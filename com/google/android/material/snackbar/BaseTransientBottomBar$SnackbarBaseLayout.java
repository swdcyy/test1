package com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a;
import b2.c$b;
import b2.c;
import android.view.ViewGroup;
import ik.c;
import ik.d;

public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout	// class@0016ac
{
    public final AccessibilityManager b;
    public final c$b c;
    public d d;
    public c e;

    public void BaseTransientBottomBar$SnackbarBaseLayout(Context p0){
       super(p0, null);
    }
    public void BaseTransientBottomBar$SnackbarBaseLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.n5);
       int i = 1;
       if (typedArray.hasValue(i)) {
          i0.A0(this, (float)typedArray.getDimensionPixelSize(i, 0));
       }
       typedArray.recycle();
       AccessibilityManager systemServic = p0.getSystemService("accessibility");
       this.b = systemServic;
       BaseTransientBottomBar$SnackbarBaseLayout$a snackbarBase = new BaseTransientBottomBar$SnackbarBaseLayout$a(this);
       this.c = snackbarBase;
       c.a(systemServic, snackbarBase);
       this.setClickableOrFocusableBasedOnAccessibility(systemServic.isTouchExplorationEnabled());
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       BaseTransientBottomBar$SnackbarBaseLayout te = this.e;
       if (te != null) {
          te.onViewAttachedToWindow(this);
       }
       i0.p0(this);
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       BaseTransientBottomBar$SnackbarBaseLayout te = this.e;
       if (te != null) {
          te.onViewDetachedFromWindow(this);
       }
       c.b(this.b, this.c);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       BaseTransientBottomBar$SnackbarBaseLayout td = this.d;
       if (td != null) {
          td.a(this, p1, p2, p3, p4);
       }
       return;
    }
    public void setClickableOrFocusableBasedOnAccessibility(boolean p0){
       this.setClickable((p0 ^ 0x01));
       this.setFocusable(p0);
    }
    public void setOnAttachStateChangeListener(c p0){
       this.e = p0;
    }
    public void setOnLayoutChangeListener(d p0){
       this.d = p0;
    }
}
