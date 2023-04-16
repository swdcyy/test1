package com.google.android.material.textfield.TextInputLayout$d;
import a2.a;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import b2.d;
import android.widget.EditText;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import java.lang.Object;

public class TextInputLayout$d extends a	// class@0016e4
{
    public final TextInputLayout d;

    public void TextInputLayout$d(TextInputLayout p0){
       super();
       this.d = p0;
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       EditText editText = this.d.getEditText();
       Editable text = (editText != null)? editText.getText(): null;
       CharSequence hint = this.d.getHint();
       CharSequence error = this.d.getError();
       CharSequence counterOverf = this.d.getCounterOverflowDescription();
       int i = TextUtils.isEmpty(text) ^ 1;
       int i1 = TextUtils.isEmpty(hint) ^ 1;
       int i2 = TextUtils.isEmpty(error) ^ 1;
       boolean b = false;
       int i3 = (i2 || !TextUtils.isEmpty(counterOverf))? 1: 0;
       if (i) {
          p1.C0(text);
       }else if(i1){
          p1.C0(hint);
       }
       if (i1) {
          p1.m0(hint);
          if (!i && i1) {
             b = true;
          }
          p1.y0(b);
       }
       if (i3) {
          if (!i2) {
             error = counterOverf;
          }
          p1.i0(error);
          p1.f0(1);
       }
       return;
    }
    public void onPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onPopulateAccessibilityEvent(p0, p1);
       EditText editText = this.d.getEditText();
       Editable text = (editText != null)? editText.getText(): null;
       if (TextUtils.isEmpty(text)) {
          text = this.d.getHint();
       }
       if (!TextUtils.isEmpty(text)) {
          p1.getText().add(text);
       }
       return;
    }
}
