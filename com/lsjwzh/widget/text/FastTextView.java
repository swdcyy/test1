package com.lsjwzh.widget.text.FastTextView;
import com.lsjwzh.widget.text.FastTextLayoutView;
import android.content.Context;
import android.util.AttributeSet;
import q38.c;
import android.text.TextPaint;
import java.lang.String;
import android.graphics.Color;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import n0.c;
import android.view.View;
import n0.d;
import android.text.Layout;
import android.text.Spanned;
import java.lang.Math;
import android.text.style.ReplacementSpan;
import android.text.TextUtils$TruncateAt;
import android.text.StaticLayout;
import android.text.SpannableStringBuilder;
import java.util.regex.Pattern;
import android.text.SpannableString;
import android.text.Spannable;
import android.text.util.Linkify;
import android.text.Layout$Alignment;
import n0.a;
import android.graphics.Paint;
import android.graphics.Paint$FontMetricsInt;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.text.TextUtils;
import android.graphics.Canvas;
import java.lang.System;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import n0.b;
import com.lsjwzh.widget.text.a;
import com.lsjwzh.widget.text.a$a;
import java.lang.Class;
import java.lang.Object;

public class FastTextView extends FastTextLayoutView	// class@00147b
{
    public c d;
    public CharSequence e;
    public TextPaint f;
    public ReplacementSpan g;
    public boolean h;
    public a i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public static final String n;

    static {
       FastTextView.n = "FastTextView";
    }
    public void FastTextView(Context p0){
       super(p0, null);
    }
    public void FastTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void FastTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new c();
       this.f = new TextPaint(1);
       this.h = false;
       this.m = Color.parseColor("#109DD0");
       this.d.d(p0, p1, p2, -1);
       this.setText(this.d.h);
       TextPaint paint = this.getPaint();
       int defaultColor = this.d.f.getDefaultColor();
       this.j = defaultColor;
       paint.setColor(defaultColor);
       paint.setTextSize((float)this.d.g);
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, c$b.E0, p2, -1);
       this.h = typedArray.getBoolean(false, false);
       typedArray.recycle();
    }
    public void c(c p0){
    }
    public final void d(){
       this.e(false);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       c f = this.d.f;
       if (f != null && f.isStateful()) {
          this.l();
       }
       return;
    }
    public final void e(boolean p0){
       if (this.h != null && p0) {
          d.b.c(this.e);
       }
       this.i = null;
       this.setTextLayout(null);
       this.requestLayout();
       this.invalidate();
       return;
    }
    public c f(CharSequence p0,int p1,int p2,TextPaint p3,int p4){
       return c.b(p0, p1, p2, p3, p4);
    }
    public int g(CharSequence p0){
       double d = (p0 instanceof Spanned)? Math.ceil((double)Layout.getDesiredWidth(p0, this.f)): Math.ceil((double)this.f.measureText(p0, 0, p0.length()));
       return (int)d;
    }
    public final int getCurrentTextColor(){
       return this.j;
    }
    public ReplacementSpan getCustomEllipsisSpan(){
       return this.g;
    }
    public int getEllipsize(){
       return this.d.e;
    }
    public int getGravity(){
       return this.d.b();
    }
    public final int getInnerHeight(){
       return ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
    }
    public int getInnerWidth(){
       return ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public int getMaxLines(){
       return this.d.d;
    }
    public int getMaxWidth(){
       return this.d.c;
    }
    public TextPaint getPaint(){
       return this.f;
    }
    public CharSequence getText(){
       return this.e;
    }
    public final ColorStateList getTextColors(){
       return this.d.f;
    }
    public TextPaint getTextPaint(){
       return this.f;
    }
    public float getTextSize(){
       return this.f.getTextSize();
    }
    public TextUtils$TruncateAt getTruncateAt(){
       c e = this.d.e;
       if (e == 1) {
          return TextUtils$TruncateAt.START;
       }
       if (e == 2) {
          return TextUtils$TruncateAt.MIDDLE;
       }
       if (e != 3) {
          return null;
       }
       return TextUtils$TruncateAt.END;
    }
    public StaticLayout h(CharSequence p0,int p1,boolean p2){
       SpannableStringBuilder spannableStr;
       FastTextView this;
       if (this.k != null) {
          spannableStr = new SpannableStringBuilder();
          String str = "\n";
          String[] stringArray = Pattern.compile(str).split(p0);
          int len = stringArray.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             i1 = i1 + 1;
             if (!(stringArray[i]).isEmpty()) {
                spannableStr.append(stringArray[i]);
                int i2 = len - 1;
                if (i < i2) {
                   spannableStr.append(str);
                }
             }
             i = i + 1;
          }
          if (i1 >= this.d.d) {
             spannableStr.append(str);
             spannableStr.append(str);
          }
       }else {
          spannableStr = new SpannableString(p0);
       }
       FastTextView tl = this.l;
       if (tl > null) {
          Linkify.addLinks(spannableStr, tl);
       }
       TextUtils$TruncateAt truncateAt = this.getTruncateAt();
       int i3 = (!p2 || truncateAt != null)? this.g(spannableStr): p1;
       if (!p2) {
          p1 = (p1 > 0)? Math.min(p1, i3): i3;
       }
    label_0066 :
       c uoc = this.f(spannableStr, 0, spannableStr.length(), this.f, p1);
       this = this.d;
       uoc.h((float)this.a, this.b);
       uoc.i(this.d.d);
       uoc.d(c.c(this, this.getGravity()));
       uoc.g(true);
       if (truncateAt != null) {
          uoc.e(truncateAt);
          a uoa = new a(spannableStr);
          uoa.c(this.g);
          uoc.j(uoa);
          if (i3 > (this.d.d * p1)) {
             int i4 = (int)this.f.measureText("бн") - 2;
             this = this.g;
             if (this != null) {
                FastTextView te = this.e;
                uoc.f(((p1 - this.getSize(this.getPaint(), te, 0, te.length(), null)) + i4));
             }else {
                uoc.f(p1);
             }
          }else {
             uoc.f(i3);
          }
          this.c(uoc);
          StaticLayout staticLayout = uoc.a();
          uoa.d(staticLayout);
          this.i = uoa;
          return staticLayout;
       }else {
          this.c(uoc);
          return uoc.a();
       }
    }
    public void i(int p0,float p1){
       FastTextView td = this.d;
       td.a = p0;
       td.b = p1;
       this.d();
    }
    public void j(float p0,int p1){
       p0 = TypedValue.applyDimension(p1, p0, c.c(this.getResources()));
       if (p0 - this.f.getTextSize()) {
          this.f.setTextSize(p0);
          this.d();
       }
       return;
    }
    public boolean k(int p0,CharSequence p1,Layout p2){
       boolean b = true;
       if (TextUtils.isEmpty(p1) || (p0 <= 0 || (p2 == null || (p0 < p2.getWidth() || (p0 > p2.getWidth() && (p2.getLineCount() <= b && (p0 <= p2.getWidth() || this.g(p1) <= p2.getWidth()))))))) {
          b = false;
       }
    label_002f :
       return b;
    }
    public final void l(){
       int colorForStat = this.d.f.getColorForState(this.getDrawableState(), this.j);
       if (colorForStat != this.j) {
          this.j = colorForStat;
          this.getPaint().setColor(this.j);
          colorForStat = 1;
       }else {
          colorForStat = 0;
       }
       if (colorForStat) {
          this.invalidate();
       }
       return;
    }
    public void onDraw(Canvas p0){
       System.currentTimeMillis();
       p0.save();
       if (this.b != null) {
          int i = this.getGravity() & 0x800007;
          if (i != 1) {
             i = (i != 5)? this.getPaddingLeft(): (this.getPaddingLeft() + this.getInnerWidth()) - this.b.getWidth();
          }else {
             i = this.getPaddingLeft() + ((this.getInnerWidth() - this.b.getWidth()) / 2);
          }
          int i1 = this.getGravity() & 0x70;
          if (i1 != 16) {
             i1 = (i1 != 80)? this.getPaddingTop(): (this.getPaddingTop() + this.getInnerHeight()) - this.b.getHeight();
          }else {
             i1 = this.getPaddingTop() + ((this.getInnerHeight() - this.b.getHeight()) / 2);
          }
          p0.translate((float)i, (float)i1);
          this.b.draw(p0);
       }
       p0.restore();
       System.currentTimeMillis();
       return;
    }
    public void onMeasure(int p0,int p1){
       int size = View$MeasureSpec.getSize(p0);
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
       if (this.k(size, this.e, this.b)) {
          if (this.h != null) {
             Layout layout = d.b.a(this.e);
             this.b = layout;
             if (layout == null) {
                StaticLayout staticLayout = this.h(this.e, size, b);
                this.b = staticLayout;
                d.b.b(this.e, staticLayout);
             }
          }else {
             this.b = this.h(this.e, size, b);
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Layout textLayout = this.getTextLayout();
       if (textLayout != null) {
          CharSequence text = textLayout.getText();
          Spanned spanned = null;
          if (b.a(text)) {
             FastTextView ti = this.i;
             if (ti != null) {
                text = ti.b();
                spanned = ti;
             }
          }
          if (text instanceof Spannable) {
             if (!a.b(this, textLayout, text, p0) && !a.c(this, textLayout, text, a$a.class, p0)) {
                FastTextView tg = this.g;
                if (tg == null || (!tg instanceof a$a || (spanned == null || !a.c(this, textLayout, spanned, tg.getClass(), p0)))) {
                label_0046 :
                   return super.onTouchEvent(p0);
                }
             }
             return true;
          }else {
             goto label_0046 ;
          }
       }else {
          goto label_0046 ;
       }
    }
    public void setCustomEllipsisSpan(ReplacementSpan p0){
       this.g = p0;
    }
    public void setEllipsize(int p0){
       FastTextView td = this.d;
       if (td.e != p0) {
          td.e = p0;
          this.d();
       }
       return;
    }
    public void setGravity(int p0){
       if (this.d.e(p0)) {
          this.d();
       }
       return;
    }
    public void setMaxLines(int p0){
       FastTextView td = this.d;
       if (td.d != p0) {
          td.d = p0;
          this.d();
       }
       return;
    }
    public void setMaxWidth(int p0){
       FastTextView td = this.d;
       if (td.c != p0) {
          td.c = p0;
          this.d();
       }
       return;
    }
    public void setText(CharSequence p0){
       if (this.e != p0) {
          this.e(false);
       }
       this.e = p0;
       return;
    }
    public void setTextColor(int p0){
       this.d.f = ColorStateList.valueOf(p0);
       this.l();
    }
    public void setTextColor(ColorStateList p0){
       this.d.f = p0;
       this.l();
    }
    public void setTextSize(float p0){
       this.j(p0, 2);
    }
}
