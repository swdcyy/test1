package com.kwai.library.widget.textview.FoldingTextView;
import com.kwai.library.widget.textview.MovementTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import com.kwai.library.widget.textview.FoldingTextView$e;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Exception;
import android.text.SpannableString;
import com.kwai.library.widget.textview.FoldingTextView$b;
import com.kwai.library.widget.textview.FoldingTextView$c;
import com.kwai.library.widget.textview.FoldingTextView$d;
import android.view.View$OnTouchListener;
import android.view.ViewTreeObserver;
import com.kwai.library.widget.textview.FoldingTextView$a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class FoldingTextView extends MovementTextView	// class@000a3c
{
    public boolean k;
    public String l;
    public String m;
    public FoldingTextView$e n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;

    public void FoldingTextView(Context p0){
       super(p0, null);
    }
    public void FoldingTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FoldingTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q0);
       this.m = typedArray.getString(1);
       this.l = typedArray.getString(2);
       this.k = typedArray.getBoolean(3, false);
       this.p = typedArray.getColor(5, 0xff000000);
       this.q = typedArray.getBoolean(4, false);
       this.r = typedArray.getBoolean(false, 1);
       typedArray.recycle();
       if (!TextUtils.x(this.l) && !TextUtils.x(this.m)) {
          return;
       }
       throw new IllegalArgumentException("are you set collapseText and expandText in xml?");
    }
    public void setOnTextExpand(boolean p0){
       this.o = p0;
    }
    public void setTextFoldingListener(FoldingTextView$e p0){
       this.n = p0;
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
             float f = this.getPaint().measureText(this.l);
             int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
             String str = "\n";
             if (this.k != null) {
                f = spannableStr.subSequence(0, v9.getLineEnd((p1 - 1)));
                if (10 == f.charAt((f.length() - 1))) {
                   f = f.subSequence(0, (f.length() - 1));
                }
                spannableStr1 = new SpannableStringBuilder(f);
                spannableStr1.append(str);
                spannableStr1.append(this.l);
                if (this.r != null) {
                   spannableStr.append(str);
                   spannableStr.append(this.m);
                }
             }else {
                int i1 = p1 - 1;
                int lineStart = v9.getLineStart(i1);
                CharSequence uCharSequenc = spannableStr.subSequence(lineStart, v9.getLineEnd(i1));
                if (10 == uCharSequenc.charAt((uCharSequenc.length() - 1))) {
                   uCharSequenc = uCharSequenc.subSequence(0, (uCharSequenc.length() - 1));
                }
                float f1 = this.getPaint().measureText(uCharSequenc.toString());
                f1 = f1 + f;
                float f2 = (float)i;
                while (f1 - f2 > 0 && (i > 0 && uCharSequenc.length() > 0)) {
                   lineStart = uCharSequenc.length() - 1;
                   uCharSequenc = uCharSequenc.subSequence(0, lineStart);
                   f1 = this.getPaint().measureText(uCharSequenc.toString());
                }
                try{
                   for (; uCharSequenc != null && uCharSequenc.length() > 0; uCharSequenc = uCharSequenc.subSequence(0, i2)) {
                      int i2 = uCharSequenc.length() - 1;
                      char c = uCharSequenc.charAt(i2);
                      i2 = (c && (c != 9 && (c != 10 && (c != 13 && (c < ' ' || (c > 0xd7ff && (c < 0xe000 || c > 0xfffd)))))))? 1: 0;
                      if (i2 && spannableStr.length() > uCharSequenc.length()) {
                         i2 = uCharSequenc.length() - 1;
                         c = uCharSequenc.charAt(i2);
                         char c1 = spannableStr.charAt(uCharSequenc.length());
                         i2 = ((Integer.toHexString(c)).compareTo("dc00") >= 0 && ((Integer.toHexString(c)).compareTo("dfff") <= 0 && !(Integer.toHexString(c1)).equals("200D")))? 1: 0;
                         if (!i2) {
                            i2 = uCharSequenc.length() - 1;
                         }
                      }
                   }
                }catch(java.lang.Exception e13){
                   e13.printStackTrace();
                }
             label_016a :
                SpannableStringBuilder spannableStr4 = new SpannableStringBuilder(uCharSequenc);
                spannableStr4.append(this.l);
                if (p1 > 1) {
                   SpannableStringBuilder spannableStr5 = new SpannableStringBuilder(spannableStr.subSequence(0, v9.getLineEnd((p1 - 2))));
                   spannableStr5.append(spannableStr4);
                   spannableStr1 = spannableStr5;
                }else {
                   spannableStr1 = new SpannableStringBuilder(spannableStr4);
                }
                if (this.r != null) {
                   if ((v9.getLineWidth((lineCount - 1)) + this.getPaint().measureText(this.m)) - f2 > 0) {
                      spannableStr.append(str);
                   }
                   spannableStr.append(this.m);
                }
             }
             SpannableString spannableStr2 = new SpannableString(spannableStr1);
             SpannableString spannableStr3 = new SpannableString(spannableStr);
             spannableStr2.setSpan(new FoldingTextView$b(this, spannableStr3), (spannableStr1.length() - (this.l).length()), spannableStr1.length(), 33);
             if (this.r != null) {
                spannableStr3.setSpan(new FoldingTextView$c(this, spannableStr2), (spannableStr.length() - (this.m).length()), spannableStr.length(), 33);
             }
             if (FoldingTextView$d.b == null) {
                FoldingTextView$d.b = new FoldingTextView$d();
             }
             this.setOnTouchListener(FoldingTextView$d.b);
             if (this.o != null) {
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
          this.getViewTreeObserver().addOnPreDrawListener(new FoldingTextView$a(this, p0, p1));
       }else {
          this.u(p0, p1);
       }
       return;
    }
}
