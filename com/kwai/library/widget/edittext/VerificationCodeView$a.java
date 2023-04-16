package com.kwai.library.widget.edittext.VerificationCodeView$a;
import com.kwai.library.widget.edittext.PasteTextEditText$a;
import com.kwai.library.widget.edittext.VerificationCodeView;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import ekd.t0;
import android.view.View;
import android.widget.LinearLayout;
import com.kwai.library.widget.edittext.PasteTextEditText;
import android.widget.EditText;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class VerificationCodeView$a implements PasteTextEditText$a	// class@00092e
{
    public final VerificationCodeView a;

    public void VerificationCodeView$a(VerificationCodeView p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       VerificationCodeView$a ta = this.a;
       Objects.requireNonNull(ta);
       Objects.requireNonNull(p0);
       if (!t0.a(p0)) {
       }else {
          char[] uocharArray = p0.toCharArray();
          int i = 0;
          int i1 = 0;
          while (i < ta.f) {
             PasteTextEditText childAt = ta.getChildAt(i);
             if (childAt.isCursorVisible()) {
                if (i1 < uocharArray.length) {
                   if (uocharArray[i1]) {
                      childAt.setText(uocharArray[i1]+"");
                      childAt.setCursorVisible(false);
                      i1 = i1 + 1;
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void b(String p0){
    }
    public void c(String p0){
    }
}
