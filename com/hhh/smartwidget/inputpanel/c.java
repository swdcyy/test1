package com.hhh.smartwidget.inputpanel.c;
import android.text.TextWatcher;
import com.hhh.smartwidget.inputpanel.InputPanel;
import com.hhh.smartwidget.inputpanel.InputPanel$b;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import android.widget.EditText;
import mm.k;
import java.lang.String;
import mm.g;

public class c implements TextWatcher	// class@000585
{
    public final InputPanel$b b;
    public final InputPanel c;

    public void c(InputPanel p0,InputPanel$b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.c.v(p0);
       c tb = this.b;
       if (tb.H != null) {
          c tc = this.c;
          tb.S.c(tc, tc.q);
       }
       if (this.b.G != null && (p0.length() > 0 && p3 == 1)) {
          String str = (p0.toString()).substring(p1, (p1 + 1));
          if (("@").equals(str) || ("£À").equals(str)) {
             c tc1 = this.c;
             this.b.R.a(tc1, tc1.q);
          }
       }
       return;
    }
}
