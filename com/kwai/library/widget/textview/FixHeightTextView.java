package com.kwai.library.widget.textview.FixHeightTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import h27.c;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import java.util.Objects;

public final class FixHeightTextView extends AppCompatTextView	// class@000a36
{
    public final c f;
    public HashMap g;

    public void FixHeightTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FixHeightTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FixHeightTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       c uoc = new c(this);
       this.f = uoc;
       this.setIncludeFontPadding(false);
       if (p1 != null) {
          CharSequence text = this.getText();
          if (!TextUtils.isEmpty(text)) {
             this.setFixHeightText(text);
          }
          TypedArray typedArray = p0.obtainStyledAttributes(p1, uoc.d);
          a.o(typedArray, "context.obtainStyledAttr¡­heightHelper.STYLE_ATTRS\)");
          if ((uoc.f).equals(typedArray.getString(1))) {
             this.setTypeface(Typeface.DEFAULT);
             c.b(uoc, this, 0, 2, null);
          }
          typedArray.recycle();
       }
       return;
    }
    public void FixHeightTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void setFakeBold(float p0){
       this.f.a(this, p0);
    }
    public final void setFixHeightText(CharSequence p0){
       this.f.c(p0);
    }
    public final void setFixLineHeight(int p0){
       FixHeightTextView tf = this.f;
       Objects.requireNonNull(tf);
       if (p0 > 0) {
          tf.a = p0;
          tf.d(tf.h.getText(), p0);
       }
       return;
    }
    public final void setStyle(int p0){
       FixHeightTextView tf = this.f;
       tf.h.setIncludeFontPadding(false);
       TypedArray typedArray = tf.h.getContext().obtainStyledAttributes(p0, tf.d);
       a.o(typedArray, "textView.context.obtainS¡­tes\(styleId, STYLE_ATTRS\)");
       CharSequence text = tf.h.getText();
       if (!TextUtils.isEmpty(text)) {
          tf.c(text);
       }
       if ((tf.f).equals(typedArray.getString(1))) {
          tf.h.setTypeface(Typeface.DEFAULT);
          c.b(tf, tf.h, 0, 2, null);
       }
       typedArray.recycle();
       return;
    }
}
