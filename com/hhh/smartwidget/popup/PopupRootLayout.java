package com.hhh.smartwidget.popup.PopupRootLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;

public class PopupRootLayout extends FrameLayout	// class@000593
{
    public int b;
    public int c;

    public void PopupRootLayout(Context p0){
       super(p0);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.a(p0, null, 0);
    }
    public void PopupRootLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.a(p0, p1, 0);
    }
    public void PopupRootLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.a(p0, p1, p2);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Z3, p2, 0);
       this.b = typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE);
       this.c = typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE);
       typedArray.recycle();
    }
    public void measureChildWithMargins(View p0,int p1,int p2,int p3,int p4){
       int size = View$MeasureSpec.getSize(p1);
       int size1 = View$MeasureSpec.getSize(p3);
       PopupRootLayout tc = this.c;
       if (size > tc) {
          p2 = size - tc;
       }
       int i = p2;
       PopupRootLayout tb = this.b;
       if (size1 > tb) {
          p4 = size1 - tb;
       }
       super.measureChildWithMargins(p0, p1, i, p3, p4);
       return;
    }
}
