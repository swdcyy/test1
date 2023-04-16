package com.yxcorp.gifshow.detail.view.LetterSpaceTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.widget.TextView$BufferType;
import android.widget.TextView;
import java.lang.Float;

public class LetterSpaceTextView extends AppCompatTextView	// class@001a47
{
    public float f;
    public CharSequence g;

    public void LetterSpaceTextView(Context p0){
       super(p0);
       this.f = 0;
       this.g = "";
    }
    public void LetterSpaceTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = 0;
       this.g = "";
    }
    public void LetterSpaceTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = 0;
       this.g = "";
    }
    public float getSpacing(){
       return this.f;
    }
    public CharSequence getText(){
       return this.g;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LetterSpaceTextView.class, "3")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       StringBuilder str = "";
       int i = 0;
       while (i < this.g.length()) {
          str = str+this.g.charAt(i);
          i = i + 1;
          if (i < this.g.length()) {
             str = str+"\xa0\x00";
          }
       }
       SpannableString spannableStr = new SpannableString(str);
       int i1 = 1;
       if ((str).length() > i1) {
          for (; i1 < (str).length(); i1 = i1 + 2) {
             float f = this.f + 0x3f800000;
             f = f / 10.00f;
             ScaleXSpan scaleXSpan = new ScaleXSpan(f);
             int i2 = i1 + 1;
             spannableStr.setSpan(scaleXSpan, i1, i2, 33);
          }
       }
       super.setText(spannableStr, TextView$BufferType.SPANNABLE);
       return;
    }
    public void setSpacing(float p0){
       if (PatchProxy.isSupport(LetterSpaceTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LetterSpaceTextView.class, "1")) {
          return;
       }
       this.f = p0;
       this.p();
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LetterSpaceTextView.class, "2")) {
          return;
       }
       this.g = p0;
       this.p();
       return;
    }
}
