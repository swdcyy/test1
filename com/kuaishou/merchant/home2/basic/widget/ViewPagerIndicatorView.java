package com.kuaishou.merchant.home2.basic.widget.ViewPagerIndicatorView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.graphics.drawable.ShapeDrawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class ViewPagerIndicatorView extends LinearLayout	// class@0016f7
{
    public View[] b;
    public int c;
    public ShapeDrawable d;
    public ShapeDrawable e;

    public void ViewPagerIndicatorView(Context p0){
       super(p0, null);
    }
    public void ViewPagerIndicatorView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setOrientation(0);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.q3);
       this.c = typedArray.getDimensionPixelOffset(2, a1.d(0x7f070196));
       this.d = this.a(typedArray.getColor(0, -2130706433));
       this.e = this.a(typedArray.getColor(1, -1));
       typedArray.recycle();
    }
    public final ShapeDrawable a(int p0){
       ShapeDrawable obj;
       if (PatchProxy.isSupport(ViewPagerIndicatorView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ViewPagerIndicatorView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ShapeDrawable();
       obj.setShape(new OvalShape());
       obj.getPaint().setColor(p0);
       return obj;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(ViewPagerIndicatorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPagerIndicatorView.class, "3")) {
          return;
       }
       ViewPagerIndicatorView tb = this.b;
       if (tb == null || (p0 >= 0 && p0 < tb.length)) {
          int i = 0;
          ViewPagerIndicatorView tb1 = this.b;
          while (i < tb1.length) {
             if (i == p0) {
                tb1[i].setBackground(this.e);
             }else {
                tb1[i].setBackground(this.d);
             }
             i = i + 1;
          }
       }
       return;
    }
    public int getIndicatorCount(){
       return 0;
    }
    public void setIndicatorCount(int p0){
       if (PatchProxy.isSupport(ViewPagerIndicatorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPagerIndicatorView.class, "2")) {
          return;
       }
       if (p0 <= 0) {
          return;
       }
       this.removeAllViews();
       View[] viewArray = new View[p0];
       this.b = viewArray;
       for (int i = 0; i < p0; i = i + 1) {
          View view = new View(this.getContext());
          view.setBackground(this.d);
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.c, this.c);
          ViewPagerIndicatorView tc = this.c;
          int i1 = tc / 2;
          layoutParams.leftMargin = i1;
          int i2 = tc / 2;
          layoutParams.rightMargin = i2;
          this.addView(view, layoutParams);
          this.b[i] = view;
       }
       if (p0 == 1) {
          this.setVisibility(8);
       }else {
          this.setVisibility(0);
       }
       return;
    }
    public void setIndicatorItemColor(int p0){
       if (PatchProxy.isSupport(ViewPagerIndicatorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPagerIndicatorView.class, "4")) {
          return;
       }
       this.d = this.a(p0);
       return;
    }
    public void setIndicatorItemSize(int p0){
       this.c = p0;
    }
}
