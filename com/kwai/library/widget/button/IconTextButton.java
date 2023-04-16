package com.kwai.library.widget.button.IconTextButton;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import java.lang.String;
import android.content.res.Resources;
import cw9.c;
import android.widget.TextView;
import android.view.View;
import android.view.View$MeasureSpec;
import java.lang.Math;
import ekd.n1;

public class IconTextButton extends RelativeLayout	// class@000904
{
    public TextView b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    public float l;
    public static final int m = 2131169482;

    public void IconTextButton(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.j1);
       this.c = typedArray.getDimensionPixelSize(8, n.c(this.getContext(), 6.00f));
       this.d = typedArray.getDimensionPixelSize(7, n.c(this.getContext(), 21.00f));
       this.e = typedArray.getResourceId(5, 0);
       this.f = typedArray.getResourceId(9, 0);
       this.g = typedArray.getResourceId(6, 0);
       this.h = typedArray.getResourceId(1, 0);
       this.i = typedArray.getText(2).toString();
       this.j = typedArray.getDimensionPixelSize(4, n.c(this.getContext(), (float)c.b(this.getResources(), IconTextButton.m)));
       this.k = typedArray.getColor(3, this.getResources().getColor(0x7f062103));
       this.l = typedArray.getDimension(0, 0);
       typedArray.recycle();
       TextView textView = new TextView(p0);
       this.b = textView;
       textView.setTextSize(0, (float)this.j);
       this.b.setTextColor(this.k);
       this.b.setText(this.i);
       this.b.setCompoundDrawablesWithIntrinsicBounds(this.e, this.f, this.g, this.h);
       this.b.setCompoundDrawablePadding(this.c);
       this.b.setGravity(17);
       this.addView(this.b);
    }
    public final int a(int p0,int p1){
       p1 = View$MeasureSpec.getSize(p1);
       if (View$MeasureSpec.getMode(p1) != 0x40000000) {
       }else {
          p0 = p1;
       }
       return p0;
    }
    public float getContentMarginLeftPercent(){
       return this.l;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       int measuredWidt = this.b.getMeasuredWidth();
       p1 = this.b.getMeasuredHeight();
       IconTextButton tl = this.l;
       tl = (!tl || tl - 0x3f800000 > 0)? (this.getMeasuredWidth() - measuredWidt) / 2: Math.round(((float)this.getMeasuredWidth() * this.l));
       this.b.layout(tl, ((this.getMeasuredHeight() - p1) / 2), (measuredWidt + tl), (((this.getMeasuredHeight() - p1) / 2) + p1));
       this.l = (float)tl / (float)this.getMeasuredWidth();
       n1.a(this, this.getMeasuredHeight());
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       p0 = this.a(n.c(this.getContext(), 100.00f), p0);
       p1 = this.a(n.c(this.getContext(), 44.00f), p1);
       if (this.d > p1) {
          this.d = p1;
       }
       this.setMeasuredDimension(p0, p1);
       return;
    }
    public void setContentMarginLeftPercent(float p0){
       this.l = p0;
    }
}
