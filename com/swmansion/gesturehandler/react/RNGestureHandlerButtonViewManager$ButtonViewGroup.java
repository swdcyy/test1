package com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.facebook.react.bridge.SoftAssertions;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.Integer;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import ze.p;
import android.content.res.Resources$Theme;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.MotionEvent;
import android.util.DisplayMetrics;
import cw9.c;

public class RNGestureHandlerButtonViewManager$ButtonViewGroup extends ViewGroup	// class@000c80
{
    public int b;
    public Integer c;
    public Integer d;
    public boolean e;
    public boolean f;
    public float g;
    public boolean h;
    public static TypedValue i;
    public static RNGestureHandlerButtonViewManager$ButtonViewGroup j;

    static {
       RNGestureHandlerButtonViewManager$ButtonViewGroup.i = new TypedValue();
    }
    public void RNGestureHandlerButtonViewManager$ButtonViewGroup(Context p0){
       super(p0);
       this.b = 0;
       this.e = false;
       this.f = false;
       this.g = 0;
       this.h = false;
       this.setClickable(true);
       this.setFocusable(true);
       this.h = true;
    }
    public static int c(Context p0,String p1){
       SoftAssertions.assertNotNull(p1);
       if (("selectableItemBackground").equals(p1)) {
          return 0x101030e;
       }
       if (("selectableItemBackgroundBorderless").equals(p1)) {
          return 0x101045c;
       }
       return p0.getResources().getIdentifier(p1, "attr", "android");
    }
    public final Drawable a(Drawable p0){
       int[] ointArray1;
       RNGestureHandlerButtonViewManager$ButtonViewGroup tc = this.c;
       if (tc != null && p0 instanceof RippleDrawable) {
          int[][] ointArray = new int[][1]{ointArray1};
          ointArray1 = new int[]{0x101009e};
          int[] ointArray2 = new int[]{tc.intValue()};
          p0.setColor(new ColorStateList(ointArray, ointArray2));
       }
       if (Build$VERSION.SDK_INT >= 23) {
          tc = this.d;
          if (tc != null && p0 instanceof RippleDrawable) {
             p0.setRadius((int)p.c((float)tc.intValue()));
          }
       }
       return p0;
    }
    public final Drawable b(){
       String str = (this.f != null)? "selectableItemBackgroundBorderless": "selectableItemBackground";
       this.getContext().getTheme().resolveAttribute(RNGestureHandlerButtonViewManager$ButtonViewGroup.c(this.getContext(), str), RNGestureHandlerButtonViewManager$ButtonViewGroup.i, true);
       return this.getResources().getDrawable(RNGestureHandlerButtonViewManager$ButtonViewGroup.i.resourceId, this.getContext().getTheme());
    }
    public void d(){
       if (this.h == null) {
          return;
       }
       boolean b = false;
       this.h = b;
       Drawable uDrawable = null;
       if (this.b == null) {
          this.setBackground(uDrawable);
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       RNGestureHandlerButtonViewManager$ButtonViewGroup uButtonViewG = 23;
       if (sDK_INT >= uButtonViewG) {
          this.setForeground(uDrawable);
       }
       if (this.e != null && sDK_INT >= uButtonViewG) {
          Drawable uDrawable1 = this.b();
          this.a(uDrawable1);
          this.setForeground(uDrawable1);
          RNGestureHandlerButtonViewManager$ButtonViewGroup tb = this.b;
          if (tb != null) {
             this.setBackgroundColor(tb);
          }
       }else if(this.b == null && this.c == null){
          this.setBackground(this.b());
       }else {
          PaintDrawable paintDrawabl = new PaintDrawable(this.b);
          uDrawable = this.b();
          uButtonViewG = this.g;
          if (uButtonViewG) {
             paintDrawabl.setCornerRadius(uButtonViewG);
             if (uDrawable instanceof RippleDrawable) {
                PaintDrawable paintDrawabl1 = new PaintDrawable(-1);
                paintDrawabl1.setCornerRadius(this.g);
                uDrawable.setDrawableByLayerId(0x102002e, paintDrawabl1);
             }
          }
          this.a(uDrawable);
          Drawable[] uDrawableArr = new Drawable[]{paintDrawabl,uDrawable};
          this.setBackground(new LayerDrawable(uDrawableArr));
       }
       return;
    }
    public void dispatchDrawableHotspotChanged(float p0,float p1){
    }
    public void drawableHotspotChanged(float p0,float p1){
       RNGestureHandlerButtonViewManager$ButtonViewGroup j = RNGestureHandlerButtonViewManager$ButtonViewGroup.j;
       if (j == null || j == this) {
          super.drawableHotspotChanged(p0, p1);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (super.onInterceptTouchEvent(p0)) {
          return true;
       }
       this.onTouchEvent(p0);
       return this.isPressed();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public void setBackgroundColor(int p0){
       this.b = p0;
       this.h = true;
    }
    public void setBorderRadius(float p0){
       this.g = p0 * c.c(this.getResources()).density;
       this.h = true;
    }
    public void setPressed(boolean p0){
       if (p0 && RNGestureHandlerButtonViewManager$ButtonViewGroup.j == null) {
          RNGestureHandlerButtonViewManager$ButtonViewGroup.j = this;
       }
       if (!p0 || RNGestureHandlerButtonViewManager$ButtonViewGroup.j == this) {
          super.setPressed(p0);
       }
       if (!p0 && RNGestureHandlerButtonViewManager$ButtonViewGroup.j == this) {
          RNGestureHandlerButtonViewManager$ButtonViewGroup.j = null;
       }
       return;
    }
    public void setRippleColor(Integer p0){
       this.c = p0;
       this.h = true;
    }
    public void setRippleRadius(Integer p0){
       this.d = p0;
       this.h = true;
    }
    public void setUseBorderlessDrawable(boolean p0){
       this.f = p0;
    }
    public void setUseDrawableOnForeground(boolean p0){
       this.e = p0;
       this.h = true;
    }
}
