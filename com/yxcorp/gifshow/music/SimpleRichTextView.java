package com.yxcorp.gifshow.music.SimpleRichTextView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.graphics.Typeface;
import android.view.View;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.TextUtils;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import java.lang.Math;
import com.yxcorp.gifshow.music.MusicRankLabelViewGroup;
import android.text.SpannableStringBuilder;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import rnc.i;

public class SimpleRichTextView extends ViewGroup	// class@001fd7
{
    public final int b;
    public final String c;
    public final int d;
    public TextView e;
    public TextView f;
    public TextView g;
    public View h;
    public int i;
    public float j;
    public CharSequence k;
    public CharSequence l;
    public a m;
    public BackgroundColorSpan n;
    public SpannableStringBuilder o;
    public boolean p;
    public View$OnClickListener q;
    public View$OnLongClickListener r;

    public void SimpleRichTextView(Context p0){
       super(p0, null);
    }
    public void SimpleRichTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SimpleRichTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = a1.e(16.00f);
       this.b = i;
       this.c = "...";
       this.d = a.a().a().getResources().getColor(0x7f060765);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.e5, p2, 0);
       this.j = typedArray.getDimension(0, (float)i);
       typedArray.recycle();
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleRichTextView.class, "1")) {
       }else {
          this.i = p0.getResources().getColor(0x7f0619e8);
          TextView textView = new TextView(p0);
          this.e = textView;
          textView.setTextColor(this.i);
          this.e.setIncludeFontPadding(0);
          this.e.setTextSize(0, this.j);
          this.e.setTypeface(Typeface.DEFAULT_BOLD);
          this.e.setSingleLine();
          this.e.setGravity(16);
          this.addView(this.e);
       }
       return;
    }
    public final boolean a(){
       boolean b = (this.m != null)? true: false;
       return b;
    }
    public final float b(TextView p0,CharSequence p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SimpleRichTextView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       this.k = p1;
       float f = 0;
       if (TextUtils.isEmpty(p1)) {
          return f;
       }
       StaticLayout staticLayout = new StaticLayout(this.k, p0.getPaint(), 0x2710, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
       int lineCount = TextUtils.isEmpty(p1).getLineCount();
       for (int i = 0; i < lineCount; i = i + 1) {
          f = f + TextUtils.isEmpty(p1).getLineWidth(i);
       }
       return f;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(-2, -2);
    }
    public final float getLineHeight(){
       Paint$FontMetrics obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.e.getPaint().getFontMetrics();
       float f = obj.descent - obj.ascent;
       if (this.h != null) {
          f = Math.max(f, (float)this.getTailerViewMeasureHeight());
       }
       return f;
    }
    public final int getTailerUsedWidth(){
       SimpleRichTextView obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       if (obj == null) {
          return 0;
       }
       ViewGroup$MarginLayoutParams layoutParams = obj.getLayoutParams();
       return ((this.h.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin);
    }
    public final int getTailerViewMeasureHeight(){
       SimpleRichTextView obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       int i = 0;
       if (obj != null) {
          if (obj instanceof MusicRankLabelViewGroup) {
             return obj.getPreMeasureHeight();
          }else {
             ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
             if (layoutParams != null) {
                layoutParams = layoutParams.height;
                if (layoutParams > null) {
                   i = layoutParams;
                }
             }
          }
       }
       return i;
    }
    public final int getTailerViewMeasureWidth(){
       SimpleRichTextView obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       if (obj instanceof TextView) {
          return (int)Math.ceil((double)((this.b(obj, obj.getText()) + (float)obj.getPaddingLeft()) + (float)obj.getPaddingRight()));
       }
       if (obj instanceof MusicRankLabelViewGroup) {
          return obj.getPreMeasureWidth();
       }
       int i = 0;
       if (obj != null) {
          ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
          if (layoutParams != null) {
             layoutParams = layoutParams.width;
             if (layoutParams > null) {
                i = layoutParams;
             }
          }
       }
       return i;
    }
    public CharSequence getText(){
       SpannableStringBuilder obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder(this.l);
       if (this.a()) {
          obj.removeSpan(this.n);
       }
       return obj;
    }
    public float getTextSize(){
       return (float)this.b;
    }
    public int getTextWidth(){
       Object obj = PatchProxy.apply(null, this, SimpleRichTextView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getWidth();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(SimpleRichTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SimpleRichTextView.class, "13")) {
             return;
          }
       }
       SimpleRichTextView te = this.e;
       te.layout(i1, i1, te.getMeasuredWidth(), this.e.getMeasuredHeight());
       int measuredWidt = this.e.getMeasuredWidth();
       SimpleRichTextView tf = this.f;
       if (tf != null) {
          measuredWidt = p4 - p2;
          tf.layout(i1, (measuredWidt - tf.getMeasuredHeight()), this.f.getMeasuredWidth(), measuredWidt);
          int measuredWidt1 = this.f.getMeasuredWidth();
          SimpleRichTextView tg = this.g;
          if (tg != null) {
             tg.layout(measuredWidt1, (measuredWidt - this.f.getMeasuredHeight()), (this.g.getMeasuredWidth() + measuredWidt1), measuredWidt);
             measuredWidt = this.g.getMeasuredWidth() + measuredWidt1;
          }else {
             measuredWidt = measuredWidt1;
          }
       }
       tf = this.h;
       if (tf != null) {
          ViewGroup$MarginLayoutParams layoutParams = tf.getLayoutParams();
          int i2 = (int)this.getLineHeight();
          p4 = (p4 - p2) - i2;
          p4 = p4 + ((i2 - this.h.getMeasuredHeight()) / i);
          p2 = this.h.getMeasuredHeight() + p4;
          if (this.f != null || (((this.e.getMeasuredWidth() + this.h.getMeasuredWidth()) + layoutParams.leftMargin) + layoutParams.rightMargin) <= (p3 - p1)) {
             i1 = measuredWidt + layoutParams.leftMargin;
          }
          this.h.layout(i1, p4, (this.h.getMeasuredWidth() + i1), p2);
       }
       this.p = true;
       return;
    }
    public void onMeasure(int p0,int p1){
       SimpleRichTextView tl;
       SimpleRichTextView tq;
       if (PatchProxy.isSupport(SimpleRichTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SimpleRichTextView.class, "4")) {
          return;
       }
       int i = 0x40000000;
       if (!PatchProxy.isSupport(SimpleRichTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SimpleRichTextView.class, "5")) {
          SimpleRichTextView th = this.h;
          if (th != null && th.getParent() == null) {
             this.addView(this.h);
             this.h.measure(View$MeasureSpec.makeMeasureSpec(this.getTailerViewMeasureWidth(), i), View$MeasureSpec.makeMeasureSpec(this.getTailerViewMeasureHeight(), i));
          }
       }
       if (!TextUtils.isEmpty(this.l)) {
          p1 = View$MeasureSpec.getSize(p0);
          float f = this.b(this.e, this.l);
          float f1 = (float)p1;
          if (f1 - ((float)this.getTailerUsedWidth() + f) < 0) {
             float lineHeight = this.getLineHeight();
             int i1 = (int)(2.00f * lineHeight);
             if (f - f1 > 0) {
                int i2 = (int)((f1 / f) * (float)this.l.length());
                float f2 = this.b(this.e, this.l.subSequence(0, i2));
                while (f2 - f1 > 0) {
                   i2 = i2 - 1;
                   f2 = this.b(this.e, this.l.subSequence(0, i2));
                }
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, this, SimpleRichTextView.class, "8") && this.f == null) {
                   TextView textView1 = new TextView(this.getContext());
                   this.f = textView1;
                   textView1.setTextSize(0, this.j);
                   this.f.setTextColor(this.i);
                   this.f.setIncludeFontPadding(0);
                   this.f.setTypeface(Typeface.DEFAULT_BOLD);
                   this.f.setSingleLine();
                   this.f.setGravity(16);
                   if (this.h != null) {
                      this.f.setMinHeight(this.getTailerViewMeasureHeight());
                   }
                   tl = this.q;
                   if (tl != null) {
                      this.f.setOnClickListener(tl);
                   }
                   tl = this.r;
                   if (tl != null) {
                      this.f.setOnLongClickListener(tl);
                   }
                   this.addView(this.f);
                }
                tl = this.l;
                CharSequence uCharSequenc = tl.subSequence(i2, tl.length());
                this.f.setText(i.j(uCharSequenc));
                float f3 = this.b(this.f, uCharSequenc);
                if (((float)this.getTailerUsedWidth() + f3) - f1 > 0) {
                   String str = "...";
                   if (!PatchProxy.applyVoid(objArray, this, SimpleRichTextView.class, "9")) {
                      if (this.g == null) {
                         TextView textView = new TextView(this.getContext());
                         this.g = textView;
                         textView.setTextSize(0, this.j);
                         this.g.setTextColor(this.i);
                         this.g.setIncludeFontPadding(0);
                         this.g.setGravity(80);
                         this.g.setText(str);
                         this.g.setTypeface(Typeface.DEFAULT_BOLD);
                         tq = this.q;
                         if (tq != null) {
                            this.g.setOnClickListener(tq);
                         }
                         tq = this.r;
                         if (tq != null) {
                            this.g.setOnLongClickListener(tq);
                         }
                         this.addView(this.g);
                      }
                      if (this.a()) {
                         if (this.isSelected()) {
                            tq = this.o;
                            tq.setSpan(this.n, 0, tq.length(), 17);
                            this.g.setText(this.o);
                         }else {
                            this.g.setText(str);
                         }
                      }
                   }
                   int i3 = (int)this.g.getPaint().measureText(str);
                   this.g.measure(View$MeasureSpec.makeMeasureSpec(i3, i), View$MeasureSpec.makeMeasureSpec((int)lineHeight, i));
                   f1 = (float)((p1 - this.getTailerUsedWidth()) - i3);
                   int i4 = (int)(((0x3f800000 * f1) / f3) * (float)uCharSequenc.length());
                   CharSequence uCharSequenc1 = (i4 > uCharSequenc.length())? uCharSequenc: uCharSequenc.subSequence(0, i4);
                   f3 = this.b(this.f, uCharSequenc1);
                   while (f3 - f1 > 0) {
                      i4 = i4 - 1;
                      f3 = (float)(int)this.b(this.f, uCharSequenc.subSequence(0, i4));
                   }
                }
                int i5 = (int)lineHeight;
                this.f.measure(View$MeasureSpec.makeMeasureSpec((int)f3, i), View$MeasureSpec.makeMeasureSpec(i5, i));
                this.e.setText(i.j(this.l.subSequence(0, i2)));
                this.e.measure(p0, View$MeasureSpec.makeMeasureSpec(i5, i));
             }else {
                this.e.setText(i.j(this.l));
                this.e.measure(View$MeasureSpec.makeMeasureSpec((int)f, i), View$MeasureSpec.makeMeasureSpec((int)lineHeight, i));
             }
             this.setMeasuredDimension(p1, i1);
          }else {
             this.e.setText(i.j(this.l));
             this.e.measure(View$MeasureSpec.makeMeasureSpec((int)f, i), View$MeasureSpec.makeMeasureSpec((int)this.getLineHeight(), i));
             super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((int)this.getLineHeight(), i));
          }
          return;
       }else {
          super.onMeasure(p0, p1);
          return;
       }
    }
    public void setSelected(boolean p0){
       SpannableStringBuilder spannableStr;
       if (PatchProxy.isSupport(SimpleRichTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SimpleRichTextView.class, "3")) {
          return;
       }
       super.setSelected(p0);
       if (!this.a()) {
          return;
       }
       if (p0) {
          spannableStr = new SpannableStringBuilder(this.l);
          spannableStr.setSpan(this.n, 0, spannableStr.length(), 17);
          this.setText(spannableStr);
       }else {
          spannableStr = new SpannableStringBuilder(this.l);
          spannableStr.removeSpan(this.n);
          this.setText(spannableStr);
       }
       return;
    }
    public void setTailerView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleRichTextView.class, "17")) {
          return;
       }
       this.h = p0;
       SimpleRichTextView te = this.e;
       if (te != null) {
          te.setMinHeight(this.getTailerViewMeasureHeight());
       }
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleRichTextView.class, "14")) {
          return;
       }
       this.l = p0;
       if (this.p != null) {
          this.requestLayout();
       }
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(SimpleRichTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SimpleRichTextView.class, "16")) {
          return;
       }
       this.i = p0;
       this.e.setTextColor(p0);
       SimpleRichTextView tf = this.f;
       if (tf != null) {
          tf.setTextColor(p0);
       }
       tf = this.g;
       if (tf != null) {
          tf.setTextColor(p0);
       }
       return;
    }
    public void setTextContentOnLongClickListener(View$OnLongClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleRichTextView.class, "24")) {
          return;
       }
       this.r = p0;
       this.e.setOnLongClickListener(p0);
       return;
    }
    public void setTextContentOnclickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleRichTextView.class, "23")) {
          return;
       }
       this.q = p0;
       this.e.setOnClickListener(p0);
       return;
    }
}
