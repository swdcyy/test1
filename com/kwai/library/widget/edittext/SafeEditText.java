package com.kwai.library.widget.edittext.SafeEditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.widget.EditText;
import java.lang.String;
import com.yxcorp.gifshow.widget.c;
import android.text.TextUtils;
import android.text.TextPaint;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import java.lang.Object;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.view.View;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

public class SafeEditText extends AppCompatEditText	// class@000927
{
    public boolean e;
    public String f;
    public boolean g;
    public c h;

    public void SafeEditText(Context p0){
       super(p0);
       this.e = true;
       this.f = "";
       this.g = true;
       this.a(p0, null);
       this.b();
    }
    public void SafeEditText(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = true;
       this.f = "";
       this.g = true;
       this.a(p0, p1);
       this.b();
    }
    public void SafeEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = true;
       this.f = "";
       this.g = true;
       this.a(p0, p1);
       this.b();
    }
    private void a(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.J4);
       this.e = typedArray.getBoolean(0, true);
       typedArray.recycle();
    }
    public final void b(){
       if (this.getHint() != null) {
          this.f = this.getHint().toString();
       }
       return;
    }
    public void c(int p0,int p1){
       if (this.h == null) {
          this.h = new c();
       }
       if (TextUtils.isEmpty(this.f) || (p1 > 0 && p0 > 0)) {
          SpannableString spannableStr = new SpannableString(this.f);
          spannableStr.setSpan(new AbsoluteSizeSpan((int)this.h.a(this.getPaint(), p0, this.f), false), false, spannableStr.length(), 33);
          this.setHint(new SpannedString(spannableStr));
          this.g = false;
       }
    label_0045 :
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return super.dispatchTouchEvent(p0);
    }
    public Editable getText(){
       Editable text = super.getText();
       if (text == null) {
          text = new SpannableStringBuilder("");
       }
       return text;
    }
    public CharSequence getText(){
       return this.getText();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (this.e != null && (!TextUtils.isEmpty(this.f) && (p0 || this.g != null))) {
          this.c((((p3 - p1) - this.getCompoundPaddingLeft()) - this.getCompoundPaddingRight()), (((p4 - p2) - this.getCompoundPaddingBottom()) - this.getCompoundPaddingTop()));
       }
    label_002d :
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void setAllowAutoAdjustHintSize(boolean p0){
       this.e = p0;
    }
    public void setHintText(String p0){
       this.f = p0;
       this.c(this.getWidth(), this.getHeight());
    }
}
