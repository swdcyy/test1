package com.yxcorp.gifshow.widget.textview.CenterLineTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.os.Build$VERSION;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import android.text.Layout;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableStringBuilder;
import java.lang.Float;
import rzc.a;
import android.text.TextPaint;
import android.graphics.Paint;

public class CenterLineTextView extends AppCompatTextView	// class@0019ca
{
    public boolean f;

    public void CenterLineTextView(Context p0){
       super(p0, null);
    }
    public void CenterLineTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CenterLineTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.I);
       float dimension = typedArray.getDimension(0, 0);
       typedArray.recycle();
       this.p(this.getText(), dimension);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CenterLineTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CenterLineTextView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.f != null && Build$VERSION.SDK_INT <= 28) {
          if (this.getEllipsize() != TextUtils$TruncateAt.END) {
             return;
          }else {
             Layout layout = this.getLayout();
             if (layout == null) {
                return;
             }else {
                CharSequence text = layout.getText();
                CharSequence text1 = this.getText();
                if (TextUtils.n(text, text1) || (!TextUtils.x(text) && !TextUtils.x(text1))) {
                   String str = text.toString();
                   int i = str.length() - 1;
                   while (i >= 0 && str.charAt(i) == 0xfeff) {
                      i = i - 1;
                   }
                   if (i < 0) {
                      return;
                   }else {
                      this.setText(new SpannableStringBuilder(text1, 0, i).append("бн"));
                   }
                }
             }
          }
       }
       return;
    }
    public void p(CharSequence p0,float p1){
       SpannableStringBuilder spannableStr;
       if (PatchProxy.isSupport(CenterLineTextView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, CenterLineTextView.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (p0 instanceof SpannableStringBuilder) {
          spannableStr = p0;
          spannableStr.setSpan(new a(p1, this.getPaint()), 0, p0.length(), 33);
       }else {
          spannableStr = new SpannableStringBuilder(p0);
          spannableStr.setSpan(new a(p1, this.getPaint()), 0, p0.length(), 33);
       }
       this.setText(spannableStr);
       return;
    }
    public void setShouldAdjustText(boolean p0){
       this.f = p0;
    }
}
