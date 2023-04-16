package com.kwai.library.widget.edittext.a;
import android.text.TextWatcher;
import com.kwai.library.widget.edittext.SettingPasswordEdit;
import java.lang.Object;
import android.text.Editable;
import java.lang.String;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kwai.library.widget.edittext.SettingPasswordEdit$a;
import android.widget.EditText;
import android.text.Spannable;
import android.text.Selection;

public class a implements TextWatcher	// class@000932
{
    public final SettingPasswordEdit b;

    public void a(SettingPasswordEdit p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       String str1;
       SettingPasswordEdit h;
       a tb = this.b;
       String str = p0.toString();
       Objects.requireNonNull(tb);
       if (TextUtils.x(str)) {
          str = "";
       }
       int i = str.length();
       int i1 = 0;
       while (i1 < tb.g) {
          if (i1 < i) {
             str1 = String.valueOf(str.charAt(i1));
             tb.e[i1].setEnabled(TextUtils.x(str1));
          }else {
             tb.e[i1].setEnabled(true);
             str1 = "";
          }
          if (tb.f == null) {
             tb.e[i1].setText("");
          }else {
             tb.e[i1].setText(str1);
          }
          i1 = i1 + 1;
       }
       a tb1 = this.b;
       if (p0.length() == tb1.g) {
          h = tb1.h;
          if (h != null) {
             h.onFinish((p0.toString()).trim());
          }
       }else {
          h = tb1.h;
          if (h != null) {
             h.a((p0.toString()).trim());
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       Editable text = this.b.b.getText();
       Selection.setSelection(text, text.length());
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
