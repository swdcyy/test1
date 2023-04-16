package com.google.android.material.tabs.TabLayout$TabView;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import android.view.View;
import a2.i0;
import a2.d0;
import android.text.Layout;
import android.text.TextPaint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.material.tabs.TabLayout$f;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.core.widget.b;
import android.view.LayoutInflater;
import ag6.a;
import androidx.core.graphics.drawable.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import r0.a;
import android.graphics.drawable.GradientDrawable;
import fk.a;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import a2.o;
import w0.y;
import java.lang.Math;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.ActionBar$c;
import java.lang.String;
import java.lang.Class;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$MeasureSpec;

public class TabLayout$TabView extends LinearLayout	// class@0016c8
{
    public TabLayout$f b;
    public TextView c;
    public ImageView d;
    public View e;
    public TextView f;
    public ImageView g;
    public Drawable h;
    public int i;
    public final TabLayout j;

    public void TabLayout$TabView(TabLayout p0,Context p1){
       this.j = p0;
       super(p1);
       this.i = 2;
       this.e(p1);
       i0.J0(this, p0.tabPaddingStart, p0.tabPaddingTop, p0.tabPaddingEnd, p0.tabPaddingBottom);
       this.setGravity(17);
       this.setOrientation((p0.inlineLabel ^ 1));
       this.setClickable(1);
       i0.K0(this, d0.b(this.getContext(), 1002));
    }
    public final float a(Layout p0,int p1,float p2){
       return (p0.getLineWidth(p1) * (p2 / p0.getPaint().getTextSize()));
    }
    public void b(Canvas p0){
       TabLayout$TabView th = this.h;
       if (th != null) {
          th.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
          this.h.draw(p0);
       }
       return;
    }
    public void c(){
       this.setTab(null);
       this.setSelected(false);
    }
    public final void d(){
       boolean b;
       TabLayout$TabView tb = this.b;
       Drawable uDrawable = null;
       View view = (tb != null)? tb.a(): uDrawable;
       if (view != null) {
          ViewParent parent = view.getParent();
          if (parent != this) {
             if (parent != null) {
                parent.removeView(view);
             }
             this.addView(view);
          }
          this.e = view;
          TabLayout$TabView tc = this.c;
          int i = 8;
          if (tc != null) {
             tc.setVisibility(i);
          }
          tc = this.d;
          if (tc != null) {
             tc.setVisibility(i);
             this.d.setImageDrawable(uDrawable);
          }
          TextView textView = view.findViewById(0x1020014);
          this.f = textView;
          if (textView != null) {
             this.i = b.d(textView);
          }
          this.g = view.findViewById(0x1020006);
       }else {
          TabLayout$TabView te = this.e;
          if (te != null) {
             this.removeView(te);
             this.e = uDrawable;
          }
          this.f = uDrawable;
          this.g = uDrawable;
       }
       b = false;
       if (this.e == null) {
          if (this.d == null) {
             ImageView imageView = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d025b, this, b);
             this.addView(imageView, b);
             this.d = imageView;
          }
          if (tb != null && tb.b() != null) {
             uDrawable = a.r(tb.b()).mutate();
          }
          if (uDrawable != null) {
             a.o(uDrawable, this.j.tabIconTint);
             TabLayout tabIconTintM = this.j.tabIconTintMode;
             if (tabIconTintM != null) {
                a.p(uDrawable, tabIconTintM);
             }
          }
          if (this.c == null) {
             TextView textView1 = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d025c, this, b);
             this.addView(textView1);
             this.c = textView1;
             this.i = b.d(textView1);
          }
          b.r(this.c, this.j.tabTextAppearance);
          TabLayout tabTextColor = this.j.tabTextColors;
          if (tabTextColor != null) {
             this.c.setTextColor(tabTextColor);
          }
          this.g(this.c, this.d);
       }else {
          TabLayout$TabView tf = this.f;
          if (tf != null || this.g != null) {
             this.g(tf, this.g);
          }
       }
       if (tb != null && !TextUtils.isEmpty(tb.d)) {
          this.setContentDescription(tb.d);
       }
       if (tb != null && tb.f()) {
          b = true;
       }
       this.setSelected(b);
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       TabLayout$TabView th = this.h;
       int i = 0;
       if (th != null && th.isStateful()) {
          i = i | this.h.setState(drawableStat);
       }
       if (i) {
          this.invalidate();
          this.j.invalidate();
       }
       return;
    }
    public void e(Context p0){
       TabLayout tabBackgroun = this.j.tabBackgroundResId;
       Drawable uDrawable = null;
       if (tabBackgroun != null) {
          Drawable uDrawable1 = a.d(p0, tabBackgroun);
          this.h = uDrawable1;
          if (uDrawable1 != null && uDrawable1.isStateful()) {
             this.h.setState(this.getDrawableState());
          }
       }else {
          this.h = uDrawable;
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(0);
       if (this.j.tabRippleColorStateList != null) {
          GradientDrawable gradientDraw1 = new GradientDrawable();
          gradientDraw1.setCornerRadius(0.00f);
          gradientDraw1.setColor(-1);
          ColorStateList uColorStateL = a.a(this.j.tabRippleColorStateList);
          TabLayout unboundedRip = this.j.unboundedRipple;
          if (unboundedRip != null) {
             gradientDraw = uDrawable;
          }
          if (unboundedRip == null) {
             uDrawable = gradientDraw1;
          }
          gradientDraw = new RippleDrawable(uColorStateL, gradientDraw, uDrawable);
       }
       i0.v0(this, gradientDraw);
       this.j.invalidate();
       return;
    }
    public final void f(){
       this.setOrientation((this.j.inlineLabel ^ 0x01));
       TabLayout$TabView tf = this.f;
       if (tf != null || this.g != null) {
          this.g(tf, this.g);
       }else {
          this.g(this.c, this.d);
       }
       return;
    }
    public final void g(TextView p0,ImageView p1){
       TabLayout$TabView tb = this.b;
       CharSequence uCharSequenc = null;
       Drawable uDrawable = (tb != null && tb.b() != null)? a.r(this.b.b()).mutate(): uCharSequenc;
       TabLayout$TabView tb1 = this.b;
       CharSequence uCharSequenc1 = (tb1 != null)? tb1.e(): uCharSequenc;
       int i = 8;
       if (p1 != null) {
          if (uDrawable != null) {
             p1.setImageDrawable(uDrawable);
             p1.setVisibility(0);
             this.setVisibility(0);
          }else {
             p1.setVisibility(i);
             p1.setImageDrawable(uCharSequenc);
          }
       }
       int i1 = TextUtils.isEmpty(uCharSequenc1) ^ 0x01;
       if (p0 != null) {
          if (i1) {
             p0.setText(uCharSequenc1);
             p0.setVisibility(0);
             this.setVisibility(0);
          }else {
             p0.setVisibility(i);
             p0.setText(uCharSequenc);
          }
       }
       if (p1 != null) {
          ViewGroup$MarginLayoutParams layoutParams = p1.getLayoutParams();
          int i2 = (i1 && !p1.getVisibility())? this.j.t(i): 0;
          if (this.j.inlineLabel != null) {
             if (i2 != o.a(layoutParams)) {
                o.d(layoutParams, i2);
                layoutParams.bottomMargin = 0;
                p1.setLayoutParams(layoutParams);
                p1.requestLayout();
             }
          }else if(i2 != layoutParams.bottomMargin){
             layoutParams.bottomMargin = i2;
             o.d(layoutParams, 0);
             p1.setLayoutParams(layoutParams);
             p1.requestLayout();
          }
       }
    label_0095 :
       TabLayout$TabView tb2 = this.b;
       TabLayout$f d = (tb2 != null)? tb2.d: uCharSequenc;
       if (!i1) {
          uCharSequenc = d;
       }
       y.a(this, uCharSequenc);
       return;
    }
    public int getContentWidth(){
       View[] viewArray = new View[]{this.c,this.d,this.e};
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i < 3) {
          object oobject = viewArray[i];
          if (oobject != null && !oobject.getVisibility()) {
             i2 = (i3)? Math.min(i2, oobject.getLeft()): oobject.getLeft();
             i1 = (i3)? Math.max(i1, oobject.getRight()): oobject.getRight();
             i3 = 1;
          }
          i = i + 1;
       }
       return (i1 - i2);
    }
    public TabLayout$f getTab(){
       return this.b;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName(ActionBar$c.class.getName());
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName(ActionBar$c.class.getName());
    }
    public void onMeasure(int p0,int p1){
       int size = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p0);
       int tabMaxWidth = this.j.getTabMaxWidth();
       if (tabMaxWidth > 0 && (!mode || size > tabMaxWidth)) {
          p0 = View$MeasureSpec.makeMeasureSpec(this.j.tabMaxWidth, Integer.MIN_VALUE);
       }
       super.onMeasure(p0, p1);
       if (this.c != null) {
          TabLayout tabTextSize = this.j.tabTextSize;
          TabLayout$TabView ti = this.i;
          TabLayout$TabView td = this.d;
          int i = 1;
          if (td != null && !td.getVisibility()) {
             ti = 1;
          }else {
             td = this.c;
             if (td != null && td.getLineCount() > i) {
                tabTextSize = this.j.tabTextMultiLineSize;
             }
          }
          int lineCount = this.c.getLineCount();
          int i1 = b.d(this.c);
          v2 = tabTextSize - this.c.getTextSize();
          if (td || (i1 >= 0 && ti != i1)) {
             if (this.j.mode == i && (td > 0 && lineCount == i)) {
                Layout layout = this.c.getLayout();
                if (layout == null || this.a(layout, 0, tabTextSize) - (float)((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()) > 0) {
                   i = 0;
                }
             }
             if (i) {
                this.c.setTextSize(0, tabTextSize);
                this.c.setMaxLines(ti);
                super.onMeasure(p0, p1);
             }
          }
       }
    label_009a :
       return;
    }
    public boolean performClick(){
       boolean b = super.performClick();
       if (this.b != null) {
          if (!b) {
             this.playSoundEffect(0);
          }
          this.b.h();
          b = true;
       }
       return b;
    }
    public void setSelected(boolean p0){
       TabLayout$TabView tabView = (this.isSelected() != p0)? 1: null;
       super.setSelected(p0);
       tabView = this.c;
       if (tabView != null) {
          tabView.setSelected(p0);
       }
       tabView = this.d;
       if (tabView != null) {
          tabView.setSelected(p0);
       }
       tabView = this.e;
       if (tabView != null) {
          tabView.setSelected(p0);
       }
       return;
    }
    public void setTab(TabLayout$f p0){
       if (p0 != this.b) {
          this.b = p0;
          this.d();
       }
       return;
    }
}
