package com.lsjwzh.widget.text.ReadMoreTextView;
import com.lsjwzh.widget.text.FastTextView;
import android.content.Context;
import android.util.AttributeSet;
import com.lsjwzh.widget.text.ReadMoreTextView$a;
import java.lang.String;
import android.text.style.ReplacementSpan;
import n0.c;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.text.SpannableStringBuilder;
import android.text.Spannable;
import android.text.util.Linkify;
import java.lang.Object;
import java.lang.Math;
import q38.c;
import android.view.View;
import android.text.Layout$Alignment;
import android.graphics.Canvas;
import java.lang.System;
import android.view.View$MeasureSpec;
import android.text.TextUtils;
import com.lsjwzh.widget.text.FastTextLayoutView;
import android.text.Layout;

public class ReadMoreTextView extends FastTextView	// class@00147d
{
    public boolean o;
    public StaticLayout p;
    public StaticLayout q;
    public ReplacementSpan r;
    public static final String s;

    static {
       ReadMoreTextView.s = "ReadMoreTextView";
    }
    public void ReadMoreTextView(Context p0){
       super(p0, null);
    }
    public void ReadMoreTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void ReadMoreTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = new ReadMoreTextView$a("¡ø");
       this.setCustomEllipsisSpan(new ReadMoreTextView$a("¡­"));
    }
    public final void c(c p0){
    }
    public final c f(CharSequence p0,int p1,int p2,TextPaint p3,int p4){
       return c.b(p0, p1, p2, p3, p4);
    }
    public StaticLayout h(CharSequence p0,int p1,boolean p2){
       this.q = super.h(p0, p1, p2);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
       FastTextView tl = this.l;
       if (tl > null) {
          Linkify.addLinks(spannableStr, tl);
       }
       if (this.r != null) {
          spannableStr.append("¡ø");
          spannableStr.setSpan(this.r, (spannableStr.length() - 1), spannableStr.length(), 17);
       }
       int i = 0;
       int i1 = spannableStr.length();
       TextPaint paint = this.getPaint();
       p1 = (p1 > 0)? Math.min(p1, this.q.getWidth()): this.q.getWidth();
       c uoc = c.b(spannableStr, i, i1, paint, p1);
       FastTextView td = this.d;
       uoc.h((float)td.a, td.b);
       uoc.d(c.c(this, this.getGravity()));
       uoc.g(1);
       this.p = uoc.a();
       return this.q;
    }
    public void onDraw(Canvas p0){
       System.currentTimeMillis();
       p0.save();
       if (this.q != null && this.o == null) {
          p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
          this.q.draw(p0);
       }else if(this.p != null && this.o != null){
          p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
          this.p.draw(p0);
       }
       p0.restore();
       System.currentTimeMillis();
       return;
    }
    public void onMeasure(int p0,int p1){
       System.currentTimeMillis();
       int size = View$MeasureSpec.getSize(p0);
       CharSequence uCharSequenc = 1;
       boolean b = (View$MeasureSpec.getMode(p0) == 0x40000000)? true: false;
       if (!b) {
          c c = this.d.c;
          if (c != Integer.MAX_VALUE && size > c) {
             size = c;
          }
       }
       if (size > null) {
          size = (size - this.getPaddingLeft()) - this.getPaddingRight();
       }
       if (!TextUtils.isEmpty(this.getText()) && size > 0) {
          FastTextLayoutView tb = this.b;
          if (tb != null && (size < tb.getWidth() || (size > this.b.getWidth() && this.b.getLineCount() > uCharSequenc))) {
             this.b = this.h(this.getText(), size, b);
          }
       }
       ReadMoreTextView tq = this.q;
       if (tq != null && this.o == null) {
          this.b = tq;
          this.setMeasuredDimension(this.b(((this.getPaddingLeft() + this.getPaddingRight()) + this.q.getWidth()), p0), this.a(((this.getPaddingTop() + this.getPaddingBottom()) + this.q.getHeight()), p1));
       }else {
          tq = this.p;
          if (tq != null && this.o != null) {
             this.b = tq;
             this.setMeasuredDimension(this.b(((this.getPaddingLeft() + this.getPaddingRight()) + this.p.getWidth()), p0), this.a(((this.getPaddingTop() + this.getPaddingBottom()) + this.p.getHeight()), p1));
          }else {
             super.onMeasure(p0, p1);
          }
       }
       System.currentTimeMillis();
       return;
    }
    public void setCustomCollapseSpan(ReplacementSpan p0){
       this.r = p0;
    }
    public void setText(CharSequence p0){
       if (p0 != this.getText()) {
          this.o = false;
          this.q = null;
          this.p = null;
       }
       super.setText(p0);
       return;
    }
}
