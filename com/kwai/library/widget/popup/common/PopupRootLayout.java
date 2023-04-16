package com.kwai.library.widget.popup.common.PopupRootLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import a2.u0;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.graphics.Insets;
import a2.i0;
import java.lang.Exception;
import ll8.c$b;
import android.content.res.TypedArray;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import a2.z;
import o07.p;

public class PopupRootLayout extends FrameLayout	// class@00098a
{
    public int b;
    public int c;
    public z d;
    public int e;

    public void PopupRootLayout(Context p0){
       super(p0);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.e = -1;
       this.b(p0, null, 0);
    }
    public void PopupRootLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.e = -1;
       this.b(p0, p1, 0);
    }
    public void PopupRootLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = Integer.MAX_VALUE;
       this.c = Integer.MAX_VALUE;
       this.e = -1;
       this.b(p0, p1, p2);
    }
    public static u0 a(PopupRootLayout p0,View p1,u0 p2){
       p0.c(p1, p2);
       return p2;
    }
    private u0 c(View p0,u0 p1){
       PopupRootLayout te;
       try{
          if (Build$VERSION.SDK_INT >= 30) {
             WindowInsets rootWindowIn = p0.getRootWindowInsets();
             if (rootWindowIn != null) {
                Insets insets = rootWindowIn.getInsets((WindowInsets$Type.statusBars() | WindowInsets$Type.navigationBars()));
                te = this.e;
                if (te < null) {
                   te = insets.top;
                }
                this.setPadding(insets.left, te, insets.right, insets.bottom);
             }
          }else {
             u0 ou0 = i0.J(p0);
             if (ou0 != null) {
                te = this.e;
                if (te < null) {
                   int i = ou0.k();
                }
                this.setPadding(ou0.i(), te, ou0.j(), ou0.h());
             }
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return p1;
    }
    public final void b(Context p0,AttributeSet p1,int p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Z3, p2, 0);
       this.b = typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE);
       this.c = typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE);
       typedArray.recycle();
    }
    public final View getContentView(){
       Activity uActivity = n.d(this);
       if (uActivity == null) {
          return null;
       }
       return n.f(uActivity);
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
    public void onDetachedFromWindow(){
       this.d = null;
       i0.I0(this, null);
       super.onDetachedFromWindow();
    }
    public void setAutoFitSystemBarChange(int p0){
       this.e = p0;
       this.setFitsSystemWindows(false);
       p op = new p(this);
       this.d = op;
       i0.I0(this, op);
    }
}
