package com.yxcorp.gifshow.widget.merchant.live.SellingNumberText;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import lnc.u9;

public final class SellingNumberText extends AppCompatTextView	// class@001998
{
    public String f;
    public int g;

    public void SellingNumberText(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void SellingNumberText(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void SellingNumberText(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = "alte-din.ttf";
       this.setTypeface(d0.a("alte-din.ttf", p0));
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.t3);
       a.o(typedArray, "context.obtainStyledAttr¡­erchantSellingNumberText\)");
       this.g = typedArray.getInt(0, 0);
       typedArray.recycle();
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SellingNumberText.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          super.setText(p0, p1);
          return;
       }else {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
          spannableStr.setSpan(new StyleSpan(3), 0, spannableStr.length(), 33);
          if (this.g != null) {
             spannableStr.append(" ");
             spannableStr.setSpan(new u9(this.g), (spannableStr.length() - 1), spannableStr.length(), 33);
          }
          super.setText(spannableStr, TextView$BufferType.SPANNABLE);
          return;
       }
    }
}
