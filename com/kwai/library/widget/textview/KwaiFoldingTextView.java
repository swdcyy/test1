package com.kwai.library.widget.textview.KwaiFoldingTextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import com.kwai.library.widget.textview.KwaiFoldingTextView$e;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.text.SpannableString;
import com.kwai.library.widget.textview.KwaiFoldingTextView$b;
import java.lang.Object;
import com.kwai.library.widget.textview.KwaiFoldingTextView$c;
import com.kwai.library.widget.textview.KwaiFoldingTextView$d;
import android.view.View$OnTouchListener;
import android.view.ViewTreeObserver;
import com.kwai.library.widget.textview.KwaiFoldingTextView$a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class KwaiFoldingTextView extends KwaiSizeAdjustableTextView	// class@000a4c
{
    public boolean q;
    public String r;
    public String s;
    public KwaiFoldingTextView$e t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;

    public void KwaiFoldingTextView(Context p0){
       super(p0, null);
    }
    public void KwaiFoldingTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiFoldingTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.P1);
       this.s = typedArray.getString(1);
       this.r = typedArray.getString(2);
       this.q = typedArray.getBoolean(3, false);
       this.v = typedArray.getColor(5, 0xff000000);
       this.w = typedArray.getBoolean(4, false);
       this.x = typedArray.getBoolean(false, 1);
       typedArray.recycle();
       if (!TextUtils.x(this.r) && !TextUtils.x(this.s)) {
          return;
       }
       throw new IllegalArgumentException("are you set collapseText and expandText in xml?");
    }
    public void setOnTextExpand(boolean p0){
       this.u = p0;
    }
    public void setTextFoldingListener(KwaiFoldingTextView$e p0){
       this.t = p0;
    }
    public void u(CharSequence p0,int p1){
       SpannableStringBuilder spannableStr1;
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
       if (p1 <= 0 || (!TextUtils.x(spannableStr) && this.getWidth() > 0)) {
          StaticLayout staticLayout = new StaticLayout(spannableStr, this.getPaint(), this.getWidth(), Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
          int lineCount = v9.getLineCount();
          if (lineCount <= p1) {
             this.setText(p0);
             return;
          }else {
             float f = this.getPaint().measureText(this.r);
             int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
             KwaiFoldingTextView kwaiFoldingT = 10;
             if (this.q != null) {
                f = spannableStr.subSequence(0, v9.getLineEnd((p1 - 1)));
                if (kwaiFoldingT == f.charAt((f.length() - 1))) {
                   f = f.subSequence(0, (f.length() - 1));
                }
                spannableStr1 = new SpannableStringBuilder(f);
                spannableStr1.append("\n");
                spannableStr1.append(this.r);
                if (this.x != null) {
                   spannableStr.append("\n");
                   spannableStr.append(this.s);
                }
             }else {
                int i1 = p1 - 1;
                int lineStart = v9.getLineStart(i1);
                CharSequence uCharSequenc = spannableStr.subSequence(lineStart, v9.getLineEnd(i1));
                if (kwaiFoldingT == uCharSequenc.charAt((uCharSequenc.length() - 1))) {
                   uCharSequenc = uCharSequenc.subSequence(0, (uCharSequenc.length() - 1));
                }
                float f1 = this.getPaint().measureText(uCharSequenc.toString());
                f1 = f1 + f;
                float f2 = (float)i;
                while (f1 - f2 > 0 && (i > 0 && uCharSequenc.length() > 0)) {
                   int i2 = uCharSequenc.length() - 1;
                   uCharSequenc = uCharSequenc.subSequence(0, i2);
                   f1 = this.getPaint().measureText(uCharSequenc.toString());
                }
                SpannableStringBuilder spannableStr4 = new SpannableStringBuilder(uCharSequenc);
                spannableStr4.append(this.r);
                if (p1 > 1) {
                   SpannableStringBuilder spannableStr5 = new SpannableStringBuilder(spannableStr.subSequence(0, v9.getLineEnd((p1 - 2))));
                   spannableStr5.append(spannableStr4);
                   spannableStr1 = spannableStr5;
                }else {
                   spannableStr1 = new SpannableStringBuilder(spannableStr4);
                }
                if (this.x != null) {
                   if ((v9.getLineWidth((lineCount - 1)) + this.getPaint().measureText(this.s)) - f2 > 0) {
                      spannableStr.append("\n");
                   }
                   spannableStr.append(this.s);
                }
             }
             SpannableString spannableStr2 = new SpannableString(spannableStr1);
             SpannableString spannableStr3 = new SpannableString(spannableStr);
             spannableStr2.setSpan(new KwaiFoldingTextView$b(this, spannableStr3), (spannableStr1.length() - (this.r).length()), spannableStr1.length(), 33);
             if (this.x != null) {
                spannableStr3.setSpan(new KwaiFoldingTextView$c(this, spannableStr2), (spannableStr.length() - (this.s).length()), spannableStr.length(), 33);
             }
             if (KwaiFoldingTextView$d.b == null) {
                KwaiFoldingTextView$d.b = new KwaiFoldingTextView$d();
             }
             this.setOnTouchListener(KwaiFoldingTextView$d.b);
             if (this.u != null) {
                this.setText(spannableStr3);
             }else {
                this.setText(spannableStr2);
             }
          }
       }
       return;
    }
    public void v(CharSequence p0,int p1){
       if (TextUtils.x(p0)) {
          return;
       }
       if (!this.getMeasuredWidth()) {
          this.getViewTreeObserver().addOnPreDrawListener(new KwaiFoldingTextView$a(this, p0, p1));
       }else {
          this.u(p0, p1);
       }
       return;
    }
}
