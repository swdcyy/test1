package com.google.android.material.textfield.TextInputLayout$a;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;

public class TextInputLayout$a implements TextWatcher	// class@0016e1
{
    public final TextInputLayout b;

    public void TextInputLayout$a(TextInputLayout p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       TextInputLayout$a tb = this.b;
       tb.B((tb.a1 ^ 0x01));
       tb = this.b;
       if (tb.f != null) {
          tb.x(p0.length());
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
